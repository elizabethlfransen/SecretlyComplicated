package io.github.elizabethlfransen.secretlycomplicated.datagen.props.base;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.function.Predicate;

public abstract class ConditionalDataGenProp {
    private final Predicate<MaterialForm<?>> matchesForm;

    public ConditionalDataGenProp(Predicate<MaterialForm<?>> matchesForm) {
        this.matchesForm = matchesForm;
    }
    public ConditionalDataGenProp() {
        this((form) -> true);
    }
    public boolean matches(MaterialForm<?> form) {
        return matchesForm.test(form);
    }
}
