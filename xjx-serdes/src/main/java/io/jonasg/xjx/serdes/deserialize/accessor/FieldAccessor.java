package io.jonasg.xjx.serdes.deserialize.accessor;

import io.jonasg.xjx.serdes.TypeMappers;
import io.jonasg.xjx.serdes.deserialize.RecordWrapper;
import io.jonasg.xjx.serdes.deserialize.config.XjxConfiguration;
import io.jonasg.xjx.serdes.reflector.FieldReflector;

public interface FieldAccessor {

    static FieldAccessor of(FieldReflector field, Object instance, XjxConfiguration configuration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void set(Object value);
}
