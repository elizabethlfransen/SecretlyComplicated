package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import io.github.elizabethlfransen.secretlycomplicated.util.register.fluid.SCFluid
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.ItemRegistrationConfig
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.registerItem
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement
import net.minecraft.client.Minecraft
import net.minecraft.client.color.item.ItemColor
import net.minecraft.world.item.Item
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

class SCElement(
    context: RegisteringContext,
    val atomicNumber: Int,
    val name: String,
    val color: Int,
    val melting: Int, /* In Celcius */
    val boiling: Int,
    val metallic: Boolean,
    val hasGear: Boolean,
    val hasPlate: Boolean,
    val hasDensePlate: Boolean,
    val hasRod: Boolean,
    val hasDust: Boolean,
    val hasSmallDust: Boolean,
    val hasTinyDust: Boolean,
    val hasCrushed: Boolean,

    val hasImpureDust: Boolean,
    val hasPureDust: Boolean,
    val hasNugget: Boolean,
    val hasWire: Boolean,
    val hasGem: Boolean,
    val hasGemBrittle: Boolean,
    val hasGemPolished: Boolean,
    val hasBlock: Boolean,

    config: SCElementConfig
) {
    val item by context.registerItem("${name}_ingot", config.itemConfigInitializer)
    val fluid = SCFluid(name, color, context)
    val gear by context.registerItem("${name}_gear", config.itemConfigInitializer)
    val plate by context.registerItem("${name}_plate", config.itemConfigInitializer)
    val densePlate by context.registerItem("${name}_dense_plate", config.itemConfigInitializer)
    val rod by context.registerItem("${name}_rod", config.itemConfigInitializer)
    val dust by context.registerItem("${name}_dust", config.itemConfigInitializer)
    val smallDust by context.registerItem("${name}_small_dust", config.itemConfigInitializer)
    val tinyDust by context.registerItem("${name}_tiny_dust", config.itemConfigInitializer)
    val crushed by context.registerItem("${name}_crushed", config.itemConfigInitializer)
}


class SCElementConfig {
    private var item: (() -> Item)? = null
    private var gear: (() -> Item)? = null
    var itemConfigInitializer: ItemRegistrationConfig.() -> Unit = {}
        private set

    /**
     * When translating uses better language for metals for example:
     * Molten Copper vs Liquid Copper
     */
    var isMetal: Boolean = false
    var isGear: Boolean = false
    var isPlate: Boolean = false
    var isDensePlate: Boolean = false
    var isRod: Boolean = false
    var isDust: Boolean = false
    var isSmallDust: Boolean = false
    var isTinyDust: Boolean = false
    var isCrushed: Boolean = false

    fun item(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun gear(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun plate(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun densePlate(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun rod(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun dust(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun smallDust(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun tinyDust(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun crushed(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
}


fun RegisteringContext.registerElement(
    atomicNumber: Int,
    name: String,
    color: Int,
    melting: Int,
    boiling: Int,
    init: SCElementConfig.() -> Unit = {}
): SCElement {
    val config = SCElementConfig().apply(init)
    val element = SCElement(
        this,
        atomicNumber,
        name,
        color,
        melting,
        boiling,
        config.isMetal,
        config.isGear,
        config.isPlate,
        config.isDensePlate,
        config.isRod,
        config.isDust,
        config.isSmallDust,
        config.isTinyDust,
        config.isCrushed,
        config
    )
    onRegister { bus ->
        bus.addListener<FMLClientSetupEvent> {
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.item)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gear)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.plate)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.densePlate)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.rod)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.dust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.smallDust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.tinyDust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.crushed)
        }
    }
    return element
}

