package io.jonasg.xjx.serdes.deserialize;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import io.jonasg.xjx.sax.Attribute;
import io.jonasg.xjx.sax.SaxHandler;

public class MapRootSaxHandler implements SaxHandler {

    private final LinkedList<Map<String, Object>> mapsStack;

    private final boolean skipRootTag;

    private Map<String, Object> instance;

    private String characterData;

    private String prevStartTag;

    private String rootTag;

    public MapRootSaxHandler(Map<String, Object> instance) {
        this.mapsStack = new LinkedList<>();
        this.mapsStack.add(instance);
        this.skipRootTag = false;
        this.instance = instance;
    }

    public MapRootSaxHandler(HashMap<String, Object> instance, boolean skipRootTag) {
        this.mapsStack = new LinkedList<>();
        this.mapsStack.add(instance);
        this.skipRootTag = skipRootTag;
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
