package io.jonasg.xjx.serdes.reflector;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TypeReflector<T> {

    private final Class<T> clazz;

    private final List<FieldReflector> fields;

    public TypeReflector(Class<T> clazz) {
        this.clazz = clazz;
        this.fields = Arrays.stream(clazz.getDeclaredFields()).map(FieldReflector::new).toList();
    }

    public static <T> TypeReflector<T> reflect(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public InstanceReflector<T> instanceReflector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<FieldReflector> field(String fieldName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<FieldReflector> fields() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <E extends Annotation> E annotation(Class<E> annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
