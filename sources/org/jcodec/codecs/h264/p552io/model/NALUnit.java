package org.jcodec.codecs.h264.p552io.model;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

/* renamed from: org.jcodec.codecs.h264.io.model.NALUnit */
public class NALUnit {
    public int nal_ref_idc;
    public NALUnitType type;

    public NALUnit(NALUnitType nALUnitType, int i) {
        this.type = nALUnitType;
        this.nal_ref_idc = i;
    }

    public static NALUnit read(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get() & 255;
        return new NALUnit(NALUnitType.fromValue(b & C5785c.f16676I), (b >> 5) & 3);
    }

    public void write(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.type.getValue() | (this.nal_ref_idc << 5)));
    }
}
