package io.github.elizabethlfransen.secretlycomplicated.datagen.props;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.ConditionalDataGenProp;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

import java.util.function.Predicate;

public class UseExistingBlockState extends ConditionalDataGenProp {
    public UseExistingBlockState(Predicate<MaterialForm<?>> matchesForm) {
        super(matchesForm);
    }

    public UseExistingBlockState() {
    }
}
