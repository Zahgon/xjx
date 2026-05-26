package io.jonasg.xjx.serdes.reflector;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.StringJoiner;

public class FieldReflector {

    private final Field field;

    public FieldReflector(Field field) {
        this.field = field;
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> void set(T instance, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public <T> Class<T> type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isOfType(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Field rawField() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Type genericType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Annotation> T getAnnotation(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Annotation> boolean hasAnnotation(Class<T> annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRecord() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
