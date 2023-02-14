package io.github.elizabethlfransen.secretlycomplicated.materialform.item;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.item.SCItem;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.BaseLocalizableMaterialFormFactoryBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.LocalizableMaterialFormFactory;
import net.minecraft.world.item.Item;

import java.util.function.BiFunction;

public class ItemMaterialFormFactory extends LocalizableMaterialFormFactory<SimpleItemMaterialForm> {
    private final String textureName;

    private ItemMaterialFormFactory(String id, String textureName, BiFunction<SCMaterial, String, String> localizedNames, DataGenProps dataGenProps) {
        super(id, localizedNames, dataGenProps);
        this.textureName = textureName;
    }

    public static final class Builder extends BaseLocalizableMaterialFormFactoryBuilder<SimpleItemMaterialForm,ItemMaterialFormFactory,Builder> {
        private Builder(String id) {
            super(id);
        }

        @Override
        protected Builder getSelf() {
            return this;
        }

        public ItemMaterialFormFactory build() {
            return new ItemMaterialFormFactory(id, "base_" + id, getLocalizationProvider(), dataGenProps);
        }
    }


    public static Builder builder(String id) {
        return new Builder(id);
    }

    @Override
    public SimpleItemMaterialForm getMaterialForm(SCMaterial material) {
        return new SimpleItemMaterialForm(
                new SCItem(SecretlyComplicated.getInstance(), new Item.Properties()),
                textureName,
                material.color,
                getLocalizationProvider(material),
                getDataGenProps());
    }
}