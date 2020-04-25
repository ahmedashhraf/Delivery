package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8784i;
import com.google.gson.C8787l;
import com.google.gson.C8788m;
import com.google.gson.C8789n;
import com.google.gson.C8791p;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p193w.C5862c;
import com.google.gson.p321x.C8829f;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p205i.p489f.C14069f;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.google.gson.x.m.n */
/* compiled from: TypeAdapters */
public final class C8887n {

    /* renamed from: A */
    public static final C8803u<String> f23281A = new C8901g();

    /* renamed from: B */
    public static final C8803u<BigDecimal> f23282B = new C8903h();

    /* renamed from: C */
    public static final C8803u<BigInteger> f23283C = new C8905i();

    /* renamed from: D */
    public static final C8805v f23284D = m41552a(String.class, f23281A);

    /* renamed from: E */
    public static final C8803u<StringBuilder> f23285E = new C8907j();

    /* renamed from: F */
    public static final C8805v f23286F = m41552a(StringBuilder.class, f23285E);

    /* renamed from: G */
    public static final C8803u<StringBuffer> f23287G = new C8911l();

    /* renamed from: H */
    public static final C8805v f23288H = m41552a(StringBuffer.class, f23287G);

    /* renamed from: I */
    public static final C8803u<URL> f23289I = new C8912m();

    /* renamed from: J */
    public static final C8805v f23290J = m41552a(URL.class, f23289I);

    /* renamed from: K */
    public static final C8803u<URI> f23291K = new C8913n();

    /* renamed from: L */
    public static final C8805v f23292L = m41552a(URI.class, f23291K);

    /* renamed from: M */
    public static final C8803u<InetAddress> f23293M = new C8914o();

    /* renamed from: N */
    public static final C8805v f23294N = m41554b(InetAddress.class, f23293M);

    /* renamed from: O */
    public static final C8803u<UUID> f23295O = new C8915p();

    /* renamed from: P */
    public static final C8805v f23296P = m41552a(UUID.class, f23295O);

    /* renamed from: Q */
    public static final C8803u<Currency> f23297Q = new C8916q().mo32479a();

    /* renamed from: R */
    public static final C8805v f23298R = m41552a(Currency.class, f23297Q);

    /* renamed from: S */
    public static final C8805v f23299S = new C8917r();

    /* renamed from: T */
    public static final C8803u<Calendar> f23300T = new C8919s();

    /* renamed from: U */
    public static final C8805v f23301U = m41555b(Calendar.class, GregorianCalendar.class, f23300T);

    /* renamed from: V */
    public static final C8803u<Locale> f23302V = new C8920t();

    /* renamed from: W */
    public static final C8805v f23303W = m41552a(Locale.class, f23302V);

    /* renamed from: X */
    public static final C8803u<C8787l> f23304X = new C8921u();

    /* renamed from: Y */
    public static final C8805v f23305Y = m41554b(C8787l.class, f23304X);

    /* renamed from: Z */
    public static final C8805v f23306Z = new C8923w();

    /* renamed from: a */
    public static final C8803u<Class> f23307a = new C8909k().mo32479a();

    /* renamed from: b */
    public static final C8805v f23308b = m41552a(Class.class, f23307a);

    /* renamed from: c */
    public static final C8803u<BitSet> f23309c = new C8922v().mo32479a();

    /* renamed from: d */
    public static final C8805v f23310d = m41552a(BitSet.class, f23309c);

    /* renamed from: e */
    public static final C8803u<Boolean> f23311e = new C8896d0();

    /* renamed from: f */
    public static final C8803u<Boolean> f23312f = new C8898e0();

    /* renamed from: g */
    public static final C8805v f23313g = m41553a(Boolean.TYPE, Boolean.class, f23311e);

    /* renamed from: h */
    public static final C8803u<Number> f23314h = new C8900f0();

    /* renamed from: i */
    public static final C8805v f23315i = m41553a(Byte.TYPE, Byte.class, f23314h);

