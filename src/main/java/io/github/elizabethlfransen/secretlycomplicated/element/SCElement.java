package io.github.elizabethlfransen.secretlycomplicated.element;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialFormFactory;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;
import net.minecraft.resources.ResourceLocation;

import java.util.*;
import java.util.stream.Collectors;

public class SCElement implements Registerable {

    public final int atomicNumber;
    public final boolean metallic;
    public final String name;
    public final int color;
    public final int melting;
    public final int boiling;

    public final Map<String, MaterialForm> forms;

    private SCElement(int atomicNumber, boolean metallic, String name, int color, int melting, int boiling, Set<MaterialFormFactory<?>> forms) {
        this.atomicNumber = atomicNumber;
        this.metallic = metallic;
        this.name = name;
        this.color = color;
        this.melting = melting;
        this.boiling = boiling;
        this.forms = forms.stream()
                .collect(Collectors.toMap(
                        factory -> factory.id,
                        factory -> factory.getMaterialForm(this)
                ));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private int atomicNumber;
        private boolean metallic;
        private String name;
        private int color;
        private int melting;
        private int boiling;
        private Set<MaterialFormFactory<?>> forms = new HashSet<>();

        private Builder() {
        }

        public Builder atomicNumber(int atomicNumber) {
            this.atomicNumber = atomicNumber;
            return this;
        }

        public Builder metallic() {
            return metallic(true);
        }

        public Builder metallic(boolean metallic) {
            this.metallic = metallic;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder color(int color) {
            this.color = color;
            return this;
        }

        public Builder melting(int melting) {
            this.melting = melting;
            return this;
        }

        public Builder boiling(int boiling) {
            this.boiling = boiling;
            return this;
        }

        public Builder forms(Set<MaterialFormFactory<?>> forms) {
            this.forms = forms;
            return this;
        }

        public Builder withForms(Collection<MaterialFormFactory<?>> forms) {
            this.forms.addAll(forms);
            return this;
        }

        public Builder withForms(MaterialFormFactory<?>... forms) {
            return withForms(Arrays.asList(forms));
        }

        public SCElement build() {
            return new SCElement(atomicNumber, metallic, name, color, melting, boiling, forms);
        }
    }

    public String getCapitalizedName() {
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

    @Override
    public Map<String, Object> getNamedAdditionalRegisters(ResourceLocation id) {
        return new HashMap<>(forms);
    }
}