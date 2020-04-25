package androidx.recyclerview.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.C1682c.C1683a;
import androidx.recyclerview.widget.C1687d.C1691b;
import androidx.recyclerview.widget.C1726i.C1730d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.s */
/* compiled from: ListAdapter */
public abstract class C1763s<T, VH extends C1635d0> extends C1638g<VH> {

    /* renamed from: c */
    final C1687d<T> f6872c;

    /* renamed from: d */
    private final C1691b<T> f6873d = new C1764a();

    /* renamed from: androidx.recyclerview.widget.s$a */
    /* compiled from: ListAdapter */
    class C1764a implements C1691b<T> {
        C1764a() {
        }

        /* renamed from: a */
        public void mo7773a(@C0193h0 List<T> list, @C0193h0 List<T> list2) {
            C1763s.this.mo7998a(list, list2);
        }
    }

    protected C1763s(@C0193h0 C1730d<T> dVar) {
        this.f6872c = new C1687d<>((C1765t) new C1678b(this), new C1683a(dVar).mo7735a());
        this.f6872c.mo7761a(this.f6873d);
    }

    /* renamed from: a */
    public void mo7996a(@C0195i0 List<T> list) {
        this.f6872c.mo7762a(list);
    }

    /* renamed from: a */
    public void mo7998a(@C0193h0 List<T> list, @C0193h0 List<T> list2) {
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f6872c.mo7760a().size();
    }

    @C0193h0
    /* renamed from: f */
    public List<T> mo7999f() {
        return this.f6872c.mo7760a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public T mo8000g(int i) {
        return this.f6872c.mo7760a().get(i);
    }

    /* renamed from: a */
    public void mo7997a(@C0195i0 List<T> list, @C0195i0 Runnable runnable) {
        this.f6872c.mo7764a(list, runnable);
    }

    protected C1763s(@C0193h0 C1682c<T> cVar) {
        this.f6872c = new C1687d<>((C1765t) new C1678b(this), cVar);
        this.f6872c.mo7761a(this.f6873d);
    }
}
