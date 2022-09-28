package io.github.elizabethlfransen.secretlycomplicated.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class SimpleCreativeTab extends CreativeModeTab {
    private final Supplier<ItemStack> icon;
    public SimpleCreativeTab(String label, Supplier<ItemStack> icon) {
        super(label);
        this.icon = icon;
    }

    @Override
    public ItemStack makeIcon() {
        return icon.get();
    }
}
