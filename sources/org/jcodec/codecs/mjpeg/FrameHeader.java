package org.jcodec.codecs.mjpeg;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

public class FrameHeader {
    int bitsPerSample;
    Component[] components;
    int headerLength;
    int height;
    int nComp;
    int width;

    public static class Component {
        int index;
        int quantTable;
        int subH;
        int subV;
    }

    public static FrameHeader read(ByteBuffer byteBuffer) {
        FrameHeader frameHeader = new FrameHeader();
        frameHeader.headerLength = byteBuffer.getShort() & 65535;
        frameHeader.bitsPerSample = byteBuffer.get() & 255;
        frameHeader.height = byteBuffer.getShort() & 65535;
        frameHeader.width = byteBuffer.getShort() & 65535;
        frameHeader.nComp = byteBuffer.get() & 255;
        frameHeader.components = new Component[frameHeader.nComp];
        int i = 0;
        while (true) {
            Component[] componentArr = frameHeader.components;
            if (i >= componentArr.length) {
                return frameHeader;
            }
            Component component = new Component();
            componentArr[i] = component;
            component.index = byteBuffer.get() & 255;
            byte b = byteBuffer.get() & 255;
            component.subH = (b & 240) >>> 4;
            component.subV = b & C5785c.f16698q;
            component.quantTable = byteBuffer.get() & 255;
            i++;
        }
    }

    public int getHmax() {
        int i = 0;
        for (Component component : this.components) {
            i = Math.max(i, component.subH);
        }
        return i;
    }

    public int getVmax() {
        int i = 0;
        for (Component component : this.components) {
            i = Math.max(i, component.subV);
        }
        return i;
    }
}
