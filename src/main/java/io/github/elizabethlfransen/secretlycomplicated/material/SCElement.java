package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;

import java.util.Set;

public class SCElement extends SCMaterial {

    public final int atomicNumber;


    SCElement(int atomicNumber, boolean metallic, String name, int color, int melting, int boiling, Set<MaterialFormFactory<?>> forms) {
        super(metallic, name, color, melting, boiling, forms);
        this.atomicNumber = atomicNumber;
    }
}