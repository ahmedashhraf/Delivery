package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7359j;
import com.google.common.base.C7380p;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
@Deprecated
@C2775a
/* renamed from: com.google.common.collect.j2 */
/* compiled from: GenericMapMaker */
abstract class C7931j2<K0, V0> {
    @C2777c("To be supported")

    /* renamed from: a */
    C7671f<K0, V0> f21668a;

    @C2777c("To be supported")
    /* renamed from: com.google.common.collect.j2$a */
    /* compiled from: GenericMapMaker */
    enum C7932a implements C7671f<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo29980a(C7672g<Object, Object> gVar) {
        }
    }

    C7931j2() {
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: a */
    public <K extends K0, V extends V0> C7671f<K, V> mo30660a() {
        return (C7671f) C5827t.m25564b(this.f21668a, C7932a.INSTANCE);
    }

    /* renamed from: a */
    public abstract C7931j2<K0, V0> mo29943a(int i);

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: a */
    public abstract C7931j2<K0, V0> mo29944a(long j, TimeUnit timeUnit);

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: a */
    public abstract C7931j2<K0, V0> mo29945a(C7359j<Object> jVar);

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: a */
    public abstract <K extends K0, V extends V0> ConcurrentMap<K, V> mo29948a(C7380p<? super K, ? extends V> pVar);

    /* access modifiers changed from: 0000 */
    @C2777c("MapMakerInternalMap")
    /* renamed from: b */
    public abstract <K, V> C7717e4<K, V> mo29952b();

    /* renamed from: b */
    public abstract C7931j2<K0, V0> mo29949b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C7931j2<K0, V0> mo29950b(long j, TimeUnit timeUnit);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C7931j2<K0, V0> mo29953c(int i);

    /* renamed from: c */
    public abstract <K extends K0, V extends V0> ConcurrentMap<K, V> mo29954c();

    @C2777c("java.lang.ref.SoftReference")
    @Deprecated
    /* renamed from: d */
    public abstract C7931j2<K0, V0> mo29955d();

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: e */
    public abstract C7931j2<K0, V0> mo29956e();

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: f */
    public abstract C7931j2<K0, V0> mo29957f();
}
