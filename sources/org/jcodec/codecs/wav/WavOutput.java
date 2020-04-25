package org.jcodec.codecs.wav;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.audio.AudioSink;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.AudioUtil;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;

public class WavOutput implements Closeable {
    protected AudioFormat format;
    protected WavHeader header;
    protected SeekableByteChannel out;
    protected int written;

    public static class File extends WavOutput {
        public File(java.io.File file, AudioFormat audioFormat) throws IOException {
            super(NIOUtils.writableFileChannel(file), audioFormat);
        }

        public void close() throws IOException {
            WavOutput.super.close();
            NIOUtils.closeQuietly((ReadableByteChannel) this.out);
        }
    }

    public static class Sink implements AudioSink, Closeable {
        private WavOutput out;

        public Sink(WavOutput wavOutput) {
            this.out = wavOutput;
        }

        public void close() throws IOException {
            this.out.close();
        }

        public void write(FloatBuffer floatBuffer) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(this.out.format.samplesToBytes(floatBuffer.remaining()));
            AudioUtil.fromFloat(floatBuffer, this.out.format, allocate);
            allocate.flip();
            this.out.write(allocate);
        }

        public Sink(java.io.File file, AudioFormat audioFormat) throws IOException {
            this(new File(file, audioFormat));
        }

        public Sink(SeekableByteChannel seekableByteChannel, AudioFormat audioFormat) throws IOException {
            this(new WavOutput(seekableByteChannel, audioFormat));
        }

        public void write(int[] iArr, int i) throws IOException {
            int min = Math.min(iArr.length, i);
            ByteBuffer allocate = ByteBuffer.allocate(this.out.format.samplesToBytes(min));
            AudioUtil.fromInt(iArr, min, this.out.format, allocate);
            allocate.flip();
            this.out.write(allocate);
        }
    }

    public WavOutput(SeekableByteChannel seekableByteChannel, AudioFormat audioFormat) throws IOException {
        this.out = seekableByteChannel;
        this.format = audioFormat;
        this.header = new WavHeader(audioFormat, 0);
        this.header.write(seekableByteChannel);
    }

    public void close() throws IOException {
        this.out.position(0);
        AudioFormat audioFormat = this.format;
        new WavHeader(audioFormat, audioFormat.bytesToFrames(this.written)).write(this.out);
        NIOUtils.closeQuietly((ReadableByteChannel) this.out);
    }

    public void write(ByteBuffer byteBuffer) throws IOException {
        this.written += this.out.write(byteBuffer);
    }
}
