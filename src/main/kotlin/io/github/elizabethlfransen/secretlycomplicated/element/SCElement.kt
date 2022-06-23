package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import net.minecraft.world.item.Item
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.registerObject

data class SCElement(
    val atomicNumber: Number,
    val name: String
) {
    fun register(itemRegister: DeferredRegister<Item>) = RegisteredSCElement(itemRegister, this)
}

class RegisteredSCElement(
    itemRegister: DeferredRegister<Item>,
    element: SCElement
) {
    val item1 = itemRegister.register("hydrogen") { Item(Item.Properties()) }
    val item2 = itemRegister.register("helium") { Item(Item.Properties()) }
    val item3 = itemRegister.register("lithium") { Item(Item.Properties()) }
    val item4 = itemRegister.register("beryllium") { Item(Item.Properties()) }
    val item5 = itemRegister.register("boron") { Item(Item.Properties()) }
    val item6 = itemRegister.register("carbon") { Item(Item.Properties()) }
    val item7 = itemRegister.register("nitrogen") { Item(Item.Properties()) }
    val item8 = itemRegister.register("oxygen") { Item(Item.Properties()) }
    val item9 = itemRegister.register("fluorine") { Item(Item.Properties()) }
    val item10 = itemRegister.register("neon") { Item(Item.Properties()) }
}