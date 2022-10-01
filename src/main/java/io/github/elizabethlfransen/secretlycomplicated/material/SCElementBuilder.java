package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class SCElementBuilder {

    private int atomicNumber;
    private boolean metallic;
    private String name;
    private int color;
    private int melting;
    private int boiling;
    private Set<MaterialFormFactory<?>> forms = new HashSet<>();



    public SCElementBuilder atomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
        return this;
    }

    public SCElementBuilder metallic() {
        return metallic(true);
    }

    public SCElementBuilder metallic(boolean metallic) {
        this.metallic = metallic;
        return this;
    }

    public SCElementBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SCElementBuilder color(int color) {
        this.color = color;
        return this;
    }

    public SCElementBuilder melting(int melting) {
        this.melting = melting;
        return this;
    }

    public SCElementBuilder boiling(int boiling) {
        this.boiling = boiling;
        return this;
    }

    public SCElementBuilder forms(Set<MaterialFormFactory<?>> forms) {
        this.forms = forms;
        return this;
    }

    public SCElementBuilder withForms(Collection<MaterialFormFactory<?>> forms) {
        this.forms.addAll(forms);
        return this;
    }

    public SCElementBuilder withForms(MaterialFormFactory<?>... forms) {
        return withForms(Arrays.asList(forms));
    }

    public SCElement build() {
        return new SCElement(atomicNumber, metallic, name, color, melting, boiling, forms);
    }
}
