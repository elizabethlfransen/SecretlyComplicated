package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.item.ItemForm;
import io.github.elizabethlfransen.secretlycomplicated.util.Localizable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.setOf;

public class OreBlockMaterialForm implements MaterialForm, Localizable, ItemForm {

    private final SCBlock ore;
    private final String textureName;
    private final Function<String,String> localizedNames;
    private final int color;

    public OreBlockMaterialForm(SCBlock ore, String textureName, int color, Function<String, String> localizedName) {
        this.ore = ore;
        this.textureName = textureName;
        this.color = color;
        this.localizedNames = localizedName;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return setOf(ore);
    }

    public String getTextureName() {
        return textureName;
    }

    public Block getBlock() {
        return ore;
    }

    public void addLocalizations(String locale, LanguageProvider provider) {
        provider.add(ore, localizedNames.apply(locale));
    }

    public Item getItem() {
        return ore.getItem();
    }

    public int getColor() {
        return color;
    }
}

