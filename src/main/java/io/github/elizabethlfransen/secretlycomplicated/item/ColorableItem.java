package io.github.elizabethlfransen.secretlycomplicated.item;

import io.github.noeppi_noeppi.libx.base.ItemBase;
import io.github.noeppi_noeppi.libx.mod.ModX;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ColorableItem extends ItemBase implements Registerable {
    private final int color;

    public ColorableItem(ModX mod, int color, Properties properties) {
        super(mod, properties);
        this.color = color;
    }

    @Override
    public void registerClient(ResourceLocation id, Consumer<Runnable> defer) {
        Minecraft.getInstance().getItemColors().register((itemStack, colorIndex) -> color, this);
    }
}
