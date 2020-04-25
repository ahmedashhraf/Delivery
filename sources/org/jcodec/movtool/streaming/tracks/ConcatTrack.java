package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class ConcatTrack implements VirtualTrack {
    private int idx = 0;
    private VirtualPacket lastPacket;
    private int offsetFn = 0;
    private double offsetPts = 0.0d;
    private VirtualTrack[] tracks;

    public ConcatTrack(VirtualTrack[] virtualTrackArr) {
        this.tracks = virtualTrackArr;
    }

    public void close() throws IOException {
        int i = 0;
        while (true) {
            VirtualTrack[] virtualTrackArr = this.tracks;
            if (i < virtualTrackArr.length) {
                virtualTrackArr[i].close();
                i++;
            } else {
                return;
            }
        }
    }

    public CodecMeta getCodecMeta() {
        return this.tracks[0].getCodecMeta();
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    public int getPreferredTimescale() {
        return this.tracks[0].getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        while (true) {
            int i = this.idx;
            VirtualTrack[] virtualTrackArr = this.tracks;
            if (i >= virtualTrackArr.length) {
                return null;
            }
            VirtualPacket nextPacket = virtualTrackArr[i].nextPacket();
            if (nextPacket == null) {
                this.idx++;
                this.offsetPts += this.lastPacket.getPts() + this.lastPacket.getDuration();
                this.offsetFn += this.lastPacket.getFrameNo() + 1;
            } else {
                this.lastPacket = nextPacket;
                return new ConcatPacket(nextPacket, this.offsetPts, this.offsetFn);
            }
        }
    }
}
