package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p161v.C3853b;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

/* renamed from: com.fasterxml.jackson.core.h */
/* compiled from: JsonParser */
public abstract class C3794h implements Closeable, C3805p {

    /* renamed from: N */
    private static final int f11842N = 255;

    /* renamed from: O */
    private static final int f11843O = -32768;

    /* renamed from: P */
    private static final int f11844P = 32767;

    /* renamed from: b */
    private static final int f11845b = -128;

    /* renamed from: a */
    protected int f11846a;

    /* renamed from: com.fasterxml.jackson.core.h$a */
    /* compiled from: JsonParser */
    static /* synthetic */ class C3795a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11847a = new int[C3799j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.fasterxml.jackson.core.j[] r0 = com.fasterxml.jackson.core.C3799j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11847a = r0
                int[] r0 = f11847a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11847a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.C3794h.C3795a.<clinit>():void");
        }
    }

    /* renamed from: com.fasterxml.jackson.core.h$b */
    /* compiled from: JsonParser */
    public enum C3796b {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false);
        
        private final boolean _defaultState;

        private C3796b(boolean z) {
            this._defaultState = z;
        }

        /* renamed from: f */
        public static int m16064f() {
            C3796b[] values;
            int i = 0;
            for (C3796b bVar : values()) {
                if (bVar.mo16733d()) {
                    i |= bVar.mo16734e();
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo16733d() {
            return this._defaultState;
        }

        /* renamed from: e */
        public int mo16734e() {
            return 1 << ordinal();
        }
    }

    /* renamed from: com.fasterxml.jackson.core.h$c */
    /* compiled from: JsonParser */
    public enum C3797c {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected C3794h() {
    }

    /* renamed from: B */
    public abstract C3793g mo16662B();

    /* renamed from: F */
    public abstract String mo16663F() throws IOException, JsonParseException;

    /* renamed from: G */
    public abstract C3799j mo16664G();

    /* renamed from: H */
    public abstract BigDecimal mo16665H() throws IOException, JsonParseException;

    /* renamed from: I */
    public abstract double mo16666I() throws IOException, JsonParseException;

    /* renamed from: J */
    public abstract Object mo16667J() throws IOException, JsonParseException;

    /* renamed from: K */
    public abstract float mo16668K() throws IOException, JsonParseException;

    /* renamed from: L */
    public Object mo16669L() {
        return null;
    }

    /* renamed from: M */
    public abstract int mo16670M() throws IOException, JsonParseException;

    /* renamed from: N */
    public abstract C3799j mo16671N();

    /* renamed from: O */
    public abstract long mo16672O() throws IOException, JsonParseException;

    /* renamed from: P */
    public abstract C3797c mo16673P() throws IOException, JsonParseException;

    /* renamed from: Q */
    public abstract Number mo16674Q() throws IOException, JsonParseException;

    /* renamed from: R */
    public abstract C3798i mo16675R();

    /* renamed from: S */
    public C3787c mo16676S() {
        return null;
    }

    /* renamed from: T */
    public short mo16677T() throws IOException, JsonParseException {
        int M = mo16670M();
        if (M >= f11843O && M <= f11844P) {
            return (short) M;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric value (");
        sb.append(mo16678U());
        sb.append(") out of range of Java short");
        throw mo16703b(sb.toString());
    }

    /* renamed from: U */
    public abstract String mo16678U() throws IOException, JsonParseException;

    /* renamed from: V */
    public abstract char[] mo16679V() throws IOException, JsonParseException;

    /* renamed from: W */
    public abstract int mo16680W() throws IOException, JsonParseException;

    /* renamed from: X */
    public abstract int mo16681X() throws IOException, JsonParseException;

    /* renamed from: Y */
    public abstract C3793g mo16682Y();

    /* renamed from: Z */
    public boolean mo16683Z() throws IOException, JsonParseException {
        return mo16698a(false);
    }

    /* renamed from: a */
    public double mo16684a(double d) throws IOException, JsonParseException {
        return d;
    }

    /* renamed from: a */
    public int mo16685a(int i) throws IOException, JsonParseException {
        return i;
    }

    /* renamed from: a */
    public int mo16688a(Writer writer) throws IOException {
        return -1;
    }

    /* renamed from: a */
    public long mo16689a(long j) throws IOException, JsonParseException {
        return j;
    }

    /* renamed from: a */
    public C3794h mo16690a(C3796b bVar) {
        this.f11846a = (bVar.mo16734e() ^ -1) & this.f11846a;
        return this;
    }

    /* renamed from: a */
    public abstract void mo16695a(C3800k kVar);

    /* renamed from: a */
    public boolean mo16696a(C3787c cVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo16698a(boolean z) throws IOException, JsonParseException {
        return z;
    }

    /* renamed from: a */
    public abstract byte[] mo16699a(C3785a aVar) throws IOException, JsonParseException;

    /* renamed from: a0 */
    public double mo16700a0() throws IOException, JsonParseException {
        return mo16684a(0.0d);
    }

    /* renamed from: b */
    public int mo16701b(OutputStream outputStream) throws IOException {
        return -1;
    }

    /* renamed from: b */
    public void mo16707b(C3787c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parser of type ");
        sb.append(getClass().getName());
        sb.append(" does not support schema of type '");
        sb.append(cVar.mo16508a());
        sb.append("'");
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: b0 */
    public int mo16708b0() throws IOException, JsonParseException {
        return mo16685a(0);
    }

    /* renamed from: c */
    public abstract String mo16709c(String str) throws IOException, JsonParseException;

    /* renamed from: c */
    public boolean mo16710c(C3796b bVar) {
        return (bVar.mo16734e() & this.f11846a) != 0;
    }

    /* renamed from: c0 */
    public long mo16711c0() throws IOException, JsonParseException {
        return mo16689a(0);
    }

    public abstract void close() throws IOException;

    /* renamed from: d */
    public abstract void mo16713d();

    /* renamed from: d */
    public abstract void mo16714d(String str);

    /* renamed from: d0 */
    public String mo16715d0() throws IOException, JsonParseException {
        return mo16709c((String) null);
    }

    /* renamed from: e */
    public int mo16716e(int i) throws IOException, JsonParseException {
        return mo16728j0() == C3799j.VALUE_NUMBER_INT ? mo16670M() : i;
    }

    /* renamed from: e */
    public abstract BigInteger mo16717e() throws IOException, JsonParseException;

    /* renamed from: e0 */
    public abstract boolean mo16718e0();

    /* renamed from: f */
    public byte[] mo16719f() throws IOException, JsonParseException {
        return mo16699a(C3786b.m15845a());
    }

    /* renamed from: f0 */
    public abstract boolean mo16720f0();

    /* renamed from: g */
    public boolean mo16721g() throws IOException, JsonParseException {
        C3799j G = mo16664G();
        if (G == C3799j.VALUE_TRUE) {
            return true;
        }
        if (G == C3799j.VALUE_FALSE) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current token (");
        sb.append(G);
        sb.append(") not of boolean type");
        throw new JsonParseException(sb.toString(), mo16662B());
    }

    /* renamed from: g0 */
    public boolean mo16722g0() {
        return mo16664G() == C3799j.START_ARRAY;
    }

    /* renamed from: h */
    public byte mo16723h() throws IOException, JsonParseException {
        int M = mo16670M();
        if (M >= f11845b && M <= 255) {
            return (byte) M;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric value (");
        sb.append(mo16678U());
        sb.append(") out of range of Java byte");
        throw mo16703b(sb.toString());
    }

    /* renamed from: h0 */
    public Boolean mo16724h0() throws IOException, JsonParseException {
        int i = C3795a.f11847a[mo16728j0().ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public abstract C3800k mo16725i();

    /* renamed from: i0 */
    public String mo16726i0() throws IOException, JsonParseException {
        if (mo16728j0() == C3799j.VALUE_STRING) {
            return mo16678U();
        }
        return null;
    }

    public abstract boolean isClosed();

    /* renamed from: j0 */
    public abstract C3799j mo16728j0() throws IOException, JsonParseException;

    /* renamed from: k0 */
    public abstract C3799j mo16729k0() throws IOException, JsonParseException;

    /* renamed from: l0 */
    public <T extends C3803n> T mo16730l0() throws IOException, JsonProcessingException {
        C3800k i = mo16725i();
        if (i != null) {
            return i.mo16750a(this);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
    }

    /* renamed from: m0 */
    public boolean mo16731m0() {
        return false;
    }

    /* renamed from: n0 */
    public abstract C3794h mo16732n0() throws IOException, JsonParseException;

    public abstract C3804o version();

    protected C3794h(int i) {
        this.f11846a = i;
    }

    /* renamed from: a */
    public C3794h mo16691a(C3796b bVar, boolean z) {
        if (z) {
            mo16704b(bVar);
        } else {
            mo16690a(bVar);
        }
        return this;
    }

    /* renamed from: b */
    public C3794h mo16704b(C3796b bVar) {
        this.f11846a = bVar.mo16734e() | this.f11846a;
        return this;
    }

    /* renamed from: b */
    public long mo16702b(long j) throws IOException, JsonParseException {
        return mo16728j0() == C3799j.VALUE_NUMBER_INT ? mo16672O() : j;
    }

    /* renamed from: a */
    public boolean mo16697a(C3802m mVar) throws IOException, JsonParseException {
        return mo16728j0() == C3799j.FIELD_NAME && mVar.getValue().equals(mo16663F());
    }

    /* renamed from: b */
    public <T> Iterator<T> mo16706b(Class<T> cls) throws IOException, JsonProcessingException {
        C3800k i = mo16725i();
        if (i != null) {
            return i.mo16759b(this, cls);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    /* renamed from: a */
    public int mo16687a(OutputStream outputStream) throws IOException, JsonParseException {
        return mo16686a(C3786b.m15845a(), outputStream);
    }

    /* renamed from: a */
    public int mo16686a(C3785a aVar, OutputStream outputStream) throws IOException, JsonParseException {
        mo16694a();
        return 0;
    }

    /* renamed from: a */
    public <T> T mo16693a(Class<T> cls) throws IOException, JsonProcessingException {
        C3800k i = mo16725i();
        if (i != null) {
            return i.mo16753a(this, cls);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    /* renamed from: b */
    public <T> Iterator<T> mo16705b(C3853b<?> bVar) throws IOException, JsonProcessingException {
        C3800k i = mo16725i();
        if (i != null) {
            return i.mo16758b(this, bVar);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    /* renamed from: a */
    public <T> T mo16692a(C3853b<?> bVar) throws IOException, JsonProcessingException {
        C3800k i = mo16725i();
        if (i != null) {
            return i.mo16752a(this, bVar);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JsonParseException mo16703b(String str) {
        return new JsonParseException(str, mo16662B());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16694a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operation not supported by parser of type ");
        sb.append(getClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }
}
