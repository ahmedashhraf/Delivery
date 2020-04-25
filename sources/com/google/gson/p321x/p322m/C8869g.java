package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8787l;
import com.google.gson.C8791p;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p321x.C8807b;
import com.google.gson.p321x.C8811c;
import com.google.gson.p321x.C8828e;
import com.google.gson.p321x.C8848i;
import com.google.gson.p321x.C8850k;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.gson.x.m.g */
/* compiled from: MapTypeAdapterFactory */
public final class C8869g implements C8805v {

    /* renamed from: a */
    private final C8811c f23236a;

    /* renamed from: b */
    final boolean f23237b;

    /* renamed from: com.google.gson.x.m.g$a */
    /* compiled from: MapTypeAdapterFactory */
    private final class C8870a<K, V> extends C8803u<Map<K, V>> {

        /* renamed from: a */
        private final C8803u<K> f23238a;

        /* renamed from: b */
        private final C8803u<V> f23239b;

        /* renamed from: c */
        private final C8848i<? extends Map<K, V>> f23240c;

        public C8870a(C8775f fVar, Type type, C8803u<K> uVar, Type type2, C8803u<V> uVar2, C8848i<? extends Map<K, V>> iVar) {
            this.f23238a = new C8886m(fVar, uVar, type);
            this.f23239b = new C8886m(fVar, uVar2, type2);
            this.f23240c = iVar;
        }

        /* renamed from: b */
        private String m41506b(C8787l lVar) {
            if (lVar.mo32393D()) {
                C8791p u = lVar.mo32399u();
                if (u.mo32423F()) {
                    return String.valueOf(u.mo32386w());
                }
                if (u.mo32422E()) {
                    return Boolean.toString(u.mo32374f());
                }
                if (u.mo32424G()) {
                    return u.mo32388y();
                }
                throw new AssertionError();
            } else if (lVar.mo32391A()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public Map<K, V> m41508a(C8795a aVar) throws IOException {
            C8798c peek = aVar.peek();
            if (peek == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            Map<K, V> map = (Map) this.f23240c.mo32504a();
            String str = "duplicate key: ";
            if (peek == C8798c.BEGIN_ARRAY) {
                aVar.mo32444a();
                while (aVar.mo32452i()) {
                    aVar.mo32444a();
                    Object a = this.f23238a.mo32287a(aVar);
                    if (map.put(a, this.f23239b.mo32287a(aVar)) == null) {
                        aVar.mo32449f();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(a);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                aVar.mo32449f();
            } else {
                aVar.mo32447d();
                while (aVar.mo32452i()) {
                    C8828e.f23146a.mo32455a(aVar);
                    Object a2 = this.f23238a.mo32287a(aVar);
                    if (map.put(a2, this.f23239b.mo32287a(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(a2);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                aVar.mo32450g();
            }
            return map;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Map<K, V> map) throws IOException {
            if (map == null) {
                dVar.mo32456B();
            } else if (!C8869g.this.f23237b) {
                dVar.mo32468d();
                for (Entry entry : map.entrySet()) {
                    dVar.mo32465c(String.valueOf(entry.getKey()));
                    this.f23239b.mo32288a(dVar, entry.getValue());
                }
                dVar.mo32473f();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    C8787l b = this.f23238a.mo32485b(entry2.getKey());
                    arrayList.add(b);
                    arrayList2.add(entry2.getValue());
                    z |= b.mo32400z() || b.mo32392C();
                }
                if (z) {
                    dVar.mo32457a();
                    int size = arrayList.size();
                    while (i < size) {
                        dVar.mo32457a();
                        C8850k.m41446a((C8787l) arrayList.get(i), dVar);
                        this.f23239b.mo32288a(dVar, arrayList2.get(i));
                        dVar.mo32471e();
                        i++;
                    }
                    dVar.mo32471e();
                } else {
                    dVar.mo32468d();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        dVar.mo32465c(m41506b((C8787l) arrayList.get(i)));
                        this.f23239b.mo32288a(dVar, arrayList2.get(i));
                        i++;
                    }
                    dVar.mo32473f();
                }
            }
        }
    }

    public C8869g(C8811c cVar, boolean z) {
        this.f23236a = cVar;
        this.f23237b = z;
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
        Type b = aVar.mo32664b();
        if (!Map.class.isAssignableFrom(aVar.mo32660a())) {
            return null;
        }
        Type[] b2 = C8807b.m41359b(b, C8807b.m41362e(b));
        C8775f fVar2 = fVar;
        C8870a aVar2 = new C8870a(fVar2, b2[0], m41504a(fVar, b2[0]), b2[1], fVar.mo32306a(C8928a.m41700b(b2[1])), this.f23236a.mo32502a(aVar));
        return aVar2;
    }

    /* renamed from: a */
    private C8803u<?> m41504a(C8775f fVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C8887n.f23312f;
        }
        return fVar.mo32306a(C8928a.m41700b(type));
    }
}
