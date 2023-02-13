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
public class ModSingularItems {
    public static final SCMaterial tar = new SCMaterialBuilder()
            .name("tar")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();
    public static final SCMaterial sawdust = new SCMaterialBuilder()
            .name("sawdust")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();
    public static final SCMaterial rosin = new SCMaterialBuilder()
            .name("rosin")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();
    public static final SCMaterial rubber = new SCMaterialBuilder()
            .name("rubber")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();
    public static final SCMaterial cured_rubber = new SCMaterialBuilder()
            .name("cured_rubber")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();
    public static final SCMaterial slag = new SCMaterialBuilder()
            .name("slag")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();
    public static final SCMaterial rich_slag = new SCMaterialBuilder()
            .name("rich_slag")
            .color(0x222222)
            .melting(9999)
            .boiling(9999)
            .withForms(CommonMaterialFormFactories.SINGULAR_ITEMS)
            .build();

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
