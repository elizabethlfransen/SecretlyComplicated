package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.SimpleBlockMaterialForm;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ElementBlockStateProvider extends BlockStateProvider {
    public ElementBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        SecretlyComplicated.getAllMaterials()
                .forEach(this::registerMaterial);
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
