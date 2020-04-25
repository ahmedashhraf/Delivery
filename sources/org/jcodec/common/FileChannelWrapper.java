package org.jcodec.common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelWrapper implements SeekableByteChannel {

    /* renamed from: ch */
    private FileChannel f44794ch;

    public FileChannelWrapper(FileChannel fileChannel) throws FileNotFoundException {
        this.f44794ch = fileChannel;
    }

    public void close() throws IOException {
        this.f44794ch.close();
    }

    public boolean isOpen() {
        return this.f44794ch.isOpen();
    }

    public long position() throws IOException {
        return this.f44794ch.position();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f44794ch.read(byteBuffer);
    }

    public long size() throws IOException {
        return this.f44794ch.size();
    }

    public SeekableByteChannel truncate(long j) throws IOException {
        this.f44794ch.truncate(j);
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f44794ch.write(byteBuffer);
    }

    public SeekableByteChannel position(long j) throws IOException {
        this.f44794ch.position(j);
        return this;
    }
}
