package io.github.elizabethlfransen.secretlycomplicated.materialform.item;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.item.SCItem;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ItemMaterialFormFactory extends MaterialFormFactory<SimpleItemMaterialForm> {
    private final String textureName;
    private final BiFunction<SCMaterial, String, String> localizedNames;

    private ItemMaterialFormFactory(String id, String textureName, BiFunction<SCMaterial, String, String> localizedNames) {
        super(id);
        this.textureName = textureName;
        this.localizedNames = localizedNames;
    }

    public static final class Builder {
        private final String id;
        private String textureName;
        private final Map<String, Function<SCMaterial, String>> localizedNames = new HashMap<>();
        private Builder(String id) {
            this.id = id;
            this.textureName = "base_" + id;
        }

        public Builder textureName(String textureName) {
            this.textureName = textureName;
            return this;
        }

        public Builder withLocalizedName(String locale, Function<SCMaterial, String> localizedName) {
            localizedNames.put(locale, localizedName);
            return this;
        }

        public ItemMaterialFormFactory build() {
            HashMap<String, Function<SCMaterial, String>> localizedNames = new HashMap<>(this.localizedNames);
            return new ItemMaterialFormFactory(id, textureName, (element, locale) -> localizedNames.get(locale).apply(element));
        }
    }


    public static Builder builder(String id) {
        return new Builder(id);
    }

    @Override
    public SimpleItemMaterialForm getMaterialForm(SCMaterial element) {
        return new SimpleItemMaterialForm(new SCItem(SecretlyComplicated.getInstance(), new Item.Properties()), textureName, element.color, locale -> localizedNames.apply(element, locale));
    }
}
