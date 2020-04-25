package org.jcodec.codecs.vpx;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Packet;

public class IVFMuxer {

    /* renamed from: ch */
    private SeekableByteChannel f44787ch;
    private int nFrames;

    public IVFMuxer(SeekableByteChannel seekableByteChannel, int i, int i2, int i3) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(32);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(68);
        allocate.put(75);
        allocate.put(73);
        allocate.put(70);
        allocate.putShort(0);
        allocate.putShort(32);
        allocate.putInt(808996950);
        allocate.putShort((short) i);
        allocate.putShort((short) i2);
        allocate.putInt(i3);
        allocate.putInt(1);
        allocate.putInt(1);
        allocate.clear();
        seekableByteChannel.write(allocate);
        this.f44787ch = seekableByteChannel;
    }

    public void addFrame(Packet packet) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        ByteBuffer data = packet.getData();
        allocate.putInt(data.remaining());
        allocate.putLong((long) this.nFrames);
        allocate.clear();
        this.f44787ch.write(allocate);
        this.f44787ch.write(data);
        this.nFrames++;
    }

    public void close() throws IOException {
        this.f44787ch.position(24);
        NIOUtils.writeIntLE(this.f44787ch, this.nFrames);
    }
}
