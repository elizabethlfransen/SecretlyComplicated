package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import io.github.elizabethlfransen.secretlycomplicated.util.register.fluid.SCFluid
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.ItemRegistrationConfig
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.registerItem
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement
import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
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
    //val hasGem: Boolean,
    //val hasGemBrittle: Boolean,
    //val hasGemPolished: Boolean,
    //val hasBlock: Boolean,

    config: SCElementConfig
) {
    val ingot by context.registerItem("${name}_ingot", config.itemConfigInitializer)
    val fluid = SCFluid(name, color, context)

    val gear by context.registerItem("${name}_gear", config.itemConfigInitializer)
    val plate by context.registerItem("${name}_plate", config.itemConfigInitializer)
    val densePlate by context.registerItem("${name}_dense_plate", config.itemConfigInitializer)
    val rod by context.registerItem("${name}_rod", config.itemConfigInitializer)
    val dust by context.registerItem("${name}_dust", config.itemConfigInitializer)
    val smallDust by context.registerItem("${name}_small_dust", config.itemConfigInitializer)
    val tinyDust by context.registerItem("${name}_tiny_dust", config.itemConfigInitializer)
    val crushed by context.registerItem("${name}_crushed", config.itemConfigInitializer)

    val impureDust by context.registerItem("${name}_impure_dust", config.itemConfigInitializer)
    val pureDust by context.registerItem("${name}_pure_dust", config.itemConfigInitializer)
    val nugget by context.registerItem("${name}_nugget", config.itemConfigInitializer)
    val wire by context.registerItem("${name}_wire", config.itemConfigInitializer)
    //val gem by context.registerItem("${name}_gem", config.itemConfigInitializer)
    //val gemBrittle by context.registerItem("${name}_gem_brittle", config.itemConfigInitializer)
    //val gemPolished by context.registerItem("${name}_gem_polished", config.itemConfigInitializer)
    //val block by context.registerItem("${name}_block", config.itemConfigInitializer)
}


class SCElementConfig {
    private var ingot: (() -> Item)? = null
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

    var isImpureDust: Boolean = false
    var isPureDust: Boolean = false
    var isNugget: Boolean = false
    var isWire: Boolean = false
    //var isGem: Boolean = false
    //var isGemBrittle: Boolean = false
    //var isGemPolished: Boolean = false
    //var isBlock: Boolean = false

    fun ingot(init: ItemRegistrationConfig.() -> Unit) {
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

    fun impureDust(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun pureDust(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun nugget(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    fun wire(init: ItemRegistrationConfig.() -> Unit) {
        itemConfigInitializer = init
    }
    // fun gem(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun gemBrittle(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun gemPolished(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun block(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
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

        config.isImpureDust,
        config.isPureDust,
        config.isNugget,
        config.isWire,
        // config.isGem,
        // config.isGemBrittle,
        // config.isGemPolished,
        // config.isBlock,
        config
    )
    onRegister { bus ->
        bus.addListener<FMLClientSetupEvent> {
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.ingot)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gear)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.plate)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.densePlate)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.rod)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.dust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.smallDust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.tinyDust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.crushed)
        
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.impureDust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.pureDust)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.nugget)
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.wire)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gem)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gemBrittle)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gemPolished)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.block)
        }
    }
    return element
}

