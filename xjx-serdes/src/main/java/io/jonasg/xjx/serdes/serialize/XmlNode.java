package io.jonasg.xjx.serdes.serialize;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import io.jonasg.xjx.Attributes;

public final class XmlNode {

    private final String name;

    private Object value;

    private final List<XmlNode> children;

    private final Attributes attributes;

    public XmlNode(String name, Object value, List<XmlNode> children, Attributes attributes) {
        this.name = name;
        this.value = value;
        this.children = children;
        this.attributes = attributes;
    }

    public XmlNode(String name) {
        this(name, null, new ArrayList<>(), new Attributes());
    }

    public XmlNode(String name, Object value) {
        this(name, value, null, new Attributes());
    }

    public void addValueNode(String name, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public XmlNode addNode(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addAttribute(String attribute, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasChildren() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsAValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<XmlNode> children() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Attributes attributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
