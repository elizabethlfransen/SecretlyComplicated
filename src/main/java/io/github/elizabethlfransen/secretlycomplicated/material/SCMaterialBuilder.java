package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class SCMaterialBuilder {

    private boolean metallic;
    private String name;
    private int color;
    private int melting;
    private int boiling;
    private Set<MaterialFormFactory<?>> forms = new HashSet<>();

    public SCMaterialBuilder metallic() {
        return metallic(true);
    }

    public SCMaterialBuilder metallic(boolean metallic) {
        this.metallic = metallic;
        return this;
    }

    public SCMaterialBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SCMaterialBuilder color(int color) {
        this.color = color;
        return this;
    }

    public SCMaterialBuilder melting(int melting) {
        this.melting = melting;
        return this;
    }

    public SCMaterialBuilder boiling(int boiling) {
        this.boiling = boiling;
        return this;
    }

    public SCMaterialBuilder forms(Set<MaterialFormFactory<?>> forms) {
        this.forms = forms;
        return this;
    }

    public SCMaterialBuilder withForms(Collection<MaterialFormFactory<?>> forms) {
        this.forms.addAll(forms);
        return this;
    }

    public SCMaterialBuilder withForms(MaterialFormFactory<?>... forms) {
        return withForms(Arrays.asList(forms));
    }

    public SCMaterial build() {
        return new SCMaterial(metallic, name, color, melting, boiling, forms);
    }
}
