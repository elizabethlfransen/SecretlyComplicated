package io.github.elizabethlfransen.secretlycomplicated.util.register

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

typealias RegisterHandler = (bus: IEventBus) -> Unit

open class RegisteringContext {
    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretlyComplicated.ID)
    private val registerHandlers = mutableSetOf<RegisterHandler>()

    open val defaultTab: CreativeModeTab? = null

    fun onRegister(handler: RegisterHandler) {
        registerHandlers += handler
    }

    open fun register(bus: IEventBus) {
        ITEMS.register(bus)
        registerHandlers.forEach { handler -> handler(bus) }
    }
}