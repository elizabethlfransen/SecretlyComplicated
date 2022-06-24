package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.SimpleCreativeTab
import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack


object ModElements : RegisteringContext() {

    override val defaultTab: CreativeModeTab = SimpleCreativeTab("secretly_complicated") {
        ItemStack(hydrogen.item)
    }

    val hydrogen = registerElement(1, "hydrogen", 0xff1a7d)
    val helium = registerElement(2, "helium", 0xffc6e0)
    val lithium = registerElement(3, "lithium", 0xff1852)
    val beryllium = registerElement(4, "beryllium", 0x1e4cff)
    val boron = registerElement(5, "boron",0x4132ff)
    val carbon = registerElement(6, "carbon", 0xebffc1)
    val nitrogen = registerElement(7, "nitrogen", 0xe795ff)
    val oxygen = registerElement(8, "oxygen", 0xb8bfff)
    val fluorine = registerElement(9, "fluorine", 0xff1765)
    val neon = registerElement(10, "neon", 0xff4022)
}