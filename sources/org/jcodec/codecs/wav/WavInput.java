package org.jcodec.codecs.wav;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.audio.AudioSource;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.AudioUtil;
import org.jcodec.common.NIOUtils;

public class WavInput implements Closeable {
    protected AudioFormat format = this.header.getFormat();
    protected WavHeader header;

    /* renamed from: in */
    protected ReadableByteChannel f44790in;
    protected byte[] prevBuf;

    public static class File extends WavInput {
        public File(java.io.File file) throws IOException {
            super(NIOUtils.readableFileChannel(file));
        }

        public void close() throws IOException {
            WavInput.super.close();
            this.f44790in.close();
        }
    }

    public static class Source implements AudioSource, Closeable {
        private AudioFormat format;
        private int pos;
        private WavInput src;

        public Source(WavInput wavInput) {
            this.src = wavInput;
            this.format = wavInput.getFormat();
        }

        public void close() throws IOException {
            this.src.close();
        }

        public AudioFormat getFormat() {
            return this.src.getFormat();
        }

        public int read(int[] iArr, int i) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(this.format.samplesToBytes(Math.min(i, iArr.length)));
            int read = this.src.read(allocate);
            allocate.flip();
            AudioUtil.toInt(this.format, allocate, iArr);
            return this.format.bytesToFrames(read);
        }

        public Source(ReadableByteChannel readableByteChannel) throws IOException {
            this(new WavInput(readableByteChannel));
        }

        public Source(java.io.File file) throws IOException {
            this((WavInput) new File(file));
        }

        public int read(FloatBuffer floatBuffer) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(this.format.samplesToBytes(floatBuffer.remaining()));
            int read = this.src.read(allocate);
            if (read == -1) {
                return -1;
            }
            allocate.flip();
            AudioUtil.toFloat(this.format, allocate, floatBuffer);
            int bytesToFrames = this.format.bytesToFrames(read);
            this.pos += bytesToFrames;
            return bytesToFrames;
        }
    }

    public WavInput(ReadableByteChannel readableByteChannel) throws IOException {
        this.header = WavHeader.read(readableByteChannel);
        this.f44790in = readableByteChannel;
    }

    public void close() throws IOException {
        this.f44790in.close();
    }

    public AudioFormat getFormat() {
        return this.format;
    }

    public WavHeader getHeader() {
        return this.header;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        AudioFormat audioFormat = this.format;
        return NIOUtils.read(this.f44790in, byteBuffer, audioFormat.framesToBytes(audioFormat.bytesToFrames(byteBuffer.remaining())));
    }
}