    /* renamed from: j */
    public static final C8803u<Number> f23316j = new C8902g0();

    /* renamed from: k */
    public static final C8805v f23317k = m41553a(Short.TYPE, Short.class, f23316j);

    /* renamed from: l */
    public static final C8803u<Number> f23318l = new C8904h0();

    /* renamed from: m */
    public static final C8805v f23319m = m41553a(Integer.TYPE, Integer.class, f23318l);

    /* renamed from: n */
    public static final C8803u<AtomicInteger> f23320n = new C8906i0().mo32479a();

    /* renamed from: o */
    public static final C8805v f23321o = m41552a(AtomicInteger.class, f23320n);

    /* renamed from: p */
    public static final C8803u<AtomicBoolean> f23322p = new C8908j0().mo32479a();

    /* renamed from: q */
    public static final C8805v f23323q = m41552a(AtomicBoolean.class, f23322p);

    /* renamed from: r */
    public static final C8803u<AtomicIntegerArray> f23324r = new C8888a().mo32479a();

    /* renamed from: s */
    public static final C8805v f23325s = m41552a(AtomicIntegerArray.class, f23324r);

    /* renamed from: t */
    public static final C8803u<Number> f23326t = new C8890b();

    /* renamed from: u */
    public static final C8803u<Number> f23327u = new C8893c();

    /* renamed from: v */
    public static final C8803u<Number> f23328v = new C8895d();

    /* renamed from: w */
    public static final C8803u<Number> f23329w = new C8897e();

    /* renamed from: x */
    public static final C8805v f23330x = m41552a(Number.class, f23329w);

    /* renamed from: y */
    public static final C8803u<Character> f23331y = new C8899f();

    /* renamed from: z */
    public static final C8805v f23332z = m41553a(Character.TYPE, Character.class, f23331y);

    /* renamed from: com.google.gson.x.m.n$a */
    /* compiled from: TypeAdapters */
    static class C8888a extends C8803u<AtomicIntegerArray> {
        C8888a() {
        }

        /* renamed from: a */
        public AtomicIntegerArray m41557a(C8795a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo32444a();
            while (aVar.mo32452i()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo32438I()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            aVar.mo32449f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            dVar.mo32457a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                dVar.mo32459a((long) atomicIntegerArray.get(i));
            }
            dVar.mo32471e();
        }
    }

    /* renamed from: com.google.gson.x.m.n$a0 */
    /* compiled from: TypeAdapters */
    static class C8889a0 implements C8805v {

        /* renamed from: N */
        final /* synthetic */ C8803u f23333N;

        /* renamed from: a */
        final /* synthetic */ Class f23334a;

        /* renamed from: b */
        final /* synthetic */ Class f23335b;

