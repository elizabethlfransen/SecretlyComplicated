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
            .name("potassium_nitrate")
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
