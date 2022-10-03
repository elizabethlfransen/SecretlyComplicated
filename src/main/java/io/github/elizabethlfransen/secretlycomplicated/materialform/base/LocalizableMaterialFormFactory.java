package io.github.elizabethlfransen.secretlycomplicated.materialform.base;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class LocalizableMaterialFormFactory<T extends MaterialForm<T>> extends MaterialFormFactory<T> {
    private final BiFunction<SCMaterial, String, String> localizedNames;
    public LocalizableMaterialFormFactory(String id, BiFunction<SCMaterial, String, String> localizedNames, DataGenProps dataGenProps) {
        super(id, dataGenProps);
        this.localizedNames = localizedNames;
    }
    protected Function<String, String> getLocalizationProvider(SCMaterial material) {
        return (locale) -> localizedNames.apply(material, locale);
    }

    public BiFunction<SCMaterial, String, String> getLocalizedNames() {
        return localizedNames;
    }
}
