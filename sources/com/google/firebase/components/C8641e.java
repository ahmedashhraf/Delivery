package com.google.firebase.components;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@C4056a
/* renamed from: com.google.firebase.components.e */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public final class C8641e<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f22669a;

    /* renamed from: b */
    private final Set<C8659o> f22670b;

    /* renamed from: c */
    private final int f22671c;

    /* renamed from: d */
    private final int f22672d;

    /* renamed from: e */
    private final C8649h<T> f22673e;

    /* renamed from: f */
    private final Set<Class<?>> f22674f;

    @C4056a
    /* renamed from: com.google.firebase.components.e$b */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    public static class C8643b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f22675a;

        /* renamed from: b */
        private final Set<C8659o> f22676b;

        /* renamed from: c */
        private int f22677c;

        /* renamed from: d */
        private int f22678d;

        /* renamed from: e */
        private C8649h<T> f22679e;

        /* renamed from: f */
        private Set<Class<?>> f22680f;

        /* renamed from: b */
        private void m40650b(Class<?> cls) {
            C4300a0.m18628a(!this.f22675a.contains(cls), (Object) "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C8643b<T> m40651d() {
            this.f22678d = 1;
            return this;
        }

        @C4056a
        /* renamed from: c */
        public C8643b<T> mo32005c() {
            return m40648a(2);
        }

        @SafeVarargs
        private C8643b(Class<T> cls, Class<? super T>... clsArr) {
            this.f22675a = new HashSet();
            this.f22676b = new HashSet();
            this.f22677c = 0;
            this.f22678d = 0;
            this.f22680f = new HashSet();
            String str = "Null interface";
            C4300a0.m18621a(cls, (Object) str);
            this.f22675a.add(cls);
            for (Class<? super T> a : clsArr) {
                C4300a0.m18621a(a, (Object) str);
            }
            Collections.addAll(this.f22675a, clsArr);
        }

        @C4056a
        /* renamed from: a */
        public C8643b<T> mo32002a(C8659o oVar) {
            C4300a0.m18621a(oVar, (Object) "Null dependency");
            m40650b(oVar.mo32021a());
            this.f22676b.add(oVar);
            return this;
        }

        @C4056a
        /* renamed from: b */
        public C8641e<T> mo32004b() {
            C4300a0.m18632b(this.f22679e != null, "Missing required property: factory.");
            C8641e eVar = new C8641e(new HashSet(this.f22675a), new HashSet(this.f22676b), this.f22677c, this.f22678d, this.f22679e, this.f22680f);
            return eVar;
        }

        @C4056a
        /* renamed from: a */
        public C8643b<T> mo32000a() {
            return m40648a(1);
        }

        @C4056a
        /* renamed from: a */
        public C8643b<T> mo32003a(Class<?> cls) {
            this.f22680f.add(cls);
            return this;
        }

        /* renamed from: a */
        private C8643b<T> m40648a(int i) {
            C4300a0.m18632b(this.f22677c == 0, "Instantiation type has already been set.");
            this.f22677c = i;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C8643b<T> mo32001a(C8649h<T> hVar) {
            this.f22679e = (C8649h) C4300a0.m18621a(hVar, (Object) "Null factory");
            return this;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m40636a(Object obj, C8644f fVar) {
        return obj;
    }

    /* renamed from: b */
    static /* synthetic */ Object m40638b(Object obj, C8644f fVar) {
        return obj;
    }

    /* renamed from: c */
    static /* synthetic */ Object m40639c(Object obj, C8644f fVar) {
        return obj;
    }

    /* renamed from: a */
    public Set<C8659o> mo31991a() {
        return this.f22670b;
    }

    /* renamed from: b */
    public C8649h<T> mo31992b() {
        return this.f22673e;
    }

    /* renamed from: c */
    public Set<Class<? super T>> mo31993c() {
        return this.f22669a;
    }

    /* renamed from: d */
    public Set<Class<?>> mo31994d() {
        return this.f22674f;
    }

    /* renamed from: e */
    public boolean mo31995e() {
        return this.f22671c == 1;
    }

    /* renamed from: f */
    public boolean mo31996f() {
        return this.f22671c == 2;
    }

    /* renamed from: g */
    public boolean mo31997g() {
        return this.f22671c == 0;
    }

    /* renamed from: h */
    public boolean mo31998h() {
        return this.f22672d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f22669a.toArray()));
        sb.append(">{");
        sb.append(this.f22671c);
        sb.append(", type=");
        sb.append(this.f22672d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f22670b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    private C8641e(Set<Class<? super T>> set, Set<C8659o> set2, int i, int i2, C8649h<T> hVar, Set<Class<?>> set3) {
        this.f22669a = Collections.unmodifiableSet(set);
        this.f22670b = Collections.unmodifiableSet(set2);
        this.f22671c = i;
        this.f22672d = i2;
        this.f22673e = hVar;
        this.f22674f = Collections.unmodifiableSet(set3);
    }

    @C4056a
    /* renamed from: a */
    public static <T> C8643b<T> m40631a(Class<T> cls) {
        return new C8643b<>(cls, new Class[0]);
    }

    @C4056a
    /* renamed from: b */
    public static <T> C8643b<T> m40637b(Class<T> cls) {
        return m40631a(cls).m40651d();
    }

    @C4056a
    @SafeVarargs
    /* renamed from: a */
    public static <T> C8643b<T> m40632a(Class<T> cls, Class<? super T>... clsArr) {
        return new C8643b<>(cls, clsArr);
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static <T> C8641e<T> m40633a(Class<T> cls, T t) {
        return m40631a(cls).mo32001a(C8638b.m40625a((Object) t)).mo32004b();
    }

    @C4056a
    @SafeVarargs
    /* renamed from: a */
    public static <T> C8641e<T> m40635a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m40632a(cls, clsArr).mo32001a(C8639c.m40627a((Object) t)).mo32004b();
    }

    @C4056a
    /* renamed from: a */
    public static <T> C8641e<T> m40634a(T t, Class<T> cls) {
        return m40637b(cls).mo32001a(C8640d.m40629a((Object) t)).mo32004b();
    }
}
