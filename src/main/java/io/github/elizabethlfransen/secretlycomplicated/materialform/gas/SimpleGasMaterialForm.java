package io.github.elizabethlfransen.secretlycomplicated.materialform.gas;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;
import io.github.elizabethlfransen.secretlycomplicated.util.Localizable;
import mekanism.api.chemical.gas.Gas;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Set;
import java.util.function.Function;

public class SimpleGasMaterialForm extends MaterialForm<SimpleGasMaterialForm> implements Localizable {

    private final Gas gas;
    private final Function<String, String> localizations;

    public SimpleGasMaterialForm(MaterialFormFactory<SimpleGasMaterialForm> factory, Gas gas, Function<String, String> localizations, DataGenProps dataGenProps) {
        super(factory, dataGenProps);
        this.gas = gas;
        this.localizations = localizations;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return Set.of(gas);
    }

    @Override
    public void addLocalizations(String locale, LanguageProvider languageProvider) {
        languageProvider.add(gas.getTranslationKey(), localizations.apply(locale));
    }
}
