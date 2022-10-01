package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;

public abstract class MaterialFormFactory<T extends MaterialForm> {
    public final String id;
    public MaterialFormFactory(String id) {
        this.id = id;
    }

    public abstract T getMaterialForm(SCMaterial material);

    public boolean isSupported() {
        return true;
    }
}
