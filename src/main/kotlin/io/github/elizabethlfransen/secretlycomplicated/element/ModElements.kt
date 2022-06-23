package io.github.elizabethlfransen.secretlycomplicated.element

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated
import net.minecraft.client.Minecraft
import net.minecraft.client.color.item.ItemColor
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import thedarkcolour.kotlinforforge.KotlinModLoadingContext
import thedarkcolour.kotlinforforge.forge.MOD_BUS

class SCElementItem(properties: Properties = Properties()) : Item(properties) {

}

object ModElements {
    val items = DeferredRegister.create(ForgeRegistries.ITEMS, SecretlyComplicated.ID)
    val creativeModeTab = (object: CreativeModeTab("secretly_complicated") {
        override fun makeIcon(): ItemStack {
            return ItemStack(hydrogenIngot.get())
        }
    })
    val hydrogenIngot : RegistryObject<Item> = items.register("hydrogen_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val heliumIngot : RegistryObject<Item> = items.register("helium_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val lithiumIngot : RegistryObject<Item> = items.register("lithium_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val berylliumIngot : RegistryObject<Item> = items.register("beryllium_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val boronIngot : RegistryObject<Item> = items.register("boron_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val carbonIngot : RegistryObject<Item> = items.register("carbon_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val nitrogenIngot : RegistryObject<Item> = items.register("nitrogen_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val oxygenIngot : RegistryObject<Item> = items.register("oxygen_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val fluorineIngot : RegistryObject<Item> = items.register("fluorine_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
    val neonIngot : RegistryObject<Item> = items.register("neon_ingot") { Item(Item.Properties().tab(creativeModeTab)) }
}