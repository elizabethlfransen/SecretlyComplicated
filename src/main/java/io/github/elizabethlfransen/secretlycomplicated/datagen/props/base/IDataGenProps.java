package io.github.elizabethlfransen.secretlycomplicated.datagen.props.base;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.Optional;

public interface IDataGenProps {
    <T> Optional<T> getProperty(Class<T> key);
    <T> void set(Class<? extends T> key, T value);
    default void set(Object value) {
        set(value.getClass(), value);
    }

    boolean has(Class<?> key);

    DataGenPropsForMaterial forForm(MaterialForm<?> form);
}
