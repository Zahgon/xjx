package io.jonasg.xjx.scanners;

import static io.jonasg.xjx.Token.Type.CLOSE_COMMENT;
import io.jonasg.xjx.PositionedReader;
import io.jonasg.xjx.Token;
import io.jonasg.xjx.TokenEmitter;

class CommentBodyScanner implements Scanner {

    @Override
    public Scanner scan(PositionedReader reader, TokenEmitter tokenEmitter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
