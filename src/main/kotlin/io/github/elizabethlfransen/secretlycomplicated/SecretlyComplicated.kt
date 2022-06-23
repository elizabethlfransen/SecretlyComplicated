package io.github.elizabethlfransen.secretlycomplicated

import io.github.elizabethlfransen.secretlycomplicated.block.ModBlocks
import io.github.elizabethlfransen.secretlycomplicated.datagen.ElementLocalizationProvider
import io.github.elizabethlfransen.secretlycomplicated.datagen.ElementModelProvider
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import net.minecraft.client.Minecraft
import net.minecraft.client.color.block.BlockColors
import net.minecraft.client.color.item.ItemColor
import net.minecraft.client.color.item.ItemColors
import net.minecraft.world.item.ItemStack
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist

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

    // TODO: Remove sample code once actual examples exist
    init {

        ModElements.items.register(MOD_BUS)

        MOD_BUS.addListener<GatherDataEvent> {event ->
            if(event.includeClient()) {
                event.generator.addProvider(ElementModelProvider(event.generator,  event.existingFileHelper))
                event.generator.addProvider(ElementLocalizationProvider(event.generator))
            }
        }

        val obj = runForDist(
            clientTarget = {
                MOD_BUS.addListener(::onClientSetup)
            },
            serverTarget = {
                MOD_BUS.addListener(::onServerSetup)
                "test"
            })

        println(obj)
    }

    /**
     * This is used for initializing client specific
     * things such as renderers and keymaps
     * Fired on the mod specific event bus.
     */
    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Initializing client...")

        // TODO: Use Atomic Spectrum Colors
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xff1a7d}), ModElements.hydrogenIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xffc6e0}), ModElements.heliumIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xff1852}), ModElements.lithiumIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0x1e4cff}), ModElements.berylliumIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0x4132ff}), ModElements.boronIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xebffc1}), ModElements.carbonIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xe795ff}), ModElements.nitrogenIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xb8bfff}), ModElements.oxygenIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xff1765}), ModElements.fluorineIngot.get())
        Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  0xff4022}), ModElements.neonIngot.get())
    }

    /**
     * Fired on the global Forge bus.
     */
    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        LOGGER.log(Level.INFO, "Server starting...")
    }
}