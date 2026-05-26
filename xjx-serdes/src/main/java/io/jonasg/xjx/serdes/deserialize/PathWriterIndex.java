package io.jonasg.xjx.serdes.deserialize;

import io.jonasg.xjx.serdes.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PathWriterIndex {

    private final Map<Path, List<PathWriter>> index = new HashMap<>();

    public void put(Path path, PathWriter pathWriter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void putAll(PathWriterIndex pathWriterIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PathWriter> get(Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
