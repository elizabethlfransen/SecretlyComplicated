package io.github.elizabethlfransen.secretlycomplicated.datagen;

import io.github.elizabethlfransen.secretlycomplicated.SecretlyComplicated;
import io.github.elizabethlfransen.secretlycomplicated.element.SCElement;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.fluid.SimpleFluidMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.materialform.item.ItemMaterialForm;
import io.github.elizabethlfransen.secretlycomplicated.register.ModElements;
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
        ModElements.getValues()
                .forEach(this::registerElement);
    }

    private void registerElement(SCElement element) {
        element.forms.forEach((key, value) -> registerForm(
                element,
                key,
                value
        ));
    }

    private void registerForm(SCElement element, String formName, MaterialForm form) {
        if(form instanceof ItemMaterialForm itemForm) {
            registerForm("%s_%s".formatted(element.name, formName), itemForm);
        }
        if(form instanceof SimpleFluidMaterialForm fluidForm) {
            registerForm(element.name + "_fluid_bucket", fluidForm);
        }
    }

    private void registerForm(String name, SimpleFluidMaterialForm form) {
        withExistingParent(name,new ResourceLocation("forge", "item/bucket"))
                .customLoader(DynamicBucketModelBuilder::begin)
                .fluid(form.getStill());
    }

    private void registerForm(String name, ItemMaterialForm form) {
        withExistingParent(name, "item/generated")
                .texture("layer0", "%s:item/%s".formatted(SecretlyComplicated.MOD_ID, form.getTextureName()));
    }
}
