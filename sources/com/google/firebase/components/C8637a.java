package com.google.firebase.components;

import com.google.firebase.p317l.C8738a;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
abstract class C8637a implements C8644f {
    C8637a() {
    }

    /* renamed from: a */
    public <T> T mo31989a(Class<T> cls) {
        C8738a b = mo32006b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    /* renamed from: d */
    public <T> Set<T> mo31990d(Class<T> cls) {
        return (Set) mo32007c(cls).get();
    }
}
