package kotlin.p219v0;

import java.util.List;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.y0 */
/* compiled from: ReversedViews.kt */
final class C14847y0<T> extends C14776g<T> {

    /* renamed from: a */
    private final List<T> f43088a;

    public C14847y0(@C6003d List<T> list) {
        C14445h0.m62478f(list, "delegate");
        this.f43088a = list;
    }

    public void add(int i, T t) {
        this.f43088a.add(C14846y.m65642d(this, i), t);
    }

    /* renamed from: b */
    public int mo46168b() {
        return this.f43088a.size();
    }

    public void clear() {
        this.f43088a.clear();
    }

    public T get(int i) {
        return this.f43088a.get(C14846y.m65640c(this, i));
    }

    public T set(int i, T t) {
        return this.f43088a.set(C14846y.m65640c(this, i), t);
    }

    /* renamed from: b */
    public T mo46169b(int i) {
        return this.f43088a.remove(C14846y.m65640c(this, i));
    }
}
