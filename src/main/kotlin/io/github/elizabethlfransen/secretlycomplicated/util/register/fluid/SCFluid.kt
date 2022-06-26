package io.github.elizabethlfransen.secretlycomplicated.util.register.fluid

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import net.minecraft.client.renderer.item.ItemProperties
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BucketItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.LiquidBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraftforge.fluids.FluidAttributes
import net.minecraftforge.fluids.ForgeFlowingFluid
import thedarkcolour.kotlinforforge.forge.registerObject

class SCFluid(
    val name: String,
    val color: Int,
    val registeringContext: RegisteringContext
) {
    // TODO: Use name instead
    val stillTexture = ResourceLocation("minecraft:block/water_still")
    val flowingTexture = ResourceLocation("minecraft:block/water_flow")
    val overlayTexture = ResourceLocation("minecraft:block/water_overlay")
    private val fluidProps: ForgeFlowingFluid.Properties
        get() = ForgeFlowingFluid.Properties(
            { stillFluid },
            { flowingFluid },
            FluidAttributes.builder(
                stillTexture,
                flowingTexture
            )
                .overlay(overlayTexture)
                .color(color)
        )
            .block { block }
            .bucket { bucket }
    val stillFluid by registeringContext.FLUIDS.registerObject("${name}_fluid") {
        ForgeFlowingFluid.Source(fluidProps)
    }
    val flowingFluid by registeringContext.FLUIDS.registerObject("${name}_fluid_flowing") {
        ForgeFlowingFluid.Flowing(fluidProps)
    }
    val block by registeringContext.BLOCKS.registerObject("${name}_fluid_block") {
        LiquidBlock(
            { stillFluid },
            BlockBehaviour.Properties.of(Material.WATER)
                .strength(100.0F)
                .noDrops()
        )
    }
    val bucket by registeringContext.ITEMS.registerObject("${name}_fluid_bucket") {
        BucketItem(
            {stillFluid},
            Item.Properties()
                .craftRemainder(Items.BUCKET)
                .stacksTo(1)
                .also { registeringContext.defaultTab?.let(it::tab) }
        )
    }
}