package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import org.jcodec.common.NIOUtils;

public abstract class MXFInterchangeObject extends MXFMetadata {
    private C15568UL generationUID;
    private C15568UL objectClass;

    public MXFInterchangeObject(C15568UL ul) {
        super(ul);
    }

    public C15568UL getGenerationUID() {
        return this.generationUID;
    }

    public C15568UL getObjectClass() {
        return this.objectClass;
    }

    public void read(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        HashMap hashMap = new HashMap();
        while (byteBuffer.hasRemaining()) {
            short s = byteBuffer.getShort() & 65535;
            ByteBuffer read = NIOUtils.read(byteBuffer, (int) 65535 & byteBuffer.getShort());
            if (s == 257) {
                this.objectClass = C15568UL.read(read);
            } else if (s == 258) {
                this.generationUID = C15568UL.read(read);
            } else if (s != 15370) {
                hashMap.put(Integer.valueOf(s), read);
            } else {
                this.uid = C15568UL.read(read);
            }
        }
        if (hashMap.size() > 0) {
            read((Map<Integer, ByteBuffer>) hashMap);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void read(Map<Integer, ByteBuffer> map);
}
