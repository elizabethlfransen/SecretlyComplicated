package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCRock;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.OreBlockMaterialForm;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OresBlockStateProvider extends BlockStateProvider {
    public OresBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        SecretlyComplicated.getAllRocks()
                .forEach(this::registerMaterial);
    }

    private void registerMaterial(SCRock material) {
        material.forms
                .forEach((name, form) -> registerForm(material, form));
    }

    private void registerForm(SCRock material, MaterialForm form) {
        if (form instanceof OreBlockMaterialForm blockForm) {
            registerForm(material.name + "_ore", blockForm);
        }
    }

    private void registerForm(String name, OreBlockMaterialForm form) {
        itemModels().withExistingParent(name, modLoc("block/colorable_block"));
        simpleBlock(form.getBlock(), models().withExistingParent(name, modLoc("block/colorable_block")));
    }

}
