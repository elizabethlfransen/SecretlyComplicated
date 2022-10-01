package io.github.elizabethlfransen.secretlycomplicated.block;

import io.github.noeppi_noeppi.libx.mod.ModX;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemRenderProperties;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.function.Consumer;

public class SCBlock extends Block implements Registerable {
    protected final ModX mod;
    protected final Item item;

    public SCBlock(ModX mod, Properties properties) {
        this(mod, properties, new Item.Properties());
    }

    public SCBlock(ModX mod, Properties properties, Item.Properties itemProperties) {
        super(properties);
        this.mod = mod;
        if (mod.tab != null) {
            itemProperties.tab(mod.tab);
        }
        this.item = new BlockItem(this, itemProperties) {
            @Override
            public void initializeClient(@Nonnull Consumer<IItemRenderProperties> consumer) {
                SCBlock.this.initializeItemClient(consumer);
            }
        };
    }

    public Item getItem() {
        return item;
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return Set.of(getItem());
    }

    /**
     * Called from the item for this block from {@link Item#initializeClient(Consumer)}.
     * Can be used to set client properties for the block item.
     */
    public void initializeItemClient(@Nonnull Consumer<IItemRenderProperties> consumer) {

    }


}
