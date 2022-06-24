package io.github.elizabethlfransen.secretlycomplicated.util

import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

class SimpleCreativeTab(label: String, private val icon: () -> ItemStack) : CreativeModeTab(label) {
    override fun makeIcon() = icon()
}