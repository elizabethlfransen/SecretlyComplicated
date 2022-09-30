package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.block.ColorableBlock;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BlockMaterialFormFactory extends MaterialFormFactory<SimpleBlockMaterialForm> {
    private final String textureName;
    private final BiFunction<SCMaterial, String, String> localizedNames;

    private BlockMaterialFormFactory(String id, String textureName, BiFunction<SCMaterial, String, String> localizedNames) {
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

        public BlockMaterialFormFactory build() {
            HashMap<String, Function<SCMaterial, String>> localizedNames = new HashMap<>(this.localizedNames);
            return new BlockMaterialFormFactory(id, textureName, (element, locale) -> localizedNames.get(locale).apply(element));
        }
    }


    public static Builder builder(String id) {
        return new Builder(id);
    }


    @Override
    public SimpleBlockMaterialForm getMaterialForm(SCMaterial material) {
        // TODO Auto-generated method stub
        return new SimpleBlockMaterialForm(
                new ColorableBlock(SecretlyComplicated.getInstance(), material.color, BlockBehaviour.Properties.of(Material.METAL)),
                textureName,
                locale -> localizedNames.apply(material, locale)
        );
    }

    // @Override
    // public SimpleBlockMaterialForm getMaterialForm(SCMaterial element) {
    //     return new SimpleBlockMaterialForm(new ColorableBlock(SecretlyComplicated.getInstance(), element.color, new Item.Properties()), textureName, locale -> localizedNames.apply(element, locale));
    // }
}
