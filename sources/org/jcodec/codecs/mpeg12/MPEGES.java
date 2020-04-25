package org.jcodec.codecs.mpeg12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.containers.mps.MPSDemuxer.MPEGPacket;

public class MPEGES extends SegmentReader {
    public long curPts;
    private int frameNo;

    public MPEGES(ReadableByteChannel readableByteChannel) throws IOException {
        super(readableByteChannel, 4096);
    }

    public MPEGPacket getFrame(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        do {
            int i = this.curMarker;
            if (i == 256 || i == 435) {
            }
        } while (skipToMarker());
        while (this.curMarker != 256) {
            if (!readToNextMarker(duplicate)) {
                break;
            }
        }
        readToNextMarker(duplicate);
        do {
            int i2 = this.curMarker;
            if (i2 == 256 || i2 == 435) {
                duplicate.flip();
            }
        } while (readToNextMarker(duplicate));
        duplicate.flip();
        if (!duplicate.hasRemaining()) {
            return null;
        }
        long j = this.curPts;
        int i3 = this.frameNo;
        this.frameNo = i3 + 1;
        MPEGPacket mPEGPacket = new MPEGPacket(duplicate, j, 90000, 0, (long) i3, true, null);
        return mPEGPacket;
    }

    public MPEGES(ReadableByteChannel readableByteChannel, int i) throws IOException {
        super(readableByteChannel, i);
    }
}
