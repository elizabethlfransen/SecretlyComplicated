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
public class ModMachineBlocks {
        // immersive engineering
    public static final SCMaterial coke_brick = new SCMaterialBuilder()
            .name("coke_brick")
            .color(0x808080)
            .melting(9999)
            .boiling(9999)
            .metallic()
            .withForms(CommonMaterialFormFactories.MACHINE_BLOCKS)
            .build();

            
    @NoReg
    private static final Set<SCMaterial> values = Arrays.stream(ModMachineBlocks.class.getDeclaredFields())
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
        return ModMachineBlocks.values;
    }

}
