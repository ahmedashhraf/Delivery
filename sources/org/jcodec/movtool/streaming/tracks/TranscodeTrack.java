package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.VideoEncoder;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Rect;
import org.jcodec.common.model.Size;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;

public abstract class TranscodeTrack implements VirtualTrack {
    private static final int TARGET_RATE = 1024;
    /* access modifiers changed from: private */
    public int frameSize;
    /* access modifiers changed from: private */
    public int mbH;
    /* access modifiers changed from: private */
    public int mbW;
    /* access modifiers changed from: private */
    public int scaleFactor;

    /* renamed from: se */
    private CodecMeta f44954se;
    private VirtualTrack src;
    /* access modifiers changed from: private */
    public int thumbHeight;
    /* access modifiers changed from: private */
    public int thumbWidth;
    /* access modifiers changed from: private */
    public ThreadLocal<C15589b> transcoders = new ThreadLocal<>();

    /* renamed from: org.jcodec.movtool.streaming.tracks.TranscodeTrack$a */
    private class C15588a extends VirtualPacketWrapper {
        public C15588a(VirtualPacket virtualPacket) {
            super(virtualPacket);
        }

        public ByteBuffer getData() throws IOException {
            C15589b bVar = (C15589b) TranscodeTrack.this.transcoders.get();
            if (bVar == null) {
                bVar = new C15589b();
                TranscodeTrack.this.transcoders.set(bVar);
            }
            return bVar.mo49519a(this.src.getData(), ByteBuffer.allocate(TranscodeTrack.this.frameSize));
        }

        public int getDataLen() {
            return TranscodeTrack.this.frameSize;
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.TranscodeTrack$b */
    class C15589b {

        /* renamed from: a */
        private VideoDecoder f44956a;

        /* renamed from: b */
        private VideoEncoder[] f44957b = new VideoEncoder[3];

        /* renamed from: c */
        private Picture f44958c;

        /* renamed from: d */
        private Picture f44959d;

        /* renamed from: e */
        private Transform f44960e;

        public C15589b() {
            this.f44956a = TranscodeTrack.this.getDecoder(TranscodeTrack.this.scaleFactor);
            this.f44957b[0] = TranscodeTrack.this.getEncoder(1024);
            this.f44957b[1] = TranscodeTrack.this.getEncoder(921);
            this.f44957b[2] = TranscodeTrack.this.getEncoder(819);
            this.f44958c = Picture.create(TranscodeTrack.this.mbW << 4, TranscodeTrack.this.mbH << 4, ColorSpace.YUV444);
        }

        /* renamed from: a */
        public ByteBuffer mo49519a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            Picture decodeFrame = this.f44956a.decodeFrame(byteBuffer, this.f44958c.getData());
            if (this.f44959d == null) {
                this.f44959d = Picture.create(decodeFrame.getWidth(), decodeFrame.getHeight(), ColorSpace.YUV420);
                this.f44960e = ColorUtil.getTransform(decodeFrame.getColor(), ColorSpace.YUV420);
            }
            this.f44960e.transform(decodeFrame, this.f44959d);
            int i = 0;
            this.f44959d.setCrop(new Rect(0, 0, TranscodeTrack.this.thumbWidth, TranscodeTrack.this.thumbHeight));
            while (i < this.f44957b.length) {
                try {
                    byteBuffer2.clear();
                    this.f44957b[i].encodeFrame(this.f44959d, byteBuffer2);
                    break;
                } catch (BufferOverflowException unused) {
                    System.out.println("Abandon frame!!!");
                    i++;
                }
            }
            return byteBuffer2;
        }
    }

    public TranscodeTrack(VirtualTrack virtualTrack, Size size) {
        this.src = virtualTrack;
        this.scaleFactor = size.getWidth() >= 960 ? 2 : 1;
        this.thumbWidth = size.getWidth() >> this.scaleFactor;
        this.thumbHeight = (size.getHeight() >> this.scaleFactor) & -2;
        int i = this.thumbWidth;
        this.mbW = (i + 15) >> 4;
        int i2 = this.thumbHeight;
        this.mbH = (i2 + 15) >> 4;
        Size size2 = new Size(i, i2);
        Rational pasp = ((VideoCodecMeta) virtualTrack.getCodecMeta()).getPasp();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        getCodecPrivate(allocate, size2);
        this.f44954se = new VideoCodecMeta("avc1", allocate, size2, pasp);
        this.frameSize = getFrameSize(this.mbW * this.mbH, 1024);
        int i3 = this.frameSize;
        this.frameSize = i3 + (i3 >> 4);
    }

    public void close() throws IOException {
        this.src.close();
    }

    public CodecMeta getCodecMeta() {
        return this.f44954se;
    }

    /* access modifiers changed from: protected */
    public abstract void getCodecPrivate(ByteBuffer byteBuffer, Size size);

    /* access modifiers changed from: protected */
    public abstract VideoDecoder getDecoder(int i);

    public VirtualEdit[] getEdits() {
        return this.src.getEdits();
    }

    /* access modifiers changed from: protected */
    public abstract VideoEncoder getEncoder(int i);

    /* access modifiers changed from: protected */
    public abstract int getFrameSize(int i, int i2);

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        VirtualPacket nextPacket = this.src.nextPacket();
        if (nextPacket == null) {
            return null;
        }
        return new C15588a(nextPacket);
    }
}
