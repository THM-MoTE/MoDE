package de.thm.mni.mote.mode.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class ImmutableListCollector {
  
  private static <t, A extends List<t>> Collector<t, A, List<t>> toImmutableList(Supplier<A> collectionFactory) {
    return Collector.of(collectionFactory, List::add, (left, right) -> {
      left.addAll(right);
      return left;
    }, Collections::unmodifiableList);
  }
  
  public static <t> Collector<t, List<t>, List<t>> toImmutableList() {
    return toImmutableList(ArrayList::new);
  }
}