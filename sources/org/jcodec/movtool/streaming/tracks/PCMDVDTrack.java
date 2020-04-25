package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.codecs.pcmdvd.PCMDVDDecoder;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.model.AudioBuffer;
import org.jcodec.containers.mp4.boxes.channel.Label;
import org.jcodec.containers.mp4.muxer.MP4Muxer;
import org.jcodec.movtool.streaming.AudioCodecMeta;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class PCMDVDTrack implements VirtualTrack {
    /* access modifiers changed from: private */
    public PCMDVDDecoder decoder = new PCMDVDDecoder();
    /* access modifiers changed from: private */
    public AudioFormat format;
    /* access modifiers changed from: private */
    public int nFrames;
    private VirtualPacket prevPkt;
    private VirtualTrack src;

    /* renamed from: org.jcodec.movtool.streaming.tracks.PCMDVDTrack$a */
    private class C15582a extends VirtualPacketWrapper {
        public C15582a(VirtualPacket virtualPacket) {
            super(virtualPacket);
        }

        public ByteBuffer getData() throws IOException {
            ByteBuffer data = super.getData();
            return PCMDVDTrack.this.decoder.decodeFrame(data, data).getData();
        }

        public int getDataLen() throws IOException {
            return (PCMDVDTrack.this.nFrames * PCMDVDTrack.this.format.getChannels()) << 1;
        }
    }

    public PCMDVDTrack(VirtualTrack virtualTrack) throws IOException {
        this.src = virtualTrack;
        this.prevPkt = virtualTrack.nextPacket();
        VirtualPacket virtualPacket = this.prevPkt;
        if (virtualPacket != null) {
            AudioBuffer decodeFrame = this.decoder.decodeFrame(virtualPacket.getData(), ByteBuffer.allocate(this.prevPkt.getData().remaining()));
            this.format = decodeFrame.getFormat();
            this.nFrames = decodeFrame.getNFrames();
        }
    }

    public void close() throws IOException {
        this.src.close();
    }

    public CodecMeta getCodecMeta() {
        AudioCodecMeta audioCodecMeta = new AudioCodecMeta(MP4Muxer.lookupFourcc(this.format), ByteBuffer.allocate(0), this.format, true, new Label[]{Label.Left, Label.Right});
        return audioCodecMeta;
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    public int getPreferredTimescale() {
        return this.format.getSampleRate();
    }

    public VirtualPacket nextPacket() throws IOException {
        VirtualPacket virtualPacket = this.prevPkt;
        if (virtualPacket == null) {
            return null;
        }
        this.prevPkt = this.src.nextPacket();
        return new C15582a(virtualPacket);
    }
}
