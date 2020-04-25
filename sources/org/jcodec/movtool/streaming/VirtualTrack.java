package org.jcodec.movtool.streaming;

import java.io.IOException;

public interface VirtualTrack {

    public static class VirtualEdit {
        private double duration;

        /* renamed from: in */
        private double f44916in;

        public VirtualEdit(double d, double d2) {
            this.f44916in = d;
            this.duration = d2;
        }

        public double getDuration() {
            return this.duration;
        }

        public double getIn() {
            return this.f44916in;
        }
    }

    void close() throws IOException;

    CodecMeta getCodecMeta();

    VirtualEdit[] getEdits();

    int getPreferredTimescale();

    VirtualPacket nextPacket() throws IOException;
}
