package io.github.elizabethlfransen.secretlycomplicated.materialform.fluid;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.util.Localizable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.util.Map;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated.MOD_ID;

public class SimpleFluidMaterialForm extends MaterialForm implements Localizable {

    private final ForgeFlowingFluid still;
    private final ForgeFlowingFluid flowing;

    private final BucketItem bucket;
    private final String name;
    private final String fluidDescriptionId;
    private final Function<String, String> fluidLocalizations;
    private final Function<String,String> bucketLocalizations;


    public SimpleFluidMaterialForm(int color, String name, Function<String, String> fluidLocalizations, Function<String, String> bucketLocalizations, DataGenProps dataGenProps) {
        super(dataGenProps);
        this.name = name;
        this.fluidLocalizations = fluidLocalizations;
        this.bucketLocalizations = bucketLocalizations;
        ResourceLocation stillTexture = new ResourceLocation("minecraft","block/water_still");
        ResourceLocation flowingTexture = new ResourceLocation("minecraft", "block/water_flow");
        ResourceLocation overlayTexture = new ResourceLocation("minecraft","block/water_overlay");
        ForgeFlowingFluid.Properties properties = new ForgeFlowingFluid.Properties(
                this::getStill,
                this::getFlowing,
                FluidAttributes.builder(stillTexture, flowingTexture)
                        .overlay(overlayTexture)
                        .color(0xFF000000 | color)
        ).bucket(this::getBucket);
        still = new ForgeFlowingFluid.Source(properties);
        flowing = new ForgeFlowingFluid.Flowing(properties);

        Item.Properties itemProps =new Item.Properties()
                .craftRemainder(Items.BUCKET)
                .stacksTo(1);
        CreativeModeTab tab = SecretlyComplicated.getInstance().tab;
        if(tab != null)
            itemProps.tab(tab);

        bucket = new BucketItem(
                this::getStill,
                itemProps
        );
        fluidDescriptionId = "fluid.%s.%s_fluid_still".formatted(MOD_ID,name);
    }


    public ForgeFlowingFluid getStill() {
        return still;
    }

    public ForgeFlowingFluid getFlowing() {
        return flowing;
    }

    public BucketItem getBucket() {
        return bucket;
    }

    public void addLocalizations(String locale, LanguageProvider provider) {
        provider.add(fluidDescriptionId,fluidLocalizations.apply(locale));
        provider.add(bucket,bucketLocalizations.apply(locale));
    }

    @Override
    public Map<String, Object> getNamedAdditionalRegisters(ResourceLocation id) {
        return Map.of(
                "still", getStill(),
                "flowing", getFlowing(),
                "bucket", getBucket()
        );
    }

    public Item getBucketItem() {
        return bucket;
    }
}
