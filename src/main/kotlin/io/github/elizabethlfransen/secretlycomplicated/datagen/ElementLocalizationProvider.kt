package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import net.minecraft.data.DataGenerator
import net.minecraftforge.common.data.LanguageProvider

class ElementLocalizationProvider(gen: DataGenerator) : LanguageProvider(gen, SecretlyComplicated.ID,"en_us") {
    override fun addTranslations() {
        add(ModElements.hydrogen.item,"Hydrogen Ingot")
        add(ModElements.helium.item,"Helium Ingot")
        add(ModElements.lithium.item,"Lithium Ingot")
        add(ModElements.beryllium.item,"Beryllium Ingot")
        add(ModElements.boron.item,"Boron Ingot")
        add(ModElements.carbon.item,"Carbon Ingot")
        add(ModElements.nitrogen.item,"Nitrogen Ingot")
        add(ModElements.oxygen.item,"Oxygen Ingot")
        add(ModElements.fluorine.item,"Fluorine Ingot")
        add(ModElements.neon.item,"Neon Ingot")

        add(ModElements.sodium.item,"Sodium Ingot")
        add(ModElements.magnesium.item,"Magnesium Ingot")
        add(ModElements.aluminium.item,"Aluminium Ingot")
        add(ModElements.silicon.item,"Silicon Ingot")
        add(ModElements.phosphorus.item,"Phosphorus Ingot")
        add(ModElements.sulfur.item,"Sulfur Ingot")
        add(ModElements.chlorine.item,"Chlorine Ingot")
        add(ModElements.argon.item,"Argon Ingot")
    }
}