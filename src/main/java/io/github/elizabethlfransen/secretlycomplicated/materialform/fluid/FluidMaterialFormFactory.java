package io.github.elizabethlfransen.secretlycomplicated.materialform.fluid;

import io.github.elizabethlfransen.secretlycomplicated.material.SCElement;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FluidMaterialFormFactory extends MaterialFormFactory<SimpleFluidMaterialForm> {
    private final BiFunction<SCMaterial, String, String> fluidLocalizations;
    private final BiFunction<SCMaterial, String, String> bucketLocalizations;

    private FluidMaterialFormFactory(BiFunction<SCMaterial, String, String> fluidLocalizations, BiFunction<SCMaterial, String, String> bucketLocalizations) {
        super("fluid");
        this.fluidLocalizations = fluidLocalizations;
        this.bucketLocalizations = bucketLocalizations;
    }

    public static final class Builder {
        private final Map<String, Function<SCMaterial, String>> fluidLocalizations = new HashMap<>();
        private final Map<String, Function<SCMaterial, String>> bucketLocalizations = new HashMap<>();

        private Builder() {
        }

        public Builder withFluidLocalization(String locale, Function<SCMaterial, String> fluidLocalization) {
            this.fluidLocalizations.put(locale, fluidLocalization);
            return this;
        }
        public Builder withBucketLocalization(String locale, Function<SCMaterial, String> bucketLocalization) {
            this.bucketLocalizations.put(locale, bucketLocalization);
            return this;
        }

        public FluidMaterialFormFactory build() {
            return new FluidMaterialFormFactory(
                    (element, locale) -> fluidLocalizations.get(locale).apply(element),
                    (element, locale) -> bucketLocalizations.get(locale).apply(element)
            );
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public SimpleFluidMaterialForm getMaterialForm(SCMaterial material) {
        return new SimpleFluidMaterialForm(
                material.color,
                material.name,
                locale -> fluidLocalizations.apply(material, locale),
                locale -> bucketLocalizations.apply(material, locale)
        );
    }
}
