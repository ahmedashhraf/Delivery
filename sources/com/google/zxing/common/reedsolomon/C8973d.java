package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.reedsolomon.d */
/* compiled from: ReedSolomonEncoder */
public final class C8973d {

    /* renamed from: a */
    private final C8970a f23472a;

    /* renamed from: b */
    private final List<C8971b> f23473b = new ArrayList();

    public C8973d(C8970a aVar) {
        this.f23472a = aVar;
        this.f23473b.add(new C8971b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C8971b m41936a(int i) {
        if (i >= this.f23473b.size()) {
            List<C8971b> list = this.f23473b;
            C8971b bVar = (C8971b) list.get(list.size() - 1);
            for (int size = this.f23473b.size(); size <= i; size++) {
                C8970a aVar = this.f23472a;
                bVar = bVar.mo32792c(new C8971b(aVar, new int[]{1, aVar.mo32775a((size - 1) + aVar.mo32774a())}));
                this.f23473b.add(bVar);
            }
        }
        return (C8971b) this.f23473b.get(i);
    }

    /* renamed from: a */
    public void mo32796a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C8971b a = m41936a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a2 = new C8971b(this.f23472a, iArr2).mo32785a(i, 1).mo32790b(a)[1].mo32787a();
                int length2 = i - a2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a2, 0, iArr, length + length2, a2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
