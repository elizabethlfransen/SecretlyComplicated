package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.RockFormFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class SCRockBuilder {

    private String name;
    private int color;
    private Set<RockFormFactory<?>> forms = new HashSet<>();


    public SCRockBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SCRockBuilder color(int color) {
        this.color = color;
        return this;
    }

    public SCRockBuilder forms(Set<RockFormFactory<?>> forms) {
        this.forms = forms;
        return this;
    }

    public SCRockBuilder withForms(Collection<RockFormFactory<?>> forms) {
        this.forms.addAll(forms);
        return this;
    }

    public SCRockBuilder withForms(RockFormFactory<?>... forms) {
        return withForms(Arrays.asList(forms));
    }

    public SCRock build() {
        return new SCRock(name, color, forms);
    }
}
