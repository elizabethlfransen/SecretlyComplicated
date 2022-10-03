package io.github.elizabethlfransen.secretlycomplicated.datagen.props.base;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.Optional;

public final class DataGenPropsForMaterial implements IDataGenProps {
    private final MaterialForm<?> form;
    private final DataGenProps parent;

    DataGenPropsForMaterial(DataGenProps parent, MaterialForm<?> form) {
        this.parent = parent;
        this.form = form;
    }

    @Override
    public boolean has(Class<?> key) {
        return getProperty(key).isPresent();
    }

    @Override
    public DataGenPropsForMaterial forForm(MaterialForm<?> form) {
        return null;
    }

    @Override
    public <T> Optional<T> getProperty(Class<T> key) {
        return parent.getProperty(key)
                .filter(prop -> {
                    if (prop instanceof ConditionalDataGenProp conditionalProp)
                        return conditionalProp.matches(form);
                    return true;
                });
    }

    @Override
    public <T> void set(Class<? extends T> key, T value) {
        parent.set(key, value);
    }
}
