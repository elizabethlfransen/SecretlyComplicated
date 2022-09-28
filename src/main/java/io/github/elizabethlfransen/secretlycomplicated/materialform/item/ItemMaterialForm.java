package io.github.elizabethlfransen.secretlycomplicated.materialform.item;

import io.github.elizabethlfransen.secretlycomplicated.materialform.LocalizableMaterialForm;
import net.minecraft.world.item.Item;

public interface ItemMaterialForm extends LocalizableMaterialForm  {
    String getTextureName();
    Item getItem();
}
