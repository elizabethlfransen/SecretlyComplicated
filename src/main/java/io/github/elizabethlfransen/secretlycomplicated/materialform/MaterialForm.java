package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.DataGenProps;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;

public abstract class MaterialForm implements Registerable {
   public final DataGenProps dataGenProps;

    protected MaterialForm(DataGenProps dataGenProps) {
        this.dataGenProps = dataGenProps;
    }
}
