package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.material.SCRock;

public abstract class RockFormFactory<T extends MaterialForm> {
    public final String id;
    public RockFormFactory(String id) {
        this.id = id;
    }

    public abstract T getMaterialForm(SCRock material);

    public boolean isSupported() {
        return true;
    }
}
