package com.google.gson;

import com.google.gson.p321x.C8811c;
import com.google.gson.p321x.C8826d;
import com.google.gson.p321x.C8849j;
import com.google.gson.p321x.C8850k;
import com.google.gson.p321x.p322m.C8858a;
import com.google.gson.p321x.p322m.C8860b;
import com.google.gson.p321x.p322m.C8862c;
import com.google.gson.p321x.p322m.C8864d;
import com.google.gson.p321x.p322m.C8865e;
import com.google.gson.p321x.p322m.C8867f;
import com.google.gson.p321x.p322m.C8869g;
import com.google.gson.p321x.p322m.C8871h;
import com.google.gson.p321x.p322m.C8874i;
import com.google.gson.p321x.p322m.C8878j;
import com.google.gson.p321x.p322m.C8880k;
import com.google.gson.p321x.p322m.C8887n;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.f */
/* compiled from: Gson */
public final class C8775f {

    /* renamed from: m */
    static final boolean f22989m = false;

    /* renamed from: n */
    static final boolean f22990n = false;

    /* renamed from: o */
    static final boolean f22991o = false;

    /* renamed from: p */
    static final boolean f22992p = true;

    /* renamed from: q */
    static final boolean f22993q = false;

    /* renamed from: r */
    static final boolean f22994r = false;

    /* renamed from: s */
    static final boolean f22995s = false;

    /* renamed from: t */
    private static final C8928a<?> f22996t = C8928a.m41699b(Object.class);

    /* renamed from: u */
    private static final String f22997u = ")]}'\n";

    /* renamed from: a */
    private final ThreadLocal<Map<C8928a<?>, C8781f<?>>> f22998a;

    /* renamed from: b */
    private final Map<C8928a<?>, C8803u<?>> f22999b;

    /* renamed from: c */
    private final List<C8805v> f23000c;

    /* renamed from: d */
    private final C8811c f23001d;

    /* renamed from: e */
    private final C8826d f23002e;

    /* renamed from: f */
    private final C8774e f23003f;

    /* renamed from: g */
    private final boolean f23004g;

    /* renamed from: h */
    private final boolean f23005h;

    /* renamed from: i */
    private final boolean f23006i;

    /* renamed from: j */
    private final boolean f23007j;

    /* renamed from: k */
    private final boolean f23008k;

    /* renamed from: l */
    private final C8864d f23009l;

    /* renamed from: com.google.gson.f$a */
    /* compiled from: Gson */
    class C8776a extends C8803u<Number> {
        C8776a() {
        }

        /* renamed from: a */
        public Double m41126a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return Double.valueOf(aVar.mo32437H());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.mo32456B();
                return;
            }
            C8775f.m41095a(number.doubleValue());
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.f$b */
    /* compiled from: Gson */
    class C8777b extends C8803u<Number> {
        C8777b() {
        }

        /* renamed from: a */
        public Float m41130a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return Float.valueOf((float) aVar.mo32437H());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.mo32456B();
                return;
            }
            C8775f.m41095a((double) number.floatValue());
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.f$c */
    /* compiled from: Gson */
    static class C8778c extends C8803u<Number> {
        C8778c() {
        }

        /* renamed from: a */
        public Number m41134a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return Long.valueOf(aVar.mo32439J());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.mo32456B();
            } else {
                dVar.mo32472e(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.f$d */
    /* compiled from: Gson */
    static class C8779d extends C8803u<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C8803u f23012a;

        C8779d(C8803u uVar) {
            this.f23012a = uVar;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, AtomicLong atomicLong) throws IOException {
            this.f23012a.mo32288a(dVar, Long.valueOf(atomicLong.get()));
        }

        /* renamed from: a */
        public AtomicLong m41138a(C8795a aVar) throws IOException {
            return new AtomicLong(((Number) this.f23012a.mo32287a(aVar)).longValue());
        }
    }

    /* renamed from: com.google.gson.f$e */
    /* compiled from: Gson */
    static class C8780e extends C8803u<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C8803u f23013a;

        C8780e(C8803u uVar) {
            this.f23013a = uVar;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, AtomicLongArray atomicLongArray) throws IOException {
            dVar.mo32457a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f23013a.mo32288a(dVar, Long.valueOf(atomicLongArray.get(i)));
            }
            dVar.mo32471e();
        }

