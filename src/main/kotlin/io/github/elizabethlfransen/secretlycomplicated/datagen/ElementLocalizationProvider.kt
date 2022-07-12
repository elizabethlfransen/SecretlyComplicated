package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement
import net.minecraft.data.DataGenerator
import net.minecraftforge.common.data.LanguageProvider
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod.EventBusSubscriber
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent

fun SCElement.capitalizeName() = name.replaceFirstChar(Char::uppercase)

abstract class BaseElementLocalizationProvider(gen: DataGenerator, locale: String) :
    LanguageProvider(gen, SecretlyComplicated.ID, locale) {
    protected fun addFluidTranslation(element: SCElement, translation: String) {
        add("fluid.${SecretlyComplicated.ID}.${element.name}_fluid", translation)
    }

    protected abstract fun addTranslation(element: SCElement)

    override fun addTranslations() {
        ModElements.values.forEach(this::addTranslation)
    }
}

class EnglishElementLocalizationProvider(gen: DataGenerator) : BaseElementLocalizationProvider(gen, "en_us") {

    override fun addTranslation(element: SCElement) {
        val solidName =
            if (element.metallic) "${element.capitalizeName()} Ingot"
            else "Solid ${element.capitalizeName()}"
        val fluidName =
            if (element.metallic) "Molten ${element.capitalizeName()}"
            else "Liquid ${element.capitalizeName()}"
        val gearName = 
            if (element.metallic) "${element.capitalizeName()} Gear"
            else "${element.capitalizeName()} Gear"
        add(element.item, solidName)
        addFluidTranslation(element, fluidName)
        add(element.fluid.bucket, "$fluidName Bucket")
        add(element.gear, gearName)
    }
}

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
object ElementLocalizationProviders {
    @SubscribeEvent
    fun registerLocalizationProviders(event: GatherDataEvent) {
        event.generator.addProvider(EnglishElementLocalizationProvider(event.generator))
        event.generator.addProvider(ElementModelProvider(event.generator,  event.existingFileHelper))
    }
}