class SCCompound(
    context: RegisteringContext,
    val name: String,
    val color: Int,
    val melting: Int, /* In Celcius */
    val boiling: Int,
    val metallic: Boolean,
    // val hasGear: Boolean,
    // val hasPlate: Boolean,
    // val hasDensePlate: Boolean,
    // val hasRod: Boolean,
    // val hasDust: Boolean,
    // val hasSmallDust: Boolean,
    // val hasTinyDust: Boolean,
    // val hasCrushed: Boolean,
    // val hasImpureDust: Boolean,
    // val hasPureDust: Boolean,
    // val hasNugget: Boolean,
    // val hasWire: Boolean,
    // val hasGem: Boolean,
    // val hasGemBrittle: Boolean,
    // val hasGemPolished: Boolean,
    // val hasBlock: Boolean,

    config: SCCompoundConfig
) {
    val ingot by context.registerItem("${name}_ingot", config.itemConfigInitializer)
    val fluid = SCFluid(name, color, context)

    // val gear by context.registerItem("${name}_gear", config.itemConfigInitializer)
    // val plate by context.registerItem("${name}_plate", config.itemConfigInitializer)
    // val densePlate by context.registerItem("${name}_dense_plate", config.itemConfigInitializer)
    // val rod by context.registerItem("${name}_rod", config.itemConfigInitializer)
    // val dust by context.registerItem("${name}_dust", config.itemConfigInitializer)
    // val smallDust by context.registerItem("${name}_small_dust", config.itemConfigInitializer)
    // val tinyDust by context.registerItem("${name}_tiny_dust", config.itemConfigInitializer)
    // val crushed by context.registerItem("${name}_crushed", config.itemConfigInitializer)

    // val impureDust by context.registerItem("${name}_impure_dust", config.itemConfigInitializer)
    // val pureDust by context.registerItem("${name}_pure_dust", config.itemConfigInitializer)
    // val nugget by context.registerItem("${name}_nugget", config.itemConfigInitializer)
    // val wire by context.registerItem("${name}_wire", config.itemConfigInitializer)
    //val gem by context.registerItem("${name}_gem", config.itemConfigInitializer)
    //val gemBrittle by context.registerItem("${name}_gem_brittle", config.itemConfigInitializer)
    //val gemPolished by context.registerItem("${name}_gem_polished", config.itemConfigInitializer)
    //val block by context.registerItem("${name}_block", config.itemConfigInitializer)
}

class SCCompoundConfig {
    private var ingot: (() -> Item)? = null
    private var gear: (() -> Item)? = null
    var itemConfigInitializer: ItemRegistrationConfig.() -> Unit = {}
        private set

    /**
     * When translating uses better language for metals for example:
     * Molten Copper vs Liquid Copper
     */
     var isMetal: Boolean = false
    // var isGear: Boolean = false
    // var isPlate: Boolean = false
    // var isDensePlate: Boolean = false
    // var isRod: Boolean = false
    // var isDust: Boolean = false
    // var isSmallDust: Boolean = false
    // var isTinyDust: Boolean = false
    // var isCrushed: Boolean = false

    // var isImpureDust: Boolean = false
    // var isPureDust: Boolean = false
    // var isNugget: Boolean = false
    // var isWire: Boolean = false
    // var isGem: Boolean = false
    // var isGemBrittle: Boolean = false
    // var isGemPolished: Boolean = false
    // var isBlock: Boolean = false

    // fun ingot(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun gear(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun plate(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun densePlate(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun rod(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun dust(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun smallDust(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun tinyDust(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun crushed(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun impureDust(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun pureDust(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun nugget(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun wire(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun gem(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun gemBrittle(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun gemPolished(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
    // fun block(init: ItemRegistrationConfig.() -> Unit) {
    //     itemConfigInitializer = init
    // }
}

fun RegisteringContext.registerCompound(
    name: String,
    color: Int,
    melting: Int,
    boiling: Int,
    init: SCCompoundConfig.() -> Unit = {}
): SCCompound {
    val config = SCCompoundConfig().apply(init)
    val compound = SCCompound(
        this,
        name,
        color,
        melting,
        boiling,
        config.isMetal,
        // config.isGear,
        // config.isPlate,
        // config.isDensePlate,
        // config.isRod,
        // config.isDust,
        // config.isSmallDust,
        // config.isTinyDust,
        // config.isCrushed,

        // config.isImpureDust,
        // config.isPureDust,
        // config.isNugget,
        // config.isWire,
        // config.isGem,
        // config.isGemBrittle,
        // config.isGemPolished,
        // config.isBlock,
        config
    )
    onRegister { bus ->
        bus.addListener<FMLClientSetupEvent> {
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), compound.ingot)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gear)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.plate)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.densePlate)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.rod)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.dust)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.smallDust)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.tinyDust)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.crushed)
        
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.impureDust)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.pureDust)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.nugget)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.wire)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gem)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gemBrittle)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.gemPolished)
            // Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.block)
        }
    }
    return compound
}