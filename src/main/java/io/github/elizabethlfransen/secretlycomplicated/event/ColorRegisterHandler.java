package io.github.elizabethlfransen.secretlycomplicated.event;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.SimpleBlockMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.item.ItemForm;
import io.github.elizabethlfransen.secretlycomplicated.register.ModRocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraftforge.api.distmarker.Dist.CLIENT;
import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = SecretlyComplicated.MOD_ID, bus = MOD, value = {CLIENT})
public class ColorRegisterHandler {
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        SecretlyComplicated.getAllMaterials().stream()
                .flatMap(material -> material.forms.values().stream())
                .forEach(form -> registerFormItemColor(event.getItemColors(), form));
        // register rocks
        ModRocks.getValues().forEach(rock -> event.getItemColors().register((a, b) -> rock.color, rock.getItem()));
    }

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        SecretlyComplicated.getAllMaterials().stream()
                .flatMap(material -> material.forms.values().stream())
                .forEach(form -> registerFormBlockColor(event.getBlockColors(), form));
        ModRocks.getValues().forEach(rock -> event.getBlockColors().register((a, b,c,d) -> rock.color, rock));
    }


    private static void registerFormItemColor(ItemColors colors, MaterialForm form) {
        if (form instanceof ItemForm itemForm) {
            colors.register((a, b) -> itemForm.getColor(), itemForm.getItem());
        }
    }

    private static void registerFormBlockColor(BlockColors colors, MaterialForm form) {
        if ((form instanceof SimpleBlockMaterialForm blockForm)) {
            colors.register((a, b, c, d) -> blockForm.getColor(), blockForm.getBlock());
        }
    }
}
