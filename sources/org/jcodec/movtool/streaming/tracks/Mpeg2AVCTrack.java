package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jcodec.codecs.h264.H264Encoder;
import org.jcodec.codecs.h264.encode.H264FixedRateControl;
import org.jcodec.codecs.mpeg12.MPEGDecoder;
import org.jcodec.codecs.mpeg12.MPEGUtil;
import org.jcodec.codecs.mpeg12.bitstream.PictureHeader;
import org.jcodec.common.model.Size;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class Mpeg2AVCTrack implements VirtualTrack {
    public static final int TARGET_RATE = 1024;
    /* access modifiers changed from: private */
    public int frameSize;
    private C15580a gop;
    int mbH;
    int mbW;
    private VirtualPacket nextPacket;
    private C15580a prevGop;
    int scaleFactor;

    /* renamed from: se */
    private CodecMeta f44925se;
    protected VirtualTrack src;
    int thumbHeight;
    int thumbWidth;
    /* access modifiers changed from: private */
    public ThreadLocal<MPEGToAVCTranscoder> transcoders = new ThreadLocal<>();

    /* renamed from: org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a */
    private class C15580a {

        /* renamed from: a */
        private List<VirtualPacket> f44926a = new ArrayList();

        /* renamed from: b */
        private ByteBuffer[] f44927b;

        /* renamed from: c */
        private int f44928c;

        /* renamed from: d */
        private C15580a f44929d;

        /* renamed from: e */
        private C15580a f44930e;

        /* renamed from: f */
        private List<ByteBuffer> f44931f;

        public C15580a(int i, C15580a aVar) {
            this.f44928c = i;
            this.f44930e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void m68701b() throws java.io.IOException {
            /*
                r15 = this;
                r1 = r15
                monitor-enter(r15)
                java.nio.ByteBuffer[] r0 = r1.f44927b     // Catch:{ all -> 0x0112 }
                if (r0 == 0) goto L_0x0008
                monitor-exit(r15)
                return
            L_0x0008:
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r0 = r1.f44926a     // Catch:{ all -> 0x0112 }
                int r0 = r0.size()     // Catch:{ all -> 0x0112 }
                java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]     // Catch:{ all -> 0x0112 }
                r1.f44927b = r0     // Catch:{ all -> 0x0112 }
                r2 = 0
                r3 = 0
            L_0x0014:
                r0 = 2
                if (r3 >= r0) goto L_0x0110
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack r4 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.this     // Catch:{ all -> 0x00ee }
                java.lang.ThreadLocal r4 = r4.transcoders     // Catch:{ all -> 0x00ee }
                java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.tracks.MPEGToAVCTranscoder r4 = (org.jcodec.movtool.streaming.tracks.MPEGToAVCTranscoder) r4     // Catch:{ all -> 0x00ee }
                if (r4 != 0) goto L_0x0038
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack r4 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.this     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack r5 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.this     // Catch:{ all -> 0x00ee }
                int r5 = r5.scaleFactor     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.tracks.MPEGToAVCTranscoder r4 = r4.createTranscoder(r5)     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack r5 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.this     // Catch:{ all -> 0x00ee }
                java.lang.ThreadLocal r5 = r5.transcoders     // Catch:{ all -> 0x00ee }
                r5.set(r4)     // Catch:{ all -> 0x00ee }
            L_0x0038:
                r15.m68699a()     // Catch:{ all -> 0x00ee }
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r5 = r1.f44926a     // Catch:{ all -> 0x00ee }
                double[] r5 = r15.m68700a(r5)     // Catch:{ all -> 0x00ee }
                r6 = 0
                r7 = 0
            L_0x0043:
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r8 = r1.f44926a     // Catch:{ all -> 0x00ee }
                int r8 = r8.size()     // Catch:{ all -> 0x00ee }
                r9 = 3
                if (r6 >= r8) goto L_0x008a
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r8 = r1.f44926a     // Catch:{ all -> 0x00ee }
                java.lang.Object r8 = r8.get(r6)     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.VirtualPacket r8 = (org.jcodec.movtool.streaming.VirtualPacket) r8     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r11 = r8.getData()     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r12 = r11.duplicate()     // Catch:{ all -> 0x00ee }
                int r12 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.getPicType(r12)     // Catch:{ all -> 0x00ee }
                if (r12 == r9) goto L_0x0065
                int r7 = r7 + 1
                goto L_0x0068
            L_0x0065:
                if (r7 >= r0) goto L_0x0068
                goto L_0x0087
            L_0x0068:
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack r9 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.this     // Catch:{ all -> 0x00ee }
                int r9 = r9.frameSize     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer[] r12 = r1.f44927b     // Catch:{ all -> 0x00ee }
                if (r6 != 0) goto L_0x0078
                r10 = 1
                goto L_0x0079
            L_0x0078:
                r10 = 0
            L_0x0079:
                double r13 = r8.getPts()     // Catch:{ all -> 0x00ee }
                int r8 = java.util.Arrays.binarySearch(r5, r13)     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r8 = r4.transcodeFrame(r11, r9, r10, r8)     // Catch:{ all -> 0x00ee }
                r12[r6] = r8     // Catch:{ all -> 0x00ee }
            L_0x0087:
                int r6 = r6 + 1
                goto L_0x0043
            L_0x008a:
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a r5 = r1.f44929d     // Catch:{ all -> 0x00ee }
                if (r5 == 0) goto L_0x0110
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a r5 = r1.f44929d     // Catch:{ all -> 0x00ee }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00ee }
                r6.<init>()     // Catch:{ all -> 0x00ee }
                r5.f44931f = r6     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a r5 = r1.f44929d     // Catch:{ all -> 0x00ee }
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r5 = r5.f44926a     // Catch:{ all -> 0x00ee }
                double[] r5 = r15.m68700a(r5)     // Catch:{ all -> 0x00ee }
                r6 = 0
                r7 = 0
            L_0x00a1:
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a r8 = r1.f44929d     // Catch:{ all -> 0x00ee }
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r8 = r8.f44926a     // Catch:{ all -> 0x00ee }
                int r8 = r8.size()     // Catch:{ all -> 0x00ee }
                if (r6 >= r8) goto L_0x0110
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a r8 = r1.f44929d     // Catch:{ all -> 0x00ee }
                java.util.List<org.jcodec.movtool.streaming.VirtualPacket> r8 = r8.f44926a     // Catch:{ all -> 0x00ee }
                java.lang.Object r8 = r8.get(r6)     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.VirtualPacket r8 = (org.jcodec.movtool.streaming.VirtualPacket) r8     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r11 = r8.getData()     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r12 = r11.duplicate()     // Catch:{ all -> 0x00ee }
                int r12 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.getPicType(r12)     // Catch:{ all -> 0x00ee }
                if (r12 == r9) goto L_0x00c5
                int r7 = r7 + 1
            L_0x00c5:
                if (r7 < r0) goto L_0x00c8
                goto L_0x0110
            L_0x00c8:
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack r12 = org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.this     // Catch:{ all -> 0x00ee }
                int r12 = r12.frameSize     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)     // Catch:{ all -> 0x00ee }
                org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$a r13 = r1.f44929d     // Catch:{ all -> 0x00ee }
                java.util.List<java.nio.ByteBuffer> r13 = r13.f44931f     // Catch:{ all -> 0x00ee }
                if (r6 != 0) goto L_0x00da
                r14 = 1
                goto L_0x00db
            L_0x00da:
                r14 = 0
            L_0x00db:
                double r9 = r8.getPts()     // Catch:{ all -> 0x00ee }
                int r8 = java.util.Arrays.binarySearch(r5, r9)     // Catch:{ all -> 0x00ee }
                java.nio.ByteBuffer r8 = r4.transcodeFrame(r11, r12, r14, r8)     // Catch:{ all -> 0x00ee }
                r13.add(r8)     // Catch:{ all -> 0x00ee }
                int r6 = r6 + 1
                r9 = 3
                goto L_0x00a1
            L_0x00ee:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
                r4.<init>()     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = "Error transcoding gop: "
                r4.append(r5)     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0112 }
                r4.append(r0)     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = ", retrying."
                r4.append(r0)     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0112 }
                org.jcodec.common.logging.Logger.error(r0)     // Catch:{ all -> 0x0112 }
                int r3 = r3 + 1
                goto L_0x0014
            L_0x0110:
                monitor-exit(r15)
                return
            L_0x0112:
                r0 = move-exception
                monitor-exit(r15)
                goto L_0x0116
            L_0x0115:
                throw r0
            L_0x0116:
                goto L_0x0115
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack.C15580a.m68701b():void");
        }

        /* renamed from: a */
        public void mo49504a(C15580a aVar) {
            this.f44929d = aVar;
        }

        /* renamed from: a */
        public VirtualPacket mo49503a(VirtualPacket virtualPacket) {
            this.f44926a.add(virtualPacket);
            return new C15581b(virtualPacket, this, this.f44926a.size() - 1);
        }

        /* renamed from: a */
        private double[] m68700a(List<VirtualPacket> list) {
            double[] dArr = new double[list.size()];
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = ((VirtualPacket) list.get(i)).getPts();
            }
            Arrays.sort(dArr);
            return dArr;
        }

        /* renamed from: a */
        private synchronized void m68699a() {
            if (this.f44931f != null) {
                for (int i = 0; i < this.f44931f.size(); i++) {
                    this.f44927b[i] = (ByteBuffer) this.f44931f.get(i);
                }
            }
        }

        /* renamed from: a */
        public ByteBuffer mo49502a(int i) throws IOException {
            m68701b();
            if (this.f44927b[i] == null) {
                C15580a aVar = this.f44930e;
                if (aVar != null) {
                    aVar.m68701b();
                    m68699a();
                }
            }
            return this.f44927b[i];
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.Mpeg2AVCTrack$b */
    private class C15581b extends VirtualPacketWrapper {

        /* renamed from: a */
        private C15580a f44933a;

        /* renamed from: b */
        private int f44934b;

        public C15581b(VirtualPacket virtualPacket, C15580a aVar, int i) {
            super(virtualPacket);
            this.f44933a = aVar;
            this.f44934b = i;
        }

        public ByteBuffer getData() throws IOException {
            return this.f44933a.mo49502a(this.f44934b);
        }

        public int getDataLen() {
            return Mpeg2AVCTrack.this.frameSize;
        }
    }

    public Mpeg2AVCTrack(VirtualTrack virtualTrack) throws IOException {
        checkFourCC(virtualTrack);
        this.src = virtualTrack;
        H264FixedRateControl h264FixedRateControl = new H264FixedRateControl(1024);
        H264Encoder h264Encoder = new H264Encoder(h264FixedRateControl);
        this.nextPacket = virtualTrack.nextPacket();
        Size size = MPEGDecoder.getSize(this.nextPacket.getData());
        this.scaleFactor = selectScaleFactor(size);
        this.thumbWidth = size.getWidth() >> this.scaleFactor;
        this.thumbHeight = (size.getHeight() >> this.scaleFactor) & -2;
        int i = this.thumbWidth;
        this.mbW = (i + 15) >> 4;
        int i2 = this.thumbHeight;
        this.mbH = (i2 + 15) >> 4;
        this.f44925se = Transcode2AVCTrack.createCodecMeta(virtualTrack, h264Encoder, i, i2);
        this.frameSize = h264FixedRateControl.calcFrameSize(this.mbW * this.mbH);
        int i3 = this.frameSize;
        this.frameSize = i3 + (i3 >> 4);
    }

    public static int getPicType(ByteBuffer byteBuffer) {
        ByteBuffer nextSegment;
        do {
            nextSegment = MPEGUtil.nextSegment(byteBuffer);
            if (nextSegment == null) {
                return -1;
            }
        } while ((nextSegment.getInt() & 255) != 0);
        return PictureHeader.read(nextSegment).picture_coding_type;
    }

    /* access modifiers changed from: protected */
    public void checkFourCC(VirtualTrack virtualTrack) {
        if (!"m2v1".equals(virtualTrack.getCodecMeta().getFourcc())) {
            throw new IllegalArgumentException("Input track is not ProRes");
        }
    }

    public void close() throws IOException {
        this.src.close();
    }

    /* access modifiers changed from: protected */
    public MPEGToAVCTranscoder createTranscoder(int i) {
        return new MPEGToAVCTranscoder(i);
    }

    public CodecMeta getCodecMeta() {
        return this.f44925se;
    }

    public VirtualEdit[] getEdits() {
        return this.src.getEdits();
    }

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        VirtualPacket virtualPacket = this.nextPacket;
        if (virtualPacket == null) {
            return null;
        }
        if (virtualPacket.isKeyframe()) {
            this.prevGop = this.gop;
            this.gop = new C15580a(this.nextPacket.getFrameNo(), this.prevGop);
            C15580a aVar = this.prevGop;
            if (aVar != null) {
                aVar.mo49504a(this.gop);
            }
        }
        VirtualPacket a = this.gop.mo49503a(this.nextPacket);
        this.nextPacket = this.src.nextPacket();
        return a;
    }

    /* access modifiers changed from: protected */
    public int selectScaleFactor(Size size) {
        if (size.getWidth() >= 960) {
            return 2;
        }
        return size.getWidth() > 480 ? 1 : 0;
    }
}
