package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class GenericTrack extends MXFInterchangeObject {
    private String name;
    private C15568UL sequenceRef;
    private int trackId;
    private int trackNumber;

    public GenericTrack(C15568UL ul) {
        super(ul);
    }

    public String getName() {
        return this.name;
    }

    public C15568UL getSequenceRef() {
        return this.sequenceRef;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public int getTrackNumber() {
        return this.trackNumber;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 18433:
                    this.trackId = byteBuffer.getInt();
                    break;
                case 18434:
                    this.name = readUtf16String(byteBuffer);
                    break;
                case 18435:
                    this.sequenceRef = C15568UL.read(byteBuffer);
                    break;
                case 18436:
                    this.trackNumber = byteBuffer.getInt();
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
