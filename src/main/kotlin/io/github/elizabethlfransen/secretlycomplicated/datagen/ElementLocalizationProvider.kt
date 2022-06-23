package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement
import net.minecraft.data.DataGenerator
import net.minecraftforge.common.data.LanguageProvider
import net.minecraftforge.forgespi.language.IModLanguageProvider

class ElementLocalizationProvider(gen: DataGenerator) : LanguageProvider(gen, SecretlyComplicated.ID,"en_us") {
    override fun addTranslations() {
        add(ModElements.hydrogenIngot.get(),"Hydrogen Ingot")
        add(ModElements.heliumIngot.get(),"Helium Ingot")
        add(ModElements.lithiumIngot.get(),"Lithium Ingot")
        add(ModElements.berylliumIngot.get(),"Beryllium Ingot")
        add(ModElements.boronIngot.get(),"Boron Ingot")
        add(ModElements.carbonIngot.get(),"Carbon Ingot")
        add(ModElements.nitrogenIngot.get(),"Nitrogen Ingot")
        add(ModElements.oxygenIngot.get(),"Oxygen Ingot")
        add(ModElements.fluorineIngot.get(),"Fluorine Ingot")
        add(ModElements.neonIngot.get(),"Neon Ingot")
    }
}