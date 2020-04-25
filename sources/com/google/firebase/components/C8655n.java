package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.n */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
class C8655n {

    /* renamed from: com.google.firebase.components.n$b */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8657b {

        /* renamed from: a */
        private final C8641e<?> f22695a;

        /* renamed from: b */
        private final Set<C8657b> f22696b = new HashSet();

        /* renamed from: c */
        private final Set<C8657b> f22697c = new HashSet();

        C8657b(C8641e<?> eVar) {
            this.f22695a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32013a(C8657b bVar) {
            this.f22696b.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo32015b(C8657b bVar) {
            this.f22697c.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo32016c(C8657b bVar) {
            this.f22697c.remove(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo32018d() {
            return this.f22697c.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8641e<?> mo32012a() {
            return this.f22695a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<C8657b> mo32014b() {
            return this.f22696b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo32017c() {
            return this.f22696b.isEmpty();
        }
    }

    /* renamed from: com.google.firebase.components.n$c */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8658c {

        /* renamed from: a */
        private final Class<?> f22698a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f22699b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C8658c)) {
                return false;
            }
            C8658c cVar = (C8658c) obj;
            if (!cVar.f22698a.equals(this.f22698a) || cVar.f22699b != this.f22699b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f22698a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f22699b).hashCode();
        }

        private C8658c(Class<?> cls, boolean z) {
            this.f22698a = cls;
            this.f22699b = z;
        }
    }

    C8655n() {
    }

    /* renamed from: a */
    static void m40684a(List<C8641e<?>> list) {
        Set<C8657b> b = m40685b(list);
        Set a = m40683a(b);
        int i = 0;
        while (!a.isEmpty()) {
            C8657b bVar = (C8657b) a.iterator().next();
            a.remove(bVar);
            i++;
            for (C8657b bVar2 : bVar.mo32014b()) {
                bVar2.mo32016c(bVar);
                if (bVar2.mo32018d()) {
                    a.add(bVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C8657b bVar3 : b) {
                if (!bVar3.mo32018d() && !bVar3.mo32017c()) {
                    arrayList.add(bVar3.mo32012a());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C8657b> m40685b(List<C8641e<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        for (C8641e eVar : list) {
            C8657b bVar = new C8657b(eVar);
            Iterator it = eVar.mo31993c().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C8658c cVar = new C8658c(cls, !eVar.mo31998h());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(cVar);
                    if (set.isEmpty() || cVar.f22699b) {
                        set.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C8657b> it2 : hashMap.values()) {
            for (C8657b bVar2 : it2) {
                for (C8659o oVar : bVar2.mo32012a().mo31991a()) {
                    if (oVar.mo32022b()) {
                        Set<C8657b> set2 = (Set) hashMap.get(new C8658c(oVar.mo32021a(), oVar.mo32024d()));
                        if (set2 != null) {
                            for (C8657b bVar3 : set2) {
                                bVar2.mo32013a(bVar3);
                                bVar3.mo32015b(bVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C8657b> m40683a(Set<C8657b> set) {
        HashSet hashSet = new HashSet();
        for (C8657b bVar : set) {
            if (bVar.mo32018d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }
}
