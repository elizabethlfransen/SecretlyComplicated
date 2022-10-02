package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class SCBaseMaterialBuilder<TSelf extends SCBaseMaterialBuilder<TSelf, TMaterial>, TMaterial extends SCMaterial> {
    protected boolean metallic;
    protected String name;
    protected int color;
    protected int melting;
    protected int boiling;
    protected Set<MaterialFormFactory<?>> forms = new HashSet<>();

    protected abstract TSelf getSelf();

    protected TSelf configure(Runnable configuration) {
        configuration.run();
        return getSelf();
    }

    public TSelf metallic() {
        return metallic(true);
    }

    public TSelf metallic(boolean metallic) {
        return configure(() -> this.metallic = metallic);
    }

    public TSelf name(String name) {
        return configure(() -> this.name = name);
    }

    public TSelf color(int color) {
        return configure(() -> this.color = color);
    }

    public TSelf melting(int melting) {
        return configure(() -> this.melting = melting);
    }

    public TSelf boiling(int boiling) {
        return configure(() -> this.boiling = boiling);
    }

    public TSelf forms(Set<MaterialFormFactory<?>> forms) {
        return configure(() -> this.forms = forms);
    }

    public TSelf withForms(Collection<MaterialFormFactory<?>> forms) {
        return configure(() -> this.forms.addAll(forms));
    }

    public TSelf withForms(MaterialFormFactory<?>... forms) {
        return withForms(Arrays.asList(forms));
    }

    public abstract TMaterial build();
}
