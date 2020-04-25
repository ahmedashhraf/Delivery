package p076c.p082c.p083a.p105v;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p076c.p082c.p083a.p084a0.C2216i;

/* renamed from: c.c.a.v.a */
/* compiled from: ActivityFragmentLifecycle */
class C2494a implements C2502g {

    /* renamed from: a */
    private final Set<C2503h> f9514a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f9515b;

    /* renamed from: c */
    private boolean f9516c;

    C2494a() {
    }

    /* renamed from: a */
    public void mo9931a(C2503h hVar) {
        this.f9514a.add(hVar);
        if (this.f9516c) {
            hVar.onDestroy();
        } else if (this.f9515b) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9932b() {
        this.f9515b = true;
        for (C2503h onStart : C2216i.m11341a((Collection<T>) this.f9514a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9933c() {
        this.f9515b = false;
        for (C2503h onStop : C2216i.m11341a((Collection<T>) this.f9514a)) {
            onStop.onStop();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9930a() {
        this.f9516c = true;
        for (C2503h onDestroy : C2216i.m11341a((Collection<T>) this.f9514a)) {
            onDestroy.onDestroy();
        }
    }
}
