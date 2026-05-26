package io.jonasg.xjx;

import java.io.Reader;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import io.jonasg.xjx.scanners.Scanner;
import io.jonasg.xjx.scanners.WhiteSpaceScanner;

/**
 * Tokenize an XML document into a stream of {@link Token}.
 */
public class Tokenizer {

    public Stream<Token<?>> tokenize(Reader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static class TokenSpliterator implements Spliterator<Token<?>> {

        private final BufferedPositionedReader reader;

        private Scanner scanner;

        public TokenSpliterator(Reader reader) {
            this.scanner = new WhiteSpaceScanner();
            this.reader = new BufferedPositionedReader(reader);
        }

        @Override
        public boolean tryAdvance(Consumer<? super Token<?>> action) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Spliterator<Token<?>> trySplit() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public long estimateSize() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int characteristics() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
