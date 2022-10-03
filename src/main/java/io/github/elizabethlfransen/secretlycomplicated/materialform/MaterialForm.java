package io.github.elizabethlfransen.secretlycomplicated.materialform;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.IDataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.base.MaterialFormFactory;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;

public abstract class MaterialForm<TForm extends MaterialForm<TForm>> implements Registerable {
   public final IDataGenProps dataGenProps;
   private final MaterialFormFactory<TForm> factory;

    protected MaterialForm(MaterialFormFactory<TForm> factory, IDataGenProps dataGenProps) {
        this.dataGenProps = dataGenProps.forForm(this);
        this.factory = factory;
    }

    public MaterialFormFactory<TForm> getFactory() {
        return factory;
    }
}
