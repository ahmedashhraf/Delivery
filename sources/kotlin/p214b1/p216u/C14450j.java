package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14792m0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.j */
/* compiled from: ArrayIterators.kt */
final class C14450j extends C14792m0 {

    /* renamed from: a */
    private int f42578a;

    /* renamed from: b */
    private final long[] f42579b;

    public C14450j(@C6003d long[] jArr) {
        C14445h0.m62478f(jArr, "array");
        this.f42579b = jArr;
    }

    /* renamed from: b */
    public long mo45592b() {
        try {
            long[] jArr = this.f42579b;
            int i = this.f42578a;
            this.f42578a = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42578a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42578a < this.f42579b.length;
    }
}
