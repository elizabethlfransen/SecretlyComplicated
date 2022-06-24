package io.github.elizabethlfransen.secretlycomplicated.util.register.item

import io.github.elizabethlfransen.secretlycomplicated.util.register.RegisteringContext
import net.minecraft.world.item.Item
import net.minecraftforge.registries.RegistryObject
import thedarkcolour.kotlinforforge.forge.registerObject
import kotlin.properties.ReadOnlyProperty

fun RegisteringContext.item(name: String, init: ItemRegistrationConfig.() -> Unit = {}): RegistryObject<Item> {
    val config = ItemRegistrationConfig()
    defaultTab?.let(config.props::tab)
    config.init()
    return ITEMS.register(name) {
        Item(config.props)
    }
}

fun RegisteringContext.registerItem(name: String, init: ItemRegistrationConfig.() -> Unit = {}): ReadOnlyProperty<Any?, Item> {
    val config = ItemRegistrationConfig()
    defaultTab?.let(config.props::tab)
    config.init()
    return ITEMS.registerObject(name) {
        Item(config.props)
    }
}