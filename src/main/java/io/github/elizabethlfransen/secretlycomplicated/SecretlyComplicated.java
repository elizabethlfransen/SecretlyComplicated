package io.github.elizabethlfransen.secretlycomplicated;

import io.github.elizabethlfransen.secretlycomplicated.datagen.DataProviderRegister;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.register.ModCompounds;
import io.github.elizabethlfransen.secretlycomplicated.register.ModElements;
import io.github.elizabethlfransen.secretlycomplicated.register.ModFluids;
import io.github.elizabethlfransen.secretlycomplicated.register.ModGases;
import io.github.elizabethlfransen.secretlycomplicated.register.ModGems;
import io.github.elizabethlfransen.secretlycomplicated.register.ModMachineBlocks;
import io.github.elizabethlfransen.secretlycomplicated.register.ModOres;
import io.github.elizabethlfransen.secretlycomplicated.register.ModSingularItems;
import io.github.elizabethlfransen.secretlycomplicated.util.SimpleCreativeTab;
import io.github.noeppi_noeppi.libx.mod.registration.ModXRegistration;
import io.github.noeppi_noeppi.libx.mod.registration.RegistrationBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

import static io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated.MOD_ID;

@Mod(MOD_ID)
public final class SecretlyComplicated extends ModXRegistration {
    public static final String MOD_ID = "secretly_complicated";
    private static final Logger logger = LogManager.getLogger(SecretlyComplicated.class);
    private static SecretlyComplicated instance;

    public SecretlyComplicated() {
        super(new SimpleCreativeTab(MOD_ID, () -> new ItemStack(Items.DIRT)));
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().register(DataProviderRegister.class);
    }

    public static SecretlyComplicated getInstance() {
        return instance;
    }

    @Override
    protected void initRegistration(RegistrationBuilder builder) {

        builder
                .setVersion(1);
    }

    @Override
    protected void setup(FMLCommonSetupEvent event) {

    }

    @Override
    protected void clientSetup(FMLClientSetupEvent event) {

    }

    public static Set<SCMaterial> getAllMaterials() {
        Set<SCMaterial> result = new HashSet<>();
        result.addAll(ModCompounds.getValues());
        result.addAll(ModElements.getValues());
        result.addAll(ModOres.getValues());
        result.addAll(ModMachineBlocks.getValues());
        result.addAll(ModFluids.getValues());
        result.addAll(ModGems.getValues());
        result.addAll(ModSingularItems.getValues());
        result.addAll(ModGases.getValues());

        return result;
    }
}
