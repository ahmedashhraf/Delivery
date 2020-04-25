package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class MXFStructuralComponent extends MXFInterchangeObject {
    private C15568UL dataDefinitionUL;
    private long duration;

    public MXFStructuralComponent(C15568UL ul) {
        super(ul);
    }

    public C15568UL getDataDefinitionUL() {
        return this.dataDefinitionUL;
    }

    public long getDuration() {
        return this.duration;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 513) {
                this.dataDefinitionUL = C15568UL.read((ByteBuffer) entry.getValue());
            } else if (intValue != 514) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.duration = ((ByteBuffer) entry.getValue()).getLong();
            }
            it.remove();
        }
    }
}
