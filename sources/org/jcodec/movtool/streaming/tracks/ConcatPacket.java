package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.movtool.streaming.VirtualPacket;

public class ConcatPacket implements VirtualPacket {
    private int fnOffset;
    private VirtualPacket packet;
    private double ptsOffset;

    public ConcatPacket(VirtualPacket virtualPacket, double d, int i) {
        this.packet = virtualPacket;
        this.ptsOffset = d;
        this.fnOffset = i;
    }

    public ByteBuffer getData() throws IOException {
        return this.packet.getData();
    }

    public int getDataLen() throws IOException {
        return this.packet.getDataLen();
    }

    public double getDuration() {
        return this.packet.getDuration();
    }

    public int getFrameNo() {
        return this.fnOffset + this.packet.getFrameNo();
    }

    public double getPts() {
        return this.ptsOffset + this.packet.getPts();
    }

    public boolean isKeyframe() {
        return this.packet.isKeyframe();
    }
}
