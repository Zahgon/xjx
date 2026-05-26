package io.jonasg.xjx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Optional;

public class BufferedPositionedReader implements PositionedReader {

    private final BufferedReader reader;

    private String currentLine;

    private int currentLinePos;

    private boolean hasMoreToRead = true;

    public BufferedPositionedReader(BufferedReader reader) {
        this.reader = reader;
        this.readNextLine();
    }

    public BufferedPositionedReader(Reader reader) {
        this(new BufferedReader(reader));
    }

    @Override
    public String currentLine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String readNextLine() {
        try {
            String readLine = reader.readLine();
            if (readLine != null) {
                currentLine = readLine;
                currentLinePos = 0;
            } else {
                hasMoreToRead = false;
                currentLine = null;
                currentLinePos = 0;
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return currentLine;
    }

    @Override
    public String peekLine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Character readOneChar() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public char peekOneChar() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String readChars(int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasMoreToRead() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<String> readUntil(String until) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Character getCurrentChar() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void ltrim() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String removeLeadingWhitespace(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
