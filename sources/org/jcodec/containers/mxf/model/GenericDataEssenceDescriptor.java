package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class GenericDataEssenceDescriptor extends FileDescriptor {
    private C15568UL dataEssenceCoding;

    public GenericDataEssenceDescriptor(C15568UL ul) {
        super(ul);
    }

    public C15568UL getDataEssenceCoding() {
        return this.dataEssenceCoding;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            if (((Integer) entry.getKey()).intValue() != 15873) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ FileDescriptor: ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.dataEssenceCoding = C15568UL.read(byteBuffer);
                it.remove();
            }
        }
    }
}
