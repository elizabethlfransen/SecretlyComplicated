package io.github.elizabethlfransen.secretlycomplicated.materialform.base;


import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class BaseLocalizableMaterialFormFactoryBuilder<
        TMaterialForm extends MaterialForm,
        TFactory extends MaterialFormFactory<TMaterialForm>,
        TBuilder extends BaseMaterialFormFactoryBuilder<TMaterialForm, TFactory, TBuilder>
        > extends BaseMaterialFormFactoryBuilder<TMaterialForm, TFactory, TBuilder> {
    protected final Map<String, Function<SCMaterial, String>> localizedNames = new HashMap<>();

    protected BaseLocalizableMaterialFormFactoryBuilder(String id) {
        super(id);
    }


    public TBuilder withLocalization(String locale, Function<SCMaterial, String> localization) {
        return configure(() -> localizedNames.put(locale, localization));
    }



    protected BiFunction<SCMaterial, String, String> getLocalizationProvider() {
        return (material, locale) -> localizedNames.get(locale).apply(material);
    }

}
