package com.google.common.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p150g.C6646i;

/* renamed from: com.google.common.collect.m4 */
/* compiled from: MutableClassToInstanceMap */
public final class C8045m4<B> extends C7571i<Class<? extends B>, B> implements C8254x<B> {

    /* renamed from: O */
    private static final C7542a4<Class<?>, Object> f21835O = new C8046a();

    /* renamed from: P */
    private static final long f21836P = 0;

    /* renamed from: com.google.common.collect.m4$a */
    /* compiled from: MutableClassToInstanceMap */
    static class C8046a implements C7542a4<Class<?>, Object> {
        C8046a() {
        }

        /* renamed from: a */
        public void mo29640a(Class<?> cls, Object obj) {
            C8045m4.m38497c(cls, obj);
        }
    }

    private C8045m4(Map<Class<? extends B>, B> map) {
        super(map, f21835O);
    }

    /* renamed from: E */
    public static <B> C8045m4<B> m38494E() {
        return new C8045m4<>(new HashMap());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <B, T extends B> T m38497c(Class<T> cls, B b) {
        return C6646i.m31727c(cls).cast(b);
    }

    /* renamed from: a */
    public <T extends B> T mo30819a(Class<T> cls, T t) {
        return m38497c(cls, put(cls, t));
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    /* renamed from: b */
    public static <B> C8045m4<B> m38495b(Map<Class<? extends B>, B> map) {
        return new C8045m4<>(map);
    }

    /* renamed from: a */
    public <T extends B> T mo30818a(Class<T> cls) {
        return m38497c(cls, get(cls));
    }
}
