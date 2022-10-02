package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.UseOreModelProp;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.BlockForm;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class SCBlockStateProvider extends BlockStateProvider {
    public SCBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        SecretlyComplicated.getAllMaterials()
                .forEach(this::registerMaterial);
    }


    private void registerForm(MaterialForm form) {
        if (form instanceof BlockForm blockForm) {
            registerForm(form, blockForm);
        }
    }

    private void registerMaterial(SCMaterial material) {
        material.forms
                .forEach((name, form) -> registerForm(form));
    }


    private void registerWithParent(BlockForm form, String parent) {
        String name = Objects.requireNonNull(form.getBlock().getRegistryName(), "expected block to have a registry name but did not").getPath();
        itemModels().withExistingParent(name, modLoc(parent));
        simpleBlock(form.getBlock(), models().withExistingParent(name, modLoc(parent)));
    }

    private void registerRock(BlockForm form, String texture) {
        String name = Objects.requireNonNull(form.getBlock().getRegistryName(), "expected block to have a registry name but did not").getPath();
        itemModels().withExistingParent(name, modLoc("block/base_ore"))
                .texture("all", texture);
        simpleBlock(form.getBlock(), models().withExistingParent(name, modLoc("block/base_ore")).texture("all", texture));
    }

    private void registerForm(MaterialForm form, BlockForm blockForm) {
        form.dataGenProps.getProperty(UseOreModelProp.class)
                .ifPresentOrElse(
                        prop -> registerRock(blockForm,prop.baseTexture()),
                        () -> registerWithParent(blockForm, "block/colorable_block")
                );
    }

}
