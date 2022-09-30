package io.github.elizabethlfransen.secretlycomplicated.block;

import io.github.noeppi_noeppi.libx.base.BlockBase;
import io.github.noeppi_noeppi.libx.mod.ModX;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ColorableBlock extends BlockBase implements Registerable {
    private final int color;

    public ColorableBlock(ModX mod, int color, Properties properties) {
        super(mod, properties);
        this.color = color;
    }

    @Override
    public void registerClient(ResourceLocation id, Consumer<Runnable> defer) {
        Minecraft.getInstance().getBlockColors().register((p_92567_, p_92568_, p_92569_, p_92570_) -> color, this);
        
    }
}
