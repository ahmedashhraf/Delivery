package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.AudioFormat;
import org.jcodec.containers.mp4.boxes.EndianBox.Endian;
import org.jcodec.containers.mp4.boxes.channel.Label;
import org.jcodec.movtool.streaming.AudioCodecMeta;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class StereoDownmixTrack implements VirtualTrack {
    private static final int FRAMES_IN_OUT_PACKET = 20480;
    /* access modifiers changed from: private */
    public DownmixHelper downmix;
    private int frameNo;
    /* access modifiers changed from: private */
    public int rate = -1;
    private AudioCodecMeta[] sampleEntries;
    private boolean[][] solo;
    private VirtualTrack[] sources;

    protected class DownmixVirtualPacket implements VirtualPacket {
        private int frameNo;
        private VirtualPacket[] packets;

        public DownmixVirtualPacket(VirtualPacket[] virtualPacketArr, int i) {
            this.packets = virtualPacketArr;
            this.frameNo = i;
        }

        public ByteBuffer getData() throws IOException {
            ByteBuffer[] byteBufferArr = new ByteBuffer[this.packets.length];
            for (int i = 0; i < byteBufferArr.length; i++) {
                VirtualPacket[] virtualPacketArr = this.packets;
                byteBufferArr[i] = virtualPacketArr[i] == null ? null : virtualPacketArr[i].getData();
            }
            ByteBuffer allocate = ByteBuffer.allocate(81920);
            StereoDownmixTrack.this.downmix.downmix(byteBufferArr, allocate);
            return allocate;
        }

        public int getDataLen() {
            return 81920;
        }

        public double getDuration() {
            double access$100 = (double) StereoDownmixTrack.this.rate;
            Double.isNaN(access$100);
            return 20480.0d / access$100;
        }

        public int getFrameNo() {
            return this.frameNo;
        }

        public double getPts() {
            double d = (double) this.frameNo;
            double access$100 = (double) StereoDownmixTrack.this.rate;
            Double.isNaN(d);
            Double.isNaN(access$100);
            return d / access$100;
        }

        public boolean isKeyframe() {
            return true;
        }
    }

    public StereoDownmixTrack(VirtualTrack... virtualTrackArr) {
        this.sources = new VirtualTrack[virtualTrackArr.length];
        this.sampleEntries = new AudioCodecMeta[this.sources.length];
        this.solo = new boolean[virtualTrackArr.length][];
        int i = 0;
        while (i < virtualTrackArr.length) {
            CodecMeta codecMeta = virtualTrackArr[i].getCodecMeta();
            if (codecMeta instanceof AudioCodecMeta) {
                AudioCodecMeta audioCodecMeta = (AudioCodecMeta) codecMeta;
                if (audioCodecMeta.isPCM()) {
                    AudioFormat format = audioCodecMeta.getFormat();
                    int i2 = this.rate;
                    if (i2 == -1 || i2 == format.getFrameRate()) {
                        this.rate = format.getFrameRate();
                        this.sampleEntries[i] = audioCodecMeta;
                        this.sources[i] = new PCMFlatternTrack(virtualTrackArr[i], FRAMES_IN_OUT_PACKET);
                        this.solo[i] = new boolean[format.getChannels()];
                        i++;
                    } else {
                        throw new IllegalArgumentException("Can not downmix tracks of different rate.");
                    }
                } else {
                    throw new IllegalArgumentException("Non PCM audio track.");
                }
            } else {
                throw new IllegalArgumentException("Non audio track");
            }
        }
        this.downmix = new DownmixHelper(this.sampleEntries, FRAMES_IN_OUT_PACKET, null);
    }

    public boolean[][] bulkGetSolo() {
        return this.solo;
    }

    public void bulkSetSolo(boolean[][] zArr) {
        this.solo = zArr;
        this.downmix = new DownmixHelper(this.sampleEntries, FRAMES_IN_OUT_PACKET, zArr);
    }

    public void close() throws IOException {
        for (VirtualTrack close : this.sources) {
            close.close();
        }
    }

    public CodecMeta getCodecMeta() {
        AudioCodecMeta audioCodecMeta = new AudioCodecMeta("sowt", 2, 2, this.rate, Endian.LITTLE_ENDIAN, true, new Label[]{Label.Left, Label.Right}, null);
        return audioCodecMeta;
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    public int getPreferredTimescale() {
        return this.rate;
    }

    public boolean isChannelMute(int i, int i2) {
        return this.solo[i][i2];
    }

    public void muteAll() {
        for (int i = 0; i < this.solo.length; i++) {
            int i2 = 0;
            while (true) {
                boolean[][] zArr = this.solo;
                if (i2 >= zArr[i].length) {
                    break;
                }
                zArr[i][i2] = false;
                i2++;
            }
        }
    }

    public VirtualPacket nextPacket() throws IOException {
        VirtualPacket[] virtualPacketArr = new VirtualPacket[this.sources.length];
        boolean z = true;
        for (int i = 0; i < virtualPacketArr.length; i++) {
            virtualPacketArr[i] = this.sources[i].nextPacket();
            z &= virtualPacketArr[i] == null;
        }
        if (z) {
            return null;
        }
        DownmixVirtualPacket downmixVirtualPacket = new DownmixVirtualPacket(virtualPacketArr, this.frameNo);
        this.frameNo += FRAMES_IN_OUT_PACKET;
        return downmixVirtualPacket;
    }

    public void soloAll() {
        for (int i = 0; i < this.solo.length; i++) {
            int i2 = 0;
            while (true) {
                boolean[][] zArr = this.solo;
                if (i2 >= zArr[i].length) {
                    break;
                }
                zArr[i][i2] = true;
                i2++;
            }
        }
    }

    public void soloChannel(int i, int i2, boolean z) {
        boolean[][] zArr = this.solo;
        zArr[i][i2] = z;
        this.downmix = new DownmixHelper(this.sampleEntries, FRAMES_IN_OUT_PACKET, zArr);
    }

    public void soloTrack(int i, boolean z) {
        int i2 = 0;
        while (true) {
            boolean[][] zArr = this.solo;
            if (i2 < zArr[i].length) {
                zArr[i][i2] = z;
                i2++;
            } else {
                this.downmix = new DownmixHelper(this.sampleEntries, FRAMES_IN_OUT_PACKET, zArr);
                return;
            }
        }
    }
}
