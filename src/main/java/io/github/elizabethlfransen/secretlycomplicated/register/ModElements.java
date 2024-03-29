package io.github.elizabethlfransen.secretlycomplicated.register;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCElement;
import io.github.elizabethlfransen.secretlycomplicated.material.SCElementBuilder;
import io.github.noeppi_noeppi.libx.annotation.ForMod;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.elizabethlfransen.secretlycomplicated.materialform.CommonMaterialFormFactories.PARTS;

@RegisterClass
@ForMod(value = SecretlyComplicated.class)
public final class ModElements {
    public static final SCElement hydrogen = new SCElementBuilder()
            .atomicNumber(1)
            .name("hydrogen")
            .color(0xff1a7d)
            .melting(-259)
            .boiling(-252)
            .withForms(PARTS)
            .build();
    public static final SCElement helium = new SCElementBuilder()
            .atomicNumber(2)
            .name("helium")
            .color(0xffc6e0)
            .melting(-272)
            .boiling(-268)
            .withForms(PARTS)
            .build();
    public static final SCElement lithium = new SCElementBuilder()
            .atomicNumber(3)
            .name("lithium")
            .color(0xe5e5e5)
            .melting(180)
            .boiling(1342)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0xff1852
    public static final SCElement beryllium = new SCElementBuilder()
            .atomicNumber(4)
            .name("beryllium")
            .color(0xcccccc)
            .melting(1286)
            .boiling(2469)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0x1e4cff
    public static final SCElement boron = new SCElementBuilder()
            .atomicNumber(5)
            .name("boron")
            .color(0xb2b2b2)
            .melting(2076)
            .boiling(4000)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0x4132ff
    public static final SCElement carbon = new SCElementBuilder()
            .atomicNumber(6)
            .name("carbon")
            .color(0x141414)
            .melting(3500)
            .boiling(9999)
            .withForms(PARTS)
            .build();// atomic spectral emission color: 0xebffc1
    public static final SCElement nitrogen = new SCElementBuilder()
            .atomicNumber(7)
            .name("nitrogen")
            .color(0xe795ff)
            .melting(-210)
            .boiling(-195)
            .withForms(PARTS)
            .build();
    public static final SCElement oxygen = new SCElementBuilder()
            .atomicNumber(8)
            .name("oxygen")
            .color(0xb8bfff)
            .melting(-218)
            .boiling(-182)
            .withForms(PARTS)
            .build();
    public static final SCElement fluorine = new SCElementBuilder()
            .atomicNumber(9)
            .name("fluorine")
            .color(0xff1765)
            .melting(-219)
            .boiling(-188)
            .withForms(PARTS)
            .build();
    public static final SCElement neon = new SCElementBuilder()
            .atomicNumber(10)
            .name("neon")
            .color(0xff4022)
            .melting(-248)
            .boiling(-246)
            .withForms(PARTS)
            .build();

    public static final SCElement sodium = new SCElementBuilder()
            .atomicNumber(11)
            .name("sodium")
            .color(0xf7f7f7)
            .melting(97)
            .boiling(882)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0xffad1d
    public static final SCElement magnesium = new SCElementBuilder()
            .atomicNumber(12)
            .name("magnesium")
            .color(0xdedede)
            .melting(650)
            .boiling(1091)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0x55faff
    public static final SCElement aluminium = new SCElementBuilder()
            .atomicNumber(13)
            .name("aluminium")
            .color(0xc7c7c7)
            .melting(660)
            .boiling(2470)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0x4c95ff
    public static final SCElement silicon = new SCElementBuilder()
            .atomicNumber(14)
            .name("silicon")
            .color(0xbbceff)
            .melting(1410)
            .boiling(2355)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement phosphorus = new SCElementBuilder()
            .atomicNumber(15)
            .name("phosphorus")
            .color(0xffff00)
            .melting(44)
            .boiling(280)
            .withForms(PARTS)
            .build();// atomic spectral emission color: 0x36fec8
    public static final SCElement sulfur = new SCElementBuilder()
            .atomicNumber(16)
            .name("sulfur")
            .color(0xc8c800)
            .melting(112)
            .boiling(444)
            .withForms(PARTS)
            .build();// atomic spectral emission color: 0x6fb0ff
    public static final SCElement chlorine = new SCElementBuilder()
            .atomicNumber(17)
            .name("chlorine")
            .color(0x00ffff)
            .melting(-101)
            .boiling(-34)
            .withForms(PARTS)
            .build();// atomic spectral emission color: 0x76b1ff
    public static final SCElement argon = new SCElementBuilder()
            .atomicNumber(18)
            .name("argon")
            .color(0xff6afe)
            .melting(-189)
            .boiling(-185)
            .withForms(PARTS)
            .build();

