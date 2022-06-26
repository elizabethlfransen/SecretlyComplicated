package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import io.github.elizabethlfransen.secretlycomplicated.util.register.fluid.SCFluid
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.ItemRegistrationConfig
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.registerItem
import net.minecraft.client.Minecraft
import net.minecraft.client.color.item.ItemColor
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

class SCElement(
    context: RegisteringContext,
    val atomicNumber: Int,
    val name: String,
    val color: Int,
    val melting: Int, /* In Celcius */
    val boiling: Int,
    config: SCElementConfig
) {
    val item by context.registerItem("${name}_ingot", config.itemConfigInitializer)
    val fluid = SCFluid(name, color, context)
}


class SCElementConfig {
    var itemConfigInitializer: ItemRegistrationConfig.() -> Unit = {}
        private set

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
    val element = SCElement(
        this,
        atomicNumber,
        name,
        color,
        melting,
        boiling,
        SCElementConfig().apply(init)
    )
    onRegister { bus ->
        bus.addListener<FMLClientSetupEvent> {
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex -> color }), element.item)
        }
    }
    return element
}