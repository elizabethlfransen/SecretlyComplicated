package io.github.elizabethlfransen.secretlycomplicated.materialform;

import java.util.Arrays;
import java.util.List;

import static io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForms.*;


public final class OreMaterialFormFactories {

    public static final List<RockFormFactory<?>> rocks = Arrays.asList(
        ORE
    );

    private OreMaterialFormFactories() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
