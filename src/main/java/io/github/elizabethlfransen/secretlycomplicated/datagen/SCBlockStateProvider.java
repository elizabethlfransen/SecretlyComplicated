package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.UseExistingBlockState;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.UseExistingModel;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.UseOreModelProp;
import io.github.elizabethlfransen.secretlycomplicated.datagen.props.UseSimpleModelForOres;
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


    private void registerForm(MaterialForm<?> form) {
        if (form instanceof BlockForm blockForm) {
            //noinspection unchecked
            registerForm((MaterialForm<? extends BlockForm>) form, blockForm);
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

    private void registerRock(MaterialForm<? extends BlockForm> form, BlockForm blockForm, String texture) {
        String name = Objects.requireNonNull(blockForm.getBlock().getRegistryName(), "expected block to have a registry name but did not").getPath();

        if(form.dataGenProps.has(UseSimpleModelForOres.class)) {
            simpleBlock(blockForm.getBlock());
            itemModels().withExistingParent(name, modLoc("block/"+name));
        } else {
            itemModels().withExistingParent(name, modLoc("block/base_ore"))
                    .texture("all", texture);
            simpleBlock(blockForm.getBlock(), models().withExistingParent(name, modLoc("block/base_ore")).
                    texture("all", texture));
        }


    }

    private void registerForm(MaterialForm<? extends BlockForm> form, BlockForm blockForm) {
        if(form.dataGenProps.has(UseExistingBlockState.class))
            return;
        if(form.dataGenProps.has(UseExistingModel.class)) {
            String name = Objects.requireNonNull(blockForm.getBlock().getRegistryName(), "expected block to have a registry name but did not").getPath();
            simpleBlock(blockForm.getBlock(),models().getExistingFile(modLoc("block/"+name)));
            return;
        }
        
        form.dataGenProps.getProperty(UseOreModelProp.class)
                .ifPresentOrElse(
                        prop -> registerRock(form, blockForm,prop.baseTexture()),
                        () -> registerWithParent(blockForm, "block/colorable_block")
                );
    }

}
