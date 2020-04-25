package org.jcodec.codecs.common.biari;

import androidx.core.p034l.C0962e0;
import java.nio.ByteBuffer;
import org.jcodec.codecs.vpx.VPXConst;

public class VPxBooleanEncoder {
    private int count = -24;
    private int lowvalue = 0;
    private ByteBuffer out;
    private int range = 255;

    public VPxBooleanEncoder(ByteBuffer byteBuffer) {
        this.out = byteBuffer;
    }

    public int position() {
        return this.out.position() + ((this.count + 24) >> 3);
    }

    public void stop() {
        for (int i = 0; i < 32; i++) {
            writeBit(128, 0);
        }
    }

    public void writeBit(int i, int i2) {
        int i3 = this.range;
        int i4 = (((i3 - 1) * i) >> 8) + 1;
        if (i2 != 0) {
            this.lowvalue += i4;
            this.range = i3 - i4;
        } else {
            this.range = i4;
        }
        int[] iArr = VPXConst.vp8Norm;
        int i5 = this.range;
        int i6 = iArr[i5];
        this.range = i5 << i6;
        this.count += i6;
        int i7 = this.count;
        if (i7 >= 0) {
            int i8 = i6 - i7;
            if (((this.lowvalue << (i8 - 1)) & Integer.MIN_VALUE) != 0) {
                int position = this.out.position() - 1;
                while (position >= 0 && this.out.get(position) == -1) {
                    this.out.put(position, 0);
                    position--;
                }
                ByteBuffer byteBuffer = this.out;
                byteBuffer.put(position, (byte) ((byteBuffer.get(position) & 255) + 1));
            }
            this.out.put((byte) (this.lowvalue >> (24 - i8)));
            this.lowvalue <<= i8;
            i6 = this.count;
            this.lowvalue &= C0962e0.f4342s;
            this.count = i6 - 8;
        }
        this.lowvalue <<= i6;
    }
}
