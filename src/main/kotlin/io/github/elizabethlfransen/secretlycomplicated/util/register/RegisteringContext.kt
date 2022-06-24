package io.github.elizabethlfransen.secretlycomplicated.util.register

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

open class RegisteringContext {
    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretlyComplicated.ID)

    open val defaultTab: CreativeModeTab? = null

    open fun register(bus: IEventBus) {
        ITEMS.register(bus)
    }
}