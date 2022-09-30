package io.github.elizabethlfransen.secretlycomplicated.materialform.block;

import io.github.elizabethlfransen.secretlycomplicated.materialform.LocalizableMaterialForm;
import net.minecraft.world.level.block.Block;

public interface BlockMaterialForm extends LocalizableMaterialForm  {
    String getTextureName();
    Block getBlock();
}
