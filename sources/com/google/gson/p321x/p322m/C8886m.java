package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.p321x.p322m.C8874i.C8876b;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.x.m.m */
/* compiled from: TypeAdapterRuntimeTypeWrapper */
final class C8886m<T> extends C8803u<T> {

    /* renamed from: a */
    private final C8775f f23278a;

    /* renamed from: b */
    private final C8803u<T> f23279b;

    /* renamed from: c */
    private final Type f23280c;

    C8886m(C8775f fVar, C8803u<T> uVar, Type type) {
        this.f23278a = fVar;
        this.f23279b = uVar;
        this.f23280c = type;
    }

    /* renamed from: a */
    public T mo32287a(C8795a aVar) throws IOException {
        return this.f23279b.mo32287a(aVar);
    }

    /* renamed from: a */
    public void mo32288a(C8799d dVar, T t) throws IOException {
        C8803u<T> uVar = this.f23279b;
        Type a = m41548a(this.f23280c, (Object) t);
        if (a != this.f23280c) {
            uVar = this.f23278a.mo32306a(C8928a.m41700b(a));
            if (uVar instanceof C8876b) {
                C8803u<T> uVar2 = this.f23279b;
                if (!(uVar2 instanceof C8876b)) {
                    uVar = uVar2;
                }
            }
        }
        uVar.mo32288a(dVar, t);
    }

    /* renamed from: a */
    private Type m41548a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }
}
