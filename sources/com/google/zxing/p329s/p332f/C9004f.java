package com.google.zxing.p329s.p332f;

import com.google.zxing.p335u.C9043a;
import java.util.LinkedList;

/* renamed from: com.google.zxing.s.f.f */
/* compiled from: State */
final class C9004f {

    /* renamed from: e */
    static final C9004f f23547e = new C9004f(C9005g.f23552b, 0, 0, 0);

    /* renamed from: a */
    private final int f23548a;

    /* renamed from: b */
    private final C9005g f23549b;

    /* renamed from: c */
    private final int f23550c;

    /* renamed from: d */
    private final int f23551d;

    private C9004f(C9005g gVar, int i, int i2, int i3) {
        this.f23549b = gVar;
        this.f23548a = i;
        this.f23550c = i2;
        this.f23551d = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo32862a() {
        return this.f23550c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo32867b() {
        return this.f23551d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo32870c() {
        return this.f23548a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C9005g mo32871d() {
        return this.f23549b;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C9001d.f23534b[this.f23548a], Integer.valueOf(this.f23551d), Integer.valueOf(this.f23550c)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9004f mo32864a(int i, int i2) {
        int i3 = this.f23551d;
        C9005g gVar = this.f23549b;
        int i4 = this.f23548a;
        if (i != i4) {
            int i5 = C9001d.f23540h[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo32874a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C9004f(gVar.mo32874a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9004f mo32869b(int i, int i2) {
        C9005g gVar = this.f23549b;
        int i3 = this.f23548a == 2 ? 4 : 5;
        return new C9004f(gVar.mo32874a(C9001d.f23542j[this.f23548a][i], i3).mo32874a(i2, 5), this.f23548a, 0, this.f23551d + i3 + 5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9004f mo32868b(int i) {
        int i2 = this.f23550c;
        if (i2 == 0) {
            return this;
        }
        return new C9004f(this.f23549b.mo32875b(i - i2, i2), this.f23548a, 0, this.f23551d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9004f mo32863a(int i) {
        C9005g gVar = this.f23549b;
        int i2 = this.f23548a;
        int i3 = this.f23551d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C9001d.f23540h[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo32874a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f23550c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        C9004f fVar = new C9004f(gVar, i2, this.f23550c + 1, i3 + i8);
        return fVar.f23550c == 2078 ? fVar.mo32868b(i + 1) : fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32866a(C9004f fVar) {
        int i = this.f23551d + (C9001d.f23540h[this.f23548a][fVar.f23548a] >> 16);
        int i2 = fVar.f23550c;
        if (i2 > 0) {
            int i3 = this.f23550c;
            if (i3 == 0 || i3 > i2) {
                i += 10;
            }
        }
        return i <= fVar.f23551d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9043a mo32865a(byte[] bArr) {
        LinkedList<C9005g> linkedList = new LinkedList<>();
        for (C9005g gVar = mo32868b(bArr.length).f23549b; gVar != null; gVar = gVar.mo32873a()) {
            linkedList.addFirst(gVar);
        }
        C9043a aVar = new C9043a();
        for (C9005g a : linkedList) {
            a.mo32856a(aVar, bArr);
        }
        return aVar;
    }
}
