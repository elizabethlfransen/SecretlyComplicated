package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.setOf;

public class SimpleBlockMaterialForm implements BlockMaterialForm {

    private final Block block;
    private final String textureName;
    private final Function<String,String> localizedNames;

    public SimpleBlockMaterialForm(Block block, String textureName, Function<String, String> localizedName) {
        this.block = block;
        this.textureName = textureName;
        this.localizedNames = localizedName;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return setOf(block);
    }

    @Override
    public String getTextureName() {
        return textureName;
    }

    @Override
    public Block getBlock() {
        return block;
    }

    @Override
    public void addLocalizations(String locale, LanguageProvider provider) {
        provider.add(block, localizedNames.apply(locale));
    }
}

