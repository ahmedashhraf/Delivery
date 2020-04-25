package com.fasterxml.jackson.core.p156q;

import com.facebook.internal.ServerProtocol;
import com.fasterxml.jackson.core.C3785a;
import com.fasterxml.jackson.core.C3794h;
import com.fasterxml.jackson.core.C3794h.C3796b;
import com.fasterxml.jackson.core.C3798i;
import com.fasterxml.jackson.core.C3799j;
import com.fasterxml.jackson.core.C3804o;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.p158s.C3823h;
import com.fasterxml.jackson.core.p162w.C3870k;
import java.io.IOException;

/* renamed from: com.fasterxml.jackson.core.q.c */
/* compiled from: ParserMinimalBase */
public abstract class C3809c extends C3794h {

    /* renamed from: S */
    protected static final int f11930S = 9;

    /* renamed from: T */
    protected static final int f11931T = 10;

    /* renamed from: U */
    protected static final int f11932U = 13;

    /* renamed from: V */
    protected static final int f11933V = 32;

    /* renamed from: W */
    protected static final int f11934W = 91;

    /* renamed from: X */
    protected static final int f11935X = 93;

    /* renamed from: Y */
    protected static final int f11936Y = 123;

    /* renamed from: Z */
    protected static final int f11937Z = 125;

    /* renamed from: a0 */
    protected static final int f11938a0 = 34;

    /* renamed from: b0 */
    protected static final int f11939b0 = 92;

    /* renamed from: c0 */
    protected static final int f11940c0 = 47;

    /* renamed from: d0 */
    protected static final int f11941d0 = 58;

    /* renamed from: e0 */
    protected static final int f11942e0 = 44;

    /* renamed from: f0 */
    protected static final int f11943f0 = 42;

    /* renamed from: g0 */
    protected static final int f11944g0 = 39;

    /* renamed from: h0 */
    protected static final int f11945h0 = 98;

    /* renamed from: i0 */
    protected static final int f11946i0 = 102;

    /* renamed from: j0 */
    protected static final int f11947j0 = 110;

    /* renamed from: k0 */
    protected static final int f11948k0 = 114;

    /* renamed from: l0 */
    protected static final int f11949l0 = 116;

    /* renamed from: m0 */
    protected static final int f11950m0 = 117;

    /* renamed from: Q */
    protected C3799j f11951Q;

    /* renamed from: R */
    protected C3799j f11952R;

