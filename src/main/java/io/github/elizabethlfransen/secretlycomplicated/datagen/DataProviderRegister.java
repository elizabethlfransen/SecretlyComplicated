package io.github.elizabethlfransen.secretlycomplicated.datagen;


import io.github.elizabethlfransen.secretlycomplicated.util.Locales;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import static io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated.MOD_ID;

public class DataProviderRegister {
    @SubscribeEvent
    public static void register(GatherDataEvent event) {
        if (event.includeClient()) {
            event.getGenerator().addProvider(new ElementModelProvider(event.getGenerator(), MOD_ID, event.getExistingFileHelper()));
            event.getGenerator().addProvider(new SecretlyComplicatedLocaleProvider(event.getGenerator(), MOD_ID, Locales.EN_US));
        }
    }
}
