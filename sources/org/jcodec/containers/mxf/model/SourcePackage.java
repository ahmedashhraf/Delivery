package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class SourcePackage extends GenericPackage {
    private C15568UL descriptorRef;
    private C15568UL packageUid;
    private C15568UL[] trackRefs;

    public SourcePackage(C15568UL ul) {
        super(ul);
    }

    public C15568UL getDescriptorRef() {
        return this.descriptorRef;
    }

    public C15568UL getPackageUid() {
        return this.packageUid;
    }

    public C15568UL[] getTrackRefs() {
        return this.trackRefs;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            if (((Integer) entry.getKey()).intValue() != 18177) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.descriptorRef = C15568UL.read(byteBuffer);
                it.remove();
            }
        }
    }
}