    public static final SCElement potassium = new SCElementBuilder()
            .atomicNumber(19)
            .name("potassium")
            .color(0xfafafa)
            .melting(63)
            .boiling(758)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0xdab4ff
    public static final SCElement calcium = new SCElementBuilder()
            .atomicNumber(20)
            .name("calcium")
            .color(0xfff5f5)
            .melting(842)
            .boiling(1483)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0xfe78bf
    public static final SCElement scandium = new SCElementBuilder()
            .atomicNumber(21)
            .name("scandium")
            .color(0xe0a5ff)
            .melting(1540)
            .boiling(2835)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement titanium = new SCElementBuilder()
            .atomicNumber(22)
            .name("titanium")
            .color(0x57a0fe)
            .melting(1668)
            .boiling(3286)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement vanadium = new SCElementBuilder()
            .atomicNumber(23)
            .name("vanadium")
            .color(0xe8cfff)
            .melting(1910)
            .boiling(3407)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement chromium = new SCElementBuilder()
            .atomicNumber(24)
            .name("chromium")
            .color(0x63c2fe)
            .melting(1907)
            .boiling(2671)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement manganese = new SCElementBuilder()
            .atomicNumber(25)
            .name("manganese")
            .color(0x435eff)
            .melting(1246)
            .boiling(2061)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement iron = new SCElementBuilder()
            .atomicNumber(26)
            .name("iron")
            .color(0xffffff)
            .melting(1538)
            .boiling(2862)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0x32eaff
    public static final SCElement cobalt = new SCElementBuilder()
            .atomicNumber(27)
            .name("cobalt")
            .color(0x41fffa)
            .melting(1495)
            .boiling(2869)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement nickel = new SCElementBuilder()
            .atomicNumber(28)
            .name("nickel")
            .color(0xc8c8fa)
            .melting(1455)
            .boiling(2730)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0x35f5ff
    public static final SCElement copper = new SCElementBuilder()
            .atomicNumber(29)
            .name("copper")
            .color(0xda7953)
            .melting(1084)
            .boiling(2562)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0x7effcf
    public static final SCElement zinc = new SCElementBuilder()
            .atomicNumber(30)
            .name("zinc")
            .color(0x91898d)
            .melting(419)
            .boiling(907)
            .withForms(PARTS)
            .metallic()
            .build(); // atomic spectral emission color: 0x3941ff
    public static final SCElement gallium = new SCElementBuilder()
            .atomicNumber(31)
            .name("gallium")
            .color(0x7625ff)
            .melting(29)
            .boiling(2400)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement germanium = new SCElementBuilder()
            .atomicNumber(32)
            .name("germanium")
            .color(0xe5ffd5)
            .melting(938)
            .boiling(2833)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement arsenic = new SCElementBuilder()
            .atomicNumber(33)
            .name("arsenic")
            .color(0x339cff)
            .melting(816)
            .boiling(613)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement selenium = new SCElementBuilder()
            .atomicNumber(34)
            .name("selenium")
            .color(0x4bb2ff)
            .melting(220)
            .boiling(684)
            .withForms(PARTS)
            .build();
    public static final SCElement bromine = new SCElementBuilder()
            .atomicNumber(35)
            .name("bromine")
            .color(0x86bfff)
            .melting(-7)
            .boiling(58)
            .withForms(PARTS)
            .build();
    public static final SCElement krypton = new SCElementBuilder()
            .atomicNumber(36)
            .name("krypton")
            .color(0xffc2ef)
            .melting(-157)
            .boiling(-153)
            .withForms(PARTS)
            .build();

