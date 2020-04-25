package kotlin.p214b1.p216u;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14838s;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.c */
/* compiled from: ArrayIterators.kt */
final class C14420c extends C14838s {

    /* renamed from: a */
    private int f42541a;

    /* renamed from: b */
    private final char[] f42542b;

    public C14420c(@C6003d char[] cArr) {
        C14445h0.m62478f(cArr, "array");
        this.f42542b = cArr;
    }

    /* renamed from: b */
    public char mo24981b() {
        try {
            char[] cArr = this.f42542b;
            int i = this.f42541a;
            this.f42541a = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42541a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f42541a < this.f42542b.length;
    }
}
