package io.jonasg.xjx.serdes.deserialize;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class PathWriter {

    private Supplier<Object> rootInitializer;

    private Supplier<Object> objectInitializer;

    private Consumer<Object> valueInitializer;

    public static PathWriter rootInitializer(Supplier<Object> rootInitializer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PathWriter objectInitializer(Supplier<Object> objectInitializer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRootInitializer(Supplier<Object> rootInitializer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PathWriter setValueInitializer(Consumer<Object> valueInitializer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PathWriter valueInitializer(Consumer<Object> o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Supplier<Object> getRootInitializer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Supplier<Object> getObjectInitializer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Consumer<Object> getValueInitializer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
