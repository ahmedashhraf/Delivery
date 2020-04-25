package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.SeekableByteChannel;

public class SeekableByteChannelWrapper implements SeekableByteChannel {
    protected SeekableByteChannel src;

    public SeekableByteChannelWrapper(SeekableByteChannel seekableByteChannel) {
        this.src = seekableByteChannel;
    }

    public void close() throws IOException {
        this.src.close();
    }

    public boolean isOpen() {
        return this.src.isOpen();
    }

    public long position() throws IOException {
        return this.src.position();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.src.read(byteBuffer);
    }

    public long size() throws IOException {
        return this.src.size();
    }

    public SeekableByteChannel truncate(long j) throws IOException {
        this.src.truncate(j);
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.src.write(byteBuffer);
    }

    public SeekableByteChannel position(long j) throws IOException {
        this.src.position(j);
        return this;
    }
}
