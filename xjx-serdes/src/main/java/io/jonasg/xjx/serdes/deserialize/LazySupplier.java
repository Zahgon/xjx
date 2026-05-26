package io.jonasg.xjx.serdes.deserialize;

import java.util.function.Supplier;

public class LazySupplier<T> implements Supplier<T> {

    private T instance;

    private Supplier<T> initializer;

    public LazySupplier(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    @Override
    public T get() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void reset(Supplier<T> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
