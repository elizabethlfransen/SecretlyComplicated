package io.github.elizabethlfransen.secretlycomplicated.materialform;

import java.util.Arrays;
import java.util.List;

import static io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForms.*;


public final class CommonMaterialFormFactories {

    public static final List<MaterialFormFactory<?>> parts = Arrays.asList(
            SOLID,
            GEAR,
            PLATE,
            DENSE_PLATE,
            ROD,
            DUST,
            SMALL_DUST,
            TINY_DUST,
            CRUSHED,
            IMPURE_DUST,
            PURE_DUST,
            NUGGET,
            WIRE,
            FLUID,
            BLOCK
    );

    private CommonMaterialFormFactories() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
