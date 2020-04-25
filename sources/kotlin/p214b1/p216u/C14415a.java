package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14834q;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.a */
/* compiled from: ArrayIterators.kt */
final class C14415a extends C14834q {

    /* renamed from: a */
    private int f42534a;

    /* renamed from: b */
    private final boolean[] f42535b;

    public C14415a(@C6003d boolean[] zArr) {
        C14445h0.m62478f(zArr, "array");
        this.f42535b = zArr;
    }

    /* renamed from: b */
    public boolean mo45526b() {
        try {
            boolean[] zArr = this.f42535b;
            int i = this.f42534a;
            this.f42534a = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42534a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42534a < this.f42535b.length;
    }
}
