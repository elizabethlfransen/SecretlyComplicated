package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.materialform.block.BlockRockFormFactory;

import static io.github.elizabethlfransen.secretlycomplicated.util.Locales.EN_US;

public final class RockMaterialForms {
    private RockMaterialForms() {
    }

    public static final BlockRockFormFactory ORE = BlockRockFormFactory.builder("ore")
            .withLocalizedName(EN_US, element -> element.getCapitalizedName() + " Ore")
            .build();
}
