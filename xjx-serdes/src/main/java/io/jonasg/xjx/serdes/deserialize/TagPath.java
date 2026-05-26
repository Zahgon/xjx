package io.jonasg.xjx.serdes.deserialize;

import io.jonasg.xjx.serdes.Tag;
import io.jonasg.xjx.serdes.reflector.FieldReflector;

public class TagPath {

    private final Tag tag;

    private final FieldReflector field;

    public TagPath(Tag tag, FieldReflector field) {
        this.tag = tag;
        this.field = field;
    }

    public boolean isAbsolute() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FieldReflector field() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String path() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String attribute() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
