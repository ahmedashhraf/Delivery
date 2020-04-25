package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.p321x.C8807b;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.google.gson.x.m.a */
/* compiled from: ArrayTypeAdapter */
public final class C8858a<E> extends C8803u<Object> {

    /* renamed from: c */
    public static final C8805v f23215c = new C8859a();

    /* renamed from: a */
    private final Class<E> f23216a;

    /* renamed from: b */
    private final C8803u<E> f23217b;

    /* renamed from: com.google.gson.x.m.a$a */
    /* compiled from: ArrayTypeAdapter */
    static class C8859a implements C8805v {
        C8859a() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            Type b = aVar.mo32664b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            Type d = C8807b.m41361d(b);
            return new C8858a(fVar, fVar.mo32306a(C8928a.m41700b(d)), C8807b.m41362e(d));
        }
    }

    public C8858a(C8775f fVar, C8803u<E> uVar, Class<E> cls) {
        this.f23217b = new C8886m(fVar, uVar, cls);
        this.f23216a = cls;
    }

    /* renamed from: a */
    public Object mo32287a(C8795a aVar) throws IOException {
        if (aVar.peek() == C8798c.NULL) {
            aVar.mo32441L();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo32444a();
        while (aVar.mo32452i()) {
            arrayList.add(this.f23217b.mo32287a(aVar));
        }
        aVar.mo32449f();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f23216a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo32288a(C8799d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.mo32456B();
            return;
        }
        dVar.mo32457a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f23217b.mo32288a(dVar, Array.get(obj, i));
        }
        dVar.mo32471e();
    }
}
