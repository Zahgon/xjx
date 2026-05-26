package io.jonasg.xjx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Attributes {

    private final Map<String, String> attributes = new LinkedHashMap<>();

    public Attributes(String... values) {
        int length = values.length;
        for (int i = 0; i < length - 1; i += 2) {
            String attributeName = values[i];
            String attributeValue = values[i + 1];
            attributes.put(attributeName, attributeValue);
        }
        if (length % 2 == 1) {
            String attributeName = values[length - 1];
            attributes.put(attributeName, null);
        }
    }

    public static Attributes empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void add(String attributeName, String attributeValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isPresent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Stream<Attribute> stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public record Attribute(String name, String value) {
    }

    @Override
    public boolean equals(Object o) {
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
