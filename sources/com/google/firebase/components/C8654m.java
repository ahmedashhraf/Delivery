package com.google.firebase.components;

import com.google.android.gms.common.internal.C4300a0;
import com.google.firebase.p314i.C8673c;
import com.google.firebase.p314i.C8674d;
import com.google.firebase.p317l.C8738a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.m */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class C8654m extends C8637a {

    /* renamed from: e */
    private static final C8738a<Set<Object>> f22690e = C8653l.m40672a();

    /* renamed from: a */
    private final Map<C8641e<?>, C8662r<?>> f22691a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C8662r<?>> f22692b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C8662r<Set<?>>> f22693c = new HashMap();

    /* renamed from: d */
    private final C8661q f22694d;

    public C8654m(Executor executor, Iterable<C8650i> iterable, C8641e<?>... eVarArr) {
        this.f22694d = new C8661q(executor);
        ArrayList<C8641e> arrayList = new ArrayList<>();
        arrayList.add(C8641e.m40635a(this.f22694d, C8661q.class, C8674d.class, C8673c.class));
        for (C8650i components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, eVarArr);
        C8655n.m40684a((List<C8641e<?>>) arrayList);
        for (C8641e eVar : arrayList) {
            this.f22691a.put(eVar, new C8662r(C8651j.m40670a(this, eVar)));
        }
        m40675a();
        m40676b();
    }

    /* renamed from: b */
    private void m40676b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f22691a.entrySet()) {
            C8641e eVar = (C8641e) entry.getKey();
            if (!eVar.mo31998h()) {
                C8662r rVar = (C8662r) entry.getValue();
                for (Class cls : eVar.mo31993c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(rVar);
                }
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            this.f22693c.put((Class) entry2.getKey(), new C8662r(C8652k.m40671a((Set) entry2.getValue())));
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo31989a(Class cls) {
        return super.mo31989a(cls);
    }

    /* renamed from: c */
    public <T> C8738a<Set<T>> mo32007c(Class<T> cls) {
        C8662r rVar = (C8662r) this.f22693c.get(cls);
        if (rVar != null) {
            return rVar;
        }
        return f22690e;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo31990d(Class cls) {
        return super.mo31990d(cls);
    }

    /* renamed from: a */
    private void m40675a() {
        for (Entry entry : this.f22691a.entrySet()) {
            C8641e eVar = (C8641e) entry.getKey();
            if (eVar.mo31998h()) {
                C8662r rVar = (C8662r) entry.getValue();
                for (Class put : eVar.mo31993c()) {
                    this.f22692b.put(put, rVar);
                }
            }
        }
        m40677c();
    }

    /* renamed from: c */
    private void m40677c() {
        for (C8641e eVar : this.f22691a.keySet()) {
            Iterator it = eVar.mo31991a().iterator();
            while (true) {
                if (it.hasNext()) {
                    C8659o oVar = (C8659o) it.next();
                    if (oVar.mo32023c() && !this.f22692b.containsKey(oVar.mo32021a())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{eVar, oVar.mo32021a()}));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<com.google.firebase.components.r>, for r2v0, types: [java.util.Set<com.google.firebase.components.r>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.Set m40674a(java.util.Set<com.google.firebase.components.C8662r> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            com.google.firebase.components.r r1 = (com.google.firebase.components.C8662r) r1
            java.lang.Object r1 = r1.get()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C8654m.m40674a(java.util.Set):java.util.Set");
    }

    /* renamed from: a */
    public void mo32011a(boolean z) {
        for (Entry entry : this.f22691a.entrySet()) {
            C8641e eVar = (C8641e) entry.getKey();
            C8662r rVar = (C8662r) entry.getValue();
            if (eVar.mo31995e() || (eVar.mo31996f() && z)) {
                rVar.get();
            }
        }
        this.f22694d.mo32029a();
    }

    /* renamed from: b */
    public <T> C8738a<T> mo32006b(Class<T> cls) {
        C4300a0.m18621a(cls, (Object) "Null interface requested.");
        return (C8738a) this.f22692b.get(cls);
    }
}
