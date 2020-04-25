package androidx.constraintlayout.solver.p014h;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.h.q */
/* compiled from: ResolutionNode */
public class C0690q {

    /* renamed from: c */
    public static final int f2929c = 0;

    /* renamed from: d */
    public static final int f2930d = 1;

    /* renamed from: e */
    public static final int f2931e = 2;

    /* renamed from: a */
    HashSet<C0690q> f2932a = new HashSet<>(2);

    /* renamed from: b */
    int f2933b = 0;

    /* renamed from: a */
    public void mo3764a(C0689p pVar) {
    }

    /* renamed from: a */
    public void mo3776a(C0690q qVar) {
        this.f2932a.add(qVar);
    }

    /* renamed from: b */
    public void mo3777b() {
        this.f2933b = 0;
        Iterator it = this.f2932a.iterator();
        while (it.hasNext()) {
            ((C0690q) it.next()).mo3777b();
        }
    }

    /* renamed from: c */
    public void mo3778c() {
        if (this instanceof C0688o) {
            this.f2933b = 0;
        }
        Iterator it = this.f2932a.iterator();
        while (it.hasNext()) {
            ((C0690q) it.next()).mo3778c();
        }
    }

    /* renamed from: d */
    public boolean mo3779d() {
        return this.f2933b == 1;
    }

    /* renamed from: e */
    public void mo3768e() {
        this.f2933b = 0;
        this.f2932a.clear();
    }

    /* renamed from: f */
    public void mo3769f() {
    }

    /* renamed from: a */
    public void mo3775a() {
        this.f2933b = 1;
        Iterator it = this.f2932a.iterator();
        while (it.hasNext()) {
            ((C0690q) it.next()).mo3769f();
        }
    }
}
