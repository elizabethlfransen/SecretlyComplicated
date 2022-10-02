package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.material.SCRock;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.SimpleBlockMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.register.ModRocks;
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
        ModRocks.getValues()
                .forEach(this::registerRock);
    }

    private void registerRock(SCRock rock) {
        itemModels().withExistingParent(rock.name,modLoc("block/base_ore"));
        simpleBlock(rock, models().withExistingParent(rock.name, modLoc("block/base_ore")));
    }

    private void registerMaterial(SCMaterial material) {
        material.forms
                .forEach((name, form) -> registerForm(material, form));
    }

    private void registerForm(SCMaterial material, MaterialForm form) {
        if (form instanceof SimpleBlockMaterialForm blockForm) {
            registerForm(material.name + "_block", blockForm);
        }
    }

    private void registerForm(String name, SimpleBlockMaterialForm form) {
        itemModels().withExistingParent(name, modLoc("block/colorable_block"));
        simpleBlock(form.getBlock(), models().withExistingParent(name, modLoc("block/colorable_block")));
    }

}
