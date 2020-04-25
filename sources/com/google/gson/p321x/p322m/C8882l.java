package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8785j;
import com.google.gson.C8786k;
import com.google.gson.C8787l;
import com.google.gson.C8792q;
import com.google.gson.C8793r;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.JsonParseException;
import com.google.gson.p321x.C8806a;
import com.google.gson.p321x.C8850k;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Type;

/* renamed from: com.google.gson.x.m.l */
/* compiled from: TreeTypeAdapter */
public final class C8882l<T> extends C8803u<T> {

    /* renamed from: a */
    private final C8793r<T> f23265a;

    /* renamed from: b */
    private final C8786k<T> f23266b;

    /* renamed from: c */
    final C8775f f23267c;

    /* renamed from: d */
    private final C8928a<T> f23268d;

    /* renamed from: e */
    private final C8805v f23269e;

    /* renamed from: f */
    private final C8884b f23270f = new C8884b<>();

    /* renamed from: g */
    private C8803u<T> f23271g;

    /* renamed from: com.google.gson.x.m.l$b */
    /* compiled from: TreeTypeAdapter */
    private final class C8884b implements C8792q, C8785j {
        private C8884b() {
        }

        /* renamed from: a */
        public C8787l mo32428a(Object obj) {
            return C8882l.this.f23267c.mo32325b(obj);
        }

        /* renamed from: a */
        public C8787l mo32429a(Object obj, Type type) {
            return C8882l.this.f23267c.mo32326b(obj, type);
        }

        /* renamed from: a */
        public <R> R mo32389a(C8787l lVar, Type type) throws JsonParseException {
            return C8882l.this.f23267c.mo32310a(lVar, type);
        }
    }

    /* renamed from: com.google.gson.x.m.l$c */
    /* compiled from: TreeTypeAdapter */
    private static final class C8885c implements C8805v {

        /* renamed from: N */
        private final Class<?> f23273N;

        /* renamed from: O */
        private final C8793r<?> f23274O;

        /* renamed from: P */
        private final C8786k<?> f23275P;

        /* renamed from: a */
        private final C8928a<?> f23276a;

        /* renamed from: b */
        private final boolean f23277b;

        C8885c(Object obj, C8928a<?> aVar, boolean z, Class<?> cls) {
            C8786k<?> kVar = null;
            this.f23274O = obj instanceof C8793r ? (C8793r) obj : null;
            if (obj instanceof C8786k) {
                kVar = (C8786k) obj;
            }
            this.f23275P = kVar;
            C8806a.m41345a((this.f23274O == null && this.f23275P == null) ? false : true);
            this.f23276a = aVar;
            this.f23277b = z;
            this.f23273N = cls;
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            C8928a<?> aVar2 = this.f23276a;
            boolean z = aVar2 != null ? aVar2.equals(aVar) || (this.f23277b && this.f23276a.mo32664b() == aVar.mo32660a()) : this.f23273N.isAssignableFrom(aVar.mo32660a());
            if (!z) {
                return null;
            }
            C8882l lVar = new C8882l(this.f23274O, this.f23275P, fVar, aVar, this);
            return lVar;
        }
    }

    public C8882l(C8793r<T> rVar, C8786k<T> kVar, C8775f fVar, C8928a<T> aVar, C8805v vVar) {
        this.f23265a = rVar;
        this.f23266b = kVar;
        this.f23267c = fVar;
        this.f23268d = aVar;
        this.f23269e = vVar;
    }

    /* renamed from: b */
    private C8803u<T> m41540b() {
        C8803u<T> uVar = this.f23271g;
        if (uVar != null) {
            return uVar;
        }
        C8803u<T> a = this.f23267c.mo32305a(this.f23269e, this.f23268d);
        this.f23271g = a;
        return a;
    }

    /* renamed from: a */
    public T mo32287a(C8795a aVar) throws IOException {
        if (this.f23266b == null) {
            return m41540b().mo32287a(aVar);
        }
        C8787l a = C8850k.m41444a(aVar);
        if (a.mo32391A()) {
            return null;
        }
        return this.f23266b.mo32390a(a, this.f23268d.mo32664b(), this.f23270f);
    }

    /* renamed from: b */
    public static C8805v m41541b(C8928a<?> aVar, Object obj) {
        return new C8885c(obj, aVar, aVar.mo32664b() == aVar.mo32660a(), null);
    }

    /* renamed from: a */
    public void mo32288a(C8799d dVar, T t) throws IOException {
        C8793r<T> rVar = this.f23265a;
        if (rVar == null) {
            m41540b().mo32288a(dVar, t);
        } else if (t == null) {
            dVar.mo32456B();
        } else {
            C8850k.m41446a(rVar.mo32430a(t, this.f23268d.mo32664b(), this.f23270f), dVar);
        }
    }

    /* renamed from: a */
    public static C8805v m41538a(C8928a<?> aVar, Object obj) {
        return new C8885c(obj, aVar, false, null);
    }

    /* renamed from: a */
    public static C8805v m41539a(Class<?> cls, Object obj) {
        return new C8885c(obj, null, false, cls);
    }
}
