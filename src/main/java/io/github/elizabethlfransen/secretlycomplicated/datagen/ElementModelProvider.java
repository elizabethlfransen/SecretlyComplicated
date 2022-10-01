package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.material.SCMaterial;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.fluid.SimpleFluidMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.item.SimpleItemMaterialForm;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.loaders.DynamicBucketModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ElementModelProvider extends ItemModelProvider {

    public ElementModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        SecretlyComplicated.getAllMaterials()
                .forEach(this::registerElement);
    }

    private void registerElement(SCMaterial material) {
        material.forms.forEach((key, value) -> registerForm(
                material,
                key,
                value
        ));
    }

    private void registerForm(SCMaterial material, String formName, MaterialForm form) {
        if (form instanceof SimpleItemMaterialForm textureForm) {
            registerForm("%s_%s".formatted(material.name, formName), textureForm);
        }
        if (form instanceof SimpleFluidMaterialForm fluidForm) {
            registerForm(material.name + "_fluid_bucket", fluidForm);
        }
    }


    private void registerForm(String name, SimpleFluidMaterialForm form) {
        withExistingParent(name, new ResourceLocation("forge", "item/bucket"))
                .customLoader(DynamicBucketModelBuilder::begin)
                .fluid(form.getStill());
    }

    private void registerForm(String name, SimpleItemMaterialForm form) {
        withExistingParent(name, "item/generated")
                .texture("layer0", "%s:item/%s".formatted(SecretlyComplicated.MOD_ID, form.getTextureName()));
    }
}
