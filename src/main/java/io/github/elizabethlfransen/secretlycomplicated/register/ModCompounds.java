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
