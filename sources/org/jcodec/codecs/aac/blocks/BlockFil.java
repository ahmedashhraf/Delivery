package org.jcodec.codecs.aac.blocks;

import org.jcodec.common.p554io.BitReader;

public class BlockFil extends Block {
    public void parse(BitReader bitReader) {
        int readNBit = bitReader.readNBit(4);
        if (readNBit == 15) {
            readNBit += bitReader.readNBit(8) - 1;
        }
        if (readNBit > 0) {
            int i = readNBit * 8;
            if (bitReader.skip(i) != i) {
                throw new RuntimeException("Overread");
            }
        }
    }
}
