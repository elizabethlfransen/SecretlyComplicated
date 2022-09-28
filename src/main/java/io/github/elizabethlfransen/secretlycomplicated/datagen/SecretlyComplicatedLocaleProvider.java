package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.materialform.LocalizableMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.register.ModElements;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated.MOD_ID;

public class SecretlyComplicatedLocaleProvider extends LanguageProvider {

    private final String locale;

    public SecretlyComplicatedLocaleProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
        this.locale = locale;
    }

    @Override
    protected void addTranslations() {
        addCommonTranslations();
        ModElements.getValues().stream()
                .flatMap(element -> element.forms.values().stream())
                .forEach(this::addTranslation);
    }

    private void addCommonTranslations() {
        // creative tab
        add("itemGroup." + MOD_ID, "Secretly Complicated");
    }

    private void addTranslation(MaterialForm form) {
        if(!(form instanceof LocalizableMaterialForm localizableMaterialForm)) return;
        localizableMaterialForm.addLocalizations(locale,this);
    }

}