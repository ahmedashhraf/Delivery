package p076c.p112d.p134b.p135a.p136d;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p112d.p134b.p135a.p136d.C2712h.C2713a;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6386j0;
import p076c.p112d.p134b.p135a.p143g.C6387k;
import p076c.p112d.p134b.p135a.p143g.C6398n;
import p076c.p112d.p134b.p135a.p143g.C6409q0;
import p076c.p112d.p134b.p135a.p143g.C6412r;
import p076c.p112d.p134b.p135a.p143g.C6413s;

/* renamed from: c.d.b.a.d.g */
/* compiled from: JsonParser */
public abstract class C6294g {

    /* renamed from: a */
    private static WeakHashMap<Class<?>, Field> f17639a = new WeakHashMap<>();

    /* renamed from: b */
    private static final Lock f17640b = new ReentrantLock();

    /* renamed from: c.d.b.a.d.g$a */
    /* compiled from: JsonParser */
    static /* synthetic */ class C6295a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17641a = new int[C6296j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                c.d.b.a.d.j[] r0 = p076c.p112d.p134b.p135a.p136d.C6296j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17641a = r0
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x0035 }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x0040 }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x004b }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x0056 }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x0062 }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x006e }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x007a }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f17641a     // Catch:{ NoSuchFieldError -> 0x0086 }
                c.d.b.a.d.j r1 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p136d.C6294g.C6295a.<clinit>():void");
        }
    }

    /* renamed from: c */
    private static Field m29207c(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        f17640b.lock();
        try {
            if (f17639a.containsKey(cls)) {
                return (Field) f17639a.get(cls);
            }
            for (C6412r c : C6387k.m29691a(cls).mo25768a()) {
                Field c2 = c.mo25832c();
                C2712h hVar = (C2712h) c2.getAnnotation(C2712h.class);
                if (hVar != null) {
                    C6381h0.m29668a(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    C6381h0.m29668a(C6398n.m29720a((Type) c2.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, c2.getType());
                    C2713a[] typeDefinitions = hVar.typeDefinitions();
                    HashSet a = C6386j0.m29689a();
                    C6381h0.m29667a(typeDefinitions.length > 0, (Object) "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (C2713a aVar : typeDefinitions) {
                        C6381h0.m29668a(a.add(aVar.key()), "Class contains two @TypeDef annotations with identical key: %s", aVar.key());
                    }
                    field = c2;
                }
            }
            f17639a.put(cls, field);
            f17640b.unlock();
            return field;
        } finally {
            f17640b.unlock();
        }
    }

    /* renamed from: p */
    private C6296j mo25693p() throws IOException {
        C6296j e = mo25173e();
        if (e == null) {
            e = mo25182n();
        }
        C6381h0.m29667a(e != null, (Object) "no JSON input found");
        return e;
    }

    /* renamed from: q */
    private C6296j m29209q() throws IOException {
        C6296j p = mo25693p();
        int i = C6295a.f17641a[p.ordinal()];
        boolean z = true;
        if (i == 1) {
            C6296j n = mo25182n();
            if (!(n == C6296j.FIELD_NAME || n == C6296j.END_OBJECT)) {
                z = false;
            }
            C6381h0.m29667a(z, (Object) n);
            return n;
        } else if (i != 2) {
            return p;
        } else {
            return mo25182n();
        }
    }

    /* renamed from: a */
    public abstract void mo25169a() throws IOException;

    /* renamed from: a */
    public final void mo25521a(String str) throws IOException {
        mo25516a(Collections.singleton(str));
    }

    /* renamed from: b */
    public final <T> T mo25524b(Class<T> cls) throws IOException {
        return mo25525b(cls, (C6287a) null);
    }

    /* renamed from: b */
    public abstract BigInteger mo25170b() throws IOException;

    /* renamed from: c */
    public abstract byte mo25171c() throws IOException;

    /* renamed from: d */
    public abstract String mo25172d() throws IOException;

    /* renamed from: e */
    public abstract C6296j mo25173e();

    /* renamed from: f */
    public abstract BigDecimal mo25174f() throws IOException;

    /* renamed from: g */
    public abstract double mo25175g() throws IOException;

    /* renamed from: h */
    public abstract C6290d mo25176h();

    /* renamed from: i */
    public abstract float mo25177i() throws IOException;

    /* renamed from: j */
    public abstract int mo25178j() throws IOException;

    /* renamed from: k */
    public abstract long mo25179k() throws IOException;

    /* renamed from: l */
    public abstract short mo25180l() throws IOException;

    /* renamed from: m */
    public abstract String mo25181m() throws IOException;

    /* renamed from: n */
    public abstract C6296j mo25182n() throws IOException;

    /* renamed from: o */
    public abstract C6294g mo25183o() throws IOException;

    /* renamed from: a */
    public final String mo25516a(Set<String> set) throws IOException {
        C6296j q = m29209q();
        while (q == C6296j.FIELD_NAME) {
            String m = mo25181m();
            mo25182n();
            if (set.contains(m)) {
                return m;
            }
            mo25183o();
            q = mo25182n();
        }
        return null;
    }

    @C2766f
    /* renamed from: b */
    public final <T> T mo25525b(Class<T> cls, C6287a aVar) throws IOException {
        try {
            return mo25513a(cls, aVar);
        } finally {
            mo25169a();
        }
    }

    /* renamed from: b */
    public final void mo25528b(Object obj) throws IOException {
        mo25529b(obj, (C6287a) null);
    }

    @C2766f
    /* renamed from: b */
    public final void mo25529b(Object obj, C6287a aVar) throws IOException {
        try {
            mo25520a(obj, aVar);
        } finally {
            mo25169a();
        }
    }

    /* renamed from: b */
    public final <T> Collection<T> mo25526b(Class<?> cls, Class<T> cls2) throws IOException {
        return mo25527b(cls, cls2, (C6287a) null);
    }

    @C2766f
    /* renamed from: b */
    public final <T> Collection<T> mo25527b(Class<?> cls, Class<T> cls2, C6287a aVar) throws IOException {
        try {
            return mo25518a(cls, cls2, aVar);
        } finally {
            mo25169a();
        }
    }

    /* renamed from: a */
    public final <T> T mo25512a(Class<T> cls) throws IOException {
        return mo25513a(cls, (C6287a) null);
    }

    @C2766f
    /* renamed from: a */
    public final <T> T mo25513a(Class<T> cls, C6287a aVar) throws IOException {
        return mo25515a((Type) cls, false, aVar);
    }

    /* renamed from: b */
    public final <T> void mo25530b(Collection<? super T> collection, Class<T> cls) throws IOException {
        mo25531b(collection, cls, (C6287a) null);
    }

    /* renamed from: a */
    public Object mo25514a(Type type, boolean z) throws IOException {
        return mo25515a(type, z, (C6287a) null);
    }

    @C2766f
    /* renamed from: b */
    public final <T> void mo25531b(Collection<? super T> collection, Class<T> cls, C6287a aVar) throws IOException {
        try {
            mo25523a(collection, cls, aVar);
        } finally {
            mo25169a();
        }
    }

    @C2766f
    /* renamed from: a */
    public Object mo25515a(Type type, boolean z, C6287a aVar) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                mo25693p();
            }
            return m29203a(null, type, new ArrayList(), null, aVar, true);
        } finally {
            if (z) {
                mo25169a();
            }
        }
    }

    /* renamed from: a */
    public final void mo25519a(Object obj) throws IOException {
        mo25520a(obj, (C6287a) null);
    }

    @C2766f
    /* renamed from: a */
    public final void mo25520a(Object obj, C6287a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj.getClass());
        m29206a(arrayList, obj, aVar);
    }

    /* renamed from: a */
    private void m29206a(ArrayList<Type> arrayList, Object obj, C6287a aVar) throws IOException {
        if (obj instanceof C6288b) {
            ((C6288b) obj).mo25489a(mo25176h());
        }
        C6296j q = m29209q();
        Class cls = obj.getClass();
        C6387k a = C6387k.m29691a(cls);
        boolean isAssignableFrom = C6413s.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            while (q == C6296j.FIELD_NAME) {
                String m = mo25181m();
                mo25182n();
                if (aVar == null || !aVar.mo25488b(obj, m)) {
                    C6412r b = a.mo25769b(m);
                    if (b != null) {
                        if (!b.mo25836g() || b.mo25837h()) {
                            Field c = b.mo25832c();
                            int size = arrayList.size();
                            arrayList.add(c.getGenericType());
                            Object a2 = m29203a(c, b.mo25833d(), arrayList, obj, aVar, true);
                            arrayList.remove(size);
                            b.mo25830a(obj, a2);
                        } else {
                            throw new IllegalArgumentException("final array/object fields are not supported");
                        }
                    } else if (isAssignableFrom) {
                        ((C6413s) obj).mo25098b(m, m29203a(null, null, arrayList, obj, aVar, true));
                    } else {
                        if (aVar != null) {
                            aVar.mo25487a(obj, m);
                        }
                        mo25183o();
                    }
                    q = mo25182n();
                } else {
                    return;
                }
            }
            return;
        }
        m29205a((Field) null, (Map) obj, C6409q0.m29775c(cls), arrayList, aVar);
    }

    /* renamed from: a */
    public final <T> Collection<T> mo25517a(Class<?> cls, Class<T> cls2) throws IOException {
        return mo25518a(cls, cls2, (C6287a) null);
    }

    @C2766f
    /* renamed from: a */
    public final <T> Collection<T> mo25518a(Class<?> cls, Class<T> cls2, C6287a aVar) throws IOException {
        Collection<T> b = C6398n.m29722b((Type) cls);
        mo25523a(b, cls2, aVar);
        return b;
    }

    /* renamed from: a */
    public final <T> void mo25522a(Collection<? super T> collection, Class<T> cls) throws IOException {
        mo25523a(collection, cls, (C6287a) null);
    }

    @C2766f
    /* renamed from: a */
    public final <T> void mo25523a(Collection<? super T> collection, Class<T> cls, C6287a aVar) throws IOException {
        m29204a((Field) null, collection, (Type) cls, new ArrayList<>(), aVar);
    }

    /* renamed from: a */
    private <T> void m29204a(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, C6287a aVar) throws IOException {
        C6296j q = m29209q();
        while (q != C6296j.END_ARRAY) {
            collection.add(m29203a(field, type, arrayList, collection, aVar, true));
            q = mo25182n();
        }
    }

    /* renamed from: a */
    private void m29205a(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, C6287a aVar) throws IOException {
        C6296j q = m29209q();
        while (q == C6296j.FIELD_NAME) {
            String m = mo25181m();
            mo25182n();
            if (aVar == null || !aVar.mo25488b(map, m)) {
                map.put(m, m29203a(field, type, arrayList, map, aVar, true));
                q = mo25182n();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x01bc A[Catch:{ IllegalArgumentException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01bf A[Catch:{ IllegalArgumentException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01ed A[Catch:{ IllegalArgumentException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01f3 A[Catch:{ IllegalArgumentException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f8 A[ADDED_TO_REGION, Catch:{ IllegalArgumentException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0215 A[Catch:{ IllegalArgumentException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x021e A[Catch:{ IllegalArgumentException -> 0x0339 }, RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m29203a(java.lang.reflect.Field r8, java.lang.reflect.Type r9, java.util.ArrayList<java.lang.reflect.Type> r10, java.lang.Object r11, p076c.p112d.p134b.p135a.p136d.C6287a r12, boolean r13) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.reflect.Type r9 = p076c.p112d.p134b.p135a.p143g.C6398n.m29717a(r10, r9)
            boolean r0 = r9 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r9
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            boolean r2 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0019
            r0 = r9
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.Class r0 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29762a(r0)
        L_0x0019:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r0 != r2) goto L_0x0021
            r7.mo25183o()
            return r1
        L_0x0021:
            c.d.b.a.d.j r2 = r7.mo25173e()
            int[] r3 = p076c.p112d.p134b.p135a.p136d.C6294g.C6295a.f17641a     // Catch:{ IllegalArgumentException -> 0x0339 }
            c.d.b.a.d.j r4 = r7.mo25173e()     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r4 = r4.ordinal()     // Catch:{ IllegalArgumentException -> 0x0339 }
            r3 = r3[r4]     // Catch:{ IllegalArgumentException -> 0x0339 }
            r4 = 0
            r5 = 1
            switch(r3) {
                case 1: goto L_0x021f;
                case 2: goto L_0x01c2;
                case 3: goto L_0x01c2;
                case 4: goto L_0x021f;
                case 5: goto L_0x021f;
                case 6: goto L_0x019b;
                case 7: goto L_0x019b;
                case 8: goto L_0x00de;
                case 9: goto L_0x00de;
                case 10: goto L_0x0085;
                case 11: goto L_0x003a;
                default: goto L_0x0036;
            }     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x0036:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x0316
        L_0x003a:
            if (r0 == 0) goto L_0x0042
            boolean r11 = r0.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r11 != 0) goto L_0x0043
        L_0x0042:
            r4 = 1
        L_0x0043:
            java.lang.String r11 = "primitive number field but found a JSON null"
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29667a(r4, r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == 0) goto L_0x007c
            int r11 = r0.getModifiers()     // Catch:{ IllegalArgumentException -> 0x0339 }
            r11 = r11 & 1536(0x600, float:2.152E-42)
            if (r11 == 0) goto L_0x007c
            java.lang.Class<java.util.Collection> r11 = java.util.Collection.class
            boolean r11 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29773a(r0, r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r11 == 0) goto L_0x0067
            java.util.Collection r9 = p076c.p112d.p134b.p135a.p143g.C6398n.m29722b(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Object r8 = p076c.p112d.p134b.p135a.p143g.C6398n.m29721b(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0067:
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            boolean r11 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29773a(r0, r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r11 == 0) goto L_0x007c
            java.util.Map r9 = p076c.p112d.p134b.p135a.p143g.C6398n.m29718a(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Object r8 = p076c.p112d.p134b.p135a.p143g.C6398n.m29721b(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x007c:
            java.lang.Class r9 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29763a(r10, r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Object r8 = p076c.p112d.p134b.p135a.p143g.C6398n.m29721b(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0085:
            java.lang.String r10 = r7.mo25181m()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r10 = r10.trim()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r10 = r10.toLowerCase(r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == r11) goto L_0x00a3
            java.lang.Class<java.lang.Float> r11 = java.lang.Float.class
            if (r0 == r11) goto L_0x00a3
            java.lang.Class r11 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == r11) goto L_0x00a3
            java.lang.Class<java.lang.Double> r11 = java.lang.Double.class
            if (r0 != r11) goto L_0x00bb
        L_0x00a3:
            java.lang.String r11 = "nan"
            boolean r11 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r11 != 0) goto L_0x00d5
            java.lang.String r11 = "infinity"
            boolean r11 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r11 != 0) goto L_0x00d5
            java.lang.String r11 = "-infinity"
            boolean r10 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r10 != 0) goto L_0x00d5
        L_0x00bb:
            if (r0 == 0) goto L_0x00cf
            java.lang.Class<java.lang.Number> r10 = java.lang.Number.class
            boolean r10 = r10.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r10 == 0) goto L_0x00cf
            if (r8 == 0) goto L_0x00d0
            java.lang.Class<c.d.b.a.d.i> r10 = p076c.p112d.p134b.p135a.p136d.C2714i.class
            java.lang.annotation.Annotation r10 = r8.getAnnotation(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r10 == 0) goto L_0x00d0
        L_0x00cf:
            r4 = 1
        L_0x00d0:
            java.lang.String r10 = "number field formatted as a JSON string must use the @JsonString annotation"
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29667a(r4, r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x00d5:
            java.lang.String r10 = r7.mo25181m()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Object r8 = p076c.p112d.p134b.p135a.p143g.C6398n.m29716a(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x00de:
            if (r8 == 0) goto L_0x00e8
            java.lang.Class<c.d.b.a.d.i> r10 = p076c.p112d.p134b.p135a.p136d.C2714i.class
            java.lang.annotation.Annotation r10 = r8.getAnnotation(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r10 != 0) goto L_0x00e9
        L_0x00e8:
            r4 = 1
        L_0x00e9:
            java.lang.String r10 = "number type formatted as a JSON number cannot use @JsonString annotation"
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29667a(r4, r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == 0) goto L_0x0196
            java.lang.Class<java.math.BigDecimal> r10 = java.math.BigDecimal.class
            boolean r10 = r0.isAssignableFrom(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r10 == 0) goto L_0x00fa
            goto L_0x0196
        L_0x00fa:
            java.lang.Class<java.math.BigInteger> r10 = java.math.BigInteger.class
            if (r0 != r10) goto L_0x0103
            java.math.BigInteger r8 = r7.mo25170b()     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0103:
            java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
            if (r0 == r10) goto L_0x018d
            java.lang.Class r10 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 != r10) goto L_0x010d
            goto L_0x018d
        L_0x010d:
            java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
            if (r0 == r10) goto L_0x0184
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 != r10) goto L_0x0117
            goto L_0x0184
        L_0x0117:
            java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
            if (r0 == r10) goto L_0x017b
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 != r10) goto L_0x0120
            goto L_0x017b
        L_0x0120:
            java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
            if (r0 == r10) goto L_0x0172
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 != r10) goto L_0x0129
            goto L_0x0172
        L_0x0129:
            java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
            if (r0 == r10) goto L_0x0169
            java.lang.Class r10 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 != r10) goto L_0x0132
            goto L_0x0169
        L_0x0132:
            java.lang.Class<java.lang.Byte> r10 = java.lang.Byte.class
            if (r0 == r10) goto L_0x0160
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 != r10) goto L_0x013b
            goto L_0x0160
        L_0x013b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r12 = r9.length()     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r12 = r12 + 30
            r11.<init>(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r12 = "expected numeric type but got "
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            r11.append(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r9 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x0339 }
            r10.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            throw r10     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x0160:
            byte r9 = r7.mo25171c()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Byte r8 = java.lang.Byte.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0169:
            short r9 = r7.mo25180l()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Short r8 = java.lang.Short.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0172:
            int r9 = r7.mo25178j()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x017b:
            float r9 = r7.mo25177i()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Float r8 = java.lang.Float.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0184:
            long r9 = r7.mo25179k()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x018d:
            double r9 = r7.mo25175g()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Double r8 = java.lang.Double.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0196:
            java.math.BigDecimal r8 = r7.mo25174f()     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x019b:
            if (r9 == 0) goto L_0x01ae
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == r10) goto L_0x01ae
            if (r0 == 0) goto L_0x01ac
            java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
            boolean r10 = r0.isAssignableFrom(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r10 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r10 = 0
            goto L_0x01af
        L_0x01ae:
            r10 = 1
        L_0x01af:
            java.lang.String r11 = "expected type Boolean or boolean but got %s"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ IllegalArgumentException -> 0x0339 }
            r12[r4] = r9     // Catch:{ IllegalArgumentException -> 0x0339 }
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29668a(r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            c.d.b.a.d.j r9 = p076c.p112d.p134b.p135a.p136d.C6296j.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r2 != r9) goto L_0x01bf
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x01c1
        L_0x01bf:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x01c1:
            return r8
        L_0x01c2:
            boolean r13 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29776d(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r9 == 0) goto L_0x01d7
            if (r13 != 0) goto L_0x01d7
            if (r0 == 0) goto L_0x01d5
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29773a(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r2 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            r2 = 0
            goto L_0x01d8
        L_0x01d7:
            r2 = 1
        L_0x01d8:
            java.lang.String r3 = "expected collection or array type but got %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IllegalArgumentException -> 0x0339 }
            r5[r4] = r9     // Catch:{ IllegalArgumentException -> 0x0339 }
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29668a(r2, r3, r5)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r12 == 0) goto L_0x01ea
            if (r8 == 0) goto L_0x01ea
            java.util.Collection r11 = r12.mo25486a(r11, r8)     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x01eb
        L_0x01ea:
            r11 = r1
        L_0x01eb:
            if (r11 != 0) goto L_0x01f1
            java.util.Collection r11 = p076c.p112d.p134b.p135a.p143g.C6398n.m29722b(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x01f1:
            if (r13 == 0) goto L_0x01f8
            java.lang.reflect.Type r1 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29769a(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x0206
        L_0x01f8:
            if (r0 == 0) goto L_0x0206
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            boolean r0 = r2.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == 0) goto L_0x0206
            java.lang.reflect.Type r1 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29774b(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x0206:
            java.lang.reflect.Type r9 = p076c.p112d.p134b.p135a.p143g.C6398n.m29717a(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0339 }
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r9
            r4 = r10
            r5 = r12
            r0.m29204a(r1, r2, r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r13 == 0) goto L_0x021e
            java.lang.Class r9 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29763a(r10, r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Object r8 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29767a(r11, r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x021e:
            return r11
        L_0x021f:
            boolean r2 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29776d(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r2 != 0) goto L_0x0227
            r2 = 1
            goto L_0x0228
        L_0x0227:
            r2 = 0
        L_0x0228:
            java.lang.String r3 = "expected object or map type but got %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IllegalArgumentException -> 0x0339 }
            r6[r4] = r9     // Catch:{ IllegalArgumentException -> 0x0339 }
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29668a(r2, r3, r6)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r13 == 0) goto L_0x0238
            java.lang.reflect.Field r13 = m29207c(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x0239
        L_0x0238:
            r13 = r1
        L_0x0239:
            if (r0 == 0) goto L_0x0242
            if (r12 == 0) goto L_0x0242
            java.lang.Object r11 = r12.mo25485a(r11, r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x0243
        L_0x0242:
            r11 = r1
        L_0x0243:
            if (r0 == 0) goto L_0x024f
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r2 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29773a(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r2 == 0) goto L_0x024f
            r2 = 1
            goto L_0x0250
        L_0x024f:
            r2 = 0
        L_0x0250:
            if (r13 == 0) goto L_0x0258
            c.d.b.a.d.b r11 = new c.d.b.a.d.b     // Catch:{ IllegalArgumentException -> 0x0339 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x0268
        L_0x0258:
            if (r11 != 0) goto L_0x0268
            if (r2 != 0) goto L_0x0264
            if (r0 != 0) goto L_0x025f
            goto L_0x0264
        L_0x025f:
            java.lang.Object r11 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29766a(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x0268
        L_0x0264:
            java.util.Map r11 = p076c.p112d.p134b.p135a.p143g.C6398n.m29718a(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x0268:
            int r3 = r10.size()     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r9 == 0) goto L_0x0271
            r10.add(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x0271:
            if (r2 == 0) goto L_0x0298
            java.lang.Class<c.d.b.a.g.s> r2 = p076c.p112d.p134b.p135a.p143g.C6413s.class
            boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r2 != 0) goto L_0x0298
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r0 = r2.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r0 == 0) goto L_0x0289
            java.lang.reflect.Type r0 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29775c(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            r6 = r0
            goto L_0x028a
        L_0x0289:
            r6 = r1
        L_0x028a:
            if (r6 == 0) goto L_0x0298
            r2 = r11
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IllegalArgumentException -> 0x0339 }
            r0 = r7
            r1 = r8
            r3 = r6
            r4 = r10
            r5 = r12
            r0.m29205a(r1, r2, r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r11
        L_0x0298:
            r7.m29206a(r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r9 == 0) goto L_0x02a0
            r10.remove(r3)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x02a0:
            if (r13 != 0) goto L_0x02a3
            return r11
        L_0x02a3:
            r9 = r11
            c.d.b.a.d.b r9 = (p076c.p112d.p134b.p135a.p136d.C6288b) r9     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r12 = r13.getName()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r9 == 0) goto L_0x02b2
            r12 = 1
            goto L_0x02b3
        L_0x02b2:
            r12 = 0
        L_0x02b3:
            java.lang.String r0 = "No value specified for @JsonPolymorphicTypeMap field"
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29667a(r12, r0)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.Class<c.d.b.a.d.h> r12 = p076c.p112d.p134b.p135a.p136d.C2712h.class
            java.lang.annotation.Annotation r12 = r13.getAnnotation(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            c.d.b.a.d.h r12 = (p076c.p112d.p134b.p135a.p136d.C2712h) r12     // Catch:{ IllegalArgumentException -> 0x0339 }
            c.d.b.a.d.h$a[] r12 = r12.typeDefinitions()     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r13 = r12.length     // Catch:{ IllegalArgumentException -> 0x0339 }
            r0 = 0
        L_0x02ca:
            if (r0 >= r13) goto L_0x02e0
            r2 = r12[r0]     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r3 = r2.key()     // Catch:{ IllegalArgumentException -> 0x0339 }
            boolean r3 = r3.equals(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r3 == 0) goto L_0x02dd
            java.lang.Class r1 = r2.ref()     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x02e0
        L_0x02dd:
            int r0 = r0 + 1
            goto L_0x02ca
        L_0x02e0:
            r2 = r1
            if (r2 == 0) goto L_0x02e4
            r4 = 1
        L_0x02e4:
            java.lang.String r12 = "No TypeDef annotation found with key: "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r13 = r9.length()     // Catch:{ IllegalArgumentException -> 0x0339 }
            if (r13 == 0) goto L_0x02f5
            java.lang.String r9 = r12.concat(r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            goto L_0x02fa
        L_0x02f5:
            java.lang.String r9 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0339 }
            r9.<init>(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x02fa:
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29667a(r4, r9)     // Catch:{ IllegalArgumentException -> 0x0339 }
            c.d.b.a.d.d r9 = r7.mo25176h()     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r11 = r9.mo25500c(r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            c.d.b.a.d.g r0 = r9.mo25144a(r11)     // Catch:{ IllegalArgumentException -> 0x0339 }
            r0.mo25693p()     // Catch:{ IllegalArgumentException -> 0x0339 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            r3 = r10
            java.lang.Object r8 = r0.m29203a(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0339 }
            return r8
        L_0x0316:
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r12 = r10.length()     // Catch:{ IllegalArgumentException -> 0x0339 }
            int r12 = r12 + 27
            r11.<init>(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r12 = "unexpected JSON node type: "
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x0339 }
            r11.append(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            java.lang.String r10 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x0339 }
            r9.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0339 }
            throw r9     // Catch:{ IllegalArgumentException -> 0x0339 }
        L_0x0339:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r7.mo25172d()
            if (r11 == 0) goto L_0x034d
            java.lang.String r12 = "key "
            r10.append(r12)
            r10.append(r11)
        L_0x034d:
            if (r8 == 0) goto L_0x035e
            if (r11 == 0) goto L_0x0356
            java.lang.String r11 = ", "
            r10.append(r11)
        L_0x0356:
            java.lang.String r11 = "field "
            r10.append(r11)
            r10.append(r8)
        L_0x035e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r8.<init>(r10, r9)
            goto L_0x0369
        L_0x0368:
            throw r8
        L_0x0369:
            goto L_0x0368
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p136d.C6294g.m29203a(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, c.d.b.a.d.a, boolean):java.lang.Object");
    }
}
