package org.jcodec.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jcodec.common.p554io.AutoPool;
import org.jcodec.common.p554io.AutoResource;

public class AutoFileChannelWrapper implements SeekableByteChannel, AutoResource {
    private static final long THRESHOLD = 5000;
    private long accessTime;

    /* renamed from: ch */
    private FileChannel f44792ch;
    private long curTime = System.currentTimeMillis();
    private File file;
    private long savedPos;

    public AutoFileChannelWrapper(File file2) throws IOException {
        this.file = file2;
        AutoPool.getInstance().add(this);
        ensureOpen();
    }

    private void ensureOpen() throws IOException {
        this.accessTime = this.curTime;
        FileChannel fileChannel = this.f44792ch;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f44792ch = new FileInputStream(this.file).getChannel();
            this.f44792ch.position(this.savedPos);
        }
    }

    public void close() throws IOException {
        FileChannel fileChannel = this.f44792ch;
        if (fileChannel != null && fileChannel.isOpen()) {
            this.savedPos = this.f44792ch.position();
            this.f44792ch.close();
            this.f44792ch = null;
        }
    }

    public boolean isOpen() {
        FileChannel fileChannel = this.f44792ch;
        return fileChannel != null && fileChannel.isOpen();
    }

    public long position() throws IOException {
        ensureOpen();
        return this.f44792ch.position();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        ensureOpen();
        int read = this.f44792ch.read(byteBuffer);
        this.savedPos = this.f44792ch.position();
        return read;
    }

    public void setCurTime(long j) {
        this.curTime = j;
        FileChannel fileChannel = this.f44792ch;
        if (fileChannel != null && fileChannel.isOpen() && j - this.accessTime > THRESHOLD) {
            try {
                close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public long size() throws IOException {
        ensureOpen();
        return this.f44792ch.size();
    }

    public SeekableByteChannel truncate(long j) throws IOException {
        ensureOpen();
        this.f44792ch.truncate(j);
        this.savedPos = this.f44792ch.position();
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        ensureOpen();
        int write = this.f44792ch.write(byteBuffer);
        this.savedPos = this.f44792ch.position();
        return write;
    }

    public SeekableByteChannel position(long j) throws IOException {
        ensureOpen();
        this.f44792ch.position(j);
        this.savedPos = j;
        return this;
    }
}
