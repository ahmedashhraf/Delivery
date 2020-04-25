package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class IndexSegment extends MXFInterchangeObject {
    private int bodySID;
    private DeltaEntries deltaEntries;
    private int editUnitByteCount;

    /* renamed from: ie */
    private IndexEntries f44897ie;
    private long indexDuration;
    private int indexEditRateDen;
    private int indexEditRateNum;
    private int indexSID;
    private long indexStartPosition;
    private C15568UL instanceUID;
    private int posTableCount;
    private int sliceCount;

    public IndexSegment(C15568UL ul) {
        super(ul);
    }

    public int getBodySID() {
        return this.bodySID;
    }

    public DeltaEntries getDeltaEntries() {
        return this.deltaEntries;
    }

    public int getEditUnitByteCount() {
        return this.editUnitByteCount;
    }

    public IndexEntries getIe() {
        return this.f44897ie;
    }

    public long getIndexDuration() {
        return this.indexDuration;
    }

    public int getIndexEditRateDen() {
        return this.indexEditRateDen;
    }

    public int getIndexEditRateNum() {
        return this.indexEditRateNum;
    }

    public int getIndexSID() {
        return this.indexSID;
    }

    public long getIndexStartPosition() {
        return this.indexStartPosition;
    }

    public C15568UL getInstanceUID() {
        return this.instanceUID;
    }

    public int getPosTableCount() {
        return this.posTableCount;
    }

    public int getSliceCount() {
        return this.sliceCount;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue != 15370) {
                switch (intValue) {
                    case 16133:
                        this.editUnitByteCount = byteBuffer.getInt();
                        break;
                    case 16134:
                        this.indexSID = byteBuffer.getInt();
                        break;
                    case 16135:
                        this.bodySID = byteBuffer.getInt();
                        break;
                    case 16136:
                        this.sliceCount = byteBuffer.get() & 255;
                        break;
                    case 16137:
                        this.deltaEntries = DeltaEntries.read(byteBuffer);
                        break;
                    case 16138:
                        this.f44897ie = IndexEntries.read(byteBuffer);
                        break;
                    case 16139:
                        this.indexEditRateNum = byteBuffer.getInt();
                        this.indexEditRateDen = byteBuffer.getInt();
                        break;
                    case 16140:
                        this.indexStartPosition = byteBuffer.getLong();
                        break;
                    case 16141:
                        this.indexDuration = byteBuffer.getLong();
                        break;
                    case 16142:
                        this.posTableCount = byteBuffer.get() & 255;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown tag [");
                        sb.append(this.f44898ul);
                        sb.append("]: %04x");
                        Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
                        continue;
                }
            } else {
                this.instanceUID = C15568UL.read(byteBuffer);
            }
            it.remove();
        }
    }
}
