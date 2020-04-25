package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C8302z2.C8303a;
import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p150g.C6646i;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.collect.s2 */
/* compiled from: ImmutableClassToInstanceMap */
public final class C8142s2<B> extends C8220v1<Class<? extends B>, B> implements C8254x<B>, Serializable {

    /* renamed from: a */
    private final C8302z2<Class<? extends B>, B> f21951a;

    /* renamed from: com.google.common.collect.s2$b */
    /* compiled from: ImmutableClassToInstanceMap */
    public static final class C8144b<B> {

        /* renamed from: a */
        private final C8303a<Class<? extends B>, B> f21952a = C8302z2.m39628g();

        /* renamed from: b */
        private static <B, T extends B> T m38995b(Class<T> cls, B b) {
            return C6646i.m31727c(cls).cast(b);
        }

        /* renamed from: a */
        public <T extends B> C8144b<B> mo31017a(Class<T> cls, T t) {
            this.f21952a.mo30687a(cls, t);
            return this;
        }

        /* renamed from: a */
        public <T extends B> C8144b<B> mo31018a(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Entry entry : map.entrySet()) {
                Class cls = (Class) entry.getKey();
                this.f21952a.mo30687a(cls, m38995b(cls, entry.getValue()));
            }
            return this;
        }

        /* renamed from: a */
        public C8142s2<B> mo31019a() {
            return new C8142s2<>(this.f21952a.mo30690a());
        }
    }

    /* renamed from: E */
    public static <B> C8144b<B> m38989E() {
        return new C8144b<>();
    }

    /* renamed from: b */
    public static <B, S extends B> C8142s2<B> m38990b(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof C8142s2) {
            return (C8142s2) map;
        }
        return new C8144b().mo31018a(map).mo31019a();
    }

    @C5952h
    /* renamed from: a */
    public <T extends B> T mo30818a(Class<T> cls) {
        return this.f21951a.get(C7397x.m35664a(cls));
    }

    private C8142s2(C8302z2<Class<? extends B>, B> z2Var) {
        this.f21951a = z2Var;
    }

    @Deprecated
    /* renamed from: a */
    public <T extends B> T mo30819a(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Map<Class<? extends B>, B> m38994y() {
        return this.f21951a;
    }
}
