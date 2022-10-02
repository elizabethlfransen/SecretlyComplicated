package io.github.elizabethlfransen.secretlycomplicated.materialform.ore;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.BaseLocalizableMaterialFormFactoryBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.LocalizableMaterialFormFactory;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.function.BiFunction;

public class OreMaterialFormFactory extends LocalizableMaterialFormFactory<OreMaterialForm> {

    private OreMaterialFormFactory(BiFunction<SCMaterial, String, String> localizedNames, String id, DataGenProps dataGenProps) {
        super(id,localizedNames, dataGenProps);
    }

    public static Builder builder(String id) {
        return new Builder(id);
    }

    public static final class Builder extends BaseLocalizableMaterialFormFactoryBuilder<OreMaterialForm, OreMaterialFormFactory, Builder> {
        public Builder(String id) {
            super(id);
        }

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        public OreMaterialFormFactory build() {
            return new OreMaterialFormFactory(getLocalizationProvider(), id, dataGenProps);
        }

    }

    @Override
    public OreMaterialForm getMaterialForm(SCMaterial material) {
        return new OreMaterialForm(
                new SCBlock(BlockBehaviour.Properties.of(Material.STONE)),
                material.color,
                getLocalizationProvider(material),
                getDataGenProps()
        );
    }
}
