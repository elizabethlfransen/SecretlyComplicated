package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.element.SCElement;

public abstract class MaterialFormFactory<T extends MaterialForm> {
    public final String id;
    public MaterialFormFactory(String id) {
        this.id = id;
    }

    public abstract T getMaterialForm(SCElement element);
}
