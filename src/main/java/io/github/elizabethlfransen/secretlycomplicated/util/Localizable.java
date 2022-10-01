package io.github.elizabethlfransen.secretlycomplicated.util;

import net.minecraftforge.common.data.LanguageProvider;

public interface Localizable {
    void addLocalizations(String locale, LanguageProvider languageProvider);
}
