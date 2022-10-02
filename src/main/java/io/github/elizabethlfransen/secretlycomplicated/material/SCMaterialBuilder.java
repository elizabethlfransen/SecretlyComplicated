package io.github.elizabethlfransen.secretlycomplicated.material;

public final class SCMaterialBuilder extends SCBaseMaterialBuilder<SCMaterialBuilder, SCMaterial> {

    @Override
    protected SCMaterialBuilder getSelf() {
        return this;
    }

    @Override
    public SCMaterial build() {
        return new SCMaterial(metallic, name, color, melting, boiling, forms);
    }
}
