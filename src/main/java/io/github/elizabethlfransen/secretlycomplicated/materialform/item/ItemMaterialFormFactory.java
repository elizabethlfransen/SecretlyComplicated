package io.github.elizabethlfransen.secretlycomplicated.materialform.item;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement;
import io.github.elizabethlfransen.secretlycomplicated.item.ColorableItem;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ItemMaterialFormFactory extends MaterialFormFactory<SimpleItemMaterialForm> {
    private final String textureName;
    private final BiFunction<SCElement, String, String> localizedNames;

    private ItemMaterialFormFactory(String id, String textureName, BiFunction<SCElement, String, String> localizedNames) {
        super(id);
        this.textureName = textureName;
        this.localizedNames = localizedNames;
    }

    public static final class Builder {
        private final String id;
        private String textureName;
        private final Map<String, Function<SCElement, String>> localizedNames = new HashMap<>();
        private Builder(String id) {
            this.id = id;
            this.textureName = "base_" + id;
        }

        public Builder textureName(String textureName) {
            this.textureName = textureName;
            return this;
        }

        public Builder withLocalizedName(String locale, Function<SCElement, String> localizedName) {
            localizedNames.put(locale, localizedName);
            return this;
        }

        public ItemMaterialFormFactory build() {
            HashMap<String, Function<SCElement, String>> localizedNames = new HashMap<>(this.localizedNames);
            return new ItemMaterialFormFactory(id, textureName, (element, locale) -> localizedNames.get(locale).apply(element));
        }
    }


    public static Builder builder(String id) {
        return new Builder(id);
    }

    @Override
    public SimpleItemMaterialForm getMaterialForm(SCElement element) {
        return new SimpleItemMaterialForm(new ColorableItem(SecretlyComplicated.getInstance(), element.color, new Item.Properties()), textureName, locale -> localizedNames.apply(element, locale));
    }
}