    public static final SCElement rubidium = new SCElementBuilder()
            .atomicNumber(37)
            .name("rubidium")
            .color(0xff4d81)
            .melting(63)
            .boiling(758)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement strontium = new SCElementBuilder()
            .atomicNumber(38)
            .name("strontium")
            .color(0xfe69c3)
            .melting(842)
            .boiling(1483)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement yttrium = new SCElementBuilder()
            .atomicNumber(39)
            .name("yttrium")
            .color(0xffecf1)
            .melting(1540)
            .boiling(2835)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement zirconium = new SCElementBuilder()
            .atomicNumber(40)
            .name("zirconium")
            .color(0x67d8ff)
            .melting(1668)
            .boiling(3286)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement niobium = new SCElementBuilder()
            .atomicNumber(41)
            .name("niobium")
            .color(0x6cc2ff)
            .melting(1910)
            .boiling(3407)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement molybdenum = new SCElementBuilder()
            .atomicNumber(42)
            .name("molybdenum")
            .color(0x8aa1fe)
            .melting(1907)
            .boiling(2671)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement technetium = new SCElementBuilder()
            .atomicNumber(43)
            .name("technetium")
            .color(0x4780ff)
            .melting(1246)
            .boiling(2061)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement ruthenium = new SCElementBuilder()
            .atomicNumber(44)
            .name("ruthenium")
            .color(0x447fff)
            .melting(1538)
            .boiling(2862)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement rhodium = new SCElementBuilder()
            .atomicNumber(45)
            .name("rhodium")
            .color(0x7cffd7)
            .melting(1495)
            .boiling(2869)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement palladium = new SCElementBuilder()
            .atomicNumber(46)
            .name("palladium")
            .color(0x4effde)
            .melting(1455)
            .boiling(2730)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement silver = new SCElementBuilder()
            .atomicNumber(47)
            .name("silver")
            .color(0xdcdcff)
            .melting(1084)
            .boiling(2562)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0x32ffa3
    public static final SCElement cadmium = new SCElementBuilder()
            .atomicNumber(48)
            .name("cadmium")
            .color(0x6098fe)
            .melting(419)
            .boiling(907)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement indium = new SCElementBuilder()
            .atomicNumber(49)
            .name("indium")
            .color(0x7745ff)
            .melting(29)
            .boiling(2400)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement tin = new SCElementBuilder()
            .atomicNumber(50)
            .name("tin")
            .color(0xdcdcdc)
            .melting(938)
            .boiling(2833)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0xffbefc
    public static final SCElement antimony = new SCElementBuilder()
            .atomicNumber(51)
            .name("antimony")
            .color(0xefe7ff)
            .melting(816)
            .boiling(613)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement tellurium = new SCElementBuilder()
            .atomicNumber(52)
            .name("tellurium")
            .color(0x47d7ff)
            .melting(220)
            .boiling(684)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement iodine = new SCElementBuilder()
            .atomicNumber(53)
            .name("iodine")
            .color(0x9fffdb)
            .melting(-7)
            .boiling(58)
            .withForms(PARTS)
            .build();
    public static final SCElement xenon = new SCElementBuilder()
            .atomicNumber(54)
            .name("xenon")
            .color(0xab94ff)
            .melting(-157)
            .boiling(-153)
            .withForms(PARTS)
            .build();

    public static final SCElement caesium = new SCElementBuilder()
            .atomicNumber(55)
            .name("caesium")
            .color(0x9268ff)
            .melting(28)
            .boiling(670)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement barium = new SCElementBuilder()
            .atomicNumber(56)
            .name("barium")
            .color(0xffc090)
            .melting(727)
            .boiling(1897)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement lanthanum = new SCElementBuilder()
            .atomicNumber(57)
            .name("lanthanum")
            .color(0x7f98ff)
            .melting(920)
            .boiling(3463)
            .withForms(PARTS)
            .metallic()
            .build();

