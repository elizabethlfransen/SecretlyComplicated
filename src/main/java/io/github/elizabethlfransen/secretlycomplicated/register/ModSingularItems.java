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
public class ModSingularItems {
    public static final SCMaterial tar = new SCMaterialBuilder()
            .name("tar")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial sawdust = new SCMaterialBuilder()
            .name("sawdust")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial fire_clay = new SCMaterialBuilder()
            .name("fire_clay")
            .color(0xf1f1f1)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial rosin = new SCMaterialBuilder()
            .name("rosin")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
//     public static final SCMaterial rubber = new SCMaterialBuilder()
//             .name("rubber")
//             .color(0x222222)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
    public static final SCMaterial cured_rubber = new SCMaterialBuilder()
            .name("cured_rubber")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial slag = new SCMaterialBuilder()
            .name("slag")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial rich_slag = new SCMaterialBuilder()
            .name("rich_slag")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial reaction_catalyst = new SCMaterialBuilder()
            .name("reaction_catalyst")
            .color(0x43ab43)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial gelled_toluene = new SCMaterialBuilder()
            .name("gelled_toluene")
            .color(0xeeeee)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial wood_pulp = new SCMaterialBuilder()
            .name("wood_pulp")
            .color(0x3f2620)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
//     public static final SCMaterial sodium_sulfide = new SCMaterialBuilder()
//             .name("sodium_sulfide")
//             .color(0xffe680)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
    public static final SCMaterial rare_earth = new SCMaterialBuilder()
            .name("rare_earth")
            .color(0x808064)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial platinum_group_sludge = new SCMaterialBuilder()
            .name("platinum_group_sludge")
            .color(0x001e00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial massicot = new SCMaterialBuilder()
            .name("massicot")
            .color(0xffdd55)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
//     public static final SCMaterial arsenic_trioxide = new SCMaterialBuilder()
//             .name("arsenic_trioxide")
//             .color(0xffffff)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial cobalt_oxide = new SCMaterialBuilder()
//             .name("cobalt_oxide")
//             .color(0x668000)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
    public static final SCMaterial magnesia = new SCMaterialBuilder()
            .name("magnesia")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial quicklime = new SCMaterialBuilder()
            .name("quicklime")
            .color(0xf0f0f0)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial potash = new SCMaterialBuilder()
            .name("potash")
            .color(0x784237)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial soda_ash = new SCMaterialBuilder()
            .name("soda_ash")
            .color(0xdcdcff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
    public static final SCMaterial ash = new SCMaterialBuilder()
            .name("ash")
            .color(0xf0f0ff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
//     public static final SCMaterial brick = new SCMaterialBuilder()
//             .name("brick")
//             .color(0x9b5643)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial sodium_bisulfate = new SCMaterialBuilder()
//             .name("sodium_bisulfate")
//             .color(0x004455)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial sodium_sulfate = new SCMaterialBuilder()
//             .name("sodium_sulfate")
//             .color(0x004455)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial raw_styrene_butadiene_rubber = new SCMaterialBuilder()
//             .name("raw_styrene_butadiene_rubber")
//             .color(0x54403d)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial phosphorous_pentoxide = new SCMaterialBuilder()
//             .name("phosphorous_pentoxide")
//             .color(0xdcdc00)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial sodium_hydroxide = new SCMaterialBuilder()
//             .name("sodium_hydroxide")
//             .color(0x003380)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
    public static final SCMaterial biotite = new SCMaterialBuilder()
            .name("biotite")
            .color(0x141e14)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.CHUNKS)
            .build();
            /*
             * Plastic stuff
             */
//     public static final SCMaterial polyethylene = new SCMaterialBuilder()
//             .name("polyethylene")
//             .color(0xc8c8c8)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial siliconrubber = new SCMaterialBuilder()
//             .name("siliconrubber")
//             .color(0x9fadbb)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial epoxid = new SCMaterialBuilder()
//             .name("epoxid")
//             .color(0xc88c14)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial silicone = new SCMaterialBuilder()
//             .name("silicone")
//             .color(0xdcdcdc)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial polycaprolactam = new SCMaterialBuilder()
//             .name("polycaprolactam")
//             .color(0x323232)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial polytetrafluoroethylene = new SCMaterialBuilder()
//             .name("polytetrafluoroethylene")
//             .color(0x646464)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial polyphenylene_sulfide = new SCMaterialBuilder()
//             .name("polyphenylene_sulfide")
//             .color(0xaa8800)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial polystyrene = new SCMaterialBuilder()
//             .name("polystyrene")
//             .color(0xbeb4aa)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial styrene_butadiene_rubber = new SCMaterialBuilder()
//             .name("styrene_butadiene_rubber")
//             .color(0x211a18)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial polyvinyl_chloride = new SCMaterialBuilder()
//             .name("polyvinyl_chloride")
//             .color(0xd7e6e6)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial gallium_arsenide = new SCMaterialBuilder()
//             .name("gallium_arsenide")
//             .color(0xa0a0a0)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();
//     public static final SCMaterial fiber_reinforced_epoxy_resin = new SCMaterialBuilder()
//             .name("fiber_reinforced_epoxy_resin")
//             .color(0xa07010)
//             .melting(9999)
//             .boiling(9999)
//             .withForms(CommonMaterialFormFactories.CHUNKS)
//             .build();

    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModSingularItems.class.getDeclaredFields())
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
        return ModSingularItems.values;
    }

}
