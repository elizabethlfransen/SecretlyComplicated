package io.github.elizabethlfransen.secretlycomplicated.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionUtil {
    private CollectionUtil(){}

    @SafeVarargs
    public static <T> Set<T> setOf(T... items) {
        return new HashSet<>(Arrays.asList(items));
    }

    @SafeVarargs
    public static <TElement> Stream<TElement> union(Collection<TElement>... collections) {
        return Arrays.stream(collections)
                .map(Collection::stream)
                .reduce(Stream.empty(), Stream::concat);
    }
}
