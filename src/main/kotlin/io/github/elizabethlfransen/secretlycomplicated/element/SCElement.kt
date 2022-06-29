package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import io.github.elizabethlfransen.secretlycomplicated.util.register.fluid.SCFluid
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.ItemRegistrationConfig
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.registerItem
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
    config: SCElementConfig
) {
    val item by context.registerItem("${name}_ingot", config.itemConfigInitializer)
    val fluid = SCFluid(name, color, context)
}


class SCElementConfig {
    private var item: (() -> Item)? = null
    var itemConfigInitializer: ItemRegistrationConfig.() -> Unit = {}
        private set

    /**
     * When translating uses better language for metals for example:
     * Molten Copper vs Liquid Copper
     */
    var isMetal: Boolean = false

    fun item(init: ItemRegistrationConfig.() -> Unit) {
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
        config
    )
    onRegister { bus ->
        bus.addListener<FMLClientSetupEvent> {
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.item)
        }
    }
    return element
}