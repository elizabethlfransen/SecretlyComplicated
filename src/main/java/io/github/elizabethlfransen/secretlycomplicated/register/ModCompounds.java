package io.github.elizabethlfransen.secretlycomplicated.register;

import io.github.elizabethlfransen.secretlycomplicated.material.SCElement;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterialBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.CommonMaterialFormFactories;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RegisterClass
public class ModCompounds {
    public static final SCMaterial roseGold = new SCMaterialBuilder()
            .name("rose_gold")
            .color(0xE0BFB8)
            .melting(897)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial brass = new SCMaterialBuilder()
            .name("brass")
            .color(0xE1C16E)
            .melting(920)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial bronze = new SCMaterialBuilder()
            .name("bronze")
            .color(0xCD7F32)
            .melting(1030)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial electrum = new SCMaterialBuilder()
            .name("electrum")
            .color(0xF2E279)
            .melting(1064)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial constantan = new SCMaterialBuilder()
            .name("constantan")
            .color(0xFFC383)
            .melting(1210)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial invar = new SCMaterialBuilder()
            .name("invar")
            .color(0x70776e)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial steel = new SCMaterialBuilder()
            .name("steel")
            .color(0x9ea4a6)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial tin_alloy = new SCMaterialBuilder()
            .name("tin_alloy")
            .color(0x9fadbb)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial battery_alloy = new SCMaterialBuilder()
            .name("battery_alloy")
            .color(0x9c7ca0)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial soldering_alloy = new SCMaterialBuilder()
            .name("soldering_alloy")
            .color(0xdcdce6)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial red_alloy = new SCMaterialBuilder()
            .name("red_alloy")
            .color(0xc80000)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial magnalium = new SCMaterialBuilder()
            .name("magnalium")
            .color(0xc8beff)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial borosilicate_glass = new SCMaterialBuilder()
            .name("borosilicate_glass")
            .color(0xfafafa)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial yttrium_barium_cuprate = new SCMaterialBuilder()
            .name("yttrium_barium_cuprate")
            .color(0x504046)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial black_bronze = new SCMaterialBuilder()
            .name("black_bronze")
            .color(0x64327d)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial black_steel = new SCMaterialBuilder()
            .name("black_steel")
            .color(0x646464)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial ferrite_mixture = new SCMaterialBuilder()
            .name("ferrite_mixture")
            .color(0xb4b4b4)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial nichrome = new SCMaterialBuilder()
            .name("nichrome")
            .color(0xcdcef6)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial osmiridium = new SCMaterialBuilder()
            .name("osmiridium")
            .color(0x6464ff)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial gallium_arsenide = new SCMaterialBuilder()
            .name("gallium_arsenide")
            .color(0xa0a0a0)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial sodium_sulfide = new SCMaterialBuilder()
            .name("sodium_sulfide")
            .color(0xffe680)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial kanthal = new SCMaterialBuilder()
            .name("kanthal")
            .color(0xc2d2df)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial vanadium_gallium = new SCMaterialBuilder()
            .name("vanadium_gallium")
            .color(0x80808c)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial vanadium_steel = new SCMaterialBuilder()
            .name("vanadium_steel")
            .color(0xc0c0c0)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial indium_gallium_phosphide = new SCMaterialBuilder()
            .name("indium_gallium_phosphide")
            .color(0x570b79)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial cobalt_brass = new SCMaterialBuilder()
            .name("cobalt_brass")
            .color(0xb4b4a0)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial bismuth_bronze = new SCMaterialBuilder()
            .name("bismuth_bronze")
            .color(0x647d7d)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial sterling_silver = new SCMaterialBuilder()
            .name("sterling_silver")
            .color(0xfadce1)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial wrought_iron = new SCMaterialBuilder()
            .name("wrought_iron")
            .color(0xc8b4b4)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial red_steel = new SCMaterialBuilder()
            .name("red_steel")
            .color(0x8c6464)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial blue_steel = new SCMaterialBuilder()
            .name("blue_steel")
            .color(0x64648c)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial tungstensteel = new SCMaterialBuilder()
            .name("tungstensteel")
            .color(0xc80000)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial nickel_zinc_ferrite = new SCMaterialBuilder()
            .name("nickel_zinc_ferrite")
            .color(0x3c3c3c)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial tungsten_carbide = new SCMaterialBuilder()
            .name("tungsten_carbide")
            .color(0x330066)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial hssg = new SCMaterialBuilder()
            .name("hssg")
            .color(0x999900)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial hsse = new SCMaterialBuilder()
            .name("hsse")
            .color(0x336600)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial hsss = new SCMaterialBuilder()
            .name("hsss")
            .color(0x660033)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    public static final SCMaterial annealed_copper = new SCMaterialBuilder()
            .name("annealed_copper")
            .color(0xff7814)
            .melting(2500)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.parts)
            .build();
    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModCompounds.class.getDeclaredFields())
            .filter(f -> f.getType() == SCMaterial.class)
            .map(f -> {
                try {
                    return (SCMaterial) f.get(null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            })
            .collect(Collectors.toUnmodifiableSet());


    public static Set<SCMaterial> getValues() {
        return ModCompounds.values;
    }

}
