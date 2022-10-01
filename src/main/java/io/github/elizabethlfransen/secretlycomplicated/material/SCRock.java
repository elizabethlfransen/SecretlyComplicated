package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.RockFormFactory;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SCRock implements Registerable {
    public final String name;
    public final int color;

    public final Map<String, MaterialForm> forms;

    SCRock(String name, int color, Set<RockFormFactory<?>> forms) {
        this.name = name;
        this.color = color;
        this.forms = forms.stream()
                .filter(RockFormFactory::isSupported)
                .collect(Collectors.toMap(
                        factory -> factory.id,
                        factory -> factory.getMaterialForm(this)
                ));
    }

    public String getCapitalizedName() {
        return Arrays.stream(name.split("_"))
                .filter(part -> part.length() > 0)
                .map(part -> Character.toUpperCase(part.charAt(0)) + part.substring(1))
                .collect(Collectors.joining(" "));
    }

    @Override
    public Map<String, Object> getNamedAdditionalRegisters(ResourceLocation id) {
        return new HashMap<>(forms);
    }
}
