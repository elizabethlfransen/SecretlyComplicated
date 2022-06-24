package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.SimpleCreativeTab
import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.registerItem
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack


object ModElements : RegisteringContext() {

    override val defaultTab: CreativeModeTab = SimpleCreativeTab("secretly_complicated") {
        ItemStack(hydrogenIngot)
    }

    val hydrogenIngot by registerItem("hydrogen_ingot")
    val heliumIngot by registerItem("helium_ingot")
    val lithiumIngot by registerItem("lithium_ingot")
    val berylliumIngot by registerItem("beryllium_ingot")
    val boronIngot by registerItem("boron_ingot")
    val carbonIngot by registerItem("carbon_ingot")
    val nitrogenIngot by registerItem("nitrogen_ingot")
    val oxygenIngot by registerItem("oxygen_ingot")
    val fluorineIngot by registerItem("fluorine_ingot")
    val neonIngot by registerItem("neon_ingot")
}