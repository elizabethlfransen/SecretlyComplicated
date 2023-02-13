package io.github.elizabethlfransen.secretlycomplicated.register;

import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterialBuilder;
import io.github.elizabethlfransen.secretlycomplicated.materialform.CommonMaterialFormFactories;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RegisterClass
public class ModFluids {
    /**
     * Fuels
     **/
    public static final SCMaterial creosote = new SCMaterialBuilder()
            .name("creosote")
            .color(0x804000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial diesel = new SCMaterialBuilder()
            .name("diesel")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial cetane_boosted_diesel = new SCMaterialBuilder()
            .name("cetane_boosted_diesel")
            .color(0xc8ff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial bio_diesel = new SCMaterialBuilder()
            .name("bio_diesel")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial biomass = new SCMaterialBuilder()
            .name("biomass")
            .color(0x00ff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial fermented_biomass = new SCMaterialBuilder()
            .name("fermented_biomass")
            .color(0x09964a)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial ethanol = new SCMaterialBuilder()
            .name("ethanol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial ethanediol = new SCMaterialBuilder()
            .name("ethanediol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial propanol = new SCMaterialBuilder()
            .name("propanol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial ethenol = new SCMaterialBuilder()
            .name("ethenol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial propanediol = new SCMaterialBuilder()
            .name("propanediol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial propenol = new SCMaterialBuilder()
            .name("propenol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial butanol = new SCMaterialBuilder()
            .name("butanol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial butenol = new SCMaterialBuilder()
            .name("butenol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial butanediol = new SCMaterialBuilder()
            .name("butanediol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial heptanol = new SCMaterialBuilder()
            .name("heptanol")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial fish_oil = new SCMaterialBuilder()
            .name("fish_oil")
            .color(0xffc400)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial seed_oil = new SCMaterialBuilder()
            .name("seed_oil")
            .color(0xc4ff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial heavy_oil = new SCMaterialBuilder()
            .name("heavy_oil")
            .color(0x0a0a0a)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial raw_oil = new SCMaterialBuilder()
            .name("raw_oil")
            .color(0x0a0a0a)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial light_oil = new SCMaterialBuilder()
            .name("light_oil")
            .color(0x0a0a0a)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sulfuric_light_diesel = new SCMaterialBuilder()
            .name("sulfuric_light_diesel")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sulfuric_heavy_diesel = new SCMaterialBuilder()
            .name("sulfuric_heavy_diesel")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial light_diesel = new SCMaterialBuilder()
            .name("light_diesel")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial heavy_diesel = new SCMaterialBuilder()
            .name("heavy_diesel")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial glyceryl = new SCMaterialBuilder()
            .name("glyceryl")
            .color(0x87de87)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial glyceryltrinitrate = new SCMaterialBuilder()
            .name("glyceryltrinitrate")
            .color(0x87de87)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();


            
    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModFluids.class.getDeclaredFields())
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
        return ModFluids.values;
    }

}
