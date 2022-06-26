package io.github.elizabethlfransen.secretlycomplicated.util.register.fluid

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BucketItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraftforge.fluids.FluidAttributes
import net.minecraftforge.fluids.ForgeFlowingFluid
import thedarkcolour.kotlinforforge.forge.registerObject

class SCFluid(
    val name: String,
    val color: Int,
    val registeringContext: RegisteringContext
) {
    // TODO: Use name instead
    val stillTexture = ResourceLocation("minecraft","block/water_still")
    val flowingTexture = ResourceLocation("minecraft", "block/water_flow")
    val overlayTexture = ResourceLocation("minecraft","block/water_overlay")
    private val fluidProps: ForgeFlowingFluid.Properties
        get() = ForgeFlowingFluid.Properties(
            { stillFluid },
            { flowingFluid },
            FluidAttributes.builder(
                stillTexture,
                flowingTexture
            )
                .overlay(overlayTexture)
                .color(0xFF000000.toInt() or color)
        )
            .bucket { bucket }
    val stillFluid by registeringContext.FLUIDS.registerObject("${name}_fluid") {
        ForgeFlowingFluid.Source(fluidProps)
    }
    val flowingFluid by registeringContext.FLUIDS.registerObject("${name}_fluid_flowing") {
        ForgeFlowingFluid.Flowing(fluidProps)
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