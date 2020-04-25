package com.google.common.base;

import java.lang.ref.WeakReference;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: com.google.common.base.w */
/* compiled from: Platform */
final class C7396w {
    private C7396w() {
    }

    /* renamed from: a */
    static long m35660a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    static C5799e m35661a(C5799e eVar) {
        return eVar.mo23101c();
    }

    /* renamed from: a */
    static <T extends Enum<T>> C7392u<T> m35662a(Class<T> cls, String str) {
        WeakReference weakReference = (WeakReference) C7354i.m35574a(cls).get(str);
        return weakReference == null ? C7392u.m35646g() : C7392u.m35645c(cls.cast(weakReference.get()));
    }
}
