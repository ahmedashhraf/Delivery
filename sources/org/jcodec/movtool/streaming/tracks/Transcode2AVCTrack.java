package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.jcodec.codecs.h264.H264Encoder;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.codecs.h264.encode.H264FixedRateControl;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;
import org.jcodec.common.model.Size;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;

public abstract class Transcode2AVCTrack implements VirtualTrack {
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
    private CodecMeta f44945se;
    protected VirtualTrack src;
    /* access modifiers changed from: private */
    public int thumbHeight;
    /* access modifiers changed from: private */
    public int thumbWidth;
    /* access modifiers changed from: private */
    public ThreadLocal<C15587b> transcoders = new ThreadLocal<>();

    /* renamed from: org.jcodec.movtool.streaming.tracks.Transcode2AVCTrack$a */
    private class C15586a extends VirtualPacketWrapper {
        public C15586a(VirtualPacket virtualPacket) {
            super(virtualPacket);
        }

        public ByteBuffer getData() throws IOException {
            C15587b bVar = (C15587b) Transcode2AVCTrack.this.transcoders.get();
            if (bVar == null) {
                bVar = new C15587b();
                Transcode2AVCTrack.this.transcoders.set(bVar);
            }
            return bVar.mo49518a(this.src.getData(), ByteBuffer.allocate(Transcode2AVCTrack.this.frameSize));
        }

        public int getDataLen() {
            return Transcode2AVCTrack.this.frameSize;
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.Transcode2AVCTrack$b */
    class C15587b {

        /* renamed from: a */
        private VideoDecoder f44947a;

        /* renamed from: b */
        private H264Encoder f44948b;

        /* renamed from: c */
        private Picture f44949c;

        /* renamed from: d */
        private Picture f44950d;

        /* renamed from: e */
        private Transform f44951e;

        /* renamed from: f */
        private H264FixedRateControl f44952f = new H264FixedRateControl(1024);

        public C15587b() {
            this.f44947a = Transcode2AVCTrack.this.getDecoder(Transcode2AVCTrack.this.scaleFactor);
            this.f44948b = new H264Encoder(this.f44952f);
            this.f44949c = Picture.create(Transcode2AVCTrack.this.mbW << 4, (Transcode2AVCTrack.this.mbH + 1) << 4, ColorSpace.YUV444);
        }

        /* renamed from: a */
        public ByteBuffer mo49518a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws IOException {
            if (byteBuffer == null) {
                return null;
            }
            Picture decodeFrame = this.f44947a.decodeFrame(byteBuffer, this.f44949c.getData());
            if (this.f44950d == null) {
                this.f44950d = Picture.create(decodeFrame.getWidth(), decodeFrame.getHeight(), this.f44948b.getSupportedColorSpaces()[0]);
                this.f44951e = ColorUtil.getTransform(decodeFrame.getColor(), this.f44948b.getSupportedColorSpaces()[0]);
            }
            this.f44951e.transform(decodeFrame, this.f44950d);
            this.f44950d.setCrop(new Rect(0, 0, Transcode2AVCTrack.this.thumbWidth, Transcode2AVCTrack.this.thumbHeight));
            int i = 1024;
            do {
                try {
                    this.f44948b.encodeFrame(this.f44950d, byteBuffer2);
                    break;
                } catch (BufferOverflowException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Abandon frame, buffer too small: ");
                    sb.append(byteBuffer2.capacity());
                    Logger.warn(sb.toString());
                    i -= 10;
                    this.f44952f.setRate(i);
                    if (i <= 10) {
                    }
                }
            } while (i <= 10);
            this.f44952f.setRate(1024);
            H264Utils.encodeMOVPacket(byteBuffer2);
            return byteBuffer2;
        }
    }

    public Transcode2AVCTrack(VirtualTrack virtualTrack, Size size) {
        checkFourCC(virtualTrack);
        this.src = virtualTrack;
        H264FixedRateControl h264FixedRateControl = new H264FixedRateControl(1024);
        H264Encoder h264Encoder = new H264Encoder(h264FixedRateControl);
        this.scaleFactor = selectScaleFactor(size);
        this.thumbWidth = size.getWidth() >> this.scaleFactor;
        this.thumbHeight = (size.getHeight() >> this.scaleFactor) & -2;
        int i = this.thumbWidth;
        this.mbW = (i + 15) >> 4;
        int i2 = this.thumbHeight;
        this.mbH = (i2 + 15) >> 4;
        this.f44945se = createCodecMeta(virtualTrack, h264Encoder, i, i2);
        this.frameSize = h264FixedRateControl.calcFrameSize(this.mbW * this.mbH);
        int i3 = this.frameSize;
        this.frameSize = i3 + (i3 >> 4);
    }

    public static VideoCodecMeta createCodecMeta(VirtualTrack virtualTrack, H264Encoder h264Encoder, int i, int i2) {
        return new VideoCodecMeta("avc1", H264Utils.getAvcCData(H264Utils.createAvcC(h264Encoder.initSPS(new Size(i, i2)), h264Encoder.initPPS(), 4)), new Size(i, i2), ((VideoCodecMeta) virtualTrack.getCodecMeta()).getPasp());
    }

    /* access modifiers changed from: protected */
    public abstract void checkFourCC(VirtualTrack virtualTrack);

    public void close() throws IOException {
        this.src.close();
    }

    public CodecMeta getCodecMeta() {
        return this.f44945se;
    }

    /* access modifiers changed from: protected */
    public abstract VideoDecoder getDecoder(int i);

    public VirtualEdit[] getEdits() {
        return this.src.getEdits();
    }

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        VirtualPacket nextPacket = this.src.nextPacket();
        if (nextPacket == null) {
            return null;
        }
        return new C15586a(nextPacket);
    }

    /* access modifiers changed from: protected */
    public abstract int selectScaleFactor(Size size);
}
