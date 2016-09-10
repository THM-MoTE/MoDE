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
 * @aspect ExpandableConnectors
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2073
 */
public class ExpandableConnectorSets extends Object {
    
        
        private Map<InstComponentDecl,ExpandableSet> map;

    
        private java.util.List<Connection> connections;

    
        private java.util.List<InstAccess> uses;

    
        private boolean expansionDone;

    

        
        public ExpandableConnectorSets() {
            map = new LinkedHashMap<InstComponentDecl,ExpandableSet>();
            connections = new ArrayList<Connection>();
            uses = new ArrayList<InstAccess>();
            expansionDone = false;
        }

    
        
        /**
         * Calculate the components present in each expandable connector and apply connections 
         * involving them.
         */
        public void elaborate(ConnectionSetManager csm) {
            boolean ok = true;
            for (ExpandableSet set : map.values()) 
                set.addNested();
            for (ExpandableSet set : map.values()) 
                if (!set.expand())
                    ok = false;
            
            if (ok) {
                expansionDone = true;
                for (Connection conn : connections)
                    conn.connect(csm);
                for (InstComponentDecl icd : map.keySet())
                    icd.buildConnectionSets(null, csm, true);
                for (InstAccess use : uses) {
                    use.flushAllRecursiveClearFinal();
                    if (use.myInstComponentDecl().isUnknown()) 
                        use.error("Using member of expandable connector is only allowed if the member is connected to in the connection set");
                }
            }
        }

    
        
        /**
         * Add an expandable connector to sets.
         */
        public void addConnector(InstComponentDecl conn) {
            setFor(conn);
        }

    
        
        /**
         * Add a use of a member of an expandable connector.
         */
        public void addUse(InstAccess use) {
            uses.add(use);
        }

    

        /**
         * Add information about a connection introducing a new component to an expandable connector.
         */
        public void addIntroducingConnection(InstAccess unknown, InstAccess known,
                FQName prefix, ConnectionEdge source) {
            InstComponentDecl expandable = unknown.findReferencedExpandableConnector();
            InstAccess unknownPart = unknown.findExpandableMemberPart(expandable);
            ExpandableSet set = setFor(expandable);
            set.addMember(known, unknown, unknownPart);
            
            connections.add(new Connection(prefix, source));
            // TODO: support adding nestled expandable connectors? see Modelica:#428
       }

    

        /**
         * Add information about a connection between two expandable connectors.
         */
        public void addSpanningConnection(InstComponentDecl leftComp, InstComponentDecl rightComp,
                FQName prefix, ConnectionEdge source) {
            connectExpandableConnectors(leftComp, rightComp);
            connections.add(new Connection(prefix, source));
        }

    

        /**
         * Check if elaboration is already done.
         */
        public boolean isExpansionDone() {
            return expansionDone;
        }

    
        
        private void connectExpandableConnectors(InstComponentDecl leftComp, InstComponentDecl rightComp) {
            ExpandableSet left = setFor(leftComp);
            ExpandableSet right = setFor(rightComp);
            left.merge(right);
            
            SortedSet<InstComponentDecl> rightChildren = rightComp.containedInstComponents();
            for (InstComponentDecl leftChild : leftComp.containedInstComponents()) {
                if (leftChild.isExpandableConnector() && rightChildren.contains(leftChild)) {
                    InstComponentDecl rightChild = rightChildren.tailSet(leftChild).first();
                    if (rightChild.isExpandableConnector())
                        connectExpandableConnectors(leftChild, rightChild);
                }
            }
        }

    
        
        private ExpandableSet setFor(InstComponentDecl comp) {
            InstComponentDecl org = comp.duplicateOriginal();
            ExpandableSet set = map.get(org);
            if (set == null) {
                set = new ExpandableSet(org);
            }
            if (org != comp) {
                set.addDuplicate(comp);
            }
            return set;
        }

    

        
        private class Connection {
            
            public final FQName prefix;
            public final FConnectClause source;
            private EvaluataionValueCache values;
            
            public Connection(FQName prefix, ConnectionEdge source) {
                this.prefix = prefix;
                this.source = (FConnectClause) source;
                values = new EvaluataionValueCache(this.source);
            }
            
            public void connect(ConnectionSetManager csm) {
                source.flushAllRecursiveClearFinal(); // Depends on FConnectClause not resetting is$Final
                values.apply();
                source.buildConnectionSets(prefix, csm, true);
                values.reset();
            }
            
            public String toString() {
                return source.toString();
            }
            
        }

    
        
        private class ExpandableSet {
            
            private Set<InstComponentDecl> connectors;
            private Map<String,ConnectorMember> members;
            private boolean expanded;
            private boolean nestedDone;
            private boolean isok;
            
