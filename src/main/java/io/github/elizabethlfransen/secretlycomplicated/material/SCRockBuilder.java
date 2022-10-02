package io.github.elizabethlfransen.secretlycomplicated.material;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public final class SCRockBuilder {

    private String name;
    private int color;


    public SCRockBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SCRockBuilder color(int color) {
        this.color = color;
        return this;
    }

    public SCRock build() {
        return new SCRock(BlockBehaviour.Properties.of(Material.STONE), name, color);
    }
}
