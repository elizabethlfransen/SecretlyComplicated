package io.github.elizabethlfransen.secretlycomplicated.materialform.item;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.util.Localizable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

import static io.github.elizabethlfransen.secretlycomplicated.util.CollectionUtil.setOf;

public class SimpleItemMaterialForm extends MaterialForm<SimpleItemMaterialForm> implements Localizable, ItemForm {

    private final Item item;
    private final String textureName;
    private final Function<String,String> localizedNames;
    private final int color;

    public SimpleItemMaterialForm(MaterialFormFactory<SimpleItemMaterialForm> factory, Item item, String textureName, int color, Function<String, String> localizedName, DataGenProps dataGenProps) {
        super(factory, dataGenProps);
        this.item = item;
        this.textureName = textureName;
        this.color = color;
        this.localizedNames = localizedName;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return setOf(item);
    }


    public String getTextureName() {
        return textureName;
    }


    public Item getItem() {
        return item;
    }

    public void addLocalizations(String locale, LanguageProvider provider) {
        provider.add(item, localizedNames.apply(locale));
    }

    public int getColor() {
        return this.color;
    }
}
