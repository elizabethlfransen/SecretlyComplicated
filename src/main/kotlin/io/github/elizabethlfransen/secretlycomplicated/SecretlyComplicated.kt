package io.github.elizabethlfransen.secretlycomplicated

import io.github.elizabethlfransen.secretlycomplicated.datagen.ElementLocalizationProvider
import io.github.elizabethlfransen.secretlycomplicated.datagen.ElementModelProvider
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.MOD_BUS

/**
 * Main mod class. Should be an `object` declaration annotated with `@Mod`.
 * The modid should be declared in this object and should match the modId entry
 * in mods.toml.
 *
 * An example for blocks is in the `blocks` package of this mod.
 */
@Mod(SecretlyComplicated.ID)
object SecretlyComplicated {
    const val ID = "secretly_complicated"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(ID)
    init {

        ModElements.register(MOD_BUS)

        MOD_BUS.addListener<GatherDataEvent> {event ->
            if(event.includeClient()) {
                event.generator.addProvider(ElementModelProvider(event.generator,  event.existingFileHelper))
                event.generator.addProvider(ElementLocalizationProvider(event.generator))
            }
        }
    }
}