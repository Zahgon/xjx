package io.jonasg.xjx.serdes.deserialize;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import io.jonasg.xjx.sax.Attribute;
import io.jonasg.xjx.sax.SaxHandler;
import io.jonasg.xjx.serdes.Path;
import io.jonasg.xjx.serdes.deserialize.config.XjxConfiguration;

public class PathBasedSaxHandler<T> implements SaxHandler {

    private final Function<String, PathWriterIndex> indexSupplier;

    private final XjxConfiguration configuration;

    private final LinkedList<Object> objectInstances = new LinkedList<>();

    private String rootTag;

    private Path path;

    private PathWriterIndex pathWriterIndex;

    private String data;

    private SaxHandler mapRootSaxHandlerDelegate;

    private String mapStartTag;

    public PathBasedSaxHandler(Function<String, PathWriterIndex> indexSupplier, XjxConfiguration configuration) {
        this.indexSupplier = indexSupplier;
        this.configuration = configuration;
    }

    public PathBasedSaxHandler(Function<String, PathWriterIndex> indexSupplier, String rootTag, XjxConfiguration configuration) {
        this.indexSupplier = indexSupplier;
        this.rootTag = rootTag;
        this.configuration = configuration;
        handleRootTag(rootTag);
    }

    @Override
    public void startDocument() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
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

    private void handleRootTag(String name) {
        this.pathWriterIndex = indexSupplier.apply(name);
        this.rootTag = name;
        path = Path.of(name);
        List<PathWriter> pathWriters = pathWriterIndex.get(path);
        if (pathWriters != null) {
            pathWriters.forEach(pathWriter -> {
                Object parent = pathWriter.getRootInitializer().get();
                if (parent instanceof MapAsRoot mapAsRoot) {
                    this.mapRootSaxHandlerDelegate = new MapRootSaxHandler(mapAsRoot.map());
                    this.objectInstances.push(mapAsRoot.root());
                } else {
                    this.objectInstances.push(parent);
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    public T instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
