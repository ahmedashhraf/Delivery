package kotlin.p219v0;

import java.util.List;
import java.util.RandomAccess;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.v0 */
/* compiled from: SlidingWindow.kt */
public final class C14843v0<E> extends C14755d<E> implements RandomAccess {

    /* renamed from: N */
    private int f43083N;

    /* renamed from: O */
    private final List<E> f43084O;

    /* renamed from: b */
    private int f43085b;

    public C14843v0(@C6003d List<? extends E> list) {
        C14445h0.m62478f(list, "list");
        this.f43084O = list;
    }

    /* renamed from: a */
    public final void mo46281a(int i, int i2) {
        C14755d.f43001a.mo46074a(i, i2, this.f43084O.size());
        this.f43085b = i;
        this.f43083N = i2 - i;
    }

    /* renamed from: b */
    public int mo45907b() {
        return this.f43083N;
    }

    public E get(int i) {
        C14755d.f43001a.mo46073a(i, this.f43083N);
        return this.f43084O.get(this.f43085b + i);
    }
}
