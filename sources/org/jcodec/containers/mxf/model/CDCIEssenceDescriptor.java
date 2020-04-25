package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class CDCIEssenceDescriptor extends GenericPictureEssenceDescriptor {
    private int alphaSampleDepth;
    private int blackRefLevel;
    private int colorRange;
    private byte colorSiting;
    private int componentDepth;
    private int horizontalSubsampling;
    private short paddingBits;
    private byte reversedByteOrder;
    private int verticalSubsampling;
    private int whiteReflevel;

    public CDCIEssenceDescriptor(C15568UL ul) {
        super(ul);
    }

    public int getAlphaSampleDepth() {
        return this.alphaSampleDepth;
    }

    public int getBlackRefLevel() {
        return this.blackRefLevel;
    }

    public int getColorRange() {
        return this.colorRange;
    }

    public byte getColorSiting() {
        return this.colorSiting;
    }

    public int getComponentDepth() {
        return this.componentDepth;
    }

    public int getHorizontalSubsampling() {
        return this.horizontalSubsampling;
    }

    public short getPaddingBits() {
        return this.paddingBits;
    }

    public byte getReversedByteOrder() {
        return this.reversedByteOrder;
    }

    public int getVerticalSubsampling() {
        return this.verticalSubsampling;
    }

    public int getWhiteReflevel() {
        return this.whiteReflevel;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 13057:
                    this.componentDepth = byteBuffer.getInt();
                    break;
                case 13058:
                    this.horizontalSubsampling = byteBuffer.getInt();
                    break;
                case 13059:
                    this.colorSiting = byteBuffer.get();
                    break;
                case 13060:
                    this.blackRefLevel = byteBuffer.getInt();
                    break;
                case 13061:
                    this.whiteReflevel = byteBuffer.getInt();
                    break;
                case 13062:
                    this.colorRange = byteBuffer.getInt();
                    break;
                case 13063:
                    this.paddingBits = byteBuffer.getShort();
                    break;
                case 13064:
                    this.verticalSubsampling = byteBuffer.getInt();
                    break;
                case 13065:
                    this.alphaSampleDepth = byteBuffer.getInt();
                    break;
                case 13067:
                    this.reversedByteOrder = byteBuffer.get();
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
