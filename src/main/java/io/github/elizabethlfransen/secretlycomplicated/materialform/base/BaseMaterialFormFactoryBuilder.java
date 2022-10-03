package io.github.elizabethlfransen.secretlycomplicated.materialform.base;

import io.github.elizabethlfransen.secretlycomplicated.datagen.props.base.DataGenProps;
import io.github.elizabethlfransen.secretlycomplicated.materialform.MaterialForm;

public abstract class BaseMaterialFormFactoryBuilder<
        TMaterialForm extends MaterialForm<TMaterialForm>,
        TFactory extends MaterialFormFactory<TMaterialForm>,
        TBuilder extends BaseMaterialFormFactoryBuilder<TMaterialForm, TFactory, TBuilder>
        > {
    protected final String id;

    protected final DataGenProps dataGenProps = new DataGenProps();
    protected BaseMaterialFormFactoryBuilder(String id) {
        this.id = id;
    }

    public <TDataGenProp> TBuilder withDataGenProp(TDataGenProp prop) {
        return configure(() -> dataGenProps.set(prop));
    }
    protected TBuilder configure(Runnable runnable) {
        runnable.run();
        return getSelf();
    }


    protected abstract TBuilder getSelf();

    public abstract TFactory build();

}
