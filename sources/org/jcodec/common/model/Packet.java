package org.jcodec.common.model;

import java.nio.ByteBuffer;
import java.util.Comparator;

public class Packet {
    public static final Comparator<Packet> FRAME_ASC = new C15544a();
    private ByteBuffer data;
    private int displayOrder;
    private long duration;
    /* access modifiers changed from: private */
    public long frameNo;
    private boolean keyFrame;
    private long pts;
    private TapeTimecode tapeTimecode;
    private long timescale;

    /* renamed from: org.jcodec.common.model.Packet$a */
    static class C15544a implements Comparator<Packet> {
        C15544a() {
        }

        /* renamed from: a */
        public int compare(Packet packet, Packet packet2) {
            int i = 0;
            if (packet == null && packet2 == null) {
                return 0;
            }
            if (packet == null) {
                return -1;
            }
            if (packet2 == null) {
                return 1;
            }
            if (packet.frameNo < packet2.frameNo) {
                i = -1;
            } else if (packet.frameNo != packet2.frameNo) {
                i = 1;
            }
            return i;
        }
    }

    public Packet(ByteBuffer byteBuffer, long j, long j2, long j3, long j4, boolean z, TapeTimecode tapeTimecode2) {
        this(byteBuffer, j, j2, j3, j4, z, tapeTimecode2, 0);
    }

    public ByteBuffer getData() {
        return this.data.duplicate();
    }

    public int getDisplayOrder() {
        return this.displayOrder;
    }

    public long getDuration() {
        return this.duration;
    }

    public double getDurationD() {
        double d = (double) this.duration;
        double d2 = (double) this.timescale;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public long getFrameNo() {
        return this.frameNo;
    }

    public long getPts() {
        return this.pts;
    }

    public double getPtsD() {
        double d = (double) this.pts;
        double d2 = (double) this.timescale;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public RationalLarge getPtsR() {
        return RationalLarge.m68667R(this.pts, this.timescale);
    }

    public TapeTimecode getTapeTimecode() {
        return this.tapeTimecode;
    }

    public long getTimescale() {
        return this.timescale;
    }

    public boolean isKeyFrame() {
        return this.keyFrame;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setDisplayOrder(int i) {
        this.displayOrder = i;
    }

    public void setTapeTimecode(TapeTimecode tapeTimecode2) {
        this.tapeTimecode = tapeTimecode2;
    }

    public void setTimescale(int i) {
        this.timescale = (long) i;
    }

    public Packet(Packet packet) {
        this(packet.data, packet.pts, packet.timescale, packet.duration, packet.frameNo, packet.keyFrame, packet.tapeTimecode);
        this.displayOrder = packet.displayOrder;
    }

    public Packet(Packet packet, ByteBuffer byteBuffer) {
        this(byteBuffer, packet.pts, packet.timescale, packet.duration, packet.frameNo, packet.keyFrame, packet.tapeTimecode);
        this.displayOrder = packet.displayOrder;
    }

    public Packet(Packet packet, TapeTimecode tapeTimecode2) {
        this(packet.data, packet.pts, packet.timescale, packet.duration, packet.frameNo, packet.keyFrame, tapeTimecode2);
        this.displayOrder = packet.displayOrder;
    }

    public Packet(ByteBuffer byteBuffer, long j, long j2, long j3, long j4, boolean z, TapeTimecode tapeTimecode2, int i) {
        this.data = byteBuffer;
        this.pts = j;
        this.timescale = j2;
        this.duration = j3;
        this.frameNo = j4;
        this.keyFrame = z;
        this.tapeTimecode = tapeTimecode2;
        this.displayOrder = i;
    }
}
