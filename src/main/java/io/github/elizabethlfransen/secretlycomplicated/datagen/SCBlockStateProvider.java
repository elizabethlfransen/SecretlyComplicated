package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.SimpleBlockMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.ore.OreMaterialForm;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SCBlockStateProvider extends BlockStateProvider {
    public SCBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        SecretlyComplicated.getAllMaterials()
                .forEach(this::registerMaterial);
    }


    private void registerForm(SCMaterial material, MaterialForm form) {
        if (form instanceof SimpleBlockMaterialForm blockForm) {
            registerForm(material.name + "_block", blockForm);
        }
        if (form instanceof OreMaterialForm blockForm) {
            registerRock(material.name + "_ore", blockForm);
        }
    }

    private void registerMaterial(SCMaterial material) {
        material.forms
                .forEach((name, form) -> registerForm(material, form));
    }

    private void registerRock(String name, OreMaterialForm rock) {
        itemModels().withExistingParent(name, modLoc("block/base_ore"));
        simpleBlock(rock.getBlock(), models().withExistingParent(name, modLoc("block/base_ore")));
    }

    private void registerForm(String name, SimpleBlockMaterialForm form) {
        itemModels().withExistingParent(name, modLoc("block/colorable_block"));
        simpleBlock(form.getBlock(), models().withExistingParent(name, modLoc("block/colorable_block")));
    }

}
