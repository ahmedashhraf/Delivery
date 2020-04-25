package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class EssenceContainerData extends MXFInterchangeObject {
    private int bodySID;
    private int indexSID;
    private C15568UL linkedPackageUID;

    public EssenceContainerData(C15568UL ul) {
        super(ul);
    }

    public int getBodySID() {
        return this.bodySID;
    }

    public int getIndexSID() {
        return this.indexSID;
    }

    public C15568UL getLinkedPackageUID() {
        return this.linkedPackageUID;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 9985) {
                this.linkedPackageUID = C15568UL.read(byteBuffer);
            } else if (intValue == 16134) {
                this.indexSID = byteBuffer.getInt();
            } else if (intValue != 16135) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ EssenceContainerData: ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.bodySID = byteBuffer.getInt();
            }
            it.remove();
        }
    }
}
