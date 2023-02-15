package io.github.elizabethlfransen.secretlycomplicated.register;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterialBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.CommonMaterialFormFactories;
import io.github.noeppi_noeppi.libx.annotation.ForMod;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RegisterClass
@ForMod(value = SecretlyComplicated.class)
public class ModGems {
    public static final SCMaterial coal_coke = new SCMaterialBuilder()
            .name("coal_coke")
            .color(0x444444)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial bitumen = new SCMaterialBuilder()
            .name("bitumen")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial apatite = new SCMaterialBuilder()
            .name("apatite")
            .color(0x0760b9)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial potassium_nitrate = new SCMaterialBuilder()
            .name("potassium_nitrate") //saltpeter, nitrate
            .color(0xfafafa)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial cinnabar = new SCMaterialBuilder()
            .name("cinnabar")
            .color(0x960000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
            /*
             * Allotropes (homonuclear) molecules
             */
    public static final SCMaterial dilithium = new SCMaterialBuilder()
            .name("dilithium")
            .color(0xf5f5f5)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial trilithium = new SCMaterialBuilder()
            .name("trilithium")
            .color(0xeeeeee)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial tetralithium = new SCMaterialBuilder()
            .name("tetralithium")
            .color(0xdbdbdb)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial pentalithium = new SCMaterialBuilder()
            .name("pentalithium")
            .color(0xd3d3d3)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial hexalithium = new SCMaterialBuilder()
            .name("hexalithium")
            .color(0xc4c4c4)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial heptalithium = new SCMaterialBuilder()
            .name("heptalithium")
            .color(0xb2b2b2)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial octalithium = new SCMaterialBuilder()
            .name("octalithium")
            .color(0xb9b9b9)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial nonalithium = new SCMaterialBuilder()
            .name("nonalithium")
            .color(0xbbbbbb)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial decalithium = new SCMaterialBuilder()
            .name("decalithium")
            .color(0xb4b4b4)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
            /*
             * Ore Gems
             */
    public static final SCMaterial blue_topaz = new SCMaterialBuilder()
            .name("blue_topaz")
            .color(0x0000ff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial charcoal = new SCMaterialBuilder()
            .name("charcoal")
            .color(0x644646)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial lignite_coke = new SCMaterialBuilder()
            .name("lignite_coke")
            .color(0x8c6464)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial lignite_coal = new SCMaterialBuilder()
            .name("lignite_coal")
            .color(0x644646)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial green_sapphire = new SCMaterialBuilder()
            .name("green_sapphire")
            .color(0x64c882)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial ruby = new SCMaterialBuilder()
            .name("ruby")
            .color(0xff6464)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial blue_sapphire = new SCMaterialBuilder()
            .name("blue_sapphire")
            .color(0x6464c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial sodalite = new SCMaterialBuilder()
            .name("sodalite")
            .color(0x1414ff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial tanzanite = new SCMaterialBuilder()
            .name("tanzanite")
            .color(0x4000c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial topaz = new SCMaterialBuilder()
            .name("topaz")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial olivine = new SCMaterialBuilder()
            .name("olivine")
            .color(0x96ff96)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial red_garnet = new SCMaterialBuilder()
            .name("red_garnet")
            .color(0xc85050)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial yellow_garnet = new SCMaterialBuilder()
            .name("yellow_garnet")
            .color(0xc8c850)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();
    public static final SCMaterial monazite = new SCMaterialBuilder()
            .name("monazite")
            .color(0x324632)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GEMS)
            .build();


    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModGems.class.getDeclaredFields())
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
        return ModGems.values;
    }

}
