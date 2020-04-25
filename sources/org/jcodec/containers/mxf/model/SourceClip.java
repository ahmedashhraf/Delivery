package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class SourceClip extends MXFStructuralComponent {
    private C15568UL sourcePackageUid;
    private int sourceTrackId;
    private long startPosition;

    public SourceClip(C15568UL ul) {
        super(ul);
    }

    public C15568UL getSourcePackageUid() {
        return this.sourcePackageUid;
    }

    public int getSourceTrackId() {
        return this.sourceTrackId;
    }

    public long getStartPosition() {
        return this.startPosition;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 4353) {
                this.sourcePackageUid = C15568UL.read(byteBuffer);
            } else if (intValue == 4354) {
                this.sourceTrackId = byteBuffer.getInt();
            } else if (intValue != 4609) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.startPosition = byteBuffer.getLong();
            }
            it.remove();
        }
    }
}
