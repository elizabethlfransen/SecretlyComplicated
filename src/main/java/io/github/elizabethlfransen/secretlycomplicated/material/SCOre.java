package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;

import java.util.Set;

public class SCOre extends SCMaterial {
    SCOre(boolean metallic, String name, int color, int melting, int boiling, Set<MaterialFormFactory<?>> forms) {
        super(metallic, name, color, melting, boiling, forms);
    }
}
