package io.github.elizabethlfransen.secretlycomplicated.materialform.gas;

import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GasMaterialFormFactory extends MaterialFormFactory<SimpleGasMaterialForm> {
    private final Map<String, Function<SCMaterial, String>> localizations;
    private GasMaterialFormFactory(Map<String, Function<SCMaterial, String>> localizations) {
        super("gas");
        this.localizations = localizations;
    }

    public static final class Builder {
        private final Map<String, Function<SCMaterial, String>> localizations = new HashMap<>();
        private Builder() {
        }
        public Builder withLocalization(String locale, Function<SCMaterial, String> localization) {
            localizations.put(locale, localization);
            return this;
        }
        public GasMaterialFormFactory build() {
            return new GasMaterialFormFactory(localizations);
        }

    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public SimpleGasMaterialForm getMaterialForm(SCMaterial material) {
        return new SimpleGasMaterialForm(new Gas(GasBuilder.builder().color(material.color)), locale -> localizations.get(locale).apply(material));
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
