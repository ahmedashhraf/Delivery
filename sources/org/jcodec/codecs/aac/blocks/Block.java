package org.jcodec.codecs.aac.blocks;

import org.jcodec.codecs.aac.BlockType;
import org.jcodec.common.p554io.BitReader;

public abstract class Block {
    private BlockType type;

    public BlockType getType() {
        return this.type;
    }

    public abstract void parse(BitReader bitReader);
}
