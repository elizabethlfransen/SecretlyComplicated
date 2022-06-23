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
    val item = itemRegister.register("hydrogen") {
        Item(
            Item.Properties()
        )
    }
}