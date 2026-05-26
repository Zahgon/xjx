package io.jonasg.xjx.serdes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Path implements Iterable<Section> {

    private final LinkedList<String> sections = new LinkedList<>();

    private String attribute;

    private Path(String... paths) {
        Arrays.stream(paths).filter(p -> !p.isEmpty()).forEach(sections::add);
    }

    private Path(LinkedList<String> sections, String section) {
        this.sections.addAll(sections);
        this.sections.add(section);
    }

    public Path(LinkedList<String> newSections) {
        this.sections.addAll(newSections);
    }

    public static Path of(String... paths) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Path parse(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path appendAttribute(String attribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path append(String section) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path append(Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path pop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getRoot() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRoot() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Section getSection(int position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<Section> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
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
