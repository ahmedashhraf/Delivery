package com.google.firebase.components;

import com.google.firebase.p314i.C8671a;
import com.google.firebase.p314i.C8673c;
import com.google.firebase.p317l.C8738a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.s */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
final class C8663s extends C8637a {

    /* renamed from: a */
    private final Set<Class<?>> f22711a;

    /* renamed from: b */
    private final Set<Class<?>> f22712b;

    /* renamed from: c */
    private final Set<Class<?>> f22713c;

    /* renamed from: d */
    private final Set<Class<?>> f22714d;

    /* renamed from: e */
    private final Set<Class<?>> f22715e;

    /* renamed from: f */
    private final C8644f f22716f;

    /* renamed from: com.google.firebase.components.s$a */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8664a implements C8673c {

        /* renamed from: a */
        private final Set<Class<?>> f22717a;

        /* renamed from: b */
        private final C8673c f22718b;

        public C8664a(Set<Class<?>> set, C8673c cVar) {
            this.f22717a = set;
            this.f22718b = cVar;
        }

        /* renamed from: a */
        public void mo32030a(C8671a<?> aVar) {
            if (this.f22717a.contains(aVar.mo32056b())) {
                this.f22718b.mo32030a(aVar);
            } else {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    C8663s(C8641e<?> eVar, C8644f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C8659o oVar : eVar.mo31991a()) {
            if (oVar.mo32022b()) {
                if (oVar.mo32024d()) {
                    hashSet3.add(oVar.mo32021a());
                } else {
                    hashSet.add(oVar.mo32021a());
                }
            } else if (oVar.mo32024d()) {
                hashSet4.add(oVar.mo32021a());
            } else {
                hashSet2.add(oVar.mo32021a());
            }
        }
        if (!eVar.mo31994d().isEmpty()) {
            hashSet.add(C8673c.class);
        }
        this.f22711a = Collections.unmodifiableSet(hashSet);
        this.f22712b = Collections.unmodifiableSet(hashSet2);
        this.f22713c = Collections.unmodifiableSet(hashSet3);
        this.f22714d = Collections.unmodifiableSet(hashSet4);
        this.f22715e = eVar.mo31994d();
        this.f22716f = fVar;
    }

    /* renamed from: a */
    public <T> T mo31989a(Class<T> cls) {
        if (this.f22711a.contains(cls)) {
            T a = this.f22716f.mo31989a(cls);
            if (!cls.equals(C8673c.class)) {
                return a;
            }
            return new C8664a(this.f22715e, (C8673c) a);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C8738a<T> mo32006b(Class<T> cls) {
        if (this.f22712b.contains(cls)) {
            return this.f22716f.mo32006b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C8738a<Set<T>> mo32007c(Class<T> cls) {
        if (this.f22714d.contains(cls)) {
            return this.f22716f.mo32007c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo31990d(Class<T> cls) {
        if (this.f22713c.contains(cls)) {
            return this.f22716f.mo31990d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
