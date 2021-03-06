package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class J2KPictureDescriptor extends MXFInterchangeObject {
    private short csiz;
    private short rsiz;
    private int xOsiz;
    private int xTOsiz;
    private int xTsiz;
    private int xsiz;
    private int yOsiz;
    private int yTOsiz;
    private int yTsiz;
    private int ysiz;

    public J2KPictureDescriptor(C15568UL ul) {
        super(ul);
    }

    public short getCsiz() {
        return this.csiz;
    }

    public short getRsiz() {
        return this.rsiz;
    }

    public int getXsiz() {
        return this.xsiz;
    }

    public int getYsiz() {
        return this.ysiz;
    }

    public int getxOsiz() {
        return this.xOsiz;
    }

    public int getxTOsiz() {
        return this.xTOsiz;
    }

    public int getxTsiz() {
        return this.xTsiz;
    }

    public int getyOsiz() {
        return this.yOsiz;
    }

    public int getyTOsiz() {
        return this.yTOsiz;
    }

    public int getyTsiz() {
        return this.yTsiz;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 24836:
                    this.rsiz = byteBuffer.getShort();
                    break;
                case 24837:
                    this.xsiz = byteBuffer.getInt();
                    break;
                case 24838:
                    this.ysiz = byteBuffer.getInt();
                    break;
                case 24839:
                    this.xOsiz = byteBuffer.getInt();
                    break;
                case 24840:
                    this.yOsiz = byteBuffer.getInt();
                    break;
                case 24841:
                    this.xTsiz = byteBuffer.getInt();
                    break;
                case 24842:
                    this.yTsiz = byteBuffer.getInt();
                    break;
                case 24843:
                    this.xTOsiz = byteBuffer.getInt();
                    break;
                case 24844:
                    this.yTOsiz = byteBuffer.getInt();
                    break;
                case 24845:
                    this.csiz = byteBuffer.getShort();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown tag [ ");
                    sb.append(this.f44898ul);
                    sb.append("]: %04x");
                    Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
                    continue;
            }
            it.remove();
        }
    }
}
