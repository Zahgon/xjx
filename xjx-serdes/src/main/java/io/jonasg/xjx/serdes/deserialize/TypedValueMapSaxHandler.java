package io.jonasg.xjx.serdes.deserialize;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import io.jonasg.xjx.sax.Attribute;
import io.jonasg.xjx.sax.SaxHandler;
import io.jonasg.xjx.serdes.deserialize.config.XjxConfiguration;

public class TypedValueMapSaxHandler implements SaxHandler {

    private final Class<?> valueType;

    private final XjxConfiguration configuration;

    private final Map<String, Object> instance;

    private PathBasedSaxHandler<Object> objectPathBasedSaxHandler;

    private String activeKey;

    public TypedValueMapSaxHandler(MapWithTypeInfo instance, XjxConfiguration configuration) {
        this.instance = instance.map();
        this.valueType = instance.valueType();
        this.configuration = configuration;
    }

    @Override
    public void startDocument() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void startTag(String namespace, String name, List<Attribute> attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void endTag(String namespace, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void characters(String data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, Object> instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
