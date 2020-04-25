package org.jcodec.movtool.streaming;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Comparator;

public interface VirtualPacket {
    public static final Comparator<? super VirtualPacket> byPts = new C15577a();

    /* renamed from: org.jcodec.movtool.streaming.VirtualPacket$a */
    static class C15577a implements Comparator<VirtualPacket> {
        C15577a() {
        }

        /* renamed from: a */
        public int compare(VirtualPacket virtualPacket, VirtualPacket virtualPacket2) {
            int i = 0;
            if (virtualPacket == null && virtualPacket2 == null) {
                return 0;
            }
            if (virtualPacket == null) {
                return -1;
            }
            if (virtualPacket2 == null) {
                return 1;
            }
            if (virtualPacket.getPts() < virtualPacket2.getPts()) {
                i = -1;
            } else if (virtualPacket.getPts() != virtualPacket2.getPts()) {
                i = 1;
            }
            return i;
        }
    }

    ByteBuffer getData() throws IOException;

    int getDataLen() throws IOException;

    double getDuration();

    int getFrameNo();

    double getPts();

    boolean isKeyframe();
}
