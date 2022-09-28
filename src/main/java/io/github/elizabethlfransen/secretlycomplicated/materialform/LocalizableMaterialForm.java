package io.github.elizabethlfransen.secretlycomplicated.materialform;

import net.minecraftforge.common.data.LanguageProvider;

public interface LocalizableMaterialForm extends MaterialForm {
    void addLocalizations(String locale, LanguageProvider provider);
}
