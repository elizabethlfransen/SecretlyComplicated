package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.materialform.item.ItemForm;
import net.minecraft.world.level.block.Block;

public interface BlockForm extends ItemForm {
    Block getBlock();
    int getColor();
}
