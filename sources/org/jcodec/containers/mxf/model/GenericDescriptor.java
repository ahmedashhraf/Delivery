package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class GenericDescriptor extends MXFInterchangeObject {
    private C15568UL[] locators;
    private C15568UL[] subDescriptors;

    public GenericDescriptor(C15568UL ul) {
        super(ul);
    }

    public C15568UL[] getLocators() {
        return this.locators;
    }

    public C15568UL[] getSubDescriptors() {
        return this.subDescriptors;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 12033) {
                this.locators = MXFMetadata.readULBatch(byteBuffer);
            } else if (intValue != 16129) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            }
            this.subDescriptors = MXFMetadata.readULBatch(byteBuffer);
            it.remove();
        }
    }
}
