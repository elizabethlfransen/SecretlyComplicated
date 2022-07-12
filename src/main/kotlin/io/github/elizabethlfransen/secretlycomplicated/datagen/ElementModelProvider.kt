package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement
import net.minecraft.data.DataGenerator
import net.minecraft.resources.ResourceLocation
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.client.model.generators.loaders.DynamicBucketModelBuilder
import net.minecraftforge.common.data.ExistingFileHelper

class ElementModelProvider(generator: DataGenerator, existingFileHelper: ExistingFileHelper) :
    ItemModelProvider(generator, SecretlyComplicated.ID, existingFileHelper) {

    private fun registerBucket(element: SCElement) {
        withExistingParent("${element.name}_fluid_bucket", ResourceLocation("forge", "item/bucket"))
            .customLoader { parent, exisingFileHandler -> DynamicBucketModelBuilder.begin(parent, exisingFileHandler) }
            .fluid(element.fluid.stillFluid)
    }

    private fun registerGears(element: SCElement) {
        withExistingParent("${element.name}_gear", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_gear")
    }

    override fun registerModels() {
        ModElements.values.forEach {
            withExistingParent("${it.name}_ingot", "item/generated")
                .texture("layer0", "minecraft:item/iron_ingot")
            registerBucket(it)
            registerGears(it)

        }
    }
}