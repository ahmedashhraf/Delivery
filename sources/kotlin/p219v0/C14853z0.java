package kotlin.p219v0;

import java.util.List;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.z0 */
/* compiled from: ReversedViews.kt */
class C14853z0<T> extends C14755d<T> {

    /* renamed from: b */
    private final List<T> f43094b;

    public C14853z0(@C6003d List<? extends T> list) {
        C14445h0.m62478f(list, "delegate");
        this.f43094b = list;
    }

    /* renamed from: b */
    public int mo45907b() {
        return this.f43094b.size();
    }

    public T get(int i) {
        return this.f43094b.get(C14846y.m65640c(this, i));
    }
}
