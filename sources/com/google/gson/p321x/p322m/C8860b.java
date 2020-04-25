package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.p321x.C8807b;
import com.google.gson.p321x.C8811c;
import com.google.gson.p321x.C8848i;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.gson.x.m.b */
/* compiled from: CollectionTypeAdapterFactory */
public final class C8860b implements C8805v {

    /* renamed from: a */
    private final C8811c f23218a;

    /* renamed from: com.google.gson.x.m.b$a */
    /* compiled from: CollectionTypeAdapterFactory */
    private static final class C8861a<E> extends C8803u<Collection<E>> {

        /* renamed from: a */
        private final C8803u<E> f23219a;

        /* renamed from: b */
        private final C8848i<? extends Collection<E>> f23220b;

        public C8861a(C8775f fVar, Type type, C8803u<E> uVar, C8848i<? extends Collection<E>> iVar) {
            this.f23219a = new C8886m(fVar, uVar, type);
            this.f23220b = iVar;
        }

        /* renamed from: a */
        public Collection<E> m41459a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            Collection<E> collection = (Collection) this.f23220b.mo32504a();
            aVar.mo32444a();
            while (aVar.mo32452i()) {
                collection.add(this.f23219a.mo32287a(aVar));
            }
            aVar.mo32449f();
            return collection;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                dVar.mo32456B();
                return;
            }
            dVar.mo32457a();
            for (E a : collection) {
                this.f23219a.mo32288a(dVar, a);
            }
            dVar.mo32471e();
        }
    }

    public C8860b(C8811c cVar) {
        this.f23218a = cVar;
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
        Type b = aVar.mo32664b();
        Class a = aVar.mo32660a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = C8807b.m41351a(b, a);
        return new C8861a(fVar, a2, fVar.mo32306a(C8928a.m41700b(a2)), this.f23218a.mo32502a(aVar));
    }
}