            public ExpandableSet() {
                connectors = new LinkedHashSet<InstComponentDecl>();
                members = new HashMap<String,ConnectorMember>();
                expanded = false;
                nestedDone = false;
                isok = true;
            }
            
            public ExpandableSet(InstComponentDecl connector) {
                this();
                connectors.add(connector);
                map.put(connector, this);
            }
            
            /**
             * Calculate the components present in each expandable connector, if not already done.
             * 
             * @return  <code>false</code> if any errors were found
             */
            public boolean expand() {
                if (!expanded) {
                    ConnectorMember[] sorted = members.values().toArray(new ConnectorMember[members.size()]);
                    Arrays.sort(sorted);
                    for (ConnectorMember member : sorted)
                        isok = member.check() && isok;
                    if (isok) 
                        for (InstComponentDecl conn : connectors)
                            conn.expandConnector(createInstComponents(sorted, conn));
                    expanded = true;
                }
                return isok;
            }
            
            /**
             * Add all nested expandable connector to their parent's sets.
             */
            public void addNested() {
                if (!nestedDone && !members.isEmpty()) {
                    nestedDone = true;
                    for (InstComponentDecl conn : connectors) {
                        InstComponentDecl p = conn.findExpandableAncestor();
                        if (p != null) {
                            InstComponentDecl c = conn.ancestorChild(p, conn);
                            ExpandableSet set = setFor(p);
                            set.addDeclared(c.name());
                            set.addNested();
                        }
                    }
                }
            }
            
            /**
             * Merge two sets of expandable connectors, keeping this one.
             */
            public void merge(ExpandableSet other) {
                if (other == null)
                    return;
                
                for (InstComponentDecl conn : other.connectors) {
                    connectors.add(conn);
                    map.put(conn, this);
                }
                
                for (ConnectorMember member : other.members.values()) {
                    ConnectorMember local = members.get(member.name);
                    if (local == null) 
                        members.put(member.name, member);
                    else
                        local.merge(member);
                }
            }
            
            /**
             * Add a member to the connectors of the set, possibly as expandable connector members 
             * that members are recursively added to.
             */
            public void addMember(InstAccess source, InstAccess unknown, InstAccess unknownPart) {
                String name = unknownPart.name();
                ConnectorMember member = members.get(name);
                if (unknownPart == unknown.getLastInstAccess()) {
                    FArraySubscripts fas = unknownPart.hasFArraySubscripts() ? unknownPart.getFArraySubscripts() : null;
                    if (member == null) 
                        members.put(name, new ConnectorMember(name, source, fas));
                    else
                        member.addConnection(source, fas);
                } else {
                    // TODO: probably need more to support arrays in this case
                    if (member == null) {
                        member = new ConnectorMember(name, unknown);
                        members.put(name, member);
                    }
                    member.set().addMember(source, unknown, unknownPart.getNextInstAccess());
                }
            }
            
            /**
             * Add a declared member to the connectors of the set.
             * 
             * This is only used to include nested expandable connectors.
             */
            public void addDeclared(String name) {
                ConnectorMember member = members.get(name);
                if (member == null) 
                    members.put(name, new ConnectorMember(name));
            }
            
            /**
             * Add a duplicate version of the expandable connector.
             * 
             * All encountered duplicate versions are expanded.
             */
            public void addDuplicate(InstComponentDecl connector) {
                connectors.add(connector);
            }
            
            /**
             * Create a list with the components each connector in this set should have.
             * 
             * @param members  the members of this set, sorted by name
             */
            public List<InstComponentDecl> createInstComponents(ConnectorMember[] members, InstComponentDecl parent) {
                List<InstComponentDecl> memberList = new List<InstComponentDecl>();
                memberList.setParent(parent); // Make sure inherited attributes work at once
                for (ConnectorMember member : members)
                    memberList.add(member.createInstComponent(parent));
                return memberList;
            }
            
            private class ConnectorMember implements Comparable<ConnectorMember> {
                
                public final String name;
                private ExpandableSet set;
                private java.util.List<Source> sources;
                private java.util.List<InstAccess> nestledAccesses;
                private InstComponentDecl template;
                private Opt<FArraySubscripts> subscripts;
                private boolean error;
                private boolean calculated;
                
                public ConnectorMember(String name) {
                    this.name = name;
                    sources = new ArrayList<Source>(4);
                    nestledAccesses = new ArrayList<InstAccess>(2);
                    template = null;
                    calculated = false;
                    error = false;
                }
                
                public ConnectorMember(String name, InstAccess target, FArraySubscripts fas) {
                    this(name);
                    addConnection(target, fas);
                }
                
                public ConnectorMember(String name, InstAccess unknown) {
                    this(name);
                    nestledAccesses.add(unknown);
                }
                
