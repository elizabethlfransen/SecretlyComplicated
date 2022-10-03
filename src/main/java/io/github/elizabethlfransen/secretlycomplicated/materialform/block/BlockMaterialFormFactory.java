package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.BaseLocalizableMaterialFormFactoryBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.LocalizableMaterialFormFactory;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BlockMaterialFormFactory extends LocalizableMaterialFormFactory<SimpleBlockMaterialForm> {

    private BlockMaterialFormFactory(String id, BiFunction<SCMaterial, String, String> localizedNames, DataGenProps dataGenProps) {
        super(id, localizedNames, dataGenProps);
    }

    public static final class Builder extends BaseLocalizableMaterialFormFactoryBuilder<SimpleBlockMaterialForm, BlockMaterialFormFactory, Builder> {
        private String textureName;
        private final Map<String, Function<SCMaterial, String>> localizedNames = new HashMap<>();

        private Builder(String id) {
            super(id);
        }

        @Override
        protected Builder getSelf() {
            return this;
        }

        public BlockMaterialFormFactory build() {
            return new BlockMaterialFormFactory(id, getLocalizationProvider(), dataGenProps);
        }
    }


    public static Builder builder(String id) {
        return new Builder(id);
    }


    @Override
    public SimpleBlockMaterialForm getMaterialForm(SCMaterial material) {
        // TODO Auto-generated method stub
        return new SimpleBlockMaterialForm(
                this,
                new SCBlock(BlockBehaviour.Properties.of(Material.METAL)),
                material.color,
                getLocalizationProvider(material),
                DataGenProps.union(getDataGenProps(), material.getDataGenProps())
        );
    }
}
