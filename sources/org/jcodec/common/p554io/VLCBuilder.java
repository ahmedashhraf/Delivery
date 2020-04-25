package org.jcodec.common.p554io;

import org.jcodec.common.IntArrayList;
import org.jcodec.common.IntIntMap;

/* renamed from: org.jcodec.common.io.VLCBuilder */
public class VLCBuilder {
    private IntArrayList codes = new IntArrayList();
    private IntArrayList codesSizes = new IntArrayList();
    /* access modifiers changed from: private */
    public IntIntMap forward = new IntIntMap();
    /* access modifiers changed from: private */
    public IntIntMap inverse = new IntIntMap();

    /* renamed from: org.jcodec.common.io.VLCBuilder$a */
    class C15542a extends VLC {
        C15542a(int[] iArr, int[] iArr2) {
            super(iArr, iArr2);
        }

        public int readVLC(BitReader bitReader) {
            return VLCBuilder.this.inverse.get(super.readVLC(bitReader));
        }

        public int readVLC16(BitReader bitReader) {
            return VLCBuilder.this.inverse.get(super.readVLC16(bitReader));
        }

        public void writeVLC(BitWriter bitWriter, int i) {
            super.writeVLC(bitWriter, VLCBuilder.this.forward.get(i));
        }
    }

    public VLCBuilder() {
    }

    public VLC getVLC() {
        return new C15542a(this.codes.toArray(), this.codesSizes.toArray());
    }

    public VLCBuilder set(int i, String str) {
        set(Integer.parseInt(str, 2), str.length(), i);
        return this;
    }

    public VLCBuilder set(int i, int i2, int i3) {
        this.codes.add(i << (32 - i2));
        this.codesSizes.add(i2);
        this.forward.put(i3, this.codes.size() - 1);
        this.inverse.put(this.codes.size() - 1, i3);
        return this;
    }

    public VLCBuilder(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < iArr.length; i++) {
            set(iArr[i], iArr2[i], iArr3[i]);
        }
    }
}
