package io.github.elizabethlfransen.secretlycomplicated.materialform.fluid;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.BaseMaterialFormFactoryBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FluidMaterialFormFactory extends MaterialFormFactory<SimpleFluidMaterialForm> {
    private final BiFunction<SCMaterial, String, String> fluidLocalizations;
    private final BiFunction<SCMaterial, String, String> bucketLocalizations;

    private FluidMaterialFormFactory(String id, BiFunction<SCMaterial, String, String> fluidLocalizations, BiFunction<SCMaterial, String, String> bucketLocalizations, DataGenProps dataGenProps) {
        super(id, dataGenProps);
        this.fluidLocalizations = fluidLocalizations;
        this.bucketLocalizations = bucketLocalizations;
    }

    public static final class Builder extends BaseMaterialFormFactoryBuilder<SimpleFluidMaterialForm,FluidMaterialFormFactory,Builder> {
        private final Map<String, Function<SCMaterial, String>> fluidLocalizations = new HashMap<>();
        private final Map<String, Function<SCMaterial, String>> bucketLocalizations = new HashMap<>();

        private Builder(String id) {
            super(id);
        }

        public Builder withFluidLocalization(String locale, Function<SCMaterial, String> fluidLocalization) {
            this.fluidLocalizations.put(locale, fluidLocalization);
            return this;
        }
        public Builder withBucketLocalization(String locale, Function<SCMaterial, String> bucketLocalization) {
            this.bucketLocalizations.put(locale, bucketLocalization);
            return this;
        }

        @Override
        protected Builder getSelf() {
            return getSelf();
        }

        public FluidMaterialFormFactory build() {
            return new FluidMaterialFormFactory(
                    id,
                    (element, locale) -> fluidLocalizations.get(locale).apply(element),
                    (element, locale) -> bucketLocalizations.get(locale).apply(element),
                    dataGenProps);
        }
    }

    public static Builder builder(String id) {
        return new Builder(id);
    }

    @Override
    public SimpleFluidMaterialForm getMaterialForm(SCMaterial material) {
        return new SimpleFluidMaterialForm(
                material.color,
                material.name,
                locale -> fluidLocalizations.apply(material, locale),
                locale -> bucketLocalizations.apply(material, locale),
                getDataGenProps()
        );
    }
}
