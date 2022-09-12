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
            else "${element.capitalizeName()} Gear"
        val plateName = 
            if (element.hasPlate) "${element.capitalizeName()} Plate"
            else "${element.capitalizeName()} Plate"
        val densePlateName = 
            if (element.hasDensePlate) "${element.capitalizeName()} Dense Plate"
            else "${element.capitalizeName()} Dense Plate"
        val rodName = 
            if (element.hasRod) "${element.capitalizeName()} Rod"
            else "${element.capitalizeName()} Rod"
        val dustName = 
            if (element.hasDust) "${element.capitalizeName()} Dust"
            else "${element.capitalizeName()} Dust"
        val smallDustName = 
            if (element.hasSmallDust) "${element.capitalizeName()} Small Dust"
            else "${element.capitalizeName()} Small Dust"
        val tinyDustName = 
            if (element.hasTinyDust) "${element.capitalizeName()} Tiny Dust"
            else "${element.capitalizeName()} Tiny Dust"
        val crushedName = 
            if (element.hasCrushed) "${element.capitalizeName()} Crushed"
            else "${element.capitalizeName()} Crushed"
        val impureDustName = 
            if (element.hasImpureDust) "${element.capitalizeName()} Impure Dust"
            else "${element.capitalizeName()} Impure Dust"
        val pureDustName = 
            if (element.hasPureDust) "${element.capitalizeName()} Pure Dust"
            else "${element.capitalizeName()} Pure Dust"
        val nuggetName = 
            if (element.hasNugget) "${element.capitalizeName()} Nugget"
            else "${element.capitalizeName()} Nugget"
        val wireName = 
            if (element.hasWire) "${element.capitalizeName()} Wire"
            else "${element.capitalizeName()} Wire"
        // val gemName = 
        //     if (element.hasGem) "${element.capitalizeName()} Gem"
        //     else "${element.capitalizeName()} Gem"
        // val gemBrittleName = 
        //     if (element.hasGemBrittle) "${element.capitalizeName()} Brittle Gem"
        //     else "${element.capitalizeName()} Brittle Gem"
        // val gemPolishedName = 
        //     if (element.hasGemPolished) "${element.capitalizeName()} Polished Gem"
        //     else "${element.capitalizeName()} Polished Gem"
        // val blockName = 
        //     if (element.hasBlock) "${element.capitalizeName()} Block"
        //     else "${element.capitalizeName()} Block"
        add(element.ingot, solidName)
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
        add(element.impureDust, impureDustName)
        add(element.pureDust, pureDustName)
        add(element.nugget, nuggetName)
        add(element.wire, wireName)
        // add(element.gem, gemName)
        // add(element.gemBrittle, gemBrittleName)
        // add(element.gemPolished, gemPolishedName)
        // add(element.block, blockName)
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