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

public class EditedPCMTrack implements VirtualTrack {
    private List<VirtualPacket>[] buckets = new List[this.edits.length];
    private int curEdit;
    private int curPkt;
    private VirtualEdit[] edits;
    private int frameNo;
    private int frameSize;
    private double pts;
    private float sampleRate;
    private VirtualTrack src;

    public static class EditedPCMPacket implements VirtualPacket {
        private int dataLen;
        private double duration;
        private int frameNo;
        private int inBytes;
        private double pts;
        private VirtualPacket src;

        public EditedPCMPacket(VirtualPacket virtualPacket, int i, int i2, double d, double d2, int i3) {
            this.src = virtualPacket;
            this.inBytes = i;
            this.dataLen = i2;
            this.pts = d;
            this.duration = d2;
            this.frameNo = i3;
        }

        public ByteBuffer getData() throws IOException {
            ByteBuffer data = this.src.getData();
            NIOUtils.skip(data, this.inBytes);
            return NIOUtils.read(data, this.dataLen);
        }

        public int getDataLen() {
            return this.dataLen;
        }

        public double getDuration() {
            return this.duration;
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

    public EditedPCMTrack(VirtualTrack virtualTrack) throws IOException {
        this.src = virtualTrack;
        this.edits = virtualTrack.getEdits();
        for (int i = 0; i < this.edits.length; i++) {
            this.buckets[i] = new ArrayList();
        }
        while (true) {
            VirtualPacket nextPacket = virtualTrack.nextPacket();
            if (nextPacket != null) {
                int i2 = 0;
                while (true) {
                    VirtualEdit[] virtualEditArr = this.edits;
                    if (i2 < virtualEditArr.length) {
                        VirtualEdit virtualEdit = virtualEditArr[i2];
                        if (nextPacket.getPts() < virtualEdit.getIn() + virtualEdit.getDuration() && nextPacket.getPts() + nextPacket.getDuration() > virtualEdit.getIn()) {
                            this.buckets[i2].add(nextPacket);
                        }
                        i2++;
                    }
                }
            } else {
                AudioCodecMeta audioCodecMeta = (AudioCodecMeta) virtualTrack.getCodecMeta();
                this.frameSize = audioCodecMeta.getFrameSize();
                this.sampleRate = (float) audioCodecMeta.getSampleRate();
                return;
            }
        }
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

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        int i = this.curEdit;
        if (i >= this.edits.length) {
            return null;
        }
        VirtualPacket virtualPacket = (VirtualPacket) this.buckets[i].get(this.curPkt);
        VirtualEdit virtualEdit = this.edits[this.curEdit];
        double max = Math.max(virtualPacket.getPts(), virtualEdit.getIn());
        double min = Math.min(virtualPacket.getPts() + virtualPacket.getDuration(), virtualEdit.getIn() + virtualEdit.getDuration()) - max;
        double pts2 = max - virtualPacket.getPts();
        double d = (double) this.sampleRate;
        Double.isNaN(d);
        int round = (int) (Math.round(pts2 * d) * ((long) this.frameSize));
        double d2 = (double) this.sampleRate;
        Double.isNaN(d2);
        EditedPCMPacket editedPCMPacket = new EditedPCMPacket(virtualPacket, round, (int) (Math.round(d2 * min) * ((long) this.frameSize)), this.pts, min, this.frameNo);
        this.curPkt++;
        if (this.curPkt >= this.buckets[this.curEdit].size()) {
            this.curEdit++;
            this.curPkt = 0;
        }
        this.frameNo++;
        this.pts += min;
        return editedPCMPacket;
    }
}
