package io.jonasg.xjx.scanners;

import java.util.Objects;
import io.jonasg.xjx.EndTag;
import io.jonasg.xjx.PositionedReader;
import io.jonasg.xjx.Token;
import io.jonasg.xjx.TokenEmitter;

class EndTagScanner implements Scanner {

    @Override
    public Scanner scan(PositionedReader reader, TokenEmitter tokenEmitter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
