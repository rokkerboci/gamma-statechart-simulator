/**
 * Generated from platform:/resource/com.triad.school.gamma.simulator.query/src/com/triad/school/gamma/simulator/query/fireableTransitions.vql
 */
package com.triad.school.gamma.simulator.query;

import hu.bme.mit.gamma.statechart.interface_.Port;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern ports(port: Port) {
 *         	Port.interfaceRealization(port, interfaceRealization);
 *         	InterfaceRealization.interface(interfaceRealization, interface);
 *         	InterfaceRealization.realizationMode(interfaceRealization, ::REQUIRED);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Ports extends BaseGeneratedEMFQuerySpecification<Ports.Matcher> {
  /**
   * Pattern-specific match representation of the com.triad.school.gamma.simulator.query.ports pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Port fPort;
    
    private static List<String> parameterNames = makeImmutableList("port");
    
    private Match(final Port pPort) {
      this.fPort = pPort;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "port": return this.fPort;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPort;
          default: return null;
      }
    }
    
    public Port getPort() {
      return this.fPort;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("port".equals(parameterName) ) {
          this.fPort = (Port) newValue;
          return true;
      }
      return false;
    }
    
    public void setPort(final Port pPort) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPort = pPort;
    }
    
    @Override
    public String patternName() {
      return "com.triad.school.gamma.simulator.query.ports";
    }
    
    @Override
    public List<String> parameterNames() {
      return Ports.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPort};
    }
    
    @Override
    public Ports.Match toImmutable() {
      return isMutable() ? newMatch(fPort) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"port\"=" + prettyPrintValue(fPort));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPort);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Ports.Match)) {
          Ports.Match other = (Ports.Match) obj;
          return Objects.equals(fPort, other.fPort);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public Ports specification() {
      return Ports.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Ports.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Ports.Match newMutableMatch(final Port pPort) {
      return new Mutable(pPort);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Ports.Match newMatch(final Port pPort) {
      return new Immutable(pPort);
    }
    
    private static final class Mutable extends Ports.Match {
      Mutable(final Port pPort) {
        super(pPort);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Ports.Match {
      Immutable(final Port pPort) {
        super(pPort);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.triad.school.gamma.simulator.query.ports pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern ports(port: Port) {
   * 	Port.interfaceRealization(port, interfaceRealization);
   * 	InterfaceRealization.interface(interfaceRealization, interface);
   * 	InterfaceRealization.realizationMode(interfaceRealization, ::REQUIRED);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Ports
   * 
   */
  public static class Matcher extends BaseMatcher<Ports.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Ports.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static Ports.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PORT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Ports.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Ports.Match> getAllMatches(final Port pPort) {
      return rawStreamAllMatches(new Object[]{pPort}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Ports.Match> streamAllMatches(final Port pPort) {
      return rawStreamAllMatches(new Object[]{pPort});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Ports.Match> getOneArbitraryMatch(final Port pPort) {
      return rawGetOneArbitraryMatch(new Object[]{pPort});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pPort) {
      return rawHasMatch(new Object[]{pPort});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pPort) {
      return rawCountMatches(new Object[]{pPort});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pPort, final Consumer<? super Ports.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPort}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Ports.Match newMatch(final Port pPort) {
      return Ports.Match.newMatch(pPort);
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfport(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PORT, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport() {
      return rawStreamAllValuesOfport(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfport() {
      return rawStreamAllValuesOfport(emptyArray());
    }
    
    @Override
    protected Ports.Match tupleToMatch(final Tuple t) {
      try {
          return Ports.Match.newMatch((Port) t.get(POSITION_PORT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Ports.Match arrayToMatch(final Object[] match) {
      try {
          return Ports.Match.newMatch((Port) match[POSITION_PORT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Ports.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Ports.Match.newMutableMatch((Port) match[POSITION_PORT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<Ports.Matcher> querySpecification() {
      return Ports.instance();
    }
  }
  
  private Ports() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Ports instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Ports.Matcher instantiate(final ViatraQueryEngine engine) {
    return Ports.Matcher.on(engine);
  }
  
  @Override
  public Ports.Matcher instantiate() {
    return Ports.Matcher.create();
  }
  
  @Override
  public Ports.Match newEmptyMatch() {
    return Ports.Match.newEmptyMatch();
  }
  
  @Override
  public Ports.Match newMatch(final Object... parameters) {
    return Ports.Match.newMatch((hu.bme.mit.gamma.statechart.interface_.Port) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Ports} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Ports#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Ports INSTANCE = new Ports();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final Ports.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_port = new PParameter("port", "hu.bme.mit.gamma.statechart.interface_.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Port")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_port);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.triad.school.gamma.simulator.query.ports";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("port");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_port = body.getOrCreateVariableByName("port");
          PVariable var_interfaceRealization = body.getOrCreateVariableByName("interfaceRealization");
          PVariable var_interface = body.getOrCreateVariableByName("interface");
          new TypeConstraint(body, Tuples.flatTupleOf(var_port), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Port")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_port, parameter_port)
          ));
          // 	Port.interfaceRealization(port, interfaceRealization)
          new TypeConstraint(body, Tuples.flatTupleOf(var_port), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Port")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_port, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Port", "interfaceRealization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "InterfaceRealization")));
          new Equality(body, var__virtual_0_, var_interfaceRealization);
          // 	InterfaceRealization.interface(interfaceRealization, interface)
          new TypeConstraint(body, Tuples.flatTupleOf(var_interfaceRealization), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "InterfaceRealization")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_interfaceRealization, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "InterfaceRealization", "interface")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Interface")));
          new Equality(body, var__virtual_1_, var_interface);
          // 	InterfaceRealization.realizationMode(interfaceRealization, ::REQUIRED)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, hu.bme.mit.gamma.statechart.interface_.RealizationMode.get("REQUIRED"));
          new TypeConstraint(body, Tuples.flatTupleOf(var_interfaceRealization), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "InterfaceRealization")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_interfaceRealization, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "InterfaceRealization", "realizationMode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "RealizationMode")));
          new Equality(body, var__virtual_3_, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}