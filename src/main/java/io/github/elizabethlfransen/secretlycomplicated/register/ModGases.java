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
public class ModGases {

    public static final SCMaterial carbon_dioxide = new SCMaterialBuilder()
            .name("carbon_dioxide")
            .color(0xa9d0f5)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
            
    public static final SCMaterial noble_gases = new SCMaterialBuilder()
            .name("noble_gases")
            .color(0xc9e3fc)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial air = new SCMaterialBuilder()
            .name("air")
            .color(0xc9e3fc)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial nitrogen_dioxide = new SCMaterialBuilder()
            .name("nitrogen_dioxide")
            .color(0x64afff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial natural_gas = new SCMaterialBuilder()
            .name("natural_gas")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial sulfuric_gas = new SCMaterialBuilder()
            .name("sulfuric_gas") //sulfur dioxide, trioxide, h2s, etc
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial refinery_gases = new SCMaterialBuilder()
            .name("refinery_gases") // It is typically made of methane and ethane, but can also have some propane, butane, and hydrogen in it.
            .color(0xfff2cc)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial sulfuric_refinery_gases = new SCMaterialBuilder()
            .name("sulfuric_refinery_gases") // It is typically made of methane and ethane, but can also have some propane, butane, and hydrogen in it.
            .color(0xfff2cc)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial butadiene = new SCMaterialBuilder()
            .name("butadiene")
            .color(0xe86900)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial vinyl_chloride = new SCMaterialBuilder()
            .name("vinyl_chloride")
            .color(0xfff0f0)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial sulfur_dioxide = new SCMaterialBuilder()
            .name("sulfur_dioxide")
            .color(0xc8c819)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial sulfur_trioxide = new SCMaterialBuilder()
            .name("sulfur_trioxide")
            .color(0xa0a014)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial dimethylamine = new SCMaterialBuilder()
            .name("dimethylamine")
            .color(0x554469)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial dinitrogen_tetroxide = new SCMaterialBuilder()
            .name("dinitrogen_tetroxide")
            .color(0x004184)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial nitric_oxide = new SCMaterialBuilder()
            .name("nitric_oxide")
            .color(0x7dc8f0)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial ammonia = new SCMaterialBuilder()
            .name("ammonia")
            .color(0x3f3480)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial chloromethane = new SCMaterialBuilder()
            .name("chloromethane")
            .color(0xc82ca0)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial tetrafluoroethylene = new SCMaterialBuilder()
            .name("tetrafluoroethylene")
            .color(0x7d7d7d)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial carbon_monoxide = new SCMaterialBuilder()
            .name("carbon_monoxide")
            .color(0x0e4880)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial ethenone = new SCMaterialBuilder()
            .name("ethenone")
            .color(0x141446)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial hydrogen_sulfide = new SCMaterialBuilder()
            .name("hydrogen_sulfide")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial uu_matter = new SCMaterialBuilder()
            .name("uu_matter")
            .color(0x8000c4)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial anti_matter = new SCMaterialBuilder()
            .name("anti_matter")
            .color(0x8000c4)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial neutron = new SCMaterialBuilder()
            .name("neutron")
            .color(0x0096FF)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial proton = new SCMaterialBuilder()
            .name("proton")
            .color(0xD2042D)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial red_matter = new SCMaterialBuilder()
            .name("red_matter")
            .color(0xff0000)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial dark_matter = new SCMaterialBuilder()
            .name("dark_matter")
            .color(0x440a5a)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
            
    public static final SCMaterial deuterium = new SCMaterialBuilder()
            .name("deuterium")
            .color(0xffffff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();

/*
 * Fuel Distillates Processing Chain
 */
    public static final SCMaterial alkane_group_distilates = new SCMaterialBuilder()
            .name("alkane_group_distilates")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial methane = new SCMaterialBuilder()
            .name("methane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial ethane = new SCMaterialBuilder()
            .name("ethane")
            .color(0xc8c8ff)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial propane = new SCMaterialBuilder()
            .name("propane")
            .color(0xfae250)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial butane = new SCMaterialBuilder()
            .name("butane")
            .color(0xb6371e)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial pentane = new SCMaterialBuilder()
            .name("pentane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial hexane = new SCMaterialBuilder()
            .name("hexane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial heptane = new SCMaterialBuilder()
            .name("heptane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial octane = new SCMaterialBuilder()
            .name("octane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial nonane = new SCMaterialBuilder()
            .name("nonane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial decane = new SCMaterialBuilder()
            .name("decane")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial alkene_group_distilates = new SCMaterialBuilder()
            .name("alkene_group_distilates")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial ethene = new SCMaterialBuilder()
            .name("ethene")
            .color(0xe1e1e1)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial propene = new SCMaterialBuilder()
            .name("propene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial butene = new SCMaterialBuilder()
            .name("butene")
            .color(0xcf5005)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial pentene = new SCMaterialBuilder()
            .name("pentene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial hexene = new SCMaterialBuilder()
            .name("hexene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial heptene = new SCMaterialBuilder()
            .name("heptene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial octene = new SCMaterialBuilder()
            .name("octene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial nonene = new SCMaterialBuilder()
            .name("nonene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
    public static final SCMaterial decene = new SCMaterialBuilder()
            .name("decene")
            .color(0xffff00)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.GASES)
            .build();
            
    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModGases.class.getDeclaredFields())
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
        return ModGases.values;
    }

}
