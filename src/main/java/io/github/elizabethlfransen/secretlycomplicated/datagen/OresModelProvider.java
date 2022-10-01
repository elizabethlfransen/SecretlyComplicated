package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCRock;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.block.OreBlockMaterialForm;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;

import net.minecraftforge.common.data.ExistingFileHelper;

public class OresModelProvider extends ItemModelProvider {

    public OresModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        SecretlyComplicated.getAllRocks()
                .forEach(this::registerElement);
    }

    private void registerElement(SCRock material) {
        material.forms.forEach((key, value) -> registerForm(
                material,
                key,
                value
        ));
    }

    private void registerForm(SCRock material, String formName, MaterialForm form) {
        if (form instanceof OreBlockMaterialForm textureForm) {
            registerForm("%s_%s".formatted(material.name, formName), textureForm);
        }
    }

    private void registerForm(String name, OreBlockMaterialForm form) {
        withExistingParent(name, "item/generated")
                .texture("layer0", "%s:item/%s".formatted(SecretlyComplicated.MOD_ID, form.getTextureName()));
    }
}
