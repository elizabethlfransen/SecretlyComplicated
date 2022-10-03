package io.github.elizabethlfransen.secretlycomplicated.materialform.ore;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.BlockForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.item.ItemForm;
import io.github.elizabethlfransen.secretlycomplicated.util.Localizable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.setOf;

public class OreMaterialForm extends MaterialForm<OreMaterialForm> implements Localizable, ItemForm, BlockForm {
    private final SCBlock block;
    private final int color;

    private final Function<String, String> localeProvider;

    public OreMaterialForm(MaterialFormFactory<OreMaterialForm> factory, SCBlock block, int color, Function<String, String> localeProvider, DataGenProps dataGenProps) {
        super(factory, dataGenProps);
        this.block = block;
        this.color = color;
        this.localeProvider = localeProvider;
    }

    @Override
    public SCBlock getBlock() {
        return block;
    }

    @Override
    public ItemLike getItem() {
        return block.getItem();
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return setOf(block);
    }

    @Override
    public void addLocalizations(String locale, LanguageProvider languageProvider) {
        languageProvider.add(getBlock(), localeProvider.apply(locale));
    }
}