    /* renamed from: com.fasterxml.jackson.core.q.c$a */
    /* compiled from: ParserMinimalBase */
    static /* synthetic */ class C3810a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11953a = new int[C3799j.values().length];

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
                com.fasterxml.jackson.core.j[] r0 = com.fasterxml.jackson.core.C3799j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11953a = r0
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f11953a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p156q.C3809c.C3810a.<clinit>():void");
        }
    }

    protected C3809c() {
    }

    /* renamed from: g */
    protected static final String m16200g(int i) {
        char c = (char) i;
        String str = ")";
        if (Character.isISOControl(c)) {
            StringBuilder sb = new StringBuilder();
            sb.append("(CTRL-CHAR, code ");
            sb.append(i);
            sb.append(str);
            return sb.toString();
        }
        String str2 = "' (code ";
        String str3 = "'";
        if (i > 255) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(c);
            sb2.append(str2);
            sb2.append(i);
            sb2.append(" / 0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(c);
        sb3.append(str2);
        sb3.append(i);
        sb3.append(str);
        return sb3.toString();
    }

    /* renamed from: F */
    public abstract String mo16663F() throws IOException, JsonParseException;

    /* renamed from: G */
    public C3799j mo16664G() {
        return this.f11951Q;
    }

    /* renamed from: N */
    public C3799j mo16671N() {
        return this.f11952R;
    }

    /* renamed from: R */
    public abstract C3798i mo16675R();

    /* renamed from: U */
    public abstract String mo16678U() throws IOException, JsonParseException;

    /* renamed from: V */
    public abstract char[] mo16679V() throws IOException, JsonParseException;

    /* renamed from: W */
    public abstract int mo16680W() throws IOException, JsonParseException;

    /* renamed from: X */
    public abstract int mo16681X() throws IOException, JsonParseException;

    /* renamed from: a */
    public boolean mo16698a(boolean z) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != null) {
            boolean z2 = false;
            switch (C3810a.f11953a[jVar.ordinal()]) {
                case 5:
                    if (mo16670M() != 0) {
                        z2 = true;
                    }
                    return z2;
                case 6:
                    return true;
                case 7:
                case 8:
                    return false;
                case 9:
                    Object J = mo16667J();
                    if (J instanceof Boolean) {
                        return ((Boolean) J).booleanValue();
                    }
                    break;
                case 10:
                    break;
            }
            if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(mo16678U().trim())) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public abstract byte[] mo16699a(C3785a aVar) throws IOException, JsonParseException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16842b(int i, String str) throws JsonParseException {
        if (!mo16710c(C3796b.ALLOW_UNQUOTED_CONTROL_CHARS) || i >= 32) {
            char c = (char) i;
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal unquoted character (");
            sb.append(m16200g(c));
            sb.append("): has to be escaped using backslash to be included in ");
            sb.append(str);
            mo16844e(sb.toString());
        }
    }

    /* renamed from: c */
    public String mo16709c(String str) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == C3799j.VALUE_STRING || (jVar != null && jVar != C3799j.VALUE_NULL && jVar.mo16747h())) {
            return mo16678U();
        }
        return str;
    }

    public abstract void close() throws IOException;

    /* renamed from: d */
    public void mo16713d() {
        C3799j jVar = this.f11951Q;
        if (jVar != null) {
            this.f11952R = jVar;
            this.f11951Q = null;
        }
    }

    /* renamed from: d */
    public abstract void mo16714d(String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16844e(String str) throws JsonParseException {
        throw mo16703b(str);
    }

    /* renamed from: e0 */
    public boolean mo16718e0() {
        return this.f11951Q != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo16846f(String str) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected end-of-input");
        sb.append(str);
        mo16844e(sb.toString());
    }

    /* renamed from: f0 */
    public abstract boolean mo16720f0();

    public abstract boolean isClosed();

    /* renamed from: j0 */
    public abstract C3799j mo16728j0() throws IOException, JsonParseException;

    /* renamed from: k0 */
    public C3799j mo16729k0() throws IOException, JsonParseException {
        C3799j j0 = mo16728j0();
        return j0 == C3799j.FIELD_NAME ? mo16728j0() : j0;
    }

    /* renamed from: n0 */
    public C3794h mo16732n0() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != C3799j.START_OBJECT && jVar != C3799j.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            C3799j j0 = mo16728j0();
            if (j0 == null) {
                mo16829o0();
                return this;
            }
            int i2 = C3810a.f11953a[j0.ordinal()];
            if (i2 == 1 || i2 == 2) {
                i++;
            } else if (i2 == 3 || i2 == 4) {
                i--;
                if (i == 0) {
                    return this;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public abstract void mo16829o0() throws JsonParseException;

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo16847p0() throws JsonParseException {
        throw mo16703b("Unexpected end-of-String in base64 content");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo16848q0() throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append(" in ");
        sb.append(this.f11951Q);
        mo16846f(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo16849r0() throws JsonParseException {
        mo16846f(" in a value");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public final void mo16850s0() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public C3804o version() {
        return C3870k.m16928a(getClass());
    }

    protected C3809c(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo16845f(int i) throws JsonParseException {
        char c = (char) i;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal character (");
        sb.append(m16200g(c));
        sb.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        mo16844e(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16843b(String str, Throwable th) throws JsonParseException {
        throw mo16838a(str, th);
    }

    /* renamed from: a */
    public int mo16685a(int i) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != null) {
            switch (C3810a.f11953a[jVar.ordinal()]) {
                case 5:
                case 11:
                    i = mo16670M();
                    break;
                case 6:
                    return 1;
                case 7:
                case 8:
                    return 0;
                case 9:
                    Object J = mo16667J();
                    if (J instanceof Number) {
                        return ((Number) J).intValue();
                    }
                    break;
                case 10:
                    return C3823h.m16303a(mo16678U(), i);
            }
        }
        return i;
    }

    /* renamed from: a */
    public long mo16689a(long j) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != null) {
            switch (C3810a.f11953a[jVar.ordinal()]) {
                case 5:
                case 11:
                    j = mo16672O();
                    break;
                case 6:
                    return 1;
                case 7:
                case 8:
                    return 0;
                case 9:
                    Object J = mo16667J();
                    if (J instanceof Number) {
                        return ((Number) J).longValue();
                    }
                    break;
                case 10:
                    return C3823h.m16305a(mo16678U(), j);
            }
        }
        return j;
    }

    /* renamed from: a */
    public double mo16684a(double d) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != null) {
            switch (C3810a.f11953a[jVar.ordinal()]) {
                case 5:
                case 11:
                    d = mo16666I();
                    break;
                case 6:
                    return 1.0d;
                case 7:
                case 8:
                    return 0.0d;
                case 9:
                    Object J = mo16667J();
                    if (J instanceof Number) {
                        return ((Number) J).doubleValue();
                    }
                    break;
                case 10:
                    return C3823h.m16302a(mo16678U(), d);
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        mo16847p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r2 = r3 + 1;
        r3 = r11.charAt(r3);
        r6 = r13.mo16488a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r6 >= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        mo16840a(r13, r3, 1, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3 = (r4 << 6) | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 < r0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r13.mo16504f() != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r12.mo17083a(r3 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        mo16847p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r4 = r2 + 1;
        r2 = r11.charAt(r2);
        r6 = r13.mo16488a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r6 >= 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r6 == -2) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        mo16840a(r13, r2, 2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r4 < r0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        mo16847p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r2 = r4 + 1;
        r4 = r11.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r13.mo16499b(r4) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("expected padding character '");
        r5.append(r13.mo16503e());
        r5.append("'");
        mo16840a(r13, r4, 3, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r12.mo17083a(r3 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r2 = (r3 << 6) | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (r4 < r0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r13.mo16504f() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r12.mo17090f(r2 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        mo16847p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r3 = r4 + 1;
        r4 = r11.charAt(r4);
        r6 = r13.mo16488a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r6 >= 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r6 == -2) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        mo16840a(r13, r4, 3, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r12.mo17090f(r2 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        r12.mo17088e((r2 << 6) | r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r4 = r13.mo16488a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 >= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        mo16840a(r13, r2, 0, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 < r0) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16841a(java.lang.String r11, com.fasterxml.jackson.core.p162w.C3857b r12, com.fasterxml.jackson.core.C3785a r13) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x00ca
        L_0x0008:
            int r3 = r2 + 1
            char r2 = r11.charAt(r2)
            if (r3 < r0) goto L_0x0012
            goto L_0x00ca
        L_0x0012:
            r4 = 32
            if (r2 <= r4) goto L_0x00c7
            int r4 = r13.mo16488a(r2)
            r5 = 0
            if (r4 >= 0) goto L_0x0020
            r10.mo16840a(r13, r2, r1, r5)
        L_0x0020:
            if (r3 < r0) goto L_0x0025
            r10.mo16847p0()
        L_0x0025:
            int r2 = r3 + 1
            char r3 = r11.charAt(r3)
            int r6 = r13.mo16488a(r3)
            if (r6 >= 0) goto L_0x0035
            r7 = 1
            r10.mo16840a(r13, r3, r7, r5)
        L_0x0035:
            int r3 = r4 << 6
            r3 = r3 | r6
            if (r2 < r0) goto L_0x004a
            boolean r4 = r13.mo16504f()
            if (r4 != 0) goto L_0x0047
            int r11 = r3 >> 4
            r12.mo17083a(r11)
            goto L_0x00ca
        L_0x0047:
            r10.mo16847p0()
        L_0x004a:
            int r4 = r2 + 1
            char r2 = r11.charAt(r2)
            int r6 = r13.mo16488a(r2)
            r7 = 3
            r8 = -2
            r9 = 2
            if (r6 >= 0) goto L_0x0093
            if (r6 == r8) goto L_0x005e
            r10.mo16840a(r13, r2, r9, r5)
        L_0x005e:
            if (r4 < r0) goto L_0x0063
            r10.mo16847p0()
        L_0x0063:
            int r2 = r4 + 1
            char r4 = r11.charAt(r4)
            boolean r5 = r13.mo16499b(r4)
            if (r5 != 0) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "expected padding character '"
            r5.append(r6)
            char r6 = r13.mo16503e()
            r5.append(r6)
            java.lang.String r6 = "'"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r10.mo16840a(r13, r4, r7, r5)
        L_0x008c:
            int r3 = r3 >> 4
            r12.mo17083a(r3)
            goto L_0x0006
        L_0x0093:
            int r2 = r3 << 6
            r2 = r2 | r6
            if (r4 < r0) goto L_0x00a7
            boolean r3 = r13.mo16504f()
            if (r3 != 0) goto L_0x00a4
            int r11 = r2 >> 2
            r12.mo17090f(r11)
            goto L_0x00ca
        L_0x00a4:
            r10.mo16847p0()
        L_0x00a7:
            int r3 = r4 + 1
            char r4 = r11.charAt(r4)
            int r6 = r13.mo16488a(r4)
            if (r6 >= 0) goto L_0x00be
            if (r6 == r8) goto L_0x00b8
            r10.mo16840a(r13, r4, r7, r5)
        L_0x00b8:
            int r2 = r2 >> 2
            r12.mo17090f(r2)
            goto L_0x00c4
        L_0x00be:
            int r2 = r2 << 6
            r2 = r2 | r6
            r12.mo17088e(r2)
        L_0x00c4:
            r2 = r3
            goto L_0x0006
        L_0x00c7:
            r2 = r3
            goto L_0x0008
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p156q.C3809c.mo16841a(java.lang.String, com.fasterxml.jackson.core.w.b, com.fasterxml.jackson.core.a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16840a(C3785a aVar, char c, int i, String str) throws JsonParseException {
        String str2;
        if (c <= ' ') {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal white space character (code 0x");
            sb.append(Integer.toHexString(c));
            sb.append(") as character #");
            sb.append(i + 1);
            sb.append(" of 4-char base64 unit: can only used between units");
            str2 = sb.toString();
        } else if (aVar.mo16499b(c)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected padding character ('");
            sb2.append(aVar.mo16503e());
            sb2.append("') as character #");
            sb2.append(i + 1);
            sb2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            str2 = sb2.toString();
        } else {
            String str3 = ") in base64 content";
            if (!Character.isDefined(c) || Character.isISOControl(c)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Illegal character (code 0x");
                sb3.append(Integer.toHexString(c));
                sb3.append(str3);
                str2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Illegal character '");
                sb4.append(c);
                sb4.append("' (code 0x");
                sb4.append(Integer.toHexString(c));
                sb4.append(str3);
                str2 = sb4.toString();
            }
        }
        if (str != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(": ");
            sb5.append(str);
            str2 = sb5.toString();
        }
        throw mo16703b(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16839a(int i, String str) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected character (");
        sb.append(m16200g(i));
        sb.append(")");
        String sb2 = sb.toString();
        if (str != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(": ");
            sb3.append(str);
            sb2 = sb3.toString();
        }
        mo16844e(sb2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public char mo16837a(char c) throws JsonProcessingException {
        if (mo16710c(C3796b.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && mo16710c(C3796b.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized character escape ");
        sb.append(m16200g(c));
        mo16844e(sb.toString());
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JsonParseException mo16838a(String str, Throwable th) {
        return new JsonParseException(str, mo16662B(), th);
    }
}
