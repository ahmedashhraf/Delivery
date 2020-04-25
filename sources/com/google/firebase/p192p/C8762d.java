package com.google.firebase.p192p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.p.d */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class C8762d {

    /* renamed from: b */
    private static volatile C8762d f22980b;

    /* renamed from: a */
    private final Set<C5859e> f22981a = new HashSet();

    C8762d() {
    }

    /* renamed from: b */
    public static C8762d m41061b() {
        C8762d dVar = f22980b;
        if (dVar == null) {
            synchronized (C8762d.class) {
                dVar = f22980b;
                if (dVar == null) {
                    dVar = new C8762d();
                    f22980b = dVar;
                }
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo32279a(String str, String str2) {
        synchronized (this.f22981a) {
            this.f22981a.add(C5859e.m25733a(str, str2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Set<C5859e> mo32278a() {
        Set<C5859e> unmodifiableSet;
        synchronized (this.f22981a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f22981a);
        }
        return unmodifiableSet;
    }
}
