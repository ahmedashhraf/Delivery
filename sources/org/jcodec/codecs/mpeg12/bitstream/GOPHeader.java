package org.jcodec.codecs.mpeg12.bitstream;

import java.nio.ByteBuffer;
import org.jcodec.common.model.TapeTimecode;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;

public class GOPHeader implements MPEGHeader {
    private boolean brokenLink;
    private boolean closedGop;
    private TapeTimecode timeCode;

    public GOPHeader(TapeTimecode tapeTimecode, boolean z, boolean z2) {
        this.timeCode = tapeTimecode;
        this.closedGop = z;
        this.brokenLink = z2;
    }

    public static GOPHeader read(ByteBuffer byteBuffer) {
        BitReader bitReader = new BitReader(byteBuffer);
        boolean z = false;
        boolean z2 = bitReader.read1Bit() == 1;
        short readNBit = (short) bitReader.readNBit(5);
        byte readNBit2 = (byte) bitReader.readNBit(6);
        bitReader.skip(1);
        byte readNBit3 = (byte) bitReader.readNBit(6);
        byte readNBit4 = (byte) bitReader.readNBit(6);
        boolean z3 = bitReader.read1Bit() == 1;
        if (bitReader.read1Bit() == 1) {
            z = true;
        }
        TapeTimecode tapeTimecode = new TapeTimecode(readNBit, readNBit2, readNBit3, readNBit4, z2);
        return new GOPHeader(tapeTimecode, z3, z);
    }

    public TapeTimecode getTimeCode() {
        return this.timeCode;
    }

    public boolean isBrokenLink() {
        return this.brokenLink;
    }

    public boolean isClosedGop() {
        return this.closedGop;
    }

    public void write(ByteBuffer byteBuffer) {
        BitWriter bitWriter = new BitWriter(byteBuffer);
        TapeTimecode tapeTimecode = this.timeCode;
        if (tapeTimecode == null) {
            bitWriter.writeNBit(0, 25);
        } else {
            bitWriter.write1Bit(tapeTimecode.isDropFrame() ? 1 : 0);
            bitWriter.writeNBit(this.timeCode.getHour(), 5);
            bitWriter.writeNBit(this.timeCode.getMinute(), 6);
            bitWriter.write1Bit(1);
            bitWriter.writeNBit(this.timeCode.getSecond(), 6);
            bitWriter.writeNBit(this.timeCode.getFrame(), 6);
        }
        bitWriter.write1Bit(this.closedGop ? 1 : 0);
        bitWriter.write1Bit(this.brokenLink ? 1 : 0);
        bitWriter.flush();
    }
}
