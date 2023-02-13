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
    public static final SCMaterial toluene = new SCMaterialBuilder()
            .name("toluene")
            .color(0x501d05)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sulfuric_naphtha = new SCMaterialBuilder()
            .name("sulfuric_naphtha")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial naphtha = new SCMaterialBuilder()
            .name("naphtha")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
     /**
     * Chemical Fluids
     **/
    public static final SCMaterial diluted_sulfuric_acid = new SCMaterialBuilder()
            .name("diluted_sulfuric_acid")
            .color(0xc07820)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial phosphoric_acid = new SCMaterialBuilder()
            .name("phosphoric_acid")
            .color(0xdcdc00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial titaniumtetrachloride = new SCMaterialBuilder()
            .name("titaniumtetrachloride")
            .color(0xd40d5c)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sodium_persulfate = new SCMaterialBuilder()
            .name("sodium_persulfate")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sulfuric_acid = new SCMaterialBuilder()
            .name("sulfuric_acid")
            .color(0xff8000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial nitric_acid = new SCMaterialBuilder()
            .name("nitric_acid")
            .color(0xe6e2ab)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial nitration_mixture = new SCMaterialBuilder()
            .name("nitration_mixture")
            .color(0xe6e2ab)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial dichlorobenzene = new SCMaterialBuilder()
            .name("dichlorobenzene")
            .color(0x004455)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial styrene = new SCMaterialBuilder()
            .name("styrene")
            .color(0xd2c8be)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial isoprene = new SCMaterialBuilder()
            .name("isoprene")
            .color(0x141414)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial tetranitromethane = new SCMaterialBuilder()
            .name("tetranitromethane")
            .color(0x0f2828)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial epichlorohydrin = new SCMaterialBuilder()
            .name("epichlorohydrin")
            .color(0x501d05)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial dimethylhydrazine = new SCMaterialBuilder()
            .name("dimethylhydrazine")
            .color(0x000055)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial chloramine = new SCMaterialBuilder()
            .name("chloramine")
            .color(0x3f9f80)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial dimethyldichlorosilane = new SCMaterialBuilder()
            .name("dimethyldichlorosilane")
            .color(0x441650)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial hydrofluoric_acid = new SCMaterialBuilder()
            .name("hydrofluoric_acid")
            .color(0x0088aa)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial chloroform = new SCMaterialBuilder()
            .name("chloroform")
            .color(0x892ca0)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial bisphenol_a = new SCMaterialBuilder()
            .name("bisphenol_a")
            .color(0xd4b300)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial acetic_acid = new SCMaterialBuilder()
            .name("acetic_acid")
            .color(0xc8b4a0)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial acetone = new SCMaterialBuilder()
            .name("acetone")
            .color(0xafafaf)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial methanol = new SCMaterialBuilder()
            .name("methanol")
            .color(0xaa8800)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial vinyl_acetate = new SCMaterialBuilder()
            .name("vinyl_acetate")
            .color(0xffb380)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial polyvinyl_acetate = new SCMaterialBuilder()
            .name("polyvinyl_acetate")
            .color(0xff9955)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial methyl_acetate = new SCMaterialBuilder()
            .name("methyl_acetate")
            .color(0xeec6af)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial allyl_chloride = new SCMaterialBuilder()
            .name("allyl_chloride")
            .color(0x87deaa)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial hydrochloric_acid = new SCMaterialBuilder()
            .name("hydrochloric_acid")
            .color(0x6f8a91)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial hypochlorous_acid = new SCMaterialBuilder()
            .name("hypochlorous_acid")
            .color(0x6f8a91)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sulfuric_trioxide = new SCMaterialBuilder()
            .name("sulfuric_trioxide")
            .color(0x8d8d21)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial sulfuric_dioxide = new SCMaterialBuilder()
            .name("sulfuric_dioxide")
            .color(0x8d8d27)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial benzene = new SCMaterialBuilder()
            .name("benzene")
            .color(0x1a1a1a)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial benzaldehyde = new SCMaterialBuilder()
            .name("benzaldehyde")
            .color(0xf7dea3)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial phenol = new SCMaterialBuilder()
            .name("phenol")
            .color(0x784421)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial indium_concentrate = new SCMaterialBuilder()
            .name("indium_concentrate")
            .color(0x400080)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial nickel_sulfate = new SCMaterialBuilder()
            .name("nickel_sulfate")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial rocket_fuel = new SCMaterialBuilder()
            .name("rocket_fuel")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.FLUIDS)
            .build();
    public static final SCMaterial lead_zinc_solution = new SCMaterialBuilder()
            .name("lead_zinc_solution")
            .color(0xffffff)
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
