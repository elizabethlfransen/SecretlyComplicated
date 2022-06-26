package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.SimpleCreativeTab
import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.typeOf


object ModElements : RegisteringContext() {

    override val defaultTab: CreativeModeTab = SimpleCreativeTab("secretly_complicated") {
        ItemStack(hydrogen.item)
    }

    // redundant
    // example for configuring an element
    val hydrogen = registerElement(1, "hydrogen", 0xff1a7d, -259, -252) /* {
        item {
            props {
                tab = defaultTab
            }
        }
    } */
    val helium = registerElement(2, "helium", 0xffc6e0, -272, -268)
    val lithium = registerElement(3, "lithium", 0xff1852, 180, 1342)
    val beryllium = registerElement(4, "beryllium", 0x1e4cff, 1286, 2469)
    val boron = registerElement(5, "boron",0x4132ff, 2076, 4000)
    val carbon = registerElement(6, "carbon", 0xebffc1, 3500, 9999)
    val nitrogen = registerElement(7, "nitrogen", 0xe795ff, -210, -195)
    val oxygen = registerElement(8, "oxygen", 0xb8bfff, -218, -182)
    val fluorine = registerElement(9, "fluorine", 0xff1765, -219, -188)
    val neon = registerElement(10, "neon", 0xff4022, -248, -246)

    val sodium = registerElement(11, "sodium", 0xffad1d, 97, 882)
    val magnesium = registerElement(12, "magnesium", 0x55faff, 650, 1091)
    val aluminium = registerElement(13, "aluminium", 0x4c95ff, 660, 2470)
    val silicon = registerElement(14, "silicon", 0xbbceff, 1410, 2355)
    val phosphorus = registerElement(15, "phosphorus", 0x36fec8, 44, 280)
    val sulfur = registerElement(16, "sulfur", 0x6fb0ff, 112, 444)
    val chlorine = registerElement(17, "chlorine", 0x76b1ff, -101, -34)
    val argon = registerElement(18, "argon", 0xff6afe, -189, -185)

    val potassium = registerElement(19, "potassium", 0xdab4ff, 63, 758)
    val calcium = registerElement(20, "calcium", 0xfe78bf, 842, 1483)
    val scandium = registerElement(21, "scandium", 0xe0a5ff, 1540, 2835)
    val titanium = registerElement(22, "titanium", 0x57a0fe, 1668, 3286)
    val vanadium = registerElement(23, "vanadium", 0xe8cfff, 1910, 3407)
    val chromium = registerElement(24, "chromium", 0x63c2fe, 1907, 2671)
    val manganese = registerElement(25, "manganese", 0x435eff, 1246, 2061)
    val iron = registerElement(26, "iron", 0x32eaff, 1538, 2862)
    val cobalt = registerElement(27, "cobalt", 0x41fffa, 1495, 2869)
    val nickel = registerElement(28, "nickel", 0x35f5ff, 1455, 2730)
    val copper = registerElement(29, "copper", 0x7effcf, 1084, 2562)
    val zinc = registerElement(30, "zinc", 0x3941ff, 419, 907)
    val gallium = registerElement(31, "gallium", 0x7625ff, 29, 2400)
    val germanium = registerElement(32, "germanium", 0xe5ffd5, 938, 2833)
    val arsenic = registerElement(33, "arsenic", 0x339cff, 816, 613)
    val selenium = registerElement(34, "selenium", 0x4bb2ff, 220, 684)
    val bromine = registerElement(35, "bromine", 0x86bfff, -7, 58)
    val krypton = registerElement(36, "krypton", 0xffc2ef, -157, -153)

    val values by lazy {
        ModElements::class.declaredMemberProperties
            .filter { it.returnType == typeOf<SCElement>() }
            .map { it.get(ModElements) }
            .map { it as SCElement }
            .toSet()

    }
}