                public int compareTo(ConnectorMember other) {
                    return name.compareTo(other.name);
                }
                
                public void addConnection(InstAccess target, FArraySubscripts fas) {
                    sources.add(new Source(target, fas));
                    InstComponentDecl targetVar = target.myInstComponentDecl();
                    ExpandableSet otherSet = map.get(targetVar);
                    if (otherSet == null && targetVar.isExpandableConnector())
                        otherSet = new ExpandableSet(targetVar);
                    if (set == null) 
                        set = otherSet;
                    else
                        set.merge(otherSet);
                }
                
                public void merge(ConnectorMember other) {
                    if (set == null)
                        set = other.set;
                    else
                        set.merge(other.set);
                    sources.addAll(other.sources);
                }
                
                public ExpandableSet set() {
                    if (set == null)
                        set = new ExpandableSet();
                    return set;
                }
                
                /**
                 * Check if all connections to this member are consistent.
                 * 
                 * @return  <code>false</code> if any errors were found
                 */
                public boolean check() {
                    if (!calculated)
                        calculateVariable();
                    return !error;
                }
                
                public InstComponentDecl createInstComponent(InstComponentDecl parent) {
                    InstComponentDecl tmpl = template();
                    if (tmpl.name().equals(name) && tmpl.isChildOf(parent)) {
                        tmpl.setLocalFArraySubscriptsOpt(subscripts());
                        return tmpl;
                    } else {
                        return new InstExpandableConnectorMember(tmpl, subscripts(), name);
                    }
                    // TODO: handle input/output (or is that really needed?)
                }
                
                private InstComponentDecl template() {
                    if (!calculated)
                        calculateVariable();
                    return template;
                }
                
                private Opt<FArraySubscripts> subscripts() {
                    if (!calculated)
                        calculateVariable();
                    return subscripts;
                }
                
                private void calculateVariable() {
                    error = false;
                    
                    // Collect instances of this member from declarations
                    ArrayList<InstComponentDecl> declared = new ArrayList<InstComponentDecl>();
                    for (InstComponentDecl conn : connectors) {
                        InstLookupResult<InstComponentDecl> res = conn.memberInstComponent(name);
                        if (res.successful())
                            declared.add(res.target());
                    }
                    
                    // Calculate size
                    SummedSize ss = new SummedSize();
                    for (InstComponentDecl decl : declared)
                        ss.updateFromDeclaration(decl);
                    for (Source src : sources)
                        src.collectSize(ss);
                    Size s = ss.size;
                    
                    // Create subscripts as size
                    subscripts = new Opt();
                    if (s != Size.SCALAR && s != null) 
                        subscripts.setChild(s.createFArraySubscripts(), 0);
                    
                    // Pick a variable to use as template
                    ASTNode templateErrorNode = null;
                    if (sources.isEmpty() && declared.isEmpty()) {
                        error = true;
                        for (InstAccess nestledAccess : nestledAccesses)
                            nestledAccess.compliance("Nested expandable connectors where some of the intermediate expandable connectors are neither connected to or declared are not supported");
                    } else if (declared.isEmpty()) {
                        template = sources.get(0).template();
                        templateErrorNode = sources.get(0).errorNode();
                    } else {
                        template = declared.get(0);
                        templateErrorNode = template;
                    }
                    
                    // Check types against template
                    if (template != null && !template.checkAsExpandableMemberTemplate(templateErrorNode))
                        error = true;
                    for (Source src : sources)
                        src.checkType(template);
                    for (InstComponentDecl decl : declared) {
                        if (!decl.connectableTypes(template)) {
                            error = true;
                            decl.error("Type of declared member of expandable connector does not match declarations in other expandable connectors in same connection set");
                        }
                    }
                    
                    // Check against connections to non-existing members of non-expandable connectors
                    if (!sources.isEmpty() && set != null && set.connectors.isEmpty() && !set.members.isEmpty()) 
                        for (ConnectorMember m : set.members.values())
                            error = !m.checkNonExisting(template) || error;
                    
                    // Check array index types. If there is a declaration they are checked in FExpSubscript.typeCheckAsIndex;
                    if (declared.isEmpty()) {
                        Source tmpl = null;
                        for (Source src : sources) {
                            if (tmpl == null)
                                tmpl = src;
                            if (!src.checkIndexType(tmpl))
                                break;
                        }
                    }
                    calculated = true;
                }
                
                private boolean checkNonExisting(InstComponentDecl parentTemplate) {
                    boolean res = true;
                    InstComponentDecl myTemplate = (parentTemplate != null) ? parentTemplate.memberInstComponent(name).targetOrNull() : null;
                    if (myTemplate == null) {
                        for (Source s : sources)
                            s.errorNode().error("Can not connect to non-existing member of non-expandable connector in expandable connector");
                        res = false;
                    }
                    if (set != null) 
                        for (ConnectorMember m : set.members.values())
                            res = m.checkNonExisting(myTemplate) && res;
                    return res;
                }
                
