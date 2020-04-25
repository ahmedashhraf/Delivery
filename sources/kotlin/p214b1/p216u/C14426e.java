package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14772f0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.e */
/* compiled from: ArrayIterators.kt */
final class C14426e extends C14772f0 {

    /* renamed from: a */
    private int f42552a;

    /* renamed from: b */
    private final float[] f42553b;

    public C14426e(@C6003d float[] fArr) {
        C14445h0.m62478f(fArr, "array");
        this.f42553b = fArr;
    }

    /* renamed from: b */
    public float mo45552b() {
        try {
            float[] fArr = this.f42553b;
            int i = this.f42552a;
            this.f42552a = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42552a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42552a < this.f42553b.length;
    }
}
