package io.github.elizabethlfransen.secretlycomplicated.materialform.base;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

public abstract class MaterialFormFactory<T extends MaterialForm<T>> {
    public final String id;
    private final DataGenProps dataGenProps;

    public MaterialFormFactory(String id, DataGenProps dataGenProps) {
        this.id = id;
        this.dataGenProps = dataGenProps;
    }

    public abstract T getMaterialForm(SCMaterial material);


    public boolean isSupported() {
        return true;
    }

    public DataGenProps getDataGenProps() {
        return dataGenProps;
    }
}
