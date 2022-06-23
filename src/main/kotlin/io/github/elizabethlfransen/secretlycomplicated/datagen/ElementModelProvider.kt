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
    }
}