                public String toString() {
                    return name + ": " + sources.toString();
                }
                
                private class Source {
                    
                    private InstAccess target;
                    private FArraySubscripts fas;
                    private boolean errorReported = false;
                    
                    public Source(InstAccess target, FArraySubscripts fas) {
                        this.target = target;
                        this.fas = fas;
                    }
                    
                    public void collectSize(SummedSize ss) {
                        // Calculate local size
                        Size s;
                        Size ts = target.size();
                        boolean[] fixed;
                        if (fas != null) {
                            MutableSize ms = new MutableSize(fas.getNumFSubscript());
                            fixed = new boolean[ms.ndims()];
                            int tspos = 0;
                            for (int i = 0; i < fixed.length; i++) {
                                FSubscript sub = fas.getFSubscript(i);
                                int len = (tspos < ts.ndims()) ? ts.get(tspos) : 1;
                                if (!sub.calculateExpandableConnectorSize(ms, i, len)) 
                                    localError();
                                fixed[i] = sub.isColon();
                                if (sub.ndims() > 0) 
                                    tspos++;
                            }
                            if (tspos != ts.ndims())
                                localError();
                            s = ms;
                        } else {
                            s = (ts == Size.SCALAR) ? ts : ts.mutableClone();
                            fixed = new boolean[s.ndims()];
                            Arrays.fill(fixed, true);
                        }
                        if (errorReported)
                            return;                        
                        
                        // Merge with other sizes in set
                        if (!ss.merge(s, fixed))
                            mismatchError();
                   }
                    
                    public void checkType(InstComponentDecl template) {
                        if (!target.myInstComponentDecl().connectableTypes(template))
                            error("Type of component introduced to external connector does not match other connections to same name in connection set or component declared in connector");
                    }
                    
                    public boolean checkIndexType(Source other) {
                        if (fas == null || other.fas == null)
                            return true;
                        for (int dim = 0; dim < Math.min(fas.ndims(), other.fas.ndims()); dim++) {
                            if (!fas.getFSubscript(dim).type().scalarType().typeCompatible(
                                    other.fas.getFSubscript(dim).type().scalarType())) {
                                error("Array index type of component introduced to external connector does not match other"
                                        + " connections to same name in connection set");
                                return false;
                            }
                        }
                        return true;
                    }
                    
                    private void mismatchError() {
                        error("Size introduced for external connector member does not match other connections to same name in connection set or component declared in connector");
                    }
                    
                    private void localError() {
                        error("Can not match size of connector to access introducing member in external connector");
                    }
                    
                    private void error(String err) {
                        error = true;
                        if (!errorReported) {
                            errorReported = true;
                            errorNode().error(err);
                        }
                    }
                    
                    public InstComponentDecl template() {
                        return target.myInstComponentDecl();
                    }
                    
                    public ASTNode errorNode() {
                        return target.getParent();
                    }
                    
                    public String toString() {
                        return target.toString() + ((fas != null) ? (" (" + fas + ")") : "");
                    }
                    
                }
                
                private class SummedSize {
                    
                    public Size size = null;
                    public boolean[] fixed = null;
                    
                    public void updateFromDeclaration(InstComponentDecl icd) {
                        if (!mergeKnownFixed(icd.size())) {
                            error = true;
                            icd.error("Size of declared member of expandable connector does not match declarations in other expandable connectors in same connection set");
                        }
                    }
    
                    private boolean mergeKnownFixed(Size s) {
                        if (s != Size.SCALAR)
                            s = s.mutableClone();
                        boolean[] sFixed = new boolean[s.ndims()];
                        for (int i = 0; i < sFixed.length; i++)
                            sFixed[i] = s.hasValue(i);
                        return merge(s, sFixed);
                    }
    
                    public boolean merge(Size s, boolean[] sFixed) {
                        if (size == null) {
                            size = s;
                            fixed = sFixed;
                        } else if (sFixed.length != fixed.length) {
                            return false;
                        } else {
                            for (int i = 0; i < fixed.length; i++) {
                                int diff = s.get(i) - size.get(i);
                                if (sFixed[i]) {
                                    if (diff == 0) {
                                        fixed[i] = true;
                                    } else if (diff < 0) {
                                        return false;
                                    }
                                } 
                                if (diff > 0) {
                                    if (fixed[i]) {
                                        return false;
                                    } else {
                                        fixed[i] = sFixed[i];
                                        ((MutableSize) size).set(i, s, i);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    
                }
        }

        }


}
