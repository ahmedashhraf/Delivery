package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.util.concurrent.m */
/* compiled from: Atomics */
public final class C8543m {
    private C8543m() {
    }

    /* renamed from: a */
    public static <V> AtomicReference<V> m40358a() {
        return new AtomicReference<>();
    }

    /* renamed from: a */
    public static <V> AtomicReference<V> m40359a(@C5952h V v) {
        return new AtomicReference<>(v);
    }

    /* renamed from: a */
    public static <E> AtomicReferenceArray<E> m40360a(int i) {
        return new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public static <E> AtomicReferenceArray<E> m40361a(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }
}
