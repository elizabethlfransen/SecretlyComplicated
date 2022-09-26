package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.SimpleCreativeTab
import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.typeOf


object ModElements : RegisteringContext() {

    override val defaultTab: CreativeModeTab = SimpleCreativeTab("secretly_complicated") {
        ItemStack(hydrogen.ingot)
    }

    // redundant
    // example for configuring an element
    val hydrogen = registerElement(1, "hydrogen", 0xff1a7d, -259, -252) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    /* {
        item {
            props {
                tab = defaultTab
            }
        }
    } */
    val helium = registerElement(2, "helium", 0xffc6e0, -272, -268) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val lithium = registerElement(3, "lithium", 0xe5e5e5, 180, 1342) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true } // atomic spectral emission color: 0xff1852
    val beryllium = registerElement(4, "beryllium", 0xcccccc, 1286, 2469) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true } // atomic spectral emission color: 0x1e4cff
    val boron = registerElement(5, "boron",0xb2b2b2, 2076, 4000) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }  // atomic spectral emission color: 0x4132ff
    val carbon = registerElement(6, "carbon", 0xebffc1, 3500, 9999) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val nitrogen = registerElement(7, "nitrogen", 0xe795ff, -210, -195) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val oxygen = registerElement(8, "oxygen", 0xb8bfff, -218, -182) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val fluorine = registerElement(9, "fluorine", 0xff1765, -219, -188) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val neon = registerElement(10, "neon", 0xff4022, -248, -246) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }

    val sodium = registerElement(11, "sodium", 0xf7f7f7, 97, 882) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true } // atomic spectral emission color: 0xffad1d
    val magnesium = registerElement(12, "magnesium", 0xdedede, 650, 1091) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true } // atomic spectral emission color: 0x55faff
    val aluminium = registerElement(13, "aluminium", 0xc7c7c7, 660, 2470) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true } // atomic spectral emission color: 0x4c95ff
    val silicon = registerElement(14, "silicon", 0xbbceff, 1410, 2355) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val phosphorus = registerElement(15, "phosphorus", 0x36fec8, 44, 280) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val sulfur = registerElement(16, "sulfur", 0x6fb0ff, 112, 444) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val chlorine = registerElement(17, "chlorine", 0x76b1ff, -101, -34) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val argon = registerElement(18, "argon", 0xff6afe, -189, -185) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }

    val potassium = registerElement(19, "potassium", 0xdab4ff, 63, 758) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val calcium = registerElement(20, "calcium", 0xfe78bf, 842, 1483) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val scandium = registerElement(21, "scandium", 0xe0a5ff, 1540, 2835) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val titanium = registerElement(22, "titanium", 0x57a0fe, 1668, 3286) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true;  }
    val vanadium = registerElement(23, "vanadium", 0xe8cfff, 1910, 3407) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true;  }
    val chromium = registerElement(24, "chromium", 0x63c2fe, 1907, 2671) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true;  }
    val manganese = registerElement(25, "manganese", 0x435eff, 1246, 2061) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val iron = registerElement(26, "iron", 0xffffff, 1538, 2862) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true;  } // atomic spectral emission color: 0x32eaff
    val cobalt = registerElement(27, "cobalt", 0x41fffa, 1495, 2869) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val nickel = registerElement(28, "nickel", 0x35f5ff, 1455, 2730) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val copper = registerElement(29, "copper", 0xda7953, 1084, 2562) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; } // atomic spectral emission color: 0x7effcf
    val zinc = registerElement(30, "zinc", 0x91898d, 419, 907) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true } // atomic spectral emission color: 0x3941ff
    val gallium = registerElement(31, "gallium", 0x7625ff, 29, 2400) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val germanium = registerElement(32, "germanium", 0xe5ffd5, 938, 2833) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val arsenic = registerElement(33, "arsenic", 0x339cff, 816, 613) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val selenium = registerElement(34, "selenium", 0x4bb2ff, 220, 684) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val bromine = registerElement(35, "bromine", 0x86bfff, -7, 58) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val krypton = registerElement(36, "krypton", 0xffc2ef, -157, -153) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }

    val rubidium = registerElement(37, "rubidium", 0xff4d81, 63, 758) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val strontium = registerElement(38, "strontium", 0xfe69c3, 842, 1483) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val yttrium = registerElement(39, "yttrium", 0xffecf1, 1540, 2835) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val zirconium = registerElement(40, "zirconium", 0x67d8ff, 1668, 3286) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val niobium = registerElement(41, "niobium", 0x6cc2ff, 1910, 3407) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val molybdenum = registerElement(42, "molybdenum", 0x8aa1fe, 1907, 2671) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val technetium = registerElement(43, "technetium", 0x4780ff, 1246, 2061) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val ruthenium = registerElement(44, "ruthenium", 0x447fff, 1538, 2862) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val rhodium = registerElement(45, "rhodium", 0x7cffd7, 1495, 2869) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val palladium = registerElement(46, "palladium", 0x4effde, 1455, 2730) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val silver = registerElement(47, "silver", 0x32ffa3, 1084, 2562) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val cadmium = registerElement(48, "cadmium", 0x6098fe, 419, 907) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val indium = registerElement(49, "indium", 0x7745ff, 29, 2400) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val tin = registerElement(50, "tin", 0xffbefc, 938, 2833) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val antimony = registerElement(51, "antimony", 0xefe7ff, 816, 613) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val tellurium = registerElement(52, "tellurium", 0x47d7ff, 220, 684) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val iodine = registerElement(53, "iodine", 0x9fffdb, -7, 58) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }
    val xenon = registerElement(54, "xenon", 0xab94ff, -157, -153) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }

    val caesium = registerElement(55, "caesium", 0x9268ff, 28, 670) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val barium = registerElement(56, "barium", 0xffc090, 727, 1897) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val lanthanum = registerElement(57, "lanthanum", 0x7f98ff, 920, 3463) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }

    val cerium = registerElement(58, "cerium", 0x69dffe, 795, 3257) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val praseodymium = registerElement(59, "praseodymium", 0x507fff, 930, 3520) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val neodymium = registerElement(60, "neodymium", 0x4168ff, 1020, 3073) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val promethium = registerElement(61, "promethium", 0x8085ff, 1041, 2999) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val samarium = registerElement(62, "samarium", 0x87a5ff, 1072, 1793) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val europium = registerElement(63, "europium", 0xeecaff, 826, 1529) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val gadolinium = registerElement(64, "gadolinium", 0xfec1fc, 1311, 3271) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val terbium = registerElement(65, "terbium", 0xa2feed, 1355, 3230) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val dysprosium = registerElement(66, "dysprosium", 0x79d7ff, 1411, 2566) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val holmium = registerElement(67, "holmium", 0x9cffc9, 1474, 2694) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val erbium = registerElement(68, "erbium", 0x5effe1, 1528, 2868) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val thulium = registerElement(69, "thulium", 0x60f4ff, 1544, 1950) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val ytterbium = registerElement(70, "ytterbium", 0xb2f5ff, 819, 1195) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val lutetium = registerElement(71, "lutetium", 0xb1faff, 1663, 3402) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }

    val hafnium = registerElement(72, "hafnium", 0x6f95ff, 2227, 4601) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val tantalum = registerElement(73, "tantalum", 0x68ceff, 3019, 5456) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val tungsten = registerElement(74, "tungsten", 0x49d5ff, 3421, 5555) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val rhenium = registerElement(75, "rhenium", 0x61a9fe, 3181, 5596) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val osmium = registerElement(76, "osmium", 0x3e94ff, 3033, 5026) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val iridium = registerElement(77, "iridium", 0x3e7eff, 2446, 4428) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val platinum = registerElement(78, "platinum", 0x5695ff, 1768, 3825) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val gold = registerElement(79, "gold", 0xa38eff, 1064, 2700) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val mercury = registerElement(80, "mercury", 0x93f8ff, -38, 356) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val thallium = registerElement(81, "thallium", 0x1eff47, 303, 1472) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val lead = registerElement(82, "lead", 0xa9ecff, 327, 1749) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val bismuth = registerElement(83, "bismuth", 0x6b97ff, 271, 1564) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val polonium = registerElement(84, "polonium", 0x4a8dff, 254, 962) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val astatine = registerElement(85, "astatine", 0x444444, 301, 336) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val radon = registerElement(86, "radon", 0xff19a1, -71, -61) { isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true }

    val francium = registerElement(87, "francium", 0xfe8146, 27, 676) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val radium = registerElement(88, "radium", 0xff5a64, 700, 1737) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val actinium = registerElement(89, "actinium", 0xc1e6ff, 1050, 3196) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }

    val thorium = registerElement(90, "thorium", 0x8bf5ff, 1754, 4786) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val protactinium = registerElement(91, "protactinium", 0xe80aff, 1568, 4000) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val uranium = registerElement(92, "uranium", 0xa0bbff, 1132, 4131) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val neptunium = registerElement(93, "neptunium", 0xffbf29, 644, 3901) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val plutonium = registerElement(94, "plutonium", 0xff40d7, 639, 3231) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val americium = registerElement(95, "americium", 0x996fff, 1175, 2606) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val curium = registerElement(96, "curium", 0xff31c3, 1346, 3109) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val berkelium = registerElement(97, "berkelium", 0x48ff5e, 984, 2627) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val californium = registerElement(98, "californium", 0x94fec1, 898, 1472) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val einsteinium = registerElement(99, "einsteinium", 0x13ffb7, 860, 9999) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val fermium = registerElement(100, "fermium", 0x444444, 1526, 9999) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val mendelevium = registerElement(101, "mendelevium", 0x444444, 926, 9999) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val nobelium = registerElement(102, "nobelium", 0x444444, 826, 9999) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }
    val lawrencium = registerElement(103, "lawrencium", 0x444444, 1627, 9999) { isMetal = true; isGear = true; isPlate = true; isDensePlate = true; isRod = true; isDust = true; isSmallDust = true; isTinyDust = true; isCrushed = true; isImpureDust = true; isPureDust = true; isNugget = true; isWire = true; }

    // alloys
    val rose_gold = registerCompound("rose_gold", 0xE0BFB8, 897, 9999) { isMetal = true; }
    val brass = registerCompound("brass", 0xE1C16E, 920, 9999) { isMetal = true; }
    val bronze = registerCompound("bronze", 0xCD7F32, 1030, 9999) { isMetal = true; }
    val electrum = registerCompound("electrum", 0xF2E279, 1064, 9999) { isMetal = true; }
    val constantan = registerCompound("constantan", 0xFFC383, 1210, 9999) { isMetal = true; }
    val invar = registerCompound("invar", 0x70776e, 2500, 9999) { isMetal = true; }
    val steel = registerCompound("steel", 0x9ea4a6, 2500, 9999) { isMetal = true; }
    /*
    enderium
    lumium
    signalum
'tin_alloy'
'battery_alloy'
'soldering_alloy'
'red_alloy'
'fireclay'
'magnalium'
'cupronickel'
'borosilicate_glass'
'yttrium_barium_cuprate'
'black_bronze'
'black_steel'
'ferrite_mixture'
'nichrome'
'osmiridium'
'gallium_arsenide'
'sodium_sulfide'
'kanthal'
'vanadium_gallium'
'vanadium_steel'
'indium_gallium_phosphide'
'cobalt_brass'
'bismuth_bronze'
'sterling_silver'

    // others
    graphite
    oilsands
    almandine
    andradite
    banded_iron
    brown_limonite
    cassiterite
    chalcopyrite
    cobaltite
    cooperite
    'galena',
    'garnierite',
    'grossular',
    'ilmenite',
    'rutile',
    'magnesite',
    'magnetite',
    'molybdenite',
    'phosphate',
    'pyrite',
    'pyrolusite',
    'pyrope',
    'saltpeter',
    'scheelite',
    'spessartine',
    'sphalerite',
    'stibnite',
    'tetrahedrite',
    'tungstate',
    'uraninite',
    'uvarovite',
    'wulfenite',
    'yellow_limonite',
    'vanadium_magnetite',
    'bastnasite',
    'pentlandite',
    'spodumene',
    'tantalite',
    'lepidolite',
    'glauconite',
    'bentonite',
    'pitchblende',
    'malachite',
    'barite',
    'phosphorus',
    'cinnabar',
    'wrought_iron',
    'tungstensteel',
    'quartzite',
    'lignite_coal',
    'salt',
    'rock_salt',
    'bauxite',
    'oil_shale'
     */
    
    
    


    val values by lazy {
        ModElements::class.declaredMemberProperties
            .filter { it.returnType == typeOf<SCElement>() }
            .map { it.get(ModElements) }
            .map { it as SCElement }
            .toSet()

    }
}