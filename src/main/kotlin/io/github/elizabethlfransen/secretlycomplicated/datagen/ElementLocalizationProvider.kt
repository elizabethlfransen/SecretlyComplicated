package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import net.minecraft.data.DataGenerator
import net.minecraftforge.common.data.LanguageProvider

class ElementLocalizationProvider(gen: DataGenerator) : LanguageProvider(gen, SecretlyComplicated.ID,"en_us") {
    override fun addTranslations() {
        add(ModElements.hydrogenIngot,"Hydrogen Ingot")
        add(ModElements.heliumIngot,"Helium Ingot")
        add(ModElements.lithiumIngot,"Lithium Ingot")
        add(ModElements.berylliumIngot,"Beryllium Ingot")
        add(ModElements.boronIngot,"Boron Ingot")
        add(ModElements.carbonIngot,"Carbon Ingot")
        add(ModElements.nitrogenIngot,"Nitrogen Ingot")
        add(ModElements.oxygenIngot,"Oxygen Ingot")
        add(ModElements.fluorineIngot,"Fluorine Ingot")
        add(ModElements.neonIngot,"Neon Ingot")
    }
}