package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.BlockMaterialForm;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated.MOD_ID;

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
                .forEach((name, form) -> registerForm(material, name, form));
    }

    private void registerForm(SCMaterial material, String formName, MaterialForm form) {
        if (form instanceof BlockMaterialForm blockForm) {
            registerForm(material.name + "_block", blockForm);
        }
    }

    private void registerForm(String name, BlockMaterialForm form) {

        simpleBlock(form.getBlock(),
                models().cubeAll(name, new ResourceLocation(MOD_ID, "block/" + form.getTextureName()))
        );
    }
}
