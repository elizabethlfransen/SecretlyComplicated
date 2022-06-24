package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import net.minecraft.data.DataGenerator
import net.minecraft.world.item.Item
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.client.model.generators.ModelProvider
import net.minecraftforge.common.data.ExistingFileHelper

class ElementModelProvider(generator: DataGenerator, existingFileHelper: ExistingFileHelper) : ItemModelProvider(generator, SecretlyComplicated.ID, existingFileHelper) {
    override fun registerModels() {
        withExistingParent("hydrogen_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("helium_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("lithium_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("beryllium_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("boron_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("carbon_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("nitrogen_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("oxygen_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("fluorine_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("neon_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")

        withExistingParent("sodium_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("magnesium_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("aluminium_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("silicon_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("phosphorus_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("sulfur_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("chlorine_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
        withExistingParent("argon_ingot", "item/generated").texture("layer0", "minecraft:item/iron_ingot")
    }
}