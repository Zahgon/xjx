package io.jonasg.xjx.serdes.deserialize;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class RecordWrapper<T> {

    private final Map<String, Object> fieldMapping = new HashMap<>();

    private final Class<T> type;

    public RecordWrapper(Class<T> type) {
        this.type = type;
    }

    public void set(String name, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public T record() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
