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
    val hydrogen = registerElement(1, "hydrogen", 0xff1a7d, -259, -252)
    /* {
        item {
            props {
                tab = defaultTab
            }
        }
    } */
    val helium = registerElement(2, "helium", 0xffc6e0, -272, -268)
    val lithium = registerElement(3, "lithium", 0xff1852, 180, 1342) { isMetal = true }
    val beryllium = registerElement(4, "beryllium", 0x1e4cff, 1286, 2469) { isMetal = true }
    val boron = registerElement(5, "boron",0x4132ff, 2076, 4000) { isMetal = true }
    val carbon = registerElement(6, "carbon", 0xebffc1, 3500, 9999)
    val nitrogen = registerElement(7, "nitrogen", 0xe795ff, -210, -195)
    val oxygen = registerElement(8, "oxygen", 0xb8bfff, -218, -182)
    val fluorine = registerElement(9, "fluorine", 0xff1765, -219, -188)
    val neon = registerElement(10, "neon", 0xff4022, -248, -246)

    val sodium = registerElement(11, "sodium", 0xffad1d, 97, 882) { isMetal = true }
    val magnesium = registerElement(12, "magnesium", 0x55faff, 650, 1091) { isMetal = true }
    val aluminium = registerElement(13, "aluminium", 0x4c95ff, 660, 2470) { isMetal = true }
    val silicon = registerElement(14, "silicon", 0xbbceff, 1410, 2355) { isMetal = true }
    val phosphorus = registerElement(15, "phosphorus", 0x36fec8, 44, 280)
    val sulfur = registerElement(16, "sulfur", 0x6fb0ff, 112, 444)
    val chlorine = registerElement(17, "chlorine", 0x76b1ff, -101, -34)
    val argon = registerElement(18, "argon", 0xff6afe, -189, -185)

    val potassium = registerElement(19, "potassium", 0xdab4ff, 63, 758) { isMetal = true }
    val calcium = registerElement(20, "calcium", 0xfe78bf, 842, 1483) { isMetal = true }
    val scandium = registerElement(21, "scandium", 0xe0a5ff, 1540, 2835) { isMetal = true }
    val titanium = registerElement(22, "titanium", 0x57a0fe, 1668, 3286) { isMetal = true }
    val vanadium = registerElement(23, "vanadium", 0xe8cfff, 1910, 3407) { isMetal = true }
    val chromium = registerElement(24, "chromium", 0x63c2fe, 1907, 2671) { isMetal = true }
    val manganese = registerElement(25, "manganese", 0x435eff, 1246, 2061) { isMetal = true }
    val iron = registerElement(26, "iron", 0x32eaff, 1538, 2862) { isMetal = true }
    val cobalt = registerElement(27, "cobalt", 0x41fffa, 1495, 2869) { isMetal = true }
    val nickel = registerElement(28, "nickel", 0x35f5ff, 1455, 2730) { isMetal = true }
    val copper = registerElement(29, "copper", 0x7effcf, 1084, 2562) { isMetal = true }
    val zinc = registerElement(30, "zinc", 0x3941ff, 419, 907) { isMetal = true }
    val gallium = registerElement(31, "gallium", 0x7625ff, 29, 2400) { isMetal = true }
    val germanium = registerElement(32, "germanium", 0xe5ffd5, 938, 2833) { isMetal = true }
    val arsenic = registerElement(33, "arsenic", 0x339cff, 816, 613) { isMetal = true }
    val selenium = registerElement(34, "selenium", 0x4bb2ff, 220, 684)
    val bromine = registerElement(35, "bromine", 0x86bfff, -7, 58)
    val krypton = registerElement(36, "krypton", 0xffc2ef, -157, -153)

    val rubidium = registerElement(37, "rubidium", 0xff4d81, 63, 758) { isMetal = true }
    val strontium = registerElement(38, "strontium", 0xfe69c3, 842, 1483) { isMetal = true }
    val yttrium = registerElement(39, "yttrium", 0xffecf1, 1540, 2835) { isMetal = true }
    val zirconium = registerElement(40, "zirconium", 0x67d8ff, 1668, 3286) { isMetal = true }
    val niobium = registerElement(41, "niobium", 0x6cc2ff, 1910, 3407) { isMetal = true }
    val molybdenum = registerElement(42, "molybdenum", 0x8aa1fe, 1907, 2671) { isMetal = true }
    val technetium = registerElement(43, "technetium", 0x4780ff, 1246, 2061) { isMetal = true }
    val ruthenium = registerElement(44, "ruthenium", 0x447fff, 1538, 2862) { isMetal = true }
    val rhodium = registerElement(45, "rhodium", 0x7cffd7, 1495, 2869) { isMetal = true }
    val palladium = registerElement(46, "palladium", 0x4effde, 1455, 2730) { isMetal = true }
    val silver = registerElement(47, "silver", 0x32ffa3, 1084, 2562) { isMetal = true }
    val cadmium = registerElement(48, "cadmium", 0x6098fe, 419, 907) { isMetal = true }
    val indium = registerElement(49, "indium", 0x7745ff, 29, 2400) { isMetal = true }
    val tin = registerElement(50, "tin", 0xffbefc, 938, 2833) { isMetal = true }
    val antimony = registerElement(51, "antimony", 0xefe7ff, 816, 613) { isMetal = true }
    val tellurium = registerElement(52, "tellurium", 0x47d7ff, 220, 684) { isMetal = true }
    val iodine = registerElement(53, "iodine", 0x9fffdb, -7, 58)
    val xenon = registerElement(54, "xenon", 0xab94ff, -157, -153)

    val caesium = registerElement(55, "caesium", 0x9268ff, 28, 670) { isMetal = true }
    val barium = registerElement(56, "barium", 0xffc090, 727, 1897) { isMetal = true }
    val lanthanum = registerElement(57, "lanthanum", 0x7f98ff, 920, 3463) { isMetal = true }

    val cerium = registerElement(58, "cerium", 0x69dffe, 795, 3257) { isMetal = true }
    val praseodymium = registerElement(59, "praseodymium", 0x507fff, 930, 3520) { isMetal = true }
    val neodymium = registerElement(60, "neodymium", 0x4168ff, 1020, 3073) { isMetal = true }
    val promethium = registerElement(61, "promethium", 0x8085ff, 1041, 2999) { isMetal = true }
    val samarium = registerElement(62, "samarium", 0x87a5ff, 1072, 1793) { isMetal = true }
    val europium = registerElement(63, "europium", 0xeecaff, 826, 1529) { isMetal = true }
    val gadolinium = registerElement(64, "gadolinium", 0xfec1fc, 1311, 3271) { isMetal = true }
    val terbium = registerElement(65, "terbium", 0xa2feed, 1355, 3230) { isMetal = true }
    val dysprosium = registerElement(66, "dysprosium", 0x79d7ff, 1411, 2566) { isMetal = true }
    val holmium = registerElement(67, "holmium", 0x9cffc9, 1474, 2694) { isMetal = true }
    val erbium = registerElement(68, "erbium", 0x5effe1, 1528, 2868) { isMetal = true }
    val thulium = registerElement(69, "thulium", 0x60f4ff, 1544, 1950) { isMetal = true }
    val ytterbium = registerElement(70, "ytterbium", 0xb2f5ff, 819, 1195) { isMetal = true }
    val lutetium = registerElement(71, "lutetium", 0xb1faff, 1663, 3402) { isMetal = true }

    val hafnium = registerElement(72, "hafnium", 0x6f95ff, 2227, 4601) { isMetal = true }
    val tantalum = registerElement(73, "tantalum", 0x68ceff, 3019, 5456) { isMetal = true }
    val tungsten = registerElement(74, "tungsten", 0x49d5ff, 3421, 5555) { isMetal = true }
    val rhenium = registerElement(75, "rhenium", 0x61a9fe, 3181, 5596) { isMetal = true }
    val osmium = registerElement(76, "osmium", 0x3e94ff, 3033, 5026) { isMetal = true }
    val iridium = registerElement(77, "iridium", 0x3e7eff, 2446, 4428) { isMetal = true }
    val platinum = registerElement(78, "platinum", 0x5695ff, 1768, 3825) { isMetal = true }
    val gold = registerElement(79, "gold", 0xa38eff, 1064, 2700) { isMetal = true }
    val mercury = registerElement(80, "mercury", 0x93f8ff, -38, 356) { isMetal = true }
    val thallium = registerElement(81, "thallium", 0x1eff47, 303, 1472) { isMetal = true }
    val lead = registerElement(82, "lead", 0xa9ecff, 327, 1749) { isMetal = true }
    val bismuth = registerElement(83, "bismuth", 0x6b97ff, 271, 1564) { isMetal = true }
    val polonium = registerElement(84, "polonium", 0x4a8dff, 254, 962) { isMetal = true }
    val astatine = registerElement(85, "astatine", 0x444444, 301, 336) { isMetal = true }
    val radon = registerElement(86, "radon", 0xff19a1, -71, -61)

    val francium = registerElement(87, "francium", 0xfe8146, 27, 676) { isMetal = true }
    val radium = registerElement(88, "radium", 0xff5a64, 700, 1737) { isMetal = true }
    val actinium = registerElement(89, "actinium", 0xc1e6ff, 1050, 3196) { isMetal = true }

    val thorium = registerElement(90, "thorium", 0x8bf5ff, 1754, 4786) { isMetal = true }
    val protactinium = registerElement(91, "protactinium", 0xe80aff, 1568, 4000) { isMetal = true }
    val uranium = registerElement(92, "uranium", 0xa0bbff, 1132, 4131) { isMetal = true }
    val neptunium = registerElement(93, "neptunium", 0xffbf29, 644, 3901) { isMetal = true }
    val plutonium = registerElement(94, "plutonium", 0xff40d7, 639, 3231) { isMetal = true }
    val americium = registerElement(95, "americium", 0x996fff, 1175, 2606) { isMetal = true }
    val curium = registerElement(96, "curium", 0xff31c3, 1346, 3109) { isMetal = true }
    val berkelium = registerElement(97, "berkelium", 0x48ff5e, 984, 2627) { isMetal = true }
    val californium = registerElement(98, "californium", 0x94fec1, 898, 1472) { isMetal = true }
    val einsteinium = registerElement(99, "einsteinium", 0x13ffb7, 860, 9999) { isMetal = true }
    val fermium = registerElement(100, "fermium", 0x444444, 1526, 9999) { isMetal = true }
    val mendelevium = registerElement(101, "mendelevium", 0x444444, 926, 9999) { isMetal = true }
    val nobelium = registerElement(102, "nobelium", 0x444444, 826, 9999) { isMetal = true }
    val lawrencium = registerElement(103, "lawrencium", 0x444444, 1627, 9999) { isMetal = true }


    val values by lazy {
        ModElements::class.declaredMemberProperties
            .filter { it.returnType == typeOf<SCElement>() }
            .map { it.get(ModElements) }
            .map { it as SCElement }
            .toSet()

    }
}