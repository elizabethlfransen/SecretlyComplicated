package io.github.elizabethlfransen.secretlycomplicated.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtil {
    private CollectionUtil(){}

    @SafeVarargs
    public static <T> Set<T> setOf(T... items) {
        return new HashSet<>(Arrays.asList(items));
    }
}
