package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForms.*;
import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.union;


public final class CommonMaterialFormFactories {

    public static final List<MaterialFormFactory<?>> PARTS = Arrays.asList(
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
            BLOCK,
            GAS
    );

    public static final List<MaterialFormFactory<?>> MACHINE_BLOCKS = Arrays.asList(
            BLOCK
    );

    public static final List<MaterialFormFactory<?>> FLUIDS = Arrays.asList(
            FLUID
    );

    public static final List<MaterialFormFactory<?>> GEMS = Arrays.asList(
            GEM,
            DUST,
            BLOCK
    );

    public static final List<MaterialFormFactory<?>> CHUNKS = Arrays.asList(
            CHUNK,
            DUST,
            BLOCK
    );
    
    public static final List<MaterialFormFactory<?>> COMPONENTS = Arrays.asList(
            COMPONENT
    );

    public static final List<MaterialFormFactory<?>> OVERWORLD_ORES = Arrays.asList(
            ORE,
            DEEPSLATE_ORE,
            NETHERRACK_ORE,
            END_ORE,
        //     GRAVEL_ORE,
        //     SAND_ORE,
            DIORITE_ORE,
            ANDESITE_ORE,
            GRANITE_ORE
    );

    public static final List<MaterialFormFactory<?>> GASES = Arrays.asList(
                GAS
        );

    public static final Set<MaterialFormFactory<?>> ORES = union(OVERWORLD_ORES)
            .collect(Collectors.toSet());


    private CommonMaterialFormFactories() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
