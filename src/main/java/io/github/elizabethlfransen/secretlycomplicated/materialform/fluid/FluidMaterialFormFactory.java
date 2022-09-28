package io.github.elizabethlfransen.secretlycomplicated.materialform.fluid;

import io.github.elizabethlfransen.secretlycomplicated.element.SCElement;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FluidMaterialFormFactory extends MaterialFormFactory<SimpleFluidMaterialForm> {
    private final BiFunction<SCElement, String, String> fluidLocalizations;
    private final BiFunction<SCElement, String, String> bucketLocalizations;

    private FluidMaterialFormFactory(BiFunction<SCElement, String, String> fluidLocalizations, BiFunction<SCElement, String, String> bucketLocalizations) {
        super("fluid");
        this.fluidLocalizations = fluidLocalizations;
        this.bucketLocalizations = bucketLocalizations;
    }

    public static final class Builder {
        private final Map<String, Function<SCElement, String>> fluidLocalizations = new HashMap<>();
        private final Map<String, Function<SCElement, String>> bucketLocalizations = new HashMap<>();

        private Builder() {
        }

        public Builder withFluidLocalization(String locale, Function<SCElement, String> fluidLocalization) {
            this.fluidLocalizations.put(locale, fluidLocalization);
            return this;
        }
        public Builder withBucketLocalization(String locale, Function<SCElement, String> bucketLocalization) {
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
    public SimpleFluidMaterialForm getMaterialForm(SCElement element) {
        return new SimpleFluidMaterialForm(
                element.color,
                element.name,
                locale -> fluidLocalizations.apply(element, locale),
                locale -> bucketLocalizations.apply(element, locale)
        );
    }
}
