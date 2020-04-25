package com.google.common.util.concurrent;

import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.collect.C7800f4;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.util.concurrent.l */
/* compiled from: AtomicLongMap */
public final class C8539l<K> {

    /* renamed from: a */
    private final ConcurrentHashMap<K, AtomicLong> f22500a;

    /* renamed from: b */
    private transient Map<K, Long> f22501b;

    /* renamed from: com.google.common.util.concurrent.l$a */
    /* compiled from: AtomicLongMap */
    class C8540a implements C7380p<AtomicLong, Long> {
        C8540a() {
        }

        /* renamed from: a */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    private C8539l(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.f22500a = (ConcurrentHashMap) C7397x.m35664a(concurrentHashMap);
    }

    /* renamed from: b */
    public static <K> C8539l<K> m40333b(Map<? extends K, ? extends Long> map) {
        C8539l<K> g = m40334g();
        g.mo31823a(map);
        return g;
    }

    /* renamed from: g */
    public static <K> C8539l<K> m40334g() {
        return new C8539l<>(new ConcurrentHashMap());
    }

    /* renamed from: h */
    private Map<K, Long> m40335h() {
        return Collections.unmodifiableMap(C7800f4.m37294a((Map<K, V1>) this.f22500a, (C7380p<? super V1, V2>) new C8540a<Object,V2>()));
    }

    /* renamed from: a */
    public long mo31821a(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.f22500a.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.f22500a.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return j;
                }
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    long j3 = j2 + j;
                    if (atomicLong.compareAndSet(j2, j3)) {
                        return j3;
                    }
                }
            }
        } while (!this.f22500a.replace(k, atomicLong, new AtomicLong(j)));
        return j;
    }

    /* renamed from: c */
    public long mo31829c(K k) {
        AtomicLong atomicLong = (AtomicLong) this.f22500a.get(k);
        if (atomicLong == null) {
            return 0;
        }
        return atomicLong.get();
    }

    /* renamed from: d */
    public long mo31832d(K k) {
        return mo31827b(k, -1);
    }

    /* renamed from: e */
    public long mo31836e(K k) {
        return mo31827b(k, 1);
    }

    /* renamed from: f */
    public long mo31839f(K k) {
        return mo31821a(k, 1);
    }

    public String toString() {
        return this.f22500a.toString();
    }

    /* renamed from: d */
    public void mo31834d() {
        for (Object next : this.f22500a.keySet()) {
            AtomicLong atomicLong = (AtomicLong) this.f22500a.get(next);
            if (atomicLong != null && atomicLong.get() == 0) {
                this.f22500a.remove(next, atomicLong);
            }
        }
    }

    /* renamed from: e */
    public int mo31835e() {
        return this.f22500a.size();
    }

    /* renamed from: f */
    public long mo31838f() {
        long j = 0;
        for (AtomicLong atomicLong : this.f22500a.values()) {
            j += atomicLong.get();
        }
        return j;
    }

    /* renamed from: g */
    public long mo31840g(K k) {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.f22500a.get(k);
        if (atomicLong == null) {
            return 0;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0));
        this.f22500a.remove(k, atomicLong);
        return j;
    }

    /* renamed from: b */
    public long mo31826b(K k) {
        return mo31821a(k, -1);
    }

    /* renamed from: c */
    public long mo31830c(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.f22500a.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.f22500a.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return 0;
                }
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    if (atomicLong.compareAndSet(j2, j)) {
                        return j2;
                    }
                }
            }
        } while (!this.f22500a.replace(k, atomicLong, new AtomicLong(j)));
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo31837e(K k, long j) {
        AtomicLong atomicLong = (AtomicLong) this.f22500a.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != j) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0)) {
            return false;
        }
        this.f22500a.remove(k, atomicLong);
        return true;
    }

    /* renamed from: b */
    public long mo31827b(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.f22500a.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.f22500a.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return 0;
                }
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    if (atomicLong.compareAndSet(j2, j2 + j)) {
                        return j2;
                    }
                }
            }
        } while (!this.f22500a.replace(k, atomicLong, new AtomicLong(j)));
        return 0;
    }

    /* renamed from: a */
    public void mo31823a(Map<? extends K, ? extends Long> map) {
        for (Entry entry : map.entrySet()) {
            mo31830c(entry.getKey(), ((Long) entry.getValue()).longValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public long mo31833d(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.f22500a.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.f22500a.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return 0;
                }
            }
            long j2 = atomicLong.get();
            if (j2 != 0) {
                return j2;
            }
        } while (!this.f22500a.replace(k, atomicLong, new AtomicLong(j)));
        return 0;
    }

    /* renamed from: a */
    public Map<K, Long> mo31822a() {
        Map<K, Long> map = this.f22501b;
        if (map != null) {
            return map;
        }
        Map<K, Long> h = m40335h();
        this.f22501b = h;
        return h;
    }

    /* renamed from: c */
    public boolean mo31831c() {
        return this.f22500a.isEmpty();
    }

    /* renamed from: b */
    public void mo31828b() {
        this.f22500a.clear();
    }

    /* renamed from: a */
    public boolean mo31824a(Object obj) {
        return this.f22500a.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo31825a(K k, long j, long j2) {
        boolean z = false;
        if (j == 0) {
            if (mo31833d(k, j2) == 0) {
                z = true;
            }
            return z;
        }
        AtomicLong atomicLong = (AtomicLong) this.f22500a.get(k);
        if (atomicLong != null) {
            z = atomicLong.compareAndSet(j, j2);
        }
        return z;
    }
}
