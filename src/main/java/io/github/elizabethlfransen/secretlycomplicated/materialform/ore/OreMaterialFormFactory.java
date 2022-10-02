package io.github.elizabethlfransen.secretlycomplicated.materialform.ore;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OreMaterialFormFactory extends MaterialFormFactory<OreMaterialForm> {
    private final BiFunction<SCMaterial, String, String> localizedNames;

    private OreMaterialFormFactory(BiFunction<SCMaterial, String, String> localizedNames) {
        super("ore");
        this.localizedNames = localizedNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private final Map<String, Function<SCMaterial, String>> localizedNames = new HashMap<>();

        public Builder withLocalization(String locale, Function<SCMaterial, String> localization) {
            localizedNames.put(locale, localization);
            return this;
        }

        private Builder() {}

        public OreMaterialFormFactory build() {
            return new OreMaterialFormFactory((material, locale) -> localizedNames.get(locale).apply(material));
        }

    }

    @Override
    public OreMaterialForm getMaterialForm(SCMaterial material) {
        return new OreMaterialForm(new SCBlock(BlockBehaviour.Properties.of(Material.STONE)),material.color,locale -> localizedNames.apply(material, locale));
    }
}
