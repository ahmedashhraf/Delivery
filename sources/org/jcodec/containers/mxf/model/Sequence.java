package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class Sequence extends MXFStructuralComponent {
    private C15568UL[] structuralComponentsRefs;

    public Sequence(C15568UL ul) {
        super(ul);
    }

    public C15568UL[] getStructuralComponentsRefs() {
        return this.structuralComponentsRefs;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((Integer) entry.getKey()).intValue() != 4097) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.structuralComponentsRefs = MXFMetadata.readULBatch((ByteBuffer) entry.getValue());
                it.remove();
            }
        }
    }
}
