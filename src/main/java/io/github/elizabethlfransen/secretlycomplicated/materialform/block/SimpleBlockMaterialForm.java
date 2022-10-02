package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.util.Localizable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.setOf;

public class SimpleBlockMaterialForm extends MaterialForm implements BlockForm, Localizable {

    private final SCBlock block;
    private final Function<String,String> localizedNames;
    private final int color;

    public SimpleBlockMaterialForm(SCBlock block, int color, Function<String, String> localizedName, DataGenProps dataGenProps) {
        super(dataGenProps);
        this.block = block;
        this.color = color;
        this.localizedNames = localizedName;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return setOf(block);
    }

    public Block getBlock() {
        return block;
    }

    public void addLocalizations(String locale, LanguageProvider provider) {
        provider.add(block, localizedNames.apply(locale));
    }

    public Item getItem() {
        return block.getItem();
    }

    public int getColor() {
        return color;
    }
}

