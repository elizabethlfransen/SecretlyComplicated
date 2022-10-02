package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.UseOreModelProp;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.BlockMaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.materialform.fluid.FluidMaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.materialform.gas.GasMaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.materialform.item.ItemMaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.materialform.ore.OreMaterialFormFactory;

import static io.github.elizabethlfransen.secretlycomplicated.util.Locales.EN_US;

public final class MaterialForms {
    private MaterialForms() {
    }

    public static final ItemMaterialFormFactory SOLID = ItemMaterialFormFactory.builder("solid")
            .withLocalization(EN_US, element ->
                    element.metallic ? element.getCapitalizedName() + " Ingot"
                            : "Solid " + element.getCapitalizedName()
            )
            .build();

    public static final FluidMaterialFormFactory FLUID = FluidMaterialFormFactory.builder("fluid")
            .withFluidLocalization(EN_US, element ->
                    element.metallic ? "Molten " + element.getCapitalizedName()
                            : "Liquid " + element.getCapitalizedName()
            )
            .withBucketLocalization(EN_US, element ->
                    element.metallic ? "Bucket of Molten " + element.getCapitalizedName()
                            : "Bucket of Liquid " + element.getCapitalizedName()
            )
            .build();

    public static final BlockMaterialFormFactory BLOCK = BlockMaterialFormFactory.builder("block")
            .withLocalization(EN_US, element ->
                    element.metallic ? element.getCapitalizedName() + " Block"
                            : "Solid " + element.getCapitalizedName()
            )
            .build();

    public static final ItemMaterialFormFactory GEAR = ItemMaterialFormFactory.builder("gear")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Gear")
            .build();
    public static final ItemMaterialFormFactory PLATE = ItemMaterialFormFactory.builder("plate")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Plate")
            .build();
    public static final ItemMaterialFormFactory DENSE_PLATE = ItemMaterialFormFactory.builder("dense_plate")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Dense Plate")
            .build();
    public static final ItemMaterialFormFactory ROD = ItemMaterialFormFactory.builder("rod")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Rod")
            .build();
    public static final ItemMaterialFormFactory DUST = ItemMaterialFormFactory.builder("dust")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Dust")
            .build();
    public static final ItemMaterialFormFactory SMALL_DUST = ItemMaterialFormFactory.builder("small_dust")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Small Dust")
            .build();
    public static final ItemMaterialFormFactory TINY_DUST = ItemMaterialFormFactory.builder("tiny_dust")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Tiny Dust")
            .build();
    public static final ItemMaterialFormFactory CRUSHED = ItemMaterialFormFactory.builder("crushed")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Crushed")
            .build();
    public static final ItemMaterialFormFactory IMPURE_DUST = ItemMaterialFormFactory.builder("impure_dust")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Impure Dust")
            .build();
    public static final ItemMaterialFormFactory PURE_DUST = ItemMaterialFormFactory.builder("pure_dust")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Pure Dust")
            .build();
    public static final ItemMaterialFormFactory NUGGET = ItemMaterialFormFactory.builder("nugget")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Nugget")
            .build();
    public static final ItemMaterialFormFactory WIRE = ItemMaterialFormFactory.builder("wire")
            .withLocalization(EN_US, element -> element.getCapitalizedName() + " Wire")
            .build();
    public static final GasMaterialFormFactory GAS = GasMaterialFormFactory.builder("gas")
            .withLocalization(EN_US, material -> material.getCapitalizedName() + " Gas")
            .build();

    public static final OreMaterialFormFactory ORE = OreMaterialFormFactory.builder("ore")
            .withLocalization(EN_US, material -> material.getCapitalizedName() + " Ore")
            .withDataGenProp(new UseOreModelProp("minecraft:block/stone"))
            .build();

    public static final OreMaterialFormFactory DEEPSLATE_ORE = OreMaterialFormFactory.builder("deepslate_ore")
            .withLocalization(EN_US, material -> "Deepslate %s Ore".formatted(material.getCapitalizedName()))
            .withDataGenProp(new UseOreModelProp("minecraft:block/deepslate"))
            .build();
}
