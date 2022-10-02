package io.github.elizabethlfransen.secretlycomplicated.materialform.gas;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.BaseLocalizableMaterialFormFactoryBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.LocalizableMaterialFormFactory;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasBuilder;

import java.util.function.BiFunction;

public class GasMaterialFormFactory extends LocalizableMaterialFormFactory<SimpleGasMaterialForm> {

    public GasMaterialFormFactory(String id, BiFunction<SCMaterial, String, String> localizedNames, DataGenProps dataGenProps) {
        super(id, localizedNames, dataGenProps);
    }

    public static final class Builder extends BaseLocalizableMaterialFormFactoryBuilder<SimpleGasMaterialForm,GasMaterialFormFactory,Builder> {

        private Builder(String id) {
            super(id);
        }

        @Override
        protected Builder getSelf() {
            return this;
        }

        public GasMaterialFormFactory build() {
            return new GasMaterialFormFactory(id, getLocalizationProvider(), dataGenProps);
        }

    }

    public static Builder builder(String id) {
        return new Builder(id);
    }

    @Override
    public SimpleGasMaterialForm getMaterialForm(SCMaterial material) {
        return new SimpleGasMaterialForm(
                new Gas(GasBuilder.builder().color(material.color)),
                getLocalizationProvider(material),
                getDataGenProps()
        );
    }

    @Override
    public boolean isSupported() {
        try {
            Class.forName("mekanism.api.chemical.gas.Gas");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