        /* renamed from: a */
        public AtomicLongArray m41142a(C8795a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo32444a();
            while (aVar.mo32452i()) {
                arrayList.add(Long.valueOf(((Number) this.f23013a.mo32287a(aVar)).longValue()));
            }
            aVar.mo32449f();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }
    }

    /* renamed from: com.google.gson.f$f */
    /* compiled from: Gson */
    static class C8781f<T> extends C8803u<T> {

        /* renamed from: a */
        private C8803u<T> f23014a;

        C8781f() {
        }

        /* renamed from: a */
        public void mo32335a(C8803u<T> uVar) {
            if (this.f23014a == null) {
                this.f23014a = uVar;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public T mo32287a(C8795a aVar) throws IOException {
            C8803u<T> uVar = this.f23014a;
            if (uVar != null) {
                return uVar.mo32287a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, T t) throws IOException {
            C8803u<T> uVar = this.f23014a;
            if (uVar != null) {
                uVar.mo32288a(dVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C8775f() {
        this(C8826d.f23133S, C8768d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C8800t.DEFAULT, Collections.emptyList());
    }

    /* renamed from: a */
    public C8826d mo32308a() {
        return this.f23002e;
    }

    /* renamed from: b */
    public C8774e mo32324b() {
        return this.f23003f;
    }

    /* renamed from: c */
    public boolean mo32327c() {
        return this.f23005h;
    }

    /* renamed from: d */
    public boolean mo32328d() {
        return this.f23004g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f23004g);
        sb.append(",factories:");
        sb.append(this.f23000c);
        sb.append(",instanceCreators:");
        sb.append(this.f23001d);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private C8803u<Number> m41094a(boolean z) {
        if (z) {
            return C8887n.f23328v;
        }
        return new C8776a();
    }

    /* renamed from: b */
    private C8803u<Number> m41098b(boolean z) {
        if (z) {
            return C8887n.f23327u;
        }
        return new C8777b();
    }

    /* renamed from: a */
    static void m41095a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this");
            sb.append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static C8803u<AtomicLongArray> m41097b(C8803u<Number> uVar) {
        return new C8780e(uVar).mo32479a();
    }

    C8775f(C8826d dVar, C8774e eVar, Map<Type, C8783h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C8800t tVar, List<C8805v> list) {
        this.f22998a = new ThreadLocal<>();
        this.f22999b = new ConcurrentHashMap();
        this.f23001d = new C8811c(map);
        this.f23002e = dVar;
        this.f23003f = eVar;
        this.f23004g = z;
        this.f23006i = z3;
        this.f23005h = z4;
        this.f23007j = z5;
        this.f23008k = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8887n.f23305Y);
        arrayList.add(C8871h.f23242b);
        arrayList.add(dVar);
        arrayList.addAll(list);
        arrayList.add(C8887n.f23284D);
        arrayList.add(C8887n.f23319m);
        arrayList.add(C8887n.f23313g);
        arrayList.add(C8887n.f23315i);
        arrayList.add(C8887n.f23317k);
        C8803u a = m41092a(tVar);
        arrayList.add(C8887n.m41553a(Long.TYPE, Long.class, a));
        arrayList.add(C8887n.m41553a(Double.TYPE, Double.class, m41094a(z7)));
        arrayList.add(C8887n.m41553a(Float.TYPE, Float.class, m41098b(z7)));
        arrayList.add(C8887n.f23330x);
        arrayList.add(C8887n.f23321o);
        arrayList.add(C8887n.f23323q);
        arrayList.add(C8887n.m41552a(AtomicLong.class, m41093a(a)));
        arrayList.add(C8887n.m41552a(AtomicLongArray.class, m41097b(a)));
        arrayList.add(C8887n.f23325s);
        arrayList.add(C8887n.f23332z);
        arrayList.add(C8887n.f23286F);
        arrayList.add(C8887n.f23288H);
        arrayList.add(C8887n.m41552a(BigDecimal.class, C8887n.f23282B));
        arrayList.add(C8887n.m41552a(BigInteger.class, C8887n.f23283C));
        arrayList.add(C8887n.f23290J);
        arrayList.add(C8887n.f23292L);
        arrayList.add(C8887n.f23296P);
        arrayList.add(C8887n.f23298R);
        arrayList.add(C8887n.f23303W);
        arrayList.add(C8887n.f23294N);
        arrayList.add(C8887n.f23310d);
        arrayList.add(C8862c.f23221c);
        arrayList.add(C8887n.f23301U);
        arrayList.add(C8880k.f23263b);
        arrayList.add(C8878j.f23261b);
        arrayList.add(C8887n.f23299S);
        arrayList.add(C8858a.f23215c);
        arrayList.add(C8887n.f23308b);
        arrayList.add(new C8860b(this.f23001d));
        arrayList.add(new C8869g(this.f23001d, z2));
        this.f23009l = new C8864d(this.f23001d);
        arrayList.add(this.f23009l);
        arrayList.add(C8887n.f23306Z);
        arrayList.add(new C8874i(this.f23001d, eVar, dVar, this.f23009l));
        this.f23000c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C8803u<Number> m41092a(C8800t tVar) {
        if (tVar == C8800t.DEFAULT) {
            return C8887n.f23326t;
        }
        return new C8778c();
    }

    /* renamed from: b */
    public C8787l mo32325b(Object obj) {
        if (obj == null) {
            return C8788m.f23032a;
        }
        return mo32326b(obj, obj.getClass());
    }

    /* renamed from: b */
    public C8787l mo32326b(Object obj, Type type) {
        C8867f fVar = new C8867f();
        mo32322a(obj, type, (C8799d) fVar);
        return fVar.mo32615F();
    }

    /* renamed from: a */
    private static C8803u<AtomicLong> m41093a(C8803u<Number> uVar) {
        return new C8779d(uVar).mo32479a();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.gson.y.a<T>, code=com.google.gson.y.a, for r6v0, types: [com.google.gson.y.a<T>, java.lang.Object, com.google.gson.y.a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.C8803u<T> mo32306a(com.google.gson.p324y.C8928a r6) {
        /*
            r5 = this;
            java.util.Map<com.google.gson.y.a<?>, com.google.gson.u<?>> r0 = r5.f22999b
            if (r6 != 0) goto L_0x0007
            com.google.gson.y.a<?> r1 = f22996t
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.u r0 = (com.google.gson.C8803u) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.y.a<?>, com.google.gson.f$f<?>>> r0 = r5.f22998a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.y.a<?>, com.google.gson.f$f<?>>> r1 = r5.f22998a
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.f$f r2 = (com.google.gson.C8775f.C8781f) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            com.google.gson.f$f r2 = new com.google.gson.f$f     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            r0.put(r6, r2)     // Catch:{ all -> 0x007a }
            java.util.List<com.google.gson.v> r3 = r5.f23000c     // Catch:{ all -> 0x007a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007a }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x007a }
            com.google.gson.v r4 = (com.google.gson.C8805v) r4     // Catch:{ all -> 0x007a }
            com.google.gson.u r4 = r4.mo32486a(r5, r6)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x003e
            r2.mo32335a(r4)     // Catch:{ all -> 0x007a }
            java.util.Map<com.google.gson.y.a<?>, com.google.gson.u<?>> r2 = r5.f22999b     // Catch:{ all -> 0x007a }
            r2.put(r6, r4)     // Catch:{ all -> 0x007a }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0062
            java.lang.ThreadLocal<java.util.Map<com.google.gson.y.a<?>, com.google.gson.f$f<?>>> r6 = r5.f22998a
            r6.remove()
        L_0x0062:
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "GSON cannot handle "
            r3.append(r4)     // Catch:{ all -> 0x007a }
            r3.append(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r3)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x0085
            java.lang.ThreadLocal<java.util.Map<com.google.gson.y.a<?>, com.google.gson.f$f<?>>> r6 = r5.f22998a
            r6.remove()
        L_0x0085:
            goto L_0x0087
        L_0x0086:
            throw r2
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C8775f.mo32306a(com.google.gson.y.a):com.google.gson.u");
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32305a(C8805v vVar, C8928a<T> aVar) {
        if (!this.f23000c.contains(vVar)) {
            vVar = this.f23009l;
        }
        boolean z = false;
        for (C8805v vVar2 : this.f23000c) {
            if (z) {
                C8803u<T> a = vVar2.mo32486a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (vVar2 == vVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32307a(Class<T> cls) {
        return mo32306a(C8928a.m41699b(cls));
    }

    /* renamed from: a */
    public String mo32317a(Object obj) {
        if (obj == null) {
            return mo32316a((C8787l) C8788m.f23032a);
        }
        return mo32318a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo32318a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo32323a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo32321a(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            mo32323a(obj, (Type) obj.getClass(), appendable);
        } else {
            mo32320a((C8787l) C8788m.f23032a, appendable);
        }
    }

    /* renamed from: a */
    public void mo32323a(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            mo32322a(obj, type, mo32304a(C8850k.m41445a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo32322a(Object obj, Type type, C8799d dVar) throws JsonIOException {
        C8803u a = mo32306a(C8928a.m41700b(type));
        boolean i = dVar.mo32477i();
        dVar.mo32464b(true);
        boolean h = dVar.mo32476h();
        dVar.mo32462a(this.f23005h);
        boolean g = dVar.mo32475g();
        dVar.mo32466c(this.f23004g);
        try {
            a.mo32288a(dVar, obj);
            dVar.mo32464b(i);
            dVar.mo32462a(h);
            dVar.mo32466c(g);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (Throwable th) {
            dVar.mo32464b(i);
            dVar.mo32462a(h);
            dVar.mo32466c(g);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo32316a(C8787l lVar) {
        StringWriter stringWriter = new StringWriter();
        mo32320a(lVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo32320a(C8787l lVar, Appendable appendable) throws JsonIOException {
        try {
            mo32319a(lVar, mo32304a(C8850k.m41445a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public C8799d mo32304a(Writer writer) throws IOException {
        if (this.f23006i) {
            writer.write(f22997u);
        }
        C8799d dVar = new C8799d(writer);
        if (this.f23007j) {
            dVar.mo32470d("  ");
        }
        dVar.mo32466c(this.f23004g);
        return dVar;
    }

    /* renamed from: a */
    public C8795a mo32303a(Reader reader) {
        C8795a aVar = new C8795a(reader);
        aVar.mo32445a(this.f23008k);
        return aVar;
    }

    /* renamed from: a */
    public void mo32319a(C8787l lVar, C8799d dVar) throws JsonIOException {
        boolean i = dVar.mo32477i();
        dVar.mo32464b(true);
        boolean h = dVar.mo32476h();
        dVar.mo32462a(this.f23005h);
        boolean g = dVar.mo32475g();
        dVar.mo32466c(this.f23004g);
        try {
            C8850k.m41446a(lVar, dVar);
            dVar.mo32464b(i);
            dVar.mo32462a(h);
            dVar.mo32466c(g);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (Throwable th) {
            dVar.mo32464b(i);
            dVar.mo32462a(h);
            dVar.mo32466c(g);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo32314a(String str, Class<T> cls) throws JsonSyntaxException {
        return C8849j.m41442b(cls).cast(mo32315a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo32315a(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return mo32313a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T mo32312a(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        C8795a a = mo32303a(reader);
        Object a2 = mo32311a(a, (Type) cls);
        m41096a(a2, a);
        return C8849j.m41442b(cls).cast(a2);
    }

    /* renamed from: a */
    public <T> T mo32313a(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C8795a a = mo32303a(reader);
        T a2 = mo32311a(a, type);
        m41096a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m41096a(Object obj, C8795a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() != C8798c.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo32311a(C8795a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean B = aVar.mo32434B();
        aVar.mo32445a(true);
        try {
            aVar.peek();
            T a = mo32306a(C8928a.m41700b(type)).mo32287a(aVar);
            aVar.mo32445a(B);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo32445a(B);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (Throwable th) {
            aVar.mo32445a(B);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo32309a(C8787l lVar, Class<T> cls) throws JsonSyntaxException {
        return C8849j.m41442b(cls).cast(mo32310a(lVar, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo32310a(C8787l lVar, Type type) throws JsonSyntaxException {
        if (lVar == null) {
            return null;
        }
        return mo32311a((C8795a) new C8865e(lVar), type);
    }
}
