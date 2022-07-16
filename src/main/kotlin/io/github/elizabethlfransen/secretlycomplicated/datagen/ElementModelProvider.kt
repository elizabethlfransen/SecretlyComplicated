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

    private fun registerMaterials(element: SCElement) {
        if (element.hasGear)
        withExistingParent("${element.name}_gear", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_gear")
        else return

        if (element.hasPlate)
        withExistingParent("${element.name}_plate", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_plate")
        else return

        if (element.hasDensePlate)
        withExistingParent("${element.name}_dense_plate", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_dense_plate")
        else return

        if (element.hasRod)
        withExistingParent("${element.name}_rod", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_rod")
        else return

        if (element.hasDust)
        withExistingParent("${element.name}_dust", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_dust")
        else return

        if (element.hasSmallDust)
        withExistingParent("${element.name}_small_dust", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_small_dust")
        else return

        if (element.hasTinyDust)
        withExistingParent("${element.name}_tiny_dust", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_tiny_dust")
        else return

        if (element.hasCrushed)
        withExistingParent("${element.name}_crushed", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_crushed")
        else return
    }

    override fun registerModels() {
        ModElements.values.forEach {
            withExistingParent("${it.name}_ingot", "item/generated")
                .texture("layer0", "minecraft:item/iron_ingot")
            registerBucket(it)
            registerMaterials(it)

        }
    }
}