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
            if (element.hasGear) "${element.capitalizeName()} Gear"
            else return
        val plateName = 
            if (element.hasPlate) "${element.capitalizeName()} Plate"
            else return
        val densePlateName = 
            if (element.hasDensePlate) "${element.capitalizeName()} Dense Plate"
            else return
        val rodName = 
            if (element.hasRod) "${element.capitalizeName()} Rod"
            else return
        val dustName = 
            if (element.hasDust) "${element.capitalizeName()} Dust"
            else return
        val smallDustName = 
            if (element.hasSmallDust) "${element.capitalizeName()} Small Dust"
            else return
        val tinyDustName = 
            if (element.hasTinyDust) "${element.capitalizeName()} Tiny Dust"
            else return
        val crushedName = 
            if (element.hasCrushed) "${element.capitalizeName()} Crushed"
            else return
        add(element.item, solidName)
        addFluidTranslation(element, fluidName)
        add(element.fluid.bucket, "$fluidName Bucket")
        add(element.gear, gearName)
        add(element.plate, plateName)
        add(element.densePlate, densePlateName)
        add(element.rod, rodName)
        add(element.dust, dustName)
        add(element.smallDust, smallDustName)
        add(element.tinyDust, tinyDustName)
        add(element.crushed, crushedName)
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