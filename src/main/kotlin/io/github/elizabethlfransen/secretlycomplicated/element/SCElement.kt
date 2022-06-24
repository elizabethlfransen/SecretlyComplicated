package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import io.github.elizabethlfransen.secretlycomplicated.util.register.item.registerItem
import net.minecraft.client.Minecraft
import net.minecraft.client.color.item.ItemColor
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

class SCElement(
    context: RegisteringContext,
    val atomicNumber: Int,
    val name: String,
    val color: Int
) {
    val item by context.registerItem("${name}_ingot")
}


fun RegisteringContext.registerElement(
    atomicNumber: Int,
    name: String,
    color: Int
): SCElement {
    val element = SCElement(
        this,
        atomicNumber,
        name,
        color
    )
    onRegister { bus->
        bus.addListener<FMLClientSetupEvent> {
            Minecraft.getInstance().itemColors.register((ItemColor { itemStack, colorIndex ->  color}), element.item)
        }
    }
    return element
}