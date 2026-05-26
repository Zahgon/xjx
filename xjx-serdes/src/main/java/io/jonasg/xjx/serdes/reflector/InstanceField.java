package io.jonasg.xjx.serdes.reflector;

import java.lang.annotation.Annotation;
import java.util.StringJoiner;

public class InstanceField {

    private final FieldReflector fieldReflector;

    private final Object instance;

    public <T> InstanceField(FieldReflector fieldReflector, T instance) {
        this.fieldReflector = fieldReflector;
        this.instance = instance;
    }

    public <A extends Annotation> boolean hasAnnotation(Class<A> annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Annotation> T getAnnotation(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public InstanceReflector<Object> reflect() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
