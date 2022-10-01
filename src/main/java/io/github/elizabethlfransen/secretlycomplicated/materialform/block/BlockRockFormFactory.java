package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.material.SCRock;
import io.github.elizabethlfransen.secretlycomplicated.materialform.RockFormFactory;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BlockRockFormFactory extends RockFormFactory<OreBlockMaterialForm> {
    private final String textureName;
    private final BiFunction<SCRock, String, String> localizedNames;

    private BlockRockFormFactory(String id, String textureName, BiFunction<SCRock, String, String> localizedNames) {
        super(id);
        this.textureName = textureName;
        this.localizedNames = localizedNames;
    }

    public static final class Builder {
        private final String id;
        private String textureName;
        private final Map<String, Function<SCRock, String>> localizedNames = new HashMap<>();

        private Builder(String id) {
            this.id = id;
            this.textureName = "base_" + id;
        }

        public Builder textureName(String textureName) {
            this.textureName = textureName;
            return this;
        }

        public Builder withLocalizedName(String locale, Function<SCRock, String> localizedName) {
            localizedNames.put(locale, localizedName);
            return this;
        }

        public BlockRockFormFactory build() {
            HashMap<String, Function<SCRock, String>> localizedNames = new HashMap<>(this.localizedNames);
            return new BlockRockFormFactory(id, textureName, (element, locale) -> localizedNames.get(locale).apply(element));
        }
    }


    public static Builder builder(String id) {
        return new Builder(id);
    }


    @Override
    public OreBlockMaterialForm getMaterialForm(SCRock material) {
        // TODO Auto-generated method stub
        return new OreBlockMaterialForm(
                new SCBlock(SecretlyComplicated.getInstance(), BlockBehaviour.Properties.of(Material.METAL)),
                textureName, material.color, locale -> localizedNames.apply(material, locale)
        );
    }

    // @Override
    // public SimpleBlockMaterialForm getMaterialForm(SCRock element) {
    //     return new SimpleBlockMaterialForm(new ColorableBlock(SecretlyComplicated.getInstance(), element.color, new Item.Properties()), textureName, locale -> localizedNames.apply(element, locale));
    // }
}
