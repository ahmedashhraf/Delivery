package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.codecs.wav.WavHeader;
import org.jcodec.codecs.wav.WavHeader.FmtChunk;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.boxes.channel.Label;
import org.jcodec.movtool.streaming.AudioCodecMeta;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class WavTrack implements VirtualTrack {
    public static final int FRAMES_PER_PKT = 1024;
    private int frameNo;
    private WavHeader header;
    private long offset;
    private int pktDataLen;
    /* access modifiers changed from: private */
    public double pktDuration;
    /* access modifiers changed from: private */
    public ByteChannelPool pool;
    private double pts;

    /* renamed from: se */
    private AudioCodecMeta f44962se;
    private long size;

    public class WavPacket implements VirtualPacket {
        private int dataLen;
        private int frameNo;
        private long offset;
        private double pts;

        public WavPacket(int i, double d, long j, int i2) {
            this.frameNo = i;
            this.pts = d;
            this.offset = j;
            this.dataLen = i2;
        }

        public ByteBuffer getData() throws IOException {
            SeekableByteChannel seekableByteChannel = null;
            try {
                seekableByteChannel = WavTrack.this.pool.getChannel();
                seekableByteChannel.position(this.offset);
                ByteBuffer allocate = ByteBuffer.allocate(this.dataLen);
                NIOUtils.read((ReadableByteChannel) seekableByteChannel, allocate);
                allocate.flip();
                return allocate;
            } finally {
                seekableByteChannel.close();
            }
        }

        public int getDataLen() throws IOException {
            return this.dataLen;
        }

        public double getDuration() {
            return WavTrack.this.pktDuration;
        }

        public int getFrameNo() {
            return this.frameNo;
        }

        public double getPts() {
            return this.pts;
        }

        public boolean isKeyframe() {
            return true;
        }
    }

    public WavTrack(ByteChannelPool byteChannelPool, Label... labelArr) throws IOException {
        SeekableByteChannel seekableByteChannel;
        this.pool = byteChannelPool;
        try {
            seekableByteChannel = byteChannelPool.getChannel();
            try {
                this.header = WavHeader.read((ReadableByteChannel) seekableByteChannel);
                this.size = this.header.dataSize <= 0 ? seekableByteChannel.size() : this.header.dataSize;
                seekableByteChannel.close();
                ByteBuffer allocate = ByteBuffer.allocate(0);
                FmtChunk fmtChunk = this.header.fmt;
                AudioFormat audioFormat = new AudioFormat(fmtChunk.sampleRate, fmtChunk.bitsPerSample >> 3, fmtChunk.numChannels, true, false);
                AudioCodecMeta audioCodecMeta = new AudioCodecMeta("sowt", allocate, audioFormat, true, labelArr);
                this.f44962se = audioCodecMeta;
                WavHeader wavHeader = this.header;
                FmtChunk fmtChunk2 = wavHeader.fmt;
                this.pktDataLen = fmtChunk2.numChannels * 1024 * (fmtChunk2.bitsPerSample >> 3);
                double d = (double) fmtChunk2.sampleRate;
                Double.isNaN(d);
                this.pktDuration = 1024.0d / d;
                this.offset = (long) wavHeader.dataOffset;
                this.pts = 0.0d;
                this.frameNo = 0;
            } catch (Throwable th) {
                th = th;
                seekableByteChannel.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            seekableByteChannel = null;
            seekableByteChannel.close();
            throw th;
        }
    }

    public void close() throws IOException {
        this.pool.close();
    }

    public CodecMeta getCodecMeta() {
        return this.f44962se;
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    public int getPreferredTimescale() {
        return this.header.fmt.sampleRate;
    }

    public VirtualPacket nextPacket() throws IOException {
        long j = this.offset;
        long j2 = this.size;
        if (j >= j2) {
            return null;
        }
        WavPacket wavPacket = new WavPacket(this.frameNo, this.pts, j, (int) Math.min(j2 - j, (long) this.pktDataLen));
        this.offset += (long) this.pktDataLen;
        this.frameNo += 1024;
        double d = (double) this.frameNo;
        double d2 = (double) this.header.fmt.sampleRate;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.pts = d / d2;
        return wavPacket;
    }
}
