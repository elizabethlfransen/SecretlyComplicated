package io.github.elizabethlfransen.secretlycomplicated.material;

public final class SCOreBuilder extends SCBaseMaterialBuilder<SCOreBuilder, SCOre> {

    @Override
    protected SCOreBuilder getSelf() {
        return this;
    }

    @Override
    public SCOre build() {
        return new SCOre(metallic, name, color, melting, boiling, forms, dataGenProps);
    }
}
