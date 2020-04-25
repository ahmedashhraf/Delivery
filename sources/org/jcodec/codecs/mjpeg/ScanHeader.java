package org.jcodec.codecs.mjpeg;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

public class ScanHeader {

    /* renamed from: ah */
    int f44752ah;

    /* renamed from: al */
    int f44753al;
    Component[] components;

    /* renamed from: ls */
    int f44754ls;

    /* renamed from: ns */
    int f44755ns;

    /* renamed from: se */
    int f44756se;

    /* renamed from: ss */
    int f44757ss;

    public static class Component {

        /* renamed from: cs */
        int f44758cs;

        /* renamed from: ta */
        int f44759ta;

        /* renamed from: td */
        int f44760td;
    }

    public static ScanHeader read(ByteBuffer byteBuffer) {
        ScanHeader scanHeader = new ScanHeader();
        scanHeader.f44754ls = byteBuffer.getShort() & 65535;
        scanHeader.f44755ns = byteBuffer.get() & 255;
        scanHeader.components = new Component[scanHeader.f44755ns];
        int i = 0;
        while (true) {
            Component[] componentArr = scanHeader.components;
            if (i < componentArr.length) {
                Component component = new Component();
                componentArr[i] = component;
                component.f44758cs = byteBuffer.get() & 255;
                byte b = byteBuffer.get() & 255;
                component.f44760td = (b & 240) >>> 4;
                component.f44759ta = b & C5785c.f16698q;
                i++;
            } else {
                scanHeader.f44757ss = byteBuffer.get() & 255;
                scanHeader.f44756se = byteBuffer.get() & 255;
                byte b2 = byteBuffer.get() & 255;
                scanHeader.f44752ah = (b2 & 240) >>> 4;
                scanHeader.f44753al = b2 & C5785c.f16698q;
                return scanHeader;
            }
        }
    }

    public boolean isInterleaved() {
        return this.f44755ns > 1;
    }
}
