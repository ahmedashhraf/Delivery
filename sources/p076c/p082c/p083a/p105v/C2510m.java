package p076c.p082c.p083a.p105v;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p108y.C2525c;

/* renamed from: c.c.a.v.m */
/* compiled from: RequestTracker */
public class C2510m {

    /* renamed from: a */
    private final Set<C2525c> f9538a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C2525c> f9539b = new ArrayList();

    /* renamed from: c */
    private boolean f9540c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9960a(C2525c cVar) {
        this.f9538a.add(cVar);
    }

    /* renamed from: b */
    public void mo9961b(C2525c cVar) {
        this.f9538a.remove(cVar);
        this.f9539b.remove(cVar);
    }

    /* renamed from: c */
    public void mo9964c(C2525c cVar) {
        this.f9538a.add(cVar);
        if (!this.f9540c) {
            cVar.mo9987c();
        } else {
            this.f9539b.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo9965d() {
        for (C2525c cVar : C2216i.m11341a((Collection<T>) this.f9538a)) {
            if (!cVar.mo9989d() && !cVar.isCancelled()) {
                cVar.mo9995o();
                if (!this.f9540c) {
                    cVar.mo9987c();
                } else {
                    this.f9539b.add(cVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo9966e() {
        this.f9540c = false;
        for (C2525c cVar : C2216i.m11341a((Collection<T>) this.f9538a)) {
            if (!cVar.mo9989d() && !cVar.isCancelled() && !cVar.isRunning()) {
                cVar.mo9987c();
            }
        }
        this.f9539b.clear();
    }

    /* renamed from: a */
    public void mo9959a() {
        for (C2525c clear : C2216i.m11341a((Collection<T>) this.f9538a)) {
            clear.clear();
        }
        this.f9539b.clear();
    }

    /* renamed from: b */
    public boolean mo9962b() {
        return this.f9540c;
    }

    /* renamed from: c */
    public void mo9963c() {
        this.f9540c = true;
        for (C2525c cVar : C2216i.m11341a((Collection<T>) this.f9538a)) {
            if (cVar.isRunning()) {
                cVar.mo9995o();
                this.f9539b.add(cVar);
            }
        }
    }
}
