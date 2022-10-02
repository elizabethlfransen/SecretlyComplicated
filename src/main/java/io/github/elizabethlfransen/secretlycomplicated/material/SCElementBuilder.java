package io.github.elizabethlfransen.secretlycomplicated.material;

public final class SCElementBuilder extends SCBaseMaterialBuilder<SCElementBuilder,SCElement> {

    private int atomicNumber;



    public SCElementBuilder atomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
        return this;
    }

    @Override
    protected SCElementBuilder getSelf() {
        return this;
    }

    @Override
    public SCElement build() {
        return new SCElement(atomicNumber, metallic, name, color, melting, boiling, forms);
    }
}
