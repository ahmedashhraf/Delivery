package com.google.gson.p321x;

import com.google.gson.C8766b;
import com.google.gson.C8767c;
import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5863d;
import com.google.gson.p193w.C5864e;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.gson.x.d */
/* compiled from: Excluder */
public final class C8826d implements C8805v, Cloneable {

    /* renamed from: R */
    private static final double f23132R = -1.0d;

    /* renamed from: S */
    public static final C8826d f23133S = new C8826d();

    /* renamed from: N */
    private boolean f23134N = true;

    /* renamed from: O */
    private boolean f23135O;

    /* renamed from: P */
    private List<C8766b> f23136P = Collections.emptyList();

    /* renamed from: Q */
    private List<C8766b> f23137Q = Collections.emptyList();

    /* renamed from: a */
    private double f23138a = f23132R;

    /* renamed from: b */
    private int f23139b = C13959t.f40863Y1;

    /* renamed from: com.google.gson.x.d$a */
    /* compiled from: Excluder */
    class C8827a extends C8803u<T> {

        /* renamed from: a */
        private C8803u<T> f23140a;

        /* renamed from: b */
        final /* synthetic */ boolean f23141b;

        /* renamed from: c */
        final /* synthetic */ boolean f23142c;

        /* renamed from: d */
        final /* synthetic */ C8775f f23143d;

        /* renamed from: e */
        final /* synthetic */ C8928a f23144e;

        C8827a(boolean z, boolean z2, C8775f fVar, C8928a aVar) {
            this.f23141b = z;
            this.f23142c = z2;
            this.f23143d = fVar;
            this.f23144e = aVar;
        }

        /* renamed from: b */
        private C8803u<T> m41398b() {
            C8803u<T> uVar = this.f23140a;
            if (uVar != null) {
                return uVar;
            }
            C8803u<T> a = this.f23143d.mo32305a((C8805v) C8826d.this, this.f23144e);
            this.f23140a = a;
            return a;
        }

        /* renamed from: a */
        public T mo32287a(C8795a aVar) throws IOException {
            if (!this.f23141b) {
                return m41398b().mo32287a(aVar);
            }
            aVar.mo32443N();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, T t) throws IOException {
            if (this.f23142c) {
                dVar.mo32456B();
            } else {
                m41398b().mo32288a(dVar, t);
            }
        }
    }

    /* renamed from: a */
    public C8826d mo32505a(double d) {
        C8826d clone = clone();
        clone.f23138a = d;
        return clone;
    }

    /* renamed from: b */
    public C8826d mo32510b() {
        C8826d clone = clone();
        clone.f23134N = false;
        return clone;
    }

    /* renamed from: c */
    public C8826d mo32511c() {
        C8826d clone = clone();
        clone.f23135O = true;
        return clone;
    }

    /* access modifiers changed from: protected */
    public C8826d clone() {
        try {
            return (C8826d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private boolean m41388b(Class<?> cls) {
        return cls.isMemberClass() && !m41389c(cls);
    }

    /* renamed from: c */
    private boolean m41389c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public C8826d mo32507a(int... iArr) {
        C8826d clone = clone();
        clone.f23139b = 0;
        for (int i : iArr) {
            clone.f23139b = i | clone.f23139b;
        }
        return clone;
    }

    /* renamed from: a */
    public C8826d mo32506a(C8766b bVar, boolean z, boolean z2) {
        C8826d clone = clone();
        if (z) {
            clone.f23136P = new ArrayList(this.f23136P);
            clone.f23136P.add(bVar);
        }
        if (z2) {
            clone.f23137Q = new ArrayList(this.f23137Q);
            clone.f23137Q.add(bVar);
        }
        return clone;
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
        Class a = aVar.mo32660a();
        boolean a2 = mo32508a(a, true);
        boolean a3 = mo32508a(a, false);
        if (!a2 && !a3) {
            return null;
        }
        C8827a aVar2 = new C8827a(a3, a2, fVar, aVar);
        return aVar2;
    }

    /* renamed from: a */
    public boolean mo32509a(Field field, boolean z) {
        if ((this.f23139b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f23138a != f23132R && !m41385a((C5863d) field.getAnnotation(C5863d.class), (C5864e) field.getAnnotation(C5864e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f23135O) {
            C5860a aVar = (C5860a) field.getAnnotation(C5860a.class);
            if (aVar == null || (!z ? !aVar.deserialize() : !aVar.serialize())) {
                return true;
            }
        }
        if ((!this.f23134N && m41388b(field.getType())) || m41387a(field.getType())) {
            return true;
        }
        List<C8766b> list = z ? this.f23136P : this.f23137Q;
        if (!list.isEmpty()) {
            C8767c cVar = new C8767c(field);
            for (C8766b a : list) {
                if (a.mo32291a(cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo32508a(Class<?> cls, boolean z) {
        if (this.f23138a != f23132R && !m41385a((C5863d) cls.getAnnotation(C5863d.class), (C5864e) cls.getAnnotation(C5864e.class))) {
            return true;
        }
        if ((!this.f23134N && m41388b(cls)) || m41387a(cls)) {
            return true;
        }
        for (C8766b a : z ? this.f23136P : this.f23137Q) {
            if (a.mo32292a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m41387a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: a */
    private boolean m41385a(C5863d dVar, C5864e eVar) {
        return m41384a(dVar) && m41386a(eVar);
    }

    /* renamed from: a */
    private boolean m41384a(C5863d dVar) {
        return dVar == null || dVar.value() <= this.f23138a;
    }

    /* renamed from: a */
    private boolean m41386a(C5864e eVar) {
        return eVar == null || eVar.value() > this.f23138a;
    }
}
