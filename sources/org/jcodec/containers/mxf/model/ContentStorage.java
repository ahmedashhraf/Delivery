package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class ContentStorage extends MXFInterchangeObject {
    private C15568UL[] essenceContainerData;
    private C15568UL[] packageRefs;

    public ContentStorage(C15568UL ul) {
        super(ul);
    }

    public C15568UL[] getEssenceContainerData() {
        return this.essenceContainerData;
    }

    public C15568UL[] getPackageRefs() {
        return this.packageRefs;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 6401) {
                this.packageRefs = MXFMetadata.readULBatch(byteBuffer);
            } else if (intValue != 6402) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ContentStorage: ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.essenceContainerData = MXFMetadata.readULBatch(byteBuffer);
            }
            it.remove();
        }
    }
}
