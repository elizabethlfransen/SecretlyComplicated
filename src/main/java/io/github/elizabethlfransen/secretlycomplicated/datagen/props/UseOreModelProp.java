package io.github.elizabethlfransen.secretlycomplicated.datagen.props;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.ConditionalDataGenProp;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.function.Predicate;

public final class UseOreModelProp extends ConditionalDataGenProp {
    private final String baseTexture;

    public UseOreModelProp(Predicate<MaterialForm<?>> matchesForm, String baseTexture) {
        super(matchesForm);
        this.baseTexture = baseTexture;
    }

    public UseOreModelProp(String baseTexture) {
        super();
        this.baseTexture = baseTexture;
    }

    public String baseTexture() {
        return baseTexture;
    }

}
