package com.google.gson.p321x.p322m;

import com.google.gson.C8774e;
import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p193w.C5861b;
import com.google.gson.p193w.C5862c;
import com.google.gson.p321x.C8807b;
import com.google.gson.p321x.C8811c;
import com.google.gson.p321x.C8826d;
import com.google.gson.p321x.C8848i;
import com.google.gson.p321x.C8849j;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.x.m.i */
/* compiled from: ReflectiveTypeAdapterFactory */
public final class C8874i implements C8805v {

    /* renamed from: N */
    private final C8826d f23245N;

    /* renamed from: O */
    private final C8864d f23246O;

    /* renamed from: a */
    private final C8811c f23247a;

    /* renamed from: b */
    private final C8774e f23248b;

    /* renamed from: com.google.gson.x.m.i$a */
    /* compiled from: ReflectiveTypeAdapterFactory */
    class C8875a extends C8877c {

        /* renamed from: d */
        final /* synthetic */ Field f23249d;

        /* renamed from: e */
        final /* synthetic */ boolean f23250e;

        /* renamed from: f */
        final /* synthetic */ C8803u f23251f;

        /* renamed from: g */
        final /* synthetic */ C8775f f23252g;

        /* renamed from: h */
        final /* synthetic */ C8928a f23253h;

        /* renamed from: i */
        final /* synthetic */ boolean f23254i;

        C8875a(String str, boolean z, boolean z2, Field field, boolean z3, C8803u uVar, C8775f fVar, C8928a aVar, boolean z4) {
            this.f23249d = field;
            this.f23250e = z3;
            this.f23251f = uVar;
            this.f23252g = fVar;
            this.f23253h = aVar;
            this.f23254i = z4;
            super(str, z, z2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32622a(C8799d dVar, Object obj) throws IOException, IllegalAccessException {
            C8803u uVar;
            Object obj2 = this.f23249d.get(obj);
            if (this.f23250e) {
                uVar = this.f23251f;
            } else {
                uVar = new C8886m(this.f23252g, this.f23251f, this.f23253h.mo32664b());
            }
            uVar.mo32288a(dVar, obj2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32621a(C8795a aVar, Object obj) throws IOException, IllegalAccessException {
            Object a = this.f23251f.mo32287a(aVar);
            if (a != null || !this.f23254i) {
                this.f23249d.set(obj, a);
            }
        }

        /* renamed from: a */
        public boolean mo32623a(Object obj) throws IOException, IllegalAccessException {
            boolean z = false;
            if (!this.f23259b) {
                return false;
            }
            if (this.f23249d.get(obj) != obj) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.google.gson.x.m.i$b */
    /* compiled from: ReflectiveTypeAdapterFactory */
    public static final class C8876b<T> extends C8803u<T> {

        /* renamed from: a */
        private final C8848i<T> f23256a;

        /* renamed from: b */
        private final Map<String, C8877c> f23257b;

        C8876b(C8848i<T> iVar, Map<String, C8877c> map) {
            this.f23256a = iVar;
            this.f23257b = map;
        }

        /* renamed from: a */
        public T mo32287a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            T a = this.f23256a.mo32504a();
            try {
                aVar.mo32447d();
                while (aVar.mo32452i()) {
                    C8877c cVar = (C8877c) this.f23257b.get(aVar.mo32440K());
                    if (cVar != null) {
                        if (cVar.f23260c) {
                            cVar.mo32621a(aVar, (Object) a);
                        }
                    }
                    aVar.mo32443N();
                }
                aVar.mo32450g();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, T t) throws IOException {
            if (t == null) {
                dVar.mo32456B();
                return;
            }
            dVar.mo32468d();
            try {
                for (C8877c cVar : this.f23257b.values()) {
                    if (cVar.mo32623a(t)) {
                        dVar.mo32465c(cVar.f23258a);
                        cVar.mo32622a(dVar, (Object) t);
                    }
                }
                dVar.mo32473f();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.x.m.i$c */
    /* compiled from: ReflectiveTypeAdapterFactory */
    static abstract class C8877c {

        /* renamed from: a */
        final String f23258a;

        /* renamed from: b */
        final boolean f23259b;

        /* renamed from: c */
        final boolean f23260c;

        protected C8877c(String str, boolean z, boolean z2) {
            this.f23258a = str;
            this.f23259b = z;
            this.f23260c = z2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo32621a(C8795a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo32622a(C8799d dVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo32623a(Object obj) throws IOException, IllegalAccessException;
    }

    public C8874i(C8811c cVar, C8774e eVar, C8826d dVar, C8864d dVar2) {
        this.f23247a = cVar;
        this.f23248b = eVar;
        this.f23245N = dVar;
        this.f23246O = dVar2;
    }

    /* renamed from: a */
    public boolean mo32620a(Field field, boolean z) {
        return m41517a(field, z, this.f23245N);
    }

    /* renamed from: a */
    static boolean m41517a(Field field, boolean z, C8826d dVar) {
        return !dVar.mo32508a(field.getType(), z) && !dVar.mo32509a(field, z);
    }

    /* renamed from: a */
    private List<String> m41515a(Field field) {
        C5862c cVar = (C5862c) field.getAnnotation(C5862c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f23248b.mo32302a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
        Class a = aVar.mo32660a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new C8876b(this.f23247a.mo32502a(aVar), m41516a(fVar, aVar, a));
    }

    /* renamed from: a */
    private C8877c m41514a(C8775f fVar, Field field, String str, C8928a<?> aVar, boolean z, boolean z2) {
        C8775f fVar2 = fVar;
        C8928a<?> aVar2 = aVar;
        boolean a = C8849j.m41441a((Type) aVar.mo32660a());
        Field field2 = field;
        C5861b bVar = (C5861b) field.getAnnotation(C5861b.class);
        C8803u a2 = bVar != null ? this.f23246O.mo32611a(this.f23247a, fVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = fVar.mo32306a(aVar2);
        }
        C8875a aVar3 = new C8875a(str, z, z2, field, z3, a2, fVar, aVar, a);
        return aVar3;
    }

    /* renamed from: a */
    private Map<String, C8877c> m41516a(C8775f fVar, C8928a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.mo32664b();
        C8928a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo32620a(field, true);
                boolean a2 = mo32620a(field, z);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = C8807b.m41353a(aVar2.mo32664b(), cls2, field.getGenericType());
                    List a4 = m41515a(field);
                    int size = a4.size();
                    C8877c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        C8877c cVar2 = cVar;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C8877c) linkedHashMap.put(str2, m41514a(fVar, field, str2, C8928a.m41700b(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C8877c cVar3 = cVar;
                    if (cVar3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(cVar3.f23258a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C8928a.m41700b(C8807b.m41353a(aVar2.mo32664b(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo32660a();
        }
        return linkedHashMap;
    }
}
