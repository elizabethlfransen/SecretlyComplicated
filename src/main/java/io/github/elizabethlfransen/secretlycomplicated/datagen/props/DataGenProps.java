package io.github.elizabethlfransen.secretlycomplicated.datagen.props;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("unchecked")
public class DataGenProps {
    private final Map<Class<?>, Object> props = new HashMap<>();

    public <T> Optional<T> getProperty(Class<T> key) {
        return Optional.ofNullable((T)props.get(key));
    }


    public <T> void set(Class<T> key, T value) {
        props.put(key, value);
    }

    public void set(Object value) {
        props.put(value.getClass(), value);
    }


    public <T> boolean has(Class<T> key) { return props.containsKey(key); }
}