    public static final SCElement cerium = new SCElementBuilder()
            .atomicNumber(58)
            .name("cerium")
            .color(0x69dffe)
            .melting(795)
            .boiling(3257)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement praseodymium = new SCElementBuilder()
            .atomicNumber(59)
            .name("praseodymium")
            .color(0x507fff)
            .melting(930)
            .boiling(3520)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement neodymium = new SCElementBuilder()
            .atomicNumber(60)
            .name("neodymium")
            .color(0x4168ff)
            .melting(1020)
            .boiling(3073)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement promethium = new SCElementBuilder()
            .atomicNumber(61)
            .name("promethium")
            .color(0x8085ff)
            .melting(1041)
            .boiling(2999)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement samarium = new SCElementBuilder()
            .atomicNumber(62)
            .name("samarium")
            .color(0x87a5ff)
            .melting(1072)
            .boiling(1793)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement europium = new SCElementBuilder()
            .atomicNumber(63)
            .name("europium")
            .color(0xeecaff)
            .melting(826)
            .boiling(1529)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement gadolinium = new SCElementBuilder()
            .atomicNumber(64)
            .name("gadolinium")
            .color(0xfec1fc)
            .melting(1311)
            .boiling(3271)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement terbium = new SCElementBuilder()
            .atomicNumber(65)
            .name("terbium")
            .color(0xa2feed)
            .melting(1355)
            .boiling(3230)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement dysprosium = new SCElementBuilder()
            .atomicNumber(66)
            .name("dysprosium")
            .color(0x79d7ff)
            .melting(1411)
            .boiling(2566)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement holmium = new SCElementBuilder()
            .atomicNumber(67)
            .name("holmium")
            .color(0x9cffc9)
            .melting(1474)
            .boiling(2694)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement erbium = new SCElementBuilder()
            .atomicNumber(68)
            .name("erbium")
            .color(0x5effe1)
            .melting(1528)
            .boiling(2868)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement thulium = new SCElementBuilder()
            .atomicNumber(69)
            .name("thulium")
            .color(0x60f4ff)
            .melting(1544)
            .boiling(1950)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement ytterbium = new SCElementBuilder()
            .atomicNumber(70)
            .name("ytterbium")
            .color(0xb2f5ff)
            .melting(819)
            .boiling(1195)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement lutetium = new SCElementBuilder()
            .atomicNumber(71)
            .name("lutetium")
            .color(0xb1faff)
            .melting(1663)
            .boiling(3402)
            .withForms(PARTS)
            .metallic()
            .build();

    public static final SCElement hafnium = new SCElementBuilder()
            .atomicNumber(72)
            .name("hafnium")
            .color(0x6f95ff)
            .melting(2227)
            .boiling(4601)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement tantalum = new SCElementBuilder()
            .atomicNumber(73)
            .name("tantalum")
            .color(0x68ceff)
            .melting(3019)
            .boiling(5456)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement tungsten = new SCElementBuilder()
            .atomicNumber(74)
            .name("tungsten")
            .color(0x49d5ff)
            .melting(3421)
            .boiling(5555)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement rhenium = new SCElementBuilder()
            .atomicNumber(75)
            .name("rhenium")
            .color(0x61a9fe)
            .melting(3181)
            .boiling(5596)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement osmium = new SCElementBuilder()
            .atomicNumber(76)
            .name("osmium")
            .color(0x3e94ff)
            .melting(3033)
            .boiling(5026)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement iridium = new SCElementBuilder()
            .atomicNumber(77)
            .name("iridium")
            .color(0x3e7eff)
            .melting(2446)
            .boiling(4428)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement platinum = new SCElementBuilder()
            .atomicNumber(78)
            .name("platinum")
            .color(0x5695ff)
            .melting(1768)
            .boiling(3825)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement gold = new SCElementBuilder()
            .atomicNumber(79)
            .name("gold")
            .color(0xffff00)
            .melting(1064)
            .boiling(2700)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0xa38eff
    public static final SCElement mercury = new SCElementBuilder()
            .atomicNumber(80)
            .name("mercury")
            .color(0x93f8ff)
            .melting(-38)
            .boiling(356)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement thallium = new SCElementBuilder()
            .atomicNumber(81)
            .name("thallium")
            .color(0x1eff47)
            .melting(303)
            .boiling(1472)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement lead = new SCElementBuilder()
            .atomicNumber(82)
            .name("lead")
            .color(0x8c648c)
            .melting(327)
            .boiling(1749)
            .withForms(PARTS)
            .metallic()
            .build();// atomic spectral emission color: 0xa9ecff
    public static final SCElement bismuth = new SCElementBuilder()
            .atomicNumber(83)
            .name("bismuth")
            .color(0x6b97ff)
            .melting(271)
            .boiling(1564)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement polonium = new SCElementBuilder()
            .atomicNumber(84)
            .name("polonium")
            .color(0x4a8dff)
            .melting(254)
            .boiling(962)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement astatine = new SCElementBuilder()
            .atomicNumber(85)
            .name("astatine")
            .color(0x444444)
            .melting(301)
            .boiling(336)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement radon = new SCElementBuilder()
            .atomicNumber(86)
            .name("radon")
            .color(0xff19a1)
            .melting(-71)
            .boiling(-61)
            .withForms(PARTS)
            .build();

