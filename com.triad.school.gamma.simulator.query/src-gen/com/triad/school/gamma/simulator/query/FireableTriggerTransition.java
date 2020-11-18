/**
 * Generated from platform:/resource/com.triad.school.gamma.simulator.query/src/com/triad/school/gamma/simulator/query/fireableTransitions.vql
 */
package com.triad.school.gamma.simulator.query;

import com.triad.school.gamma.simulator.query.ActiveState;
import hu.bme.mit.gamma.statechart.interface_.Event;
import hu.bme.mit.gamma.statechart.statechart.StateNode;
import hu.bme.mit.gamma.statechart.statechart.Transition;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
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
 *         pattern fireableTriggerTransition(source: StateNode, transition: Transition, target: StateNode, event: Event) {
 *         	Transition.sourceState(transition, source);
 *         	Transition.targetState(transition, target);
 *         	
 *         	find activeState(source);
 *         	
 *         	Transition.trigger(transition, trigger);
 *         	EventTrigger.eventReference(trigger, eventReference);
 *         	PortEventReference.event(eventReference, event);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FireableTriggerTransition extends BaseGeneratedEMFQuerySpecification<FireableTriggerTransition.Matcher> {
  /**
   * Pattern-specific match representation of the com.triad.school.gamma.simulator.query.fireableTriggerTransition pattern,
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
    private StateNode fSource;
    
    private Transition fTransition;
    
    private StateNode fTarget;
    
    private Event fEvent;
    
    private static List<String> parameterNames = makeImmutableList("source", "transition", "target", "event");
    
    private Match(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      this.fSource = pSource;
      this.fTransition = pTransition;
      this.fTarget = pTarget;
      this.fEvent = pEvent;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "source": return this.fSource;
          case "transition": return this.fTransition;
          case "target": return this.fTarget;
          case "event": return this.fEvent;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fSource;
          case 1: return this.fTransition;
          case 2: return this.fTarget;
          case 3: return this.fEvent;
          default: return null;
      }
    }
    
    public StateNode getSource() {
      return this.fSource;
    }
    
    public Transition getTransition() {
      return this.fTransition;
    }
    
    public StateNode getTarget() {
      return this.fTarget;
    }
    
    public Event getEvent() {
      return this.fEvent;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("source".equals(parameterName) ) {
          this.fSource = (StateNode) newValue;
          return true;
      }
      if ("transition".equals(parameterName) ) {
          this.fTransition = (Transition) newValue;
          return true;
      }
      if ("target".equals(parameterName) ) {
          this.fTarget = (StateNode) newValue;
          return true;
      }
      if ("event".equals(parameterName) ) {
          this.fEvent = (Event) newValue;
          return true;
      }
      return false;
    }
    
    public void setSource(final StateNode pSource) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSource = pSource;
    }
    
    public void setTransition(final Transition pTransition) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTransition = pTransition;
    }
    
    public void setTarget(final StateNode pTarget) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTarget = pTarget;
    }
    
    public void setEvent(final Event pEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEvent = pEvent;
    }
    
    @Override
    public String patternName() {
      return "com.triad.school.gamma.simulator.query.fireableTriggerTransition";
    }
    
    @Override
    public List<String> parameterNames() {
      return FireableTriggerTransition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSource, fTransition, fTarget, fEvent};
    }
    
    @Override
    public FireableTriggerTransition.Match toImmutable() {
      return isMutable() ? newMatch(fSource, fTransition, fTarget, fEvent) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
      result.append("\"transition\"=" + prettyPrintValue(fTransition) + ", ");
      result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
      result.append("\"event\"=" + prettyPrintValue(fEvent));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fSource, fTransition, fTarget, fEvent);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FireableTriggerTransition.Match)) {
          FireableTriggerTransition.Match other = (FireableTriggerTransition.Match) obj;
          return Objects.equals(fSource, other.fSource) && Objects.equals(fTransition, other.fTransition) && Objects.equals(fTarget, other.fTarget) && Objects.equals(fEvent, other.fEvent);
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
    public FireableTriggerTransition specification() {
      return FireableTriggerTransition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FireableTriggerTransition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FireableTriggerTransition.Match newMutableMatch(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return new Mutable(pSource, pTransition, pTarget, pEvent);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FireableTriggerTransition.Match newMatch(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return new Immutable(pSource, pTransition, pTarget, pEvent);
    }
    
    private static final class Mutable extends FireableTriggerTransition.Match {
      Mutable(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
        super(pSource, pTransition, pTarget, pEvent);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends FireableTriggerTransition.Match {
      Immutable(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
        super(pSource, pTransition, pTarget, pEvent);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.triad.school.gamma.simulator.query.fireableTriggerTransition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern fireableTriggerTransition(source: StateNode, transition: Transition, target: StateNode, event: Event) {
   * 	Transition.sourceState(transition, source);
   * 	Transition.targetState(transition, target);
   * 	
   * 	find activeState(source);
   * 	
   * 	Transition.trigger(transition, trigger);
   * 	EventTrigger.eventReference(trigger, eventReference);
   * 	PortEventReference.event(eventReference, event);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FireableTriggerTransition
   * 
   */
  public static class Matcher extends BaseMatcher<FireableTriggerTransition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FireableTriggerTransition.Matcher on(final ViatraQueryEngine engine) {
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
    public static FireableTriggerTransition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SOURCE = 0;
    
    private static final int POSITION_TRANSITION = 1;
    
    private static final int POSITION_TARGET = 2;
    
    private static final int POSITION_EVENT = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FireableTriggerTransition.Matcher.class);
    
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
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FireableTriggerTransition.Match> getAllMatches(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawStreamAllMatches(new Object[]{pSource, pTransition, pTarget, pEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FireableTriggerTransition.Match> streamAllMatches(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawStreamAllMatches(new Object[]{pSource, pTransition, pTarget, pEvent});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FireableTriggerTransition.Match> getOneArbitraryMatch(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawGetOneArbitraryMatch(new Object[]{pSource, pTransition, pTarget, pEvent});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawHasMatch(new Object[]{pSource, pTransition, pTarget, pEvent});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawCountMatches(new Object[]{pSource, pTransition, pTarget, pEvent});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent, final Consumer<? super FireableTriggerTransition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSource, pTransition, pTarget, pEvent}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FireableTriggerTransition.Match newMatch(final StateNode pSource, final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return FireableTriggerTransition.Match.newMatch(pSource, pTransition, pTarget, pEvent);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<StateNode> rawStreamAllValuesOfsource(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SOURCE, parameters).map(StateNode.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateNode> getAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<StateNode> streamAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StateNode> streamAllValuesOfsource(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StateNode> streamAllValuesOfsource(final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawStreamAllValuesOfsource(new Object[]{null, pTransition, pTarget, pEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateNode> getAllValuesOfsource(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateNode> getAllValuesOfsource(final Transition pTransition, final StateNode pTarget, final Event pEvent) {
      return rawStreamAllValuesOfsource(new Object[]{null, pTransition, pTarget, pEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Transition> rawStreamAllValuesOftransition(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRANSITION, parameters).map(Transition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition() {
      return rawStreamAllValuesOftransition(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOftransition() {
      return rawStreamAllValuesOftransition(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOftransition(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOftransition(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOftransition(final StateNode pSource, final StateNode pTarget, final Event pEvent) {
      return rawStreamAllValuesOftransition(new Object[]{pSource, null, pTarget, pEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOftransition(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition(final StateNode pSource, final StateNode pTarget, final Event pEvent) {
      return rawStreamAllValuesOftransition(new Object[]{pSource, null, pTarget, pEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<StateNode> rawStreamAllValuesOftarget(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGET, parameters).map(StateNode.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateNode> getAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<StateNode> streamAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StateNode> streamAllValuesOftarget(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StateNode> streamAllValuesOftarget(final StateNode pSource, final Transition pTransition, final Event pEvent) {
      return rawStreamAllValuesOftarget(new Object[]{pSource, pTransition, null, pEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateNode> getAllValuesOftarget(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateNode> getAllValuesOftarget(final StateNode pSource, final Transition pTransition, final Event pEvent) {
      return rawStreamAllValuesOftarget(new Object[]{pSource, pTransition, null, pEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Event> rawStreamAllValuesOfevent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EVENT, parameters).map(Event.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent() {
      return rawStreamAllValuesOfevent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Event> streamAllValuesOfevent() {
      return rawStreamAllValuesOfevent(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Event> streamAllValuesOfevent(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOfevent(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Event> streamAllValuesOfevent(final StateNode pSource, final Transition pTransition, final StateNode pTarget) {
      return rawStreamAllValuesOfevent(new Object[]{pSource, pTransition, pTarget, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent(final FireableTriggerTransition.Match partialMatch) {
      return rawStreamAllValuesOfevent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent(final StateNode pSource, final Transition pTransition, final StateNode pTarget) {
      return rawStreamAllValuesOfevent(new Object[]{pSource, pTransition, pTarget, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected FireableTriggerTransition.Match tupleToMatch(final Tuple t) {
      try {
          return FireableTriggerTransition.Match.newMatch((StateNode) t.get(POSITION_SOURCE), (Transition) t.get(POSITION_TRANSITION), (StateNode) t.get(POSITION_TARGET), (Event) t.get(POSITION_EVENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FireableTriggerTransition.Match arrayToMatch(final Object[] match) {
      try {
          return FireableTriggerTransition.Match.newMatch((StateNode) match[POSITION_SOURCE], (Transition) match[POSITION_TRANSITION], (StateNode) match[POSITION_TARGET], (Event) match[POSITION_EVENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FireableTriggerTransition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FireableTriggerTransition.Match.newMutableMatch((StateNode) match[POSITION_SOURCE], (Transition) match[POSITION_TRANSITION], (StateNode) match[POSITION_TARGET], (Event) match[POSITION_EVENT]);
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
    public static IQuerySpecification<FireableTriggerTransition.Matcher> querySpecification() {
      return FireableTriggerTransition.instance();
    }
  }
  
  private FireableTriggerTransition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FireableTriggerTransition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected FireableTriggerTransition.Matcher instantiate(final ViatraQueryEngine engine) {
    return FireableTriggerTransition.Matcher.on(engine);
  }
  
  @Override
  public FireableTriggerTransition.Matcher instantiate() {
    return FireableTriggerTransition.Matcher.create();
  }
  
  @Override
  public FireableTriggerTransition.Match newEmptyMatch() {
    return FireableTriggerTransition.Match.newEmptyMatch();
  }
  
  @Override
  public FireableTriggerTransition.Match newMatch(final Object... parameters) {
    return FireableTriggerTransition.Match.newMatch((hu.bme.mit.gamma.statechart.statechart.StateNode) parameters[0], (hu.bme.mit.gamma.statechart.statechart.Transition) parameters[1], (hu.bme.mit.gamma.statechart.statechart.StateNode) parameters[2], (hu.bme.mit.gamma.statechart.interface_.Event) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link FireableTriggerTransition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FireableTriggerTransition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FireableTriggerTransition INSTANCE = new FireableTriggerTransition();
    
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
    private static final FireableTriggerTransition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_source = new PParameter("source", "hu.bme.mit.gamma.statechart.statechart.StateNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "StateNode")), PParameterDirection.INOUT);
    
    private final PParameter parameter_transition = new PParameter("transition", "hu.bme.mit.gamma.statechart.statechart.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition")), PParameterDirection.INOUT);
    
    private final PParameter parameter_target = new PParameter("target", "hu.bme.mit.gamma.statechart.statechart.StateNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "StateNode")), PParameterDirection.INOUT);
    
    private final PParameter parameter_event = new PParameter("event", "hu.bme.mit.gamma.statechart.interface_.Event", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Event")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_source, parameter_transition, parameter_target, parameter_event);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.triad.school.gamma.simulator.query.fireableTriggerTransition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("source","transition","target","event");
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
          PVariable var_source = body.getOrCreateVariableByName("source");
          PVariable var_transition = body.getOrCreateVariableByName("transition");
          PVariable var_target = body.getOrCreateVariableByName("target");
          PVariable var_event = body.getOrCreateVariableByName("event");
          PVariable var_trigger = body.getOrCreateVariableByName("trigger");
          PVariable var_eventReference = body.getOrCreateVariableByName("eventReference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "StateNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "StateNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Event")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_source, parameter_source),
             new ExportedParameter(body, var_transition, parameter_transition),
             new ExportedParameter(body, var_target, parameter_target),
             new ExportedParameter(body, var_event, parameter_event)
          ));
          // 	Transition.sourceState(transition, source)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition", "sourceState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "StateNode")));
          new Equality(body, var__virtual_0_, var_source);
          // 	Transition.targetState(transition, target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition", "targetState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "StateNode")));
          new Equality(body, var__virtual_1_, var_target);
          // 		find activeState(source)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_source), ActiveState.instance().getInternalQueryRepresentation());
          // 		Transition.trigger(transition, trigger)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "Transition", "trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Trigger")));
          new Equality(body, var__virtual_2_, var_trigger);
          // 	EventTrigger.eventReference(trigger, eventReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "EventTrigger")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "EventTrigger", "eventReference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "EventReference")));
          new Equality(body, var__virtual_3_, var_eventReference);
          // 	PortEventReference.event(eventReference, event)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eventReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "PortEventReference")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eventReference, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Statechart", "PortEventReference", "event")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mit.bme.hu/gamma/statechart/Model/Interface", "Event")));
          new Equality(body, var__virtual_4_, var_event);
          bodies.add(body);
      }
      return bodies;
    }
  }
}