package com.google.firebase.components;

import androidx.annotation.C0221u;
import com.google.android.gms.common.internal.C4300a0;
import com.google.firebase.p314i.C8671a;
import com.google.firebase.p314i.C8672b;
import com.google.firebase.p314i.C8673c;
import com.google.firebase.p314i.C8674d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.q */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
class C8661q implements C8674d, C8673c {
    @C0221u("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C8672b<Object>, Executor>> f22705a = new HashMap();
    @C0221u("this")

    /* renamed from: b */
    private Queue<C8671a<?>> f22706b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f22707c;

    C8661q(Executor executor) {
        this.f22707c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Entry<C8672b<Object>, Executor>> m40706b(C8671a<?> aVar) {
        Map map;
        map = (Map) this.f22705a.get(aVar.mo32056b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C8660p.m40704a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m40706b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32030a(com.google.firebase.p314i.C8671a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C4300a0.m18620a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.i.a<?>> r0 = r3.f22706b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.i.a<?>> r0 = r3.f22706b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m40706b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C8660p.m40704a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C8661q.mo32030a(com.google.firebase.i.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo32033b(java.lang.Class<T> r2, com.google.firebase.p314i.C8672b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.internal.C4300a0.m18620a(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.i.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f22705a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.i.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f22705a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.i.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f22705a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C8661q.mo32033b(java.lang.Class, com.google.firebase.i.b):void");
    }

    /* renamed from: a */
    public synchronized <T> void mo32032a(Class<T> cls, Executor executor, C8672b<? super T> bVar) {
        C4300a0.m18620a(cls);
        C4300a0.m18620a(bVar);
        C4300a0.m18620a(executor);
        if (!this.f22705a.containsKey(cls)) {
            this.f22705a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f22705a.get(cls)).put(bVar, executor);
    }

    /* renamed from: a */
    public <T> void mo32031a(Class<T> cls, C8672b<? super T> bVar) {
        mo32032a(cls, this.f22707c, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32029a() {
        Queue<C8671a> queue;
        synchronized (this) {
            if (this.f22706b != null) {
                queue = this.f22706b;
                this.f22706b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C8671a a : queue) {
                mo32030a(a);
            }
        }
    }
}
