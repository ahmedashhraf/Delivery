package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14746a0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.d */
/* compiled from: ArrayIterators.kt */
final class C14423d extends C14746a0 {

    /* renamed from: a */
    private int f42544a;

    /* renamed from: b */
    private final double[] f42545b;

    public C14423d(@C6003d double[] dArr) {
        C14445h0.m62478f(dArr, "array");
        this.f42545b = dArr;
    }

    /* renamed from: b */
    public double mo45549b() {
        try {
            double[] dArr = this.f42545b;
            int i = this.f42544a;
            this.f42544a = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42544a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42544a < this.f42545b.length;
    }
}
