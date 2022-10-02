package io.github.elizabethlfransen.secretlycomplicated.material;

import io.github.elizabethlfransen.secretlycomplicated.block.SCBlock;
import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SCRock extends SCBlock {
    public final String name;
    public final int color;

    public SCRock(Properties properties, String name, int color) {
        super(properties);
        this.name = name;
        this.color = color;
    }

    public SCRock(Properties properties, Item.Properties itemProperties, String name, int color) {
        super(properties, itemProperties);
        this.name = name;
        this.color = color;
    }


    public String getCapitalizedName() {
        return Arrays.stream(name.split("_"))
                .filter(part -> part.length() > 0)
                .map(part -> Character.toUpperCase(part.charAt(0)) + part.substring(1))
                .collect(Collectors.joining(" "));
    }
}
