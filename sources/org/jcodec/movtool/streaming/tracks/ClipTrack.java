package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class ClipTrack implements VirtualTrack {
    private boolean eof;
    private int from;
    private List<VirtualPacket> gop;
    private VirtualTrack src;
    /* access modifiers changed from: private */
    public int startFrame;
    /* access modifiers changed from: private */
    public double startPts;

    /* renamed from: to */
    private int f44919to;

    public class ClipPacket extends VirtualPacketWrapper {
        public ClipPacket(VirtualPacket virtualPacket) {
            super(virtualPacket);
        }

        public int getFrameNo() {
            return super.getFrameNo() - ClipTrack.this.startFrame;
        }

        public double getPts() {
            return super.getPts() - ClipTrack.this.startPts;
        }
    }

    public ClipTrack(VirtualTrack virtualTrack, int i, int i2) {
        if (i2 > i) {
            this.src = virtualTrack;
            this.from = i;
            this.f44919to = i2;
            return;
        }
        throw new IllegalArgumentException("Clipping negative or zero frames.");
    }

    public void close() throws IOException {
        this.src.close();
    }

    public CodecMeta getCodecMeta() {
        return this.src.getCodecMeta();
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    /* access modifiers changed from: protected */
    public List<VirtualPacket> getGop(VirtualTrack virtualTrack, int i) throws IOException {
        VirtualPacket nextPacket;
        ArrayList arrayList = new ArrayList();
        do {
            nextPacket = virtualTrack.nextPacket();
            if (nextPacket != null) {
                if (nextPacket.isKeyframe()) {
                    arrayList.clear();
                }
                arrayList.add(nextPacket);
            }
            if (nextPacket == null) {
                break;
            }
        } while (nextPacket.getFrameNo() < i);
        return arrayList;
    }

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        if (this.eof) {
            return null;
        }
        if (this.gop == null) {
            this.gop = getGop(this.src, this.from);
            this.startPts = ((VirtualPacket) this.gop.get(0)).getPts();
            this.startFrame = ((VirtualPacket) this.gop.get(0)).getFrameNo();
        }
        VirtualPacket nextPacket = this.gop.size() > 0 ? (VirtualPacket) this.gop.remove(0) : this.src.nextPacket();
        if (nextPacket != null && nextPacket.getFrameNo() < this.f44919to) {
            return new ClipPacket(nextPacket);
        }
        this.eof = true;
        return null;
    }
}
