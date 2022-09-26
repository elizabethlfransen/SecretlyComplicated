package io.github.elizabethlfransen.secretlycomplicated.datagen

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import io.github.elizabethlfransen.secretlycomplicated.element.ModElements
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement
import io.github.elizabethlfransen.secretlycomplicated.element.SCCompound
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

    private fun registerBucket(compound: SCCompound) {
        withExistingParent("${compound.name}_fluid_bucket", ResourceLocation("forge", "item/bucket"))
            .customLoader { parent, exisingFileHandler -> DynamicBucketModelBuilder.begin(parent, exisingFileHandler) }
            .fluid(compound.fluid.stillFluid)
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

        if (element.hasImpureDust)
        withExistingParent("${element.name}_impure_dust", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_impure_dust")
        else return

        if (element.hasPureDust)
        withExistingParent("${element.name}_pure_dust", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_pure_dust")
        else return

        if (element.hasNugget)
        withExistingParent("${element.name}_nugget", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_nugget")
        else return

        if (element.hasWire)
        withExistingParent("${element.name}_wire", "item/generated")
                .texture("layer0", "secretly_complicated:item/base_wire")
        else return

        // if (element.hasGem)
        // withExistingParent("${element.name}_gem", "item/generated")
        //         .texture("layer0", "secretly_complicated:item/base_gem")
        // else return

        // if (element.hasGemBrittle)
        // withExistingParent("${element.name}_gem_brittle", "item/generated")
        //         .texture("layer0", "secretly_complicated:item/base_gem_brittle")
        // else return

        // if (element.hasGemPolished)
        // withExistingParent("${element.name}_gem_polished", "item/generated")
        //         .texture("layer0", "secretly_complicated:item/base_gem_polished")
        // else return

        // if (element.hasBlock)
        // withExistingParent("${element.name}_block", "item/generated")
        //         .texture("layer0", "secretly_complicated:item/base_block")
        // else return
    }

    private fun registerMaterials(compound: SCCompound) {

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