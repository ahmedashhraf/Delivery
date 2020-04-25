package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;
import p053b.p063d.p064b.C2108a;

public class MPEG2VideoDescriptor extends CDCIEssenceDescriptor {
    private short bPictureCount;
    private int bitRate;
    private byte closedGOP;
    private byte codedContentType;
    private byte constantBFrames;
    private byte identicalGOP;
    private byte lowDelay;
    private short maxGOP;
    private byte profileAndLevel;
    private byte singleSequence;

    public MPEG2VideoDescriptor(C15568UL ul) {
        super(ul);
    }

    public int getBitRate() {
        return this.bitRate;
    }

    public byte getClosedGOP() {
        return this.closedGOP;
    }

    public byte getCodedContentType() {
        return this.codedContentType;
    }

    public byte getConstantBFrames() {
        return this.constantBFrames;
    }

    public byte getIdenticalGOP() {
        return this.identicalGOP;
    }

    public byte getLowDelay() {
        return this.lowDelay;
    }

    public short getMaxGOP() {
        return this.maxGOP;
    }

    public byte getProfileAndLevel() {
        return this.profileAndLevel;
    }

    public byte getSingleSequence() {
        return this.singleSequence;
    }

    public short getbPictureCount() {
        return this.bPictureCount;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 32768:
                    this.singleSequence = byteBuffer.get();
                    break;
                case 32769:
                    this.constantBFrames = byteBuffer.get();
                    break;
                case 32770:
                    this.codedContentType = byteBuffer.get();
                    break;
                case 32771:
                    this.lowDelay = byteBuffer.get();
                    break;
                case 32772:
                    this.closedGOP = byteBuffer.get();
                    break;
                case C2108a.f8279j5 /*32773*/:
                    this.identicalGOP = byteBuffer.get();
                    break;
                case 32774:
                    this.maxGOP = byteBuffer.getShort();
                    break;
                case 32775:
                    this.bPictureCount = (short) (byteBuffer.get() & 255);
                    break;
                case 32776:
                    this.bitRate = byteBuffer.getInt();
                    break;
                case 32777:
                    this.profileAndLevel = byteBuffer.get();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown tag [ ");
                    sb.append(this.f44898ul);
                    sb.append("]: %04x + (");
                    sb.append(byteBuffer.remaining());
                    sb.append(")");
                    Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
                    continue;
            }
            it.remove();
        }
    }
}
