package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14770e1;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.k */
/* compiled from: ArrayIterators.kt */
final class C14453k extends C14770e1 {

    /* renamed from: a */
    private int f42581a;

    /* renamed from: b */
    private final short[] f42582b;

    public C14453k(@C6003d short[] sArr) {
        C14445h0.m62478f(sArr, "array");
        this.f42582b = sArr;
    }

    /* renamed from: b */
    public short mo45597b() {
        try {
            short[] sArr = this.f42582b;
            int i = this.f42581a;
            this.f42581a = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42581a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42581a < this.f42582b.length;
    }
}
