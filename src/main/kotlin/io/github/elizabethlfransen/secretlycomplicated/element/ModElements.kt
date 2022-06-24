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

    val sodium = registerElement(11, "sodium", 0xffad1d)
    val magnesium = registerElement(12, "magnesium", 0x55faff)
    val aluminium = registerElement(13, "aluminium", 0x4c95ff)
    val silicon = registerElement(14, "silicon", 0xbbceff)
    val phosphorus = registerElement(15, "phosphorus", 0x36fec8)
    val sulfur = registerElement(16, "sulfur", 0x6fb0ff)
    val chlorine = registerElement(17, "chlorine", 0x76b1ff)
    val argon = registerElement(18, "argon", 0xff6afe)
}