package io.github.elizabethlfransen.secretlycomplicated.util.register.item

import net.minecraft.world.item.Item

class ItemRegistrationConfig(
) {
    var props: ItemPropsConfig = ItemPropsConfig()
    fun build() = Item(props.build())
}