    public static final SCElement francium = new SCElementBuilder()
            .atomicNumber(87)
            .name("francium")
            .color(0xfe8146)
            .melting(27)
            .boiling(676)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement radium = new SCElementBuilder()
            .atomicNumber(88)
            .name("radium")
            .color(0xff5a64)
            .melting(700)
            .boiling(1737)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement actinium = new SCElementBuilder()
            .atomicNumber(89)
            .name("actinium")
            .color(0xc1e6ff)
            .melting(1050)
            .boiling(3196)
            .withForms(PARTS)
            .metallic()
            .build();

    public static final SCElement thorium = new SCElementBuilder()
            .atomicNumber(90)
            .name("thorium")
            .color(0x8bf5ff)
            .melting(1754)
            .boiling(4786)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement protactinium = new SCElementBuilder()
            .atomicNumber(91)
            .name("protactinium")
            .color(0xe80aff)
            .melting(1568)
            .boiling(4000)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement uranium = new SCElementBuilder()
            .atomicNumber(92)
            .name("uranium")
            .color(0xa0bbff)
            .melting(1132)
            .boiling(4131)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement neptunium = new SCElementBuilder()
            .atomicNumber(93)
            .name("neptunium")
            .color(0xffbf29)
            .melting(644)
            .boiling(3901)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement plutonium = new SCElementBuilder()
            .atomicNumber(94)
            .name("plutonium")
            .color(0xff40d7)
            .melting(639)
            .boiling(3231)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement americium = new SCElementBuilder()
            .atomicNumber(95)
            .name("americium")
            .color(0x996fff)
            .melting(1175)
            .boiling(2606)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement curium = new SCElementBuilder()
            .atomicNumber(96)
            .name("curium")
            .color(0xff31c3)
            .melting(1346)
            .boiling(3109)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement berkelium = new SCElementBuilder()
            .atomicNumber(97)
            .name("berkelium")
            .color(0x48ff5e)
            .melting(984)
            .boiling(2627)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement californium = new SCElementBuilder()
            .atomicNumber(98)
            .name("californium")
            .color(0x94fec1)
            .melting(898)
            .boiling(1472)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement einsteinium = new SCElementBuilder()
            .atomicNumber(99)
            .name("einsteinium")
            .color(0x13ffb7)
            .melting(860)
            .boiling(9999)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement fermium = new SCElementBuilder()
            .atomicNumber(100)
            .name("fermium")
            .color(0x444444)
            .melting(1526)
            .boiling(9999)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement mendelevium = new SCElementBuilder()
            .atomicNumber(101)
            .name("mendelevium")
            .color(0x444444)
            .melting(926)
            .boiling(9999)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement nobelium = new SCElementBuilder()
            .atomicNumber(102)
            .name("nobelium")
            .color(0x444444)
            .melting(826)
            .boiling(9999)
            .withForms(PARTS)
            .metallic()
            .build();
    public static final SCElement lawrencium = new SCElementBuilder()
            .atomicNumber(103)
            .name("lawrencium")
            .color(0x444444)
            .melting(1627)
            .boiling(9999)
            .withForms(PARTS)
            .metallic()
            .build();
    @NoReg
    private static final Set<SCElement> values = Arrays.stream(ModElements.class.getDeclaredFields())
            .filter(f -> f.getType() == SCElement.class)
            .map(f -> {
                try {
                    return (SCElement) f.get(null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            })
            .collect(Collectors.toUnmodifiableSet());


    public static Set<SCElement> getValues() {
        return ModElements.values;
    }
    private ModElements() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
