package io.github.elizabethlfransen.secretlycomplicated.materialform.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.setOf;

public class SimpleItemMaterialForm implements ItemMaterialForm {

    private final Item item;
    private final String textureName;
    private final Function<String,String> localizedNames;

    public SimpleItemMaterialForm(Item item, String textureName, Function<String, String> localizedName) {
        this.item = item;
        this.textureName = textureName;
        this.localizedNames = localizedName;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return setOf(item);
    }

    @Override
    public String getTextureName() {
        return textureName;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public void addLocalizations(String locale, LanguageProvider provider) {
        provider.add(item, localizedNames.apply(locale));
    }
}