        C8889a0(Class cls, Class cls2, C8803u uVar) {
            this.f23334a = cls;
            this.f23335b = cls2;
            this.f23333N = uVar;
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            Class a = aVar.mo32660a();
            if (a == this.f23334a || a == this.f23335b) {
                return this.f23333N;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f23334a.getName());
            sb.append(C14069f.f41344H);
            sb.append(this.f23335b.getName());
            sb.append(",adapter=");
            sb.append(this.f23333N);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.x.m.n$b */
    /* compiled from: TypeAdapters */
    static class C8890b extends C8803u<Number> {
        C8890b() {
        }

        /* renamed from: a */
        public Number m41562a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo32439J());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$b0 */
    /* compiled from: TypeAdapters */
    static class C8891b0 implements C8805v {

        /* renamed from: a */
        final /* synthetic */ Class f23336a;

        /* renamed from: b */
        final /* synthetic */ C8803u f23337b;

        /* renamed from: com.google.gson.x.m.n$b0$a */
        /* compiled from: TypeAdapters */
        class C8892a extends C8803u<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f23338a;

            C8892a(Class cls) {
                this.f23338a = cls;
            }

            /* renamed from: a */
            public void mo32288a(C8799d dVar, T1 t1) throws IOException {
                C8891b0.this.f23337b.mo32288a(dVar, t1);
            }

            /* renamed from: a */
            public T1 mo32287a(C8795a aVar) throws IOException {
                T1 a = C8891b0.this.f23337b.mo32287a(aVar);
                if (a == null || this.f23338a.isInstance(a)) {
                    return a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a ");
                sb.append(this.f23338a.getName());
                sb.append(" but was ");
                sb.append(a.getClass().getName());
                throw new JsonSyntaxException(sb.toString());
            }
        }

        C8891b0(Class cls, C8803u uVar) {
            this.f23336a = cls;
            this.f23337b = uVar;
        }

        /* renamed from: a */
        public <T2> C8803u<T2> mo32486a(C8775f fVar, C8928a<T2> aVar) {
            Class a = aVar.mo32660a();
            if (!this.f23336a.isAssignableFrom(a)) {
                return null;
            }
            return new C8892a(a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[typeHierarchy=");
            sb.append(this.f23336a.getName());
            sb.append(",adapter=");
            sb.append(this.f23337b);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.x.m.n$c */
    /* compiled from: TypeAdapters */
    static class C8893c extends C8803u<Number> {
        C8893c() {
        }

        /* renamed from: a */
        public Number m41569a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return Float.valueOf((float) aVar.mo32437H());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$c0 */
    /* compiled from: TypeAdapters */
    static /* synthetic */ class C8894c0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f23340a = new int[C8798c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.stream.c[] r0 = com.google.gson.stream.C8798c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23340a = r0
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f23340a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.p322m.C8887n.C8894c0.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.x.m.n$d */
    /* compiled from: TypeAdapters */
    static class C8895d extends C8803u<Number> {
        C8895d() {
        }

        /* renamed from: a */
        public Number m41573a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return Double.valueOf(aVar.mo32437H());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$d0 */
    /* compiled from: TypeAdapters */
    static class C8896d0 extends C8803u<Boolean> {
        C8896d0() {
        }

        /* renamed from: a */
        public Boolean m41577a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            } else if (aVar.peek() == C8798c.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo32442M()));
            } else {
                return Boolean.valueOf(aVar.mo32436G());
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Boolean bool) throws IOException {
            dVar.mo32460a(bool);
        }
    }

    /* renamed from: com.google.gson.x.m.n$e */
    /* compiled from: TypeAdapters */
    static class C8897e extends C8803u<Number> {
        C8897e() {
        }

        /* renamed from: a */
        public Number m41581a(C8795a aVar) throws IOException {
            C8798c peek = aVar.peek();
            int i = C8894c0.f23340a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new C8829f(aVar.mo32442M());
            }
            if (i == 4) {
                aVar.mo32441L();
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting number, got: ");
            sb.append(peek);
            throw new JsonSyntaxException(sb.toString());
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$e0 */
    /* compiled from: TypeAdapters */
    static class C8898e0 extends C8803u<Boolean> {
        C8898e0() {
        }

        /* renamed from: a */
        public Boolean m41585a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return Boolean.valueOf(aVar.mo32442M());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Boolean bool) throws IOException {
            dVar.mo32472e(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.x.m.n$f */
    /* compiled from: TypeAdapters */
    static class C8899f extends C8803u<Character> {
        C8899f() {
        }

        /* renamed from: a */
        public Character m41589a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            String M = aVar.mo32442M();
            if (M.length() == 1) {
                return Character.valueOf(M.charAt(0));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting character, got: ");
            sb.append(M);
            throw new JsonSyntaxException(sb.toString());
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Character ch) throws IOException {
            dVar.mo32472e(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.x.m.n$f0 */
    /* compiled from: TypeAdapters */
    static class C8900f0 extends C8803u<Number> {
        C8900f0() {
        }

        /* renamed from: a */
        public Number m41593a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo32438I());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$g */
    /* compiled from: TypeAdapters */
    static class C8901g extends C8803u<String> {
        C8901g() {
        }

        /* renamed from: a */
        public String m41597a(C8795a aVar) throws IOException {
            C8798c peek = aVar.peek();
            if (peek == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            } else if (peek == C8798c.BOOLEAN) {
                return Boolean.toString(aVar.mo32436G());
            } else {
                return aVar.mo32442M();
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, String str) throws IOException {
            dVar.mo32472e(str);
        }
    }

    /* renamed from: com.google.gson.x.m.n$g0 */
    /* compiled from: TypeAdapters */
    static class C8902g0 extends C8803u<Number> {
        C8902g0() {
        }

        /* renamed from: a */
        public Number m41601a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo32438I());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$h */
    /* compiled from: TypeAdapters */
    static class C8903h extends C8803u<BigDecimal> {
        C8903h() {
        }

        /* renamed from: a */
        public BigDecimal m41605a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo32442M());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, BigDecimal bigDecimal) throws IOException {
            dVar.mo32461a((Number) bigDecimal);
        }
    }

    /* renamed from: com.google.gson.x.m.n$h0 */
    /* compiled from: TypeAdapters */
    static class C8904h0 extends C8803u<Number> {
        C8904h0() {
        }

        /* renamed from: a */
        public Number m41609a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo32438I());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Number number) throws IOException {
            dVar.mo32461a(number);
        }
    }

    /* renamed from: com.google.gson.x.m.n$i */
    /* compiled from: TypeAdapters */
    static class C8905i extends C8803u<BigInteger> {
        C8905i() {
        }

        /* renamed from: a */
        public BigInteger m41613a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                return new BigInteger(aVar.mo32442M());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, BigInteger bigInteger) throws IOException {
            dVar.mo32461a((Number) bigInteger);
        }
    }

    /* renamed from: com.google.gson.x.m.n$i0 */
    /* compiled from: TypeAdapters */
    static class C8906i0 extends C8803u<AtomicInteger> {
        C8906i0() {
        }

        /* renamed from: a */
        public AtomicInteger m41617a(C8795a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo32438I());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, AtomicInteger atomicInteger) throws IOException {
            dVar.mo32459a((long) atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.x.m.n$j */
    /* compiled from: TypeAdapters */
    static class C8907j extends C8803u<StringBuilder> {
        C8907j() {
        }

        /* renamed from: a */
        public StringBuilder m41621a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return new StringBuilder(aVar.mo32442M());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, StringBuilder sb) throws IOException {
            dVar.mo32472e(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.x.m.n$j0 */
    /* compiled from: TypeAdapters */
    static class C8908j0 extends C8803u<AtomicBoolean> {
        C8908j0() {
        }

        /* renamed from: a */
        public AtomicBoolean m41625a(C8795a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo32436G());
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, AtomicBoolean atomicBoolean) throws IOException {
            dVar.mo32469d(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.x.m.n$k */
    /* compiled from: TypeAdapters */
    static class C8909k extends C8803u<Class> {
        C8909k() {
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Class cls) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }

        /* renamed from: a */
        public Class m41629a(C8795a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.x.m.n$k0 */
    /* compiled from: TypeAdapters */
    private static final class C8910k0<T extends Enum<T>> extends C8803u<T> {

        /* renamed from: a */
        private final Map<String, T> f23341a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f23342b = new HashMap();

        public C8910k0(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C5862c cVar = (C5862c) cls.getField(name).getAnnotation(C5862c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f23341a.put(put, enumR);
                        }
                    }
                    this.f23341a.put(name, enumR);
                    this.f23342b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m41633a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return (Enum) this.f23341a.get(aVar.mo32442M());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, T t) throws IOException {
            dVar.mo32472e(t == null ? null : (String) this.f23342b.get(t));
        }
    }

    /* renamed from: com.google.gson.x.m.n$l */
    /* compiled from: TypeAdapters */
    static class C8911l extends C8803u<StringBuffer> {
        C8911l() {
        }

        /* renamed from: a */
        public StringBuffer m41637a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return new StringBuffer(aVar.mo32442M());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, StringBuffer stringBuffer) throws IOException {
            dVar.mo32472e(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.x.m.n$m */
    /* compiled from: TypeAdapters */
    static class C8912m extends C8803u<URL> {
        C8912m() {
        }

        /* renamed from: a */
        public URL m41641a(C8795a aVar) throws IOException {
            URL url = null;
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            String M = aVar.mo32442M();
            if (!"null".equals(M)) {
                url = new URL(M);
            }
            return url;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, URL url) throws IOException {
            dVar.mo32472e(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.x.m.n$n */
    /* compiled from: TypeAdapters */
    static class C8913n extends C8803u<URI> {
        C8913n() {
        }

        /* renamed from: a */
        public URI m41645a(C8795a aVar) throws IOException {
            URI uri = null;
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            try {
                String M = aVar.mo32442M();
                if (!"null".equals(M)) {
                    uri = new URI(M);
                }
                return uri;
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, URI uri) throws IOException {
            dVar.mo32472e(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.x.m.n$o */
    /* compiled from: TypeAdapters */
    static class C8914o extends C8803u<InetAddress> {
        C8914o() {
        }

        /* renamed from: a */
        public InetAddress m41649a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return InetAddress.getByName(aVar.mo32442M());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, InetAddress inetAddress) throws IOException {
            dVar.mo32472e(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.x.m.n$p */
    /* compiled from: TypeAdapters */
    static class C8915p extends C8803u<UUID> {
        C8915p() {
        }

        /* renamed from: a */
        public UUID m41653a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return UUID.fromString(aVar.mo32442M());
            }
            aVar.mo32441L();
            return null;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, UUID uuid) throws IOException {
            dVar.mo32472e(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.x.m.n$q */
    /* compiled from: TypeAdapters */
    static class C8916q extends C8803u<Currency> {
        C8916q() {
        }

        /* renamed from: a */
        public Currency m41657a(C8795a aVar) throws IOException {
            return Currency.getInstance(aVar.mo32442M());
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Currency currency) throws IOException {
            dVar.mo32472e(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.x.m.n$r */
    /* compiled from: TypeAdapters */
    static class C8917r implements C8805v {

        /* renamed from: com.google.gson.x.m.n$r$a */
        /* compiled from: TypeAdapters */
        class C8918a extends C8803u<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ C8803u f23343a;

            C8918a(C8803u uVar) {
                this.f23343a = uVar;
            }

            /* renamed from: a */
            public Timestamp m41662a(C8795a aVar) throws IOException {
                Date date = (Date) this.f23343a.mo32287a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: a */
            public void mo32288a(C8799d dVar, Timestamp timestamp) throws IOException {
                this.f23343a.mo32288a(dVar, timestamp);
            }
        }

        C8917r() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.mo32660a() != Timestamp.class) {
                return null;
            }
            return new C8918a(fVar.mo32307a(Date.class));
        }
    }

    /* renamed from: com.google.gson.x.m.n$s */
    /* compiled from: TypeAdapters */
    static class C8919s extends C8803u<Calendar> {

        /* renamed from: a */
        private static final String f23345a = "year";

        /* renamed from: b */
        private static final String f23346b = "month";

        /* renamed from: c */
        private static final String f23347c = "dayOfMonth";

        /* renamed from: d */
        private static final String f23348d = "hourOfDay";

        /* renamed from: e */
        private static final String f23349e = "minute";

        /* renamed from: f */
        private static final String f23350f = "second";

        C8919s() {
        }

        /* renamed from: a */
        public Calendar m41666a(C8795a aVar) throws IOException {
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            aVar.mo32447d();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.peek() != C8798c.END_OBJECT) {
                String K = aVar.mo32440K();
                int I = aVar.mo32438I();
                if (f23345a.equals(K)) {
                    i = I;
                } else if (f23346b.equals(K)) {
                    i2 = I;
                } else if (f23347c.equals(K)) {
                    i3 = I;
                } else if (f23348d.equals(K)) {
                    i4 = I;
                } else if (f23349e.equals(K)) {
                    i5 = I;
                } else if (f23350f.equals(K)) {
                    i6 = I;
                }
            }
            aVar.mo32450g();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                dVar.mo32456B();
                return;
            }
            dVar.mo32468d();
            dVar.mo32465c(f23345a);
            dVar.mo32459a((long) calendar.get(1));
            dVar.mo32465c(f23346b);
            dVar.mo32459a((long) calendar.get(2));
            dVar.mo32465c(f23347c);
            dVar.mo32459a((long) calendar.get(5));
            dVar.mo32465c(f23348d);
            dVar.mo32459a((long) calendar.get(11));
            dVar.mo32465c(f23349e);
            dVar.mo32459a((long) calendar.get(12));
            dVar.mo32465c(f23350f);
            dVar.mo32459a((long) calendar.get(13));
            dVar.mo32473f();
        }
    }

    /* renamed from: com.google.gson.x.m.n$t */
    /* compiled from: TypeAdapters */
    static class C8920t extends C8803u<Locale> {
        C8920t() {
        }

        /* renamed from: a */
        public Locale m41670a(C8795a aVar) throws IOException {
            String str = null;
            if (aVar.peek() == C8798c.NULL) {
                aVar.mo32441L();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo32442M(), C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, Locale locale) throws IOException {
            dVar.mo32472e(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.x.m.n$u */
    /* compiled from: TypeAdapters */
    static class C8921u extends C8803u<C8787l> {
        C8921u() {
        }

        /* renamed from: a */
        public C8787l m41674a(C8795a aVar) throws IOException {
            switch (C8894c0.f23340a[aVar.peek().ordinal()]) {
                case 1:
                    return new C8791p((Number) new C8829f(aVar.mo32442M()));
                case 2:
                    return new C8791p(Boolean.valueOf(aVar.mo32436G()));
                case 3:
                    return new C8791p(aVar.mo32442M());
                case 4:
                    aVar.mo32441L();
                    return C8788m.f23032a;
                case 5:
                    C8784i iVar = new C8784i();
                    aVar.mo32444a();
                    while (aVar.mo32452i()) {
                        iVar.mo32363a(m41674a(aVar));
                    }
                    aVar.mo32449f();
                    return iVar;
                case 6:
                    C8789n nVar = new C8789n();
                    aVar.mo32447d();
                    while (aVar.mo32452i()) {
                        nVar.mo32405a(aVar.mo32440K(), m41674a(aVar));
                    }
                    aVar.mo32450g();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, C8787l lVar) throws IOException {
            if (lVar == null || lVar.mo32391A()) {
                dVar.mo32456B();
            } else if (lVar.mo32393D()) {
                C8791p u = lVar.mo32399u();
                if (u.mo32423F()) {
                    dVar.mo32461a(u.mo32386w());
                } else if (u.mo32422E()) {
                    dVar.mo32469d(u.mo32374f());
                } else {
                    dVar.mo32472e(u.mo32388y());
                }
            } else if (lVar.mo32400z()) {
                dVar.mo32457a();
                Iterator it = lVar.mo32395r().iterator();
                while (it.hasNext()) {
                    mo32288a(dVar, (C8787l) it.next());
                }
                dVar.mo32471e();
            } else if (lVar.mo32392C()) {
                dVar.mo32468d();
                for (Entry entry : lVar.mo32397t().entrySet()) {
                    dVar.mo32465c((String) entry.getKey());
                    mo32288a(dVar, (C8787l) entry.getValue());
                }
                dVar.mo32473f();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't write ");
                sb.append(lVar.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: com.google.gson.x.m.n$v */
    /* compiled from: TypeAdapters */
    static class C8922v extends C8803u<BitSet> {
        C8922v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo32438I() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet m41678a(com.google.gson.stream.C8795a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo32444a()
                com.google.gson.stream.c r1 = r8.peek()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.c r4 = com.google.gson.stream.C8798c.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = com.google.gson.p321x.p322m.C8887n.C8894c0.f23340a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo32442M()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x0047:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo32436G()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo32438I()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                com.google.gson.stream.c r1 = r8.peek()
                goto L_0x000e
            L_0x0075:
                r8.mo32449f()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.p322m.C8887n.C8922v.m41678a(com.google.gson.stream.a):java.util.BitSet");
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, BitSet bitSet) throws IOException {
            dVar.mo32457a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                dVar.mo32459a(bitSet.get(i) ? 1 : 0);
            }
            dVar.mo32471e();
        }
    }

    /* renamed from: com.google.gson.x.m.n$w */
    /* compiled from: TypeAdapters */
    static class C8923w implements C8805v {
        C8923w() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            Class<Enum> a = aVar.mo32660a();
            if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
                return null;
            }
            if (!a.isEnum()) {
                a = a.getSuperclass();
            }
            return new C8910k0(a);
        }
    }

    /* renamed from: com.google.gson.x.m.n$x */
    /* compiled from: TypeAdapters */
    static class C8924x implements C8805v {

        /* renamed from: a */
        final /* synthetic */ C8928a f23351a;

        /* renamed from: b */
        final /* synthetic */ C8803u f23352b;

        C8924x(C8928a aVar, C8803u uVar) {
            this.f23351a = aVar;
            this.f23352b = uVar;
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.equals(this.f23351a)) {
                return this.f23352b;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.x.m.n$y */
    /* compiled from: TypeAdapters */
    static class C8925y implements C8805v {

        /* renamed from: a */
        final /* synthetic */ Class f23353a;

        /* renamed from: b */
        final /* synthetic */ C8803u f23354b;

        C8925y(Class cls, C8803u uVar) {
            this.f23353a = cls;
            this.f23354b = uVar;
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.mo32660a() == this.f23353a) {
                return this.f23354b;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f23353a.getName());
            sb.append(",adapter=");
            sb.append(this.f23354b);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.x.m.n$z */
    /* compiled from: TypeAdapters */
    static class C8926z implements C8805v {

        /* renamed from: N */
        final /* synthetic */ C8803u f23355N;

        /* renamed from: a */
        final /* synthetic */ Class f23356a;

        /* renamed from: b */
        final /* synthetic */ Class f23357b;

        C8926z(Class cls, Class cls2, C8803u uVar) {
            this.f23356a = cls;
            this.f23357b = cls2;
            this.f23355N = uVar;
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            Class a = aVar.mo32660a();
            if (a == this.f23356a || a == this.f23357b) {
                return this.f23355N;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f23357b.getName());
            sb.append(C14069f.f41344H);
            sb.append(this.f23356a.getName());
            sb.append(",adapter=");
            sb.append(this.f23355N);
            sb.append("]");
            return sb.toString();
        }
    }

    private C8887n() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <TT> C8805v m41551a(C8928a<TT> aVar, C8803u<TT> uVar) {
        return new C8924x(aVar, uVar);
    }

    /* renamed from: b */
    public static <TT> C8805v m41555b(Class<TT> cls, Class<? extends TT> cls2, C8803u<? super TT> uVar) {
        return new C8889a0(cls, cls2, uVar);
    }

    /* renamed from: a */
    public static <TT> C8805v m41552a(Class<TT> cls, C8803u<TT> uVar) {
        return new C8925y(cls, uVar);
    }

    /* renamed from: b */
    public static <T1> C8805v m41554b(Class<T1> cls, C8803u<T1> uVar) {
        return new C8891b0(cls, uVar);
    }

    /* renamed from: a */
    public static <TT> C8805v m41553a(Class<TT> cls, Class<TT> cls2, C8803u<? super TT> uVar) {
        return new C8926z(cls, cls2, uVar);
    }
}
