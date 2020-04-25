package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14790l0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.f */
/* compiled from: ArrayIterators.kt */
final class C14429f extends C14790l0 {

    /* renamed from: a */
    private int f42554a;

    /* renamed from: b */
    private final int[] f42555b;

    public C14429f(@C6003d int[] iArr) {
        C14445h0.m62478f(iArr, "array");
        this.f42555b = iArr;
    }

    /* renamed from: b */
    public int mo45559b() {
        try {
            int[] iArr = this.f42555b;
            int i = this.f42554a;
            this.f42554a = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42554a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42554a < this.f42555b.length;
    }
}
