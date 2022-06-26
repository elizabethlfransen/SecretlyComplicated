package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import net.minecraft.data.DataGenerator
import net.minecraftforge.common.data.LanguageProvider

class ElementLocalizationProvider(gen: DataGenerator) : LanguageProvider(gen, SecretlyComplicated.ID,"en_us") {
    override fun addTranslations() {
        ModElements.values.forEach { element ->
            var capitalizedElementName = element.name.replaceFirstChar(Char::uppercase)
            add(element.item, "$capitalizedElementName Ingot")
            add(element.fluid.bucket, "$capitalizedElementName Bucket")
        }
    }
}