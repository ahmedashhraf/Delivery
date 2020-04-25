package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14836r;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.b */
/* compiled from: ArrayIterators.kt */
final class C14418b extends C14836r {

    /* renamed from: a */
    private int f42536a;

    /* renamed from: b */
    private final byte[] f42537b;

    public C14418b(@C6003d byte[] bArr) {
        C14445h0.m62478f(bArr, "array");
        this.f42537b = bArr;
    }

    /* renamed from: b */
    public byte mo45532b() {
        try {
            byte[] bArr = this.f42537b;
            int i = this.f42536a;
            this.f42536a = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42536a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42536a < this.f42537b.length;
    }
}
