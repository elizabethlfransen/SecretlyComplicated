package io.github.elizabethlfransen.secretlycomplicated.util.register.item

import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.Rarity

class ItemPropsConfig {
    var food: FoodProperties? = null
    var stacksTo: Int? = null
    var durability: Int? = null
    var craftRemainder: Item? = null
    var tab: CreativeModeTab? = null
    var rarity: Rarity? = null
    var canRepair: Boolean = true
    fun build(): Item.Properties {
        val result = Item.Properties()
        food?.let(result::food)
        stacksTo?.let(result::stacksTo)
        durability?.let(result::durability)
        craftRemainder?.let(result::craftRemainder)
        tab?.let(result::tab)
        rarity?.let(result::rarity)
        if(!canRepair)
            result.setNoRepair()
        return result
    }
}