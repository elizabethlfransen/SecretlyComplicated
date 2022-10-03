package io.github.elizabethlfransen.secretlycomplicated.datagen.props.base;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("unchecked")
public class DataGenProps implements IDataGenProps {


    private final Map<Class<?>, Object> props;

    private DataGenProps(Map<Class<?>, Object> props) {
        this.props = props;
    }

    public DataGenProps() {
        this(new HashMap<>());
    }

    public <T> Optional<T> getProperty(Class<T> key) {
        return Optional.ofNullable((T) props.get(key));
    }

    public <T> void set(Class<? extends T> key, T value) {
        props.put(key, value);
    }

    public boolean has(Class<?> key) {
        return props.containsKey(key);
    }

    public DataGenPropsForMaterial forForm(MaterialForm<?> form) {
        return new DataGenPropsForMaterial(this, form);
    }


    public static DataGenProps union(DataGenProps a, DataGenProps b) {
        Map<Class<?>, Object> resultProps = new HashMap<>();
        resultProps.putAll(a.props);
        resultProps.putAll(b.props);
        return new DataGenProps(resultProps);
    }

}
