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
public class ModComponents {

    public static final SCMaterial resister = new SCMaterialBuilder()
            .name("resister")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial transistor = new SCMaterialBuilder()
            .name("transistor")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial diode = new SCMaterialBuilder()
            .name("diode")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial capacitor = new SCMaterialBuilder()
            .name("capacitor")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial inductor = new SCMaterialBuilder()
            .name("inductor")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial crystal_oscillator = new SCMaterialBuilder()
            .name("crystal_oscillator")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial microcontroller = new SCMaterialBuilder()
            .name("microcontroller")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial nand_ic = new SCMaterialBuilder()
            .name("nand_ic")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
            
    public static final SCMaterial and_ic = new SCMaterialBuilder()
            .name("and_ic")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial or_ic = new SCMaterialBuilder()
            .name("or_ic")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial nor_ic = new SCMaterialBuilder()
            .name("nor_ic")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial xor_ic = new SCMaterialBuilder()
            .name("xor_ic")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial monocrystalline_silicon_boule = new SCMaterialBuilder()
            .name("monocrystalline_silicon_boule")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial wafer = new SCMaterialBuilder()
            .name("wafer")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial integrated_logic_wafer = new SCMaterialBuilder()
            .name("integrated_logic_wafer")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial calculation_processing_wafer = new SCMaterialBuilder()
            .name("calculation_processing_wafer")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();     
    public static final SCMaterial ram_engineering_wafer = new SCMaterialBuilder()
            .name("ram_engineering_wafer")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial electronic_circuit = new SCMaterialBuilder()
            .name("electronic_circuit")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial coated_circuit_board = new SCMaterialBuilder()
            .name("coated_circuit_board")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial poor_electronic_circuit = new SCMaterialBuilder()
            .name("poor_electronic_circuit")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial good_electronic_circuit = new SCMaterialBuilder()
            .name("good_electronic_circuit")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial excellent_electronic_circuit = new SCMaterialBuilder()
            .name("excellent_electronic_circuit")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();
    public static final SCMaterial perfect_electronic_circuit = new SCMaterialBuilder()
            .name("perfect_electronic_circuit")
            .color(0xf0c8c8)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.COMPONENTS)
            .build();

    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModComponents.class.getDeclaredFields())
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
        return ModComponents.values;
    }

}
