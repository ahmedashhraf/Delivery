package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.NIOUtils;
import org.jcodec.movtool.streaming.AudioCodecMeta;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class PCMFlatternTrack implements VirtualTrack {
    private static final VirtualPacket[] EMPTY = new VirtualPacket[0];
    private int dataLen;
    private int frameNo;
    /* access modifiers changed from: private */
    public int framesPerPkt;
    private VirtualPacket leftover;
    private int leftoverOffset;
    /* access modifiers changed from: private */
    public double packetDur;
    private List<VirtualPacket> pktBuffer = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: se */
    public AudioCodecMeta f44937se;
    private VirtualTrack src;

    /* renamed from: org.jcodec.movtool.streaming.tracks.PCMFlatternTrack$a */
    private class C15583a implements VirtualPacket {

        /* renamed from: a */
        private int f44938a;

        /* renamed from: b */
        private int f44939b;

        /* renamed from: c */
        private VirtualPacket[] f44940c;

        /* renamed from: d */
        private int f44941d;

        public C15583a(int i, VirtualPacket[] virtualPacketArr, int i2, int i3) {
            this.f44938a = i;
            this.f44939b = i2;
            this.f44940c = virtualPacketArr;
            this.f44941d = i3;
        }

        public ByteBuffer getData() throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(this.f44941d);
            ByteBuffer data = this.f44940c[0].getData();
            NIOUtils.skip(data, this.f44939b);
            NIOUtils.write(allocate, data);
            for (int i = 1; i < this.f44940c.length && allocate.hasRemaining(); i++) {
                ByteBuffer data2 = this.f44940c[i].getData();
                NIOUtils.write(allocate, data2, Math.min(data2.remaining(), allocate.remaining()));
            }
            allocate.flip();
            return allocate;
        }

        public int getDataLen() {
            return this.f44941d;
        }

        public double getDuration() {
            return PCMFlatternTrack.this.packetDur;
        }

        public int getFrameNo() {
            return this.f44938a;
        }

        public double getPts() {
            double d = (double) this.f44938a;
            double access$000 = (double) PCMFlatternTrack.this.framesPerPkt;
            Double.isNaN(d);
            Double.isNaN(access$000);
            double d2 = d * access$000;
            double sampleRate = (double) PCMFlatternTrack.this.f44937se.getSampleRate();
            Double.isNaN(sampleRate);
            return d2 / sampleRate;
        }

        public boolean isKeyframe() {
            return true;
        }
    }

    public PCMFlatternTrack(VirtualTrack virtualTrack, int i) {
        this.framesPerPkt = i;
        this.src = virtualTrack;
        this.f44937se = (AudioCodecMeta) virtualTrack.getCodecMeta();
        int frameSize = this.f44937se.getFrameSize();
        int i2 = this.framesPerPkt;
        this.dataLen = frameSize * i2;
        double d = (double) i2;
        double sampleRate = (double) this.f44937se.getSampleRate();
        Double.isNaN(d);
        Double.isNaN(sampleRate);
        this.packetDur = d / sampleRate;
    }

    public void close() throws IOException {
        this.src.close();
    }

    public CodecMeta getCodecMeta() {
        return this.f44937se;
    }

    public VirtualEdit[] getEdits() {
        return this.src.getEdits();
    }

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        this.pktBuffer.clear();
        VirtualPacket virtualPacket = this.leftover;
        if (virtualPacket == null) {
            virtualPacket = this.src.nextPacket();
        }
        if (virtualPacket == null) {
            return null;
        }
        int i = this.dataLen + this.leftoverOffset;
        do {
            this.pktBuffer.add(virtualPacket);
            i -= virtualPacket.getDataLen();
            if (i > 0) {
                virtualPacket = this.src.nextPacket();
            }
            if (i <= 0) {
                break;
            }
        } while (virtualPacket != null);
        C15583a aVar = new C15583a(this.frameNo, (VirtualPacket[]) this.pktBuffer.toArray(EMPTY), this.leftoverOffset, this.dataLen - Math.max(i, 0));
        this.frameNo += this.framesPerPkt;
        if (i < 0) {
            List<VirtualPacket> list = this.pktBuffer;
            this.leftover = (VirtualPacket) list.get(list.size() - 1);
            this.leftoverOffset = this.leftover.getDataLen() + i;
        } else {
            this.leftover = null;
            this.leftoverOffset = 0;
        }
        return aVar;
    }
}
