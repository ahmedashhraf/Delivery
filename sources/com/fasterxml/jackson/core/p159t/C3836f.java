package com.fasterxml.jackson.core.p159t;

import com.facebook.internal.ServerProtocol;
import com.fasterxml.jackson.core.C3785a;
import com.fasterxml.jackson.core.C3794h.C3796b;
import com.fasterxml.jackson.core.C3799j;
import com.fasterxml.jackson.core.C3800k;
import com.fasterxml.jackson.core.C3804o;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p156q.C3808b;
import com.fasterxml.jackson.core.p156q.C3809c;
import com.fasterxml.jackson.core.p158s.C3817b;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p160u.C3845b;
import com.fasterxml.jackson.core.p162w.C3857b;
import com.fasterxml.jackson.core.p162w.C3869j;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.t.f */
/* compiled from: ReaderBasedJsonParser */
public final class C3836f extends C3808b {

    /* renamed from: A1 */
    protected C3800k f12091A1;

    /* renamed from: B1 */
    protected final C3845b f12092B1;

    /* renamed from: C1 */
    protected final int f12093C1;

    /* renamed from: D1 */
    protected boolean f12094D1 = false;

    /* renamed from: y1 */
    protected Reader f12095y1;

    /* renamed from: z1 */
    protected char[] f12096z1;

    /* renamed from: com.fasterxml.jackson.core.t.f$a */
    /* compiled from: ReaderBasedJsonParser */
    static /* synthetic */ class C3837a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12097a = new int[C3799j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.core.j[] r0 = com.fasterxml.jackson.core.C3799j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12097a = r0
                int[] r0 = f12097a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12097a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12097a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12097a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12097a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12097a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3836f.C3837a.<clinit>():void");
        }
    }

    public C3836f(C3819d dVar, int i, Reader reader, C3800k kVar, C3845b bVar) {
        super(dVar, i);
        this.f12095y1 = reader;
        this.f12096z1 = dVar.mo16886d();
        this.f12091A1 = kVar;
        this.f12092B1 = bVar;
        this.f12093C1 = bVar.mo17039c();
    }

    /* renamed from: Q0 */
    private C3799j m16382Q0() {
        this.f11904B0 = false;
        C3799j jVar = this.f11928y0;
        this.f11928y0 = null;
        if (jVar == C3799j.START_ARRAY) {
            this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
        } else if (jVar == C3799j.START_OBJECT) {
            this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
        }
        this.f11951Q = jVar;
        return jVar;
    }

    /* renamed from: R0 */
    private void m16383R0() throws IOException, JsonParseException {
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                break;
            }
            char[] cArr = this.f12096z1;
            int i = this.f11919p0;
            this.f11919p0 = i + 1;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                        break;
                    }
                    char[] cArr2 = this.f12096z1;
                    int i2 = this.f11919p0;
                    if (cArr2[i2] == '/') {
                        this.f11919p0 = i2 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        mo16954O0();
                    } else if (c == 13) {
                        mo16953N0();
                    } else if (c != 9) {
                        mo16845f((int) c);
                    }
                }
            }
        }
        mo16846f(" in a comment");
    }

    /* renamed from: S0 */
    private void m16384S0() throws IOException, JsonParseException {
        if (!mo16710c(C3796b.ALLOW_COMMENTS)) {
            mo16839a(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            mo16846f(" in a comment");
        }
        char[] cArr = this.f12096z1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        char c = cArr[i];
        if (c == '/') {
            m16385T0();
        } else if (c == '*') {
            m16383R0();
        } else {
            mo16839a((int) c, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: T0 */
    private void m16385T0() throws IOException, JsonParseException {
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                char[] cArr = this.f12096z1;
                int i = this.f11919p0;
                this.f11919p0 = i + 1;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        mo16954O0();
                        return;
                    } else if (c == 13) {
                        mo16953N0();
                        return;
                    } else if (c != 9) {
                        mo16845f((int) c);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: U0 */
    private int m16386U0() throws IOException, JsonParseException {
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                char[] cArr = this.f12096z1;
                int i = this.f11919p0;
                this.f11919p0 = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    m16384S0();
                } else if (c != ' ') {
                    if (c == 10) {
                        mo16954O0();
                    } else if (c == 13) {
                        mo16953N0();
                    } else if (c != 9) {
                        mo16845f((int) c);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end-of-input within/between ");
                sb.append(this.f11927x0.mo16739e());
                sb.append(" entries");
                throw mo16703b(sb.toString());
            }
        }
    }

    /* renamed from: V0 */
    private int m16387V0() throws IOException, JsonParseException {
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                char[] cArr = this.f12096z1;
                int i = this.f11919p0;
                this.f11919p0 = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    m16384S0();
                } else if (c != ' ') {
                    if (c == 10) {
                        mo16954O0();
                    } else if (c == 13) {
                        mo16953N0();
                    } else if (c != 9) {
                        mo16845f((int) c);
                    }
                }
            } else {
                mo16829o0();
                return -1;
            }
        }
    }

    /* renamed from: W0 */
    private char m16388W0() throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            return '0';
        }
        char c = this.f12096z1[this.f11919p0];
        if (c < '0' || c > '9') {
            return '0';
        }
        if (!mo16710c(C3796b.ALLOW_NUMERIC_LEADING_ZEROS)) {
            mo16827g("Leading zeroes not allowed");
        }
        this.f11919p0++;
        if (c == '0') {
            do {
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    break;
                }
                char[] cArr = this.f12096z1;
                int i = this.f11919p0;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this.f11919p0 = i + 1;
            } while (c == '0');
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public boolean mo16813G0() throws IOException {
        long j = this.f11921r0;
        int i = this.f11920q0;
        this.f11921r0 = j + ((long) i);
        this.f11923t0 -= i;
        Reader reader = this.f12095y1;
        if (reader != null) {
            char[] cArr = this.f12096z1;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this.f11919p0 = 0;
                this.f11920q0 = read;
                return true;
            }
            mo16830t0();
            if (read == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Reader returned 0 characters when trying to read ");
                sb.append(this.f11920q0);
                throw new IOException(sb.toString());
            }
        }
        return false;
    }

    /* renamed from: J */
    public Object mo16667J() throws IOException, JsonParseException {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo16950K0() throws IOException, JsonParseException {
        char[] i = this.f11929z0.mo17128i();
        int j = this.f11929z0.mo17129j();
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16846f(": was expecting closing quote for a string value");
            }
            char[] cArr = this.f12096z1;
            int i2 = this.f11919p0;
            this.f11919p0 = i2 + 1;
            char c = cArr[i2];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo16831u0();
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.f11929z0.mo17114a(j);
                        return;
                    } else if (c < ' ') {
                        mo16842b((int) c, "string value");
                    }
                }
            }
            if (j >= i.length) {
                i = this.f11929z0.mo17127h();
                j = 0;
            }
            int i3 = j + 1;
            i[j] = c;
            j = i3;
        }
    }

    /* renamed from: L */
    public Object mo16669L() {
        return this.f12095y1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public C3799j mo16951L0() throws IOException, JsonParseException {
        char[] e = this.f11929z0.mo17124e();
        int j = this.f11929z0.mo17129j();
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16846f(": was expecting closing quote for a string value");
            }
            char[] cArr = this.f12096z1;
            int i = this.f11919p0;
            this.f11919p0 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo16831u0();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this.f11929z0.mo17114a(j);
                        return C3799j.VALUE_STRING;
                    } else if (c < ' ') {
                        mo16842b((int) c, "string value");
                    }
                }
            }
            if (j >= e.length) {
                e = this.f11929z0.mo17127h();
                j = 0;
            }
            int i2 = j + 1;
            e[j] = c;
            j = i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public String mo16952M0() throws IOException, JsonParseException {
        int i = this.f11919p0;
        int i2 = this.f12093C1;
        int i3 = this.f11920q0;
        if (i < i3) {
            int[] e = C3817b.m16264e();
            int length = e.length;
            do {
                char[] cArr = this.f12096z1;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && e[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this.f11919p0;
                    this.f11919p0 = i + 1;
                    return this.f12092B1.mo17036a(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this.f11919p0;
        this.f11919p0 = i;
        return m16389a(i5, i2, 39);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo16953N0() throws IOException {
        if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
            char[] cArr = this.f12096z1;
            int i = this.f11919p0;
            if (cArr[i] == 10) {
                this.f11919p0 = i + 1;
            }
        }
        this.f11922s0++;
        this.f11923t0 = this.f11919p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo16954O0() throws IOException {
        this.f11922s0++;
        this.f11923t0 = this.f11919p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo16955P0() throws IOException, JsonParseException {
        this.f12094D1 = false;
        int i = this.f11919p0;
        int i2 = this.f11920q0;
        char[] cArr = this.f12096z1;
        while (true) {
            if (i >= i2) {
                this.f11919p0 = i;
                if (!mo16813G0()) {
                    mo16846f(": was expecting closing quote for a string value");
                }
                i = this.f11919p0;
                i2 = this.f11920q0;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.f11919p0 = i3;
                    mo16831u0();
                    i = this.f11919p0;
                    i2 = this.f11920q0;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.f11919p0 = i3;
                        return;
                    } else if (c < ' ') {
                        this.f11919p0 = i3;
                        mo16842b((int) c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    /* renamed from: U */
    public String mo16678U() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != C3799j.VALUE_STRING) {
            return mo16958a(jVar);
        }
        if (this.f12094D1) {
            this.f12094D1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17123d();
    }

    /* renamed from: V */
    public char[] mo16679V() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == null) {
            return null;
        }
        int i = C3837a.f12097a[jVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!(i == 3 || i == 4)) {
                    return this.f11951Q.mo16744e();
                }
            } else if (this.f12094D1) {
                this.f12094D1 = false;
                mo16832v0();
            }
            return this.f11929z0.mo17130k();
        }
        if (!this.f11904B0) {
            String b = this.f11927x0.mo16736b();
            int length = b.length();
            char[] cArr = this.f11903A0;
            if (cArr == null) {
                this.f11903A0 = this.f11917n0.mo16879a(length);
            } else if (cArr.length < length) {
                this.f11903A0 = new char[length];
            }
            b.getChars(0, length, this.f11903A0, 0);
            this.f11904B0 = true;
        }
        return this.f11903A0;
    }

    /* renamed from: W */
    public int mo16680W() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == null) {
            return 0;
        }
        int i = C3837a.f12097a[jVar.ordinal()];
        if (i == 1) {
            return this.f11927x0.mo16736b().length();
        }
        if (i != 2) {
            if (!(i == 3 || i == 4)) {
                return this.f11951Q.mo16744e().length;
            }
        } else if (this.f12094D1) {
            this.f12094D1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17135p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != 4) goto L_0x002a;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo16681X() throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.j r0 = r3.f11951Q
            r1 = 0
            if (r0 == 0) goto L_0x002a
            int[] r2 = com.fasterxml.jackson.core.p159t.C3836f.C3837a.f12097a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x002a
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r2 = 3
            if (r0 == r2) goto L_0x0023
            r2 = 4
            if (r0 == r2) goto L_0x0023
            goto L_0x002a
        L_0x001a:
            boolean r0 = r3.f12094D1
            if (r0 == 0) goto L_0x0023
            r3.f12094D1 = r1
            r3.mo16832v0()
        L_0x0023:
            com.fasterxml.jackson.core.w.j r0 = r3.f11929z0
            int r0 = r0.mo17131l()
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3836f.mo16681X():int");
    }

    /* renamed from: a */
    public void mo16695a(C3800k kVar) {
        this.f12091A1 = kVar;
    }

    /* renamed from: b */
    public long mo16702b(long j) throws IOException, JsonParseException {
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_NUMBER_INT) {
                return mo16672O();
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return j;
        }
        if (mo16728j0() == C3799j.VALUE_NUMBER_INT) {
            j = mo16672O();
        }
        return j;
    }

    /* renamed from: c */
    public String mo16709c(String str) throws IOException, JsonParseException {
        if (this.f11951Q != C3799j.VALUE_STRING) {
            return super.mo16709c(str);
        }
        if (this.f12094D1) {
            this.f12094D1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17123d();
    }

    public void close() throws IOException {
        super.close();
        this.f12092B1.mo17042f();
    }

    /* renamed from: d0 */
    public String mo16715d0() throws IOException, JsonParseException {
        if (this.f11951Q != C3799j.VALUE_STRING) {
            return super.mo16709c(null);
        }
        if (this.f12094D1) {
            this.f12094D1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17123d();
    }

    /* renamed from: e */
    public int mo16716e(int i) throws IOException, JsonParseException {
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_NUMBER_INT) {
                return mo16670M();
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return i;
        }
        if (mo16728j0() == C3799j.VALUE_NUMBER_INT) {
            i = mo16670M();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public char mo16962h(String str) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            mo16846f(str);
        }
        char[] cArr = this.f12096z1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        return cArr[i];
    }

    /* renamed from: h0 */
    public Boolean mo16724h0() throws IOException, JsonParseException {
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jVar == C3799j.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return null;
        }
        int i = C3837a.f12097a[mo16728j0().ordinal()];
        if (i == 5) {
            return Boolean.TRUE;
        }
        if (i != 6) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public C3800k mo16725i() {
        return this.f12091A1;
    }

    /* renamed from: i0 */
    public String mo16726i0() throws IOException, JsonParseException {
        String str = null;
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_STRING) {
                if (this.f12094D1) {
                    this.f12094D1 = false;
                    mo16832v0();
                }
                return this.f11929z0.mo17123d();
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return null;
        }
        if (mo16728j0() == C3799j.VALUE_STRING) {
            str = mo16678U();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo16964j(int i) throws IOException, JsonParseException {
        if (i == 39 && mo16710c(C3796b.ALLOW_SINGLE_QUOTES)) {
            return mo16952M0();
        }
        if (!mo16710c(C3796b.ALLOW_UNQUOTED_FIELD_NAMES)) {
            mo16839a(i, "was expecting double-quote to start field name");
        }
        int[] f = C3817b.m16265f();
        int length = f.length;
        boolean z = i < length ? f[i] == 0 && (i < 48 || i > 57) : Character.isJavaIdentifierPart((char) i);
        if (!z) {
            mo16839a(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this.f11919p0;
        int i3 = this.f12093C1;
        int i4 = this.f11920q0;
        if (i2 < i4) {
            do {
                char[] cArr = this.f12096z1;
                char c = cArr[i2];
                if (c < length) {
                    if (f[c] != 0) {
                        int i5 = this.f11919p0 - 1;
                        this.f11919p0 = i2;
                        return this.f12092B1.mo17036a(cArr, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c)) {
                    int i6 = this.f11919p0 - 1;
                    this.f11919p0 = i2;
                    return this.f12092B1.mo17036a(this.f12096z1, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this.f11919p0 - 1;
        this.f11919p0 = i2;
        return m16390a(i7, i3, f);
    }

    /* renamed from: j0 */
    public C3799j mo16728j0() throws IOException, JsonParseException {
        C3799j jVar;
        this.f11907E0 = 0;
        if (this.f11951Q == C3799j.FIELD_NAME) {
            return m16382Q0();
        }
        if (this.f12094D1) {
            mo16955P0();
        }
        int V0 = m16387V0();
        if (V0 < 0) {
            close();
            this.f11951Q = null;
            return null;
        }
        long j = this.f11921r0;
        int i = this.f11919p0;
        this.f11924u0 = (j + ((long) i)) - 1;
        this.f11925v0 = this.f11922s0;
        this.f11926w0 = (i - this.f11923t0) - 1;
        this.f11906D0 = null;
        if (V0 == 93) {
            if (!this.f11927x0.mo16740f()) {
                mo16823a(V0, '}');
            }
            this.f11927x0 = this.f11927x0.mo16738d();
            C3799j jVar2 = C3799j.END_ARRAY;
            this.f11951Q = jVar2;
            return jVar2;
        } else if (V0 == 125) {
            if (!this.f11927x0.mo16741g()) {
                mo16823a(V0, ']');
            }
            this.f11927x0 = this.f11927x0.mo16738d();
            C3799j jVar3 = C3799j.END_OBJECT;
            this.f11951Q = jVar3;
            return jVar3;
        } else {
            if (this.f11927x0.mo16942i()) {
                if (V0 != 44) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("was expecting comma to separate ");
                    sb.append(this.f11927x0.mo16739e());
                    sb.append(" entries");
                    mo16839a(V0, sb.toString());
                }
                V0 = m16386U0();
            }
            boolean g = this.f11927x0.mo16741g();
            if (g) {
                this.f11927x0.mo16940a(mo16965k(V0));
                this.f11951Q = C3799j.FIELD_NAME;
                int U0 = m16386U0();
                if (U0 != 58) {
                    mo16839a(U0, "was expecting a colon to separate field name and value");
                }
                V0 = m16386U0();
            }
            if (V0 != 34) {
                if (V0 != 45) {
                    if (V0 != 91) {
                        if (V0 != 93) {
                            if (V0 == 102) {
                                mo16959a("false", 1);
                                jVar = C3799j.VALUE_FALSE;
                            } else if (V0 != 110) {
                                if (V0 != 116) {
                                    if (V0 != 123) {
                                        if (V0 != 125) {
                                            switch (V0) {
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    break;
                                                default:
                                                    jVar = mo16963i(V0);
                                                    break;
                                            }
                                        }
                                    } else {
                                        if (!g) {
                                            this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
                                        }
                                        jVar = C3799j.START_OBJECT;
                                    }
                                }
                                mo16959a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                                jVar = C3799j.VALUE_TRUE;
                            } else {
                                mo16959a("null", 1);
                                jVar = C3799j.VALUE_NULL;
                            }
                        }
                        mo16839a(V0, "expected a value");
                        mo16959a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                        jVar = C3799j.VALUE_TRUE;
                    } else {
                        if (!g) {
                            this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
                        }
                        jVar = C3799j.START_ARRAY;
                    }
                }
                jVar = mo16966l(V0);
            } else {
                this.f12094D1 = true;
                jVar = C3799j.VALUE_STRING;
            }
            if (g) {
                this.f11928y0 = jVar;
                return this.f11951Q;
            }
            this.f11951Q = jVar;
            return jVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo16965k(int i) throws IOException, JsonParseException {
        if (i != 34) {
            return mo16964j(i);
        }
        int i2 = this.f11919p0;
        int i3 = this.f12093C1;
        int i4 = this.f11920q0;
        if (i2 < i4) {
            int[] e = C3817b.m16264e();
            int length = e.length;
            while (true) {
                char[] cArr = this.f12096z1;
                char c = cArr[i2];
                if (c >= length || e[c] == 0) {
                    i3 = (i3 * 33) + c;
                    i2++;
                    if (i2 >= i4) {
                        break;
                    }
                } else if (c == '\"') {
                    int i5 = this.f11919p0;
                    this.f11919p0 = i2 + 1;
                    return this.f12092B1.mo17036a(cArr, i5, i2 - i5, i3);
                }
            }
        }
        int i6 = this.f11919p0;
        this.f11919p0 = i2;
        return m16389a(i6, i3, 34);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r9 = r10;
        r11 = r4;
        r4 = r13;
        r13 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.C3799j mo16966l(int r13) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r12 = this;
            r0 = 45
            r1 = 0
            r2 = 1
            if (r13 != r0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            int r4 = r12.f11919p0
            int r5 = r4 + -1
            int r6 = r12.f11920q0
            r7 = 57
            r8 = 48
            if (r3 == 0) goto L_0x002d
            if (r4 < r6) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            char[] r13 = r12.f12096z1
            int r9 = r4 + 1
            char r13 = r13[r4]
            if (r13 > r7) goto L_0x0026
            if (r13 >= r8) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r4 = r9
            goto L_0x002d
        L_0x0026:
            r12.f11919p0 = r9
            com.fasterxml.jackson.core.j r13 = r12.mo16957a(r13, r2)
            return r13
        L_0x002d:
            if (r13 != r8) goto L_0x0031
            goto L_0x0096
        L_0x0031:
            int r13 = r12.f11920q0
            if (r4 < r13) goto L_0x0037
            goto L_0x0096
        L_0x0037:
            char[] r13 = r12.f12096z1
            int r9 = r4 + 1
            char r13 = r13[r4]
            if (r13 < r8) goto L_0x0046
            if (r13 <= r7) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            int r2 = r2 + 1
            r4 = r9
            goto L_0x0031
        L_0x0046:
            r4 = 46
            if (r13 != r4) goto L_0x0069
            r13 = 0
        L_0x004b:
            if (r9 < r6) goto L_0x004e
            goto L_0x0096
        L_0x004e:
            char[] r4 = r12.f12096z1
            int r10 = r9 + 1
            char r4 = r4[r9]
            if (r4 < r8) goto L_0x005d
            if (r4 <= r7) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            int r13 = r13 + 1
            r9 = r10
            goto L_0x004b
        L_0x005d:
            if (r13 != 0) goto L_0x0064
            java.lang.String r9 = "Decimal point not followed by a digit"
            r12.mo16826c(r4, r9)
        L_0x0064:
            r9 = r10
            r11 = r4
            r4 = r13
            r13 = r11
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            r10 = 101(0x65, float:1.42E-43)
            if (r13 == r10) goto L_0x0072
            r10 = 69
            if (r13 != r10) goto L_0x00af
        L_0x0072:
            if (r9 < r6) goto L_0x0075
            goto L_0x0096
        L_0x0075:
            char[] r13 = r12.f12096z1
            int r10 = r9 + 1
            char r13 = r13[r9]
            if (r13 == r0) goto L_0x0084
            r0 = 43
            if (r13 != r0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r9 = r10
            goto L_0x008e
        L_0x0084:
            if (r10 < r6) goto L_0x0087
            goto L_0x0096
        L_0x0087:
            char[] r13 = r12.f12096z1
            int r0 = r10 + 1
            char r13 = r13[r10]
        L_0x008d:
            r9 = r0
        L_0x008e:
            if (r13 > r7) goto L_0x00a8
            if (r13 < r8) goto L_0x00a8
            int r1 = r1 + 1
            if (r9 < r6) goto L_0x00a1
        L_0x0096:
            if (r3 == 0) goto L_0x009a
            int r5 = r5 + 1
        L_0x009a:
            r12.f11919p0 = r5
            com.fasterxml.jackson.core.j r13 = r12.m16391b(r3)
            return r13
        L_0x00a1:
            char[] r13 = r12.f12096z1
            int r0 = r9 + 1
            char r13 = r13[r9]
            goto L_0x008d
        L_0x00a8:
            if (r1 != 0) goto L_0x00af
            java.lang.String r0 = "Exponent indicator not followed by a digit"
            r12.mo16826c(r13, r0)
        L_0x00af:
            int r9 = r9 + -1
            r12.f11919p0 = r9
            int r9 = r9 - r5
            com.fasterxml.jackson.core.w.j r13 = r12.f11929z0
            char[] r0 = r12.f12096z1
            r13.mo17122c(r0, r5, r9)
            com.fasterxml.jackson.core.j r13 = r12.mo16821a(r3, r2, r4, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3836f.mo16966l(int):com.fasterxml.jackson.core.j");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public void mo16830t0() throws IOException {
        if (this.f12095y1 != null) {
            if (this.f11917n0.mo16891i() || mo16710c(C3796b.AUTO_CLOSE_SOURCE)) {
                this.f12095y1.close();
            }
            this.f12095y1 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public char mo16831u0() throws IOException, JsonParseException {
        String str = " in character escape sequence";
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            mo16846f(str);
        }
        char[] cArr = this.f12096z1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        char c = cArr[i];
        if (!(c == '\"' || c == '/' || c == '\\')) {
            if (c == 'b') {
                c = 8;
            } else if (c == 'f') {
                return 12;
            } else {
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    return mo16837a(c);
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                        mo16846f(str);
                    }
                    char[] cArr2 = this.f12096z1;
                    int i4 = this.f11919p0;
                    this.f11919p0 = i4 + 1;
                    char c2 = cArr2[i4];
                    int a = C3817b.m16258a(c2);
                    if (a < 0) {
                        mo16839a((int) c2, "expected a hex-digit for character escape sequence");
                    }
                    i2 = (i2 << 4) | a;
                }
                return (char) i2;
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo16832v0() throws IOException, JsonParseException {
        int i = this.f11919p0;
        int i2 = this.f11920q0;
        if (i < i2) {
            int[] e = C3817b.m16264e();
            int length = e.length;
            while (true) {
                char[] cArr = this.f12096z1;
                char c = cArr[i];
                if (c >= length || e[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    C3869j jVar = this.f11929z0;
                    int i3 = this.f11919p0;
                    jVar.mo17122c(cArr, i3, i - i3);
                    this.f11919p0 = i + 1;
                    return;
                }
            }
        }
        C3869j jVar2 = this.f11929z0;
        char[] cArr2 = this.f12096z1;
        int i4 = this.f11919p0;
        jVar2.mo17120b(cArr2, i4, i - i4);
        this.f11919p0 = i;
        mo16950K0();
    }

    public C3804o version() {
        return C3832b.f12070d.mo17137a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo16834x0() throws IOException {
        super.mo16834x0();
        char[] cArr = this.f12096z1;
        if (cArr != null) {
            this.f12096z1 = null;
            this.f11917n0.mo16884c(cArr);
        }
    }

    /* renamed from: a */
    public int mo16688a(Writer writer) throws IOException {
        int i = this.f11920q0;
        int i2 = this.f11919p0;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        writer.write(this.f12096z1, i2, i3);
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C3799j mo16963i(int i) throws IOException, JsonParseException {
        if (i != 39) {
            if (i == 43) {
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    mo16849r0();
                }
                char[] cArr = this.f12096z1;
                int i2 = this.f11919p0;
                this.f11919p0 = i2 + 1;
                return mo16957a((int) cArr[i2], false);
            } else if (i == 78) {
                String str = "NaN";
                mo16959a(str, 1);
                if (mo16710c(C3796b.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return mo16819a(str, Double.NaN);
                }
                mo16844e("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        } else if (mo16710c(C3796b.ALLOW_SINGLE_QUOTES)) {
            return mo16951L0();
        }
        mo16839a(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16958a(C3799j jVar) {
        if (jVar == null) {
            return null;
        }
        int i = C3837a.f12097a[jVar.ordinal()];
        if (i == 1) {
            return this.f11927x0.mo16736b();
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.f11929z0.mo17123d();
        }
        return jVar.mo16745f();
    }

    /* renamed from: a */
    public byte[] mo16699a(C3785a aVar) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != C3799j.VALUE_STRING && (jVar != C3799j.VALUE_EMBEDDED_OBJECT || this.f11906D0 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current token (");
            sb.append(this.f11951Q);
            sb.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            mo16844e(sb.toString());
        }
        if (this.f12094D1) {
            try {
                this.f11906D0 = mo16961b(aVar);
                this.f12094D1 = false;
            } catch (IllegalArgumentException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to decode VALUE_STRING as base64 (");
                sb2.append(aVar);
                sb2.append("): ");
                sb2.append(e.getMessage());
                throw mo16703b(sb2.toString());
            }
        } else if (this.f11906D0 == null) {
            C3857b w0 = mo16833w0();
            mo16841a(mo16678U(), w0, aVar);
            this.f11906D0 = w0.mo17095h();
        }
        return this.f11906D0;
    }

    /* renamed from: b */
    private C3799j m16391b(boolean z) throws IOException, JsonParseException {
        int i;
        char c;
        boolean z2;
        boolean z3;
        int i2;
        char c2;
        char h;
        int i3;
        boolean z4 = z;
        char[] e = this.f11929z0.mo17124e();
        int i4 = 0;
        if (z4) {
            e[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        int i5 = this.f11919p0;
        if (i5 < this.f11920q0) {
            char[] cArr = this.f12096z1;
            this.f11919p0 = i5 + 1;
            c = cArr[i5];
        } else {
            c = mo16962h("No digit following minus sign");
        }
        if (c == '0') {
            c = m16388W0();
        }
        char[] cArr2 = e;
        int i6 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i6++;
                if (i >= cArr2.length) {
                    cArr2 = this.f11929z0.mo17127h();
                    i = 0;
                }
                int i7 = i + 1;
                cArr2[i] = c;
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    i = i7;
                    c = 0;
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.f12096z1;
                int i8 = this.f11919p0;
                this.f11919p0 = i8 + 1;
                c = cArr3[i8];
                i = i7;
            } else {
                z2 = false;
            }
        }
        z2 = false;
        if (i6 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Missing integer part (next char ");
            sb.append(C3809c.m16200g(c));
            sb.append(")");
            mo16827g(sb.toString());
        }
        if (c == '.') {
            int i9 = i + 1;
            cArr2[i] = c;
            int i10 = 0;
            while (true) {
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    z2 = true;
                    break;
                }
                char[] cArr4 = this.f12096z1;
                int i11 = this.f11919p0;
                this.f11919p0 = i11 + 1;
                c = cArr4[i11];
                if (c < '0' || c > '9') {
                    break;
                }
                i10++;
                if (i9 >= cArr2.length) {
                    cArr2 = this.f11929z0.mo17127h();
                    i9 = 0;
                }
                int i12 = i9 + 1;
                cArr2[i9] = c;
                i9 = i12;
            }
            if (i10 == 0) {
                mo16826c(c, "Decimal point not followed by a digit");
            }
            boolean z5 = z2;
            i2 = i10;
            i = i9;
            z3 = z5;
        } else {
            z3 = z2;
            i2 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i >= cArr2.length) {
                cArr2 = this.f11929z0.mo17127h();
                i = 0;
            }
            int i13 = i + 1;
            cArr2[i] = c;
            int i14 = this.f11919p0;
            String str = "expected a digit for number exponent";
            if (i14 < this.f11920q0) {
                char[] cArr5 = this.f12096z1;
                this.f11919p0 = i14 + 1;
                c2 = cArr5[i14];
            } else {
                c2 = mo16962h(str);
            }
            if (c2 == '-' || c2 == '+') {
                if (i13 >= cArr2.length) {
                    cArr2 = this.f11929z0.mo17127h();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                cArr2[i13] = c2;
                int i16 = this.f11919p0;
                if (i16 < this.f11920q0) {
                    char[] cArr6 = this.f12096z1;
                    this.f11919p0 = i16 + 1;
                    h = cArr6[i16];
                } else {
                    h = mo16962h(str);
                }
                i13 = i15;
            }
            int i17 = 0;
            while (true) {
                if (c2 <= '9' && c2 >= '0') {
                    i17++;
                    if (i13 >= cArr2.length) {
                        cArr2 = this.f11929z0.mo17127h();
                        i13 = 0;
                    }
                    i3 = i13 + 1;
                    cArr2[i13] = c2;
                    if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                        i4 = i17;
                        z3 = true;
                        break;
                    }
                    char[] cArr7 = this.f12096z1;
                    int i18 = this.f11919p0;
                    this.f11919p0 = i18 + 1;
                    c2 = cArr7[i18];
                    i13 = i3;
                } else {
                    i4 = i17;
                    i3 = i13;
                }
            }
            i4 = i17;
            i3 = i13;
            if (i4 == 0) {
                mo16826c(c2, "Exponent indicator not followed by a digit");
            }
            i = i3;
        }
        if (!z3) {
            this.f11919p0--;
        }
        this.f11929z0.mo17114a(i);
        return mo16821a(z4, i6, i2, i4);
    }

    /* renamed from: a */
    public int mo16686a(C3785a aVar, OutputStream outputStream) throws IOException, JsonParseException {
        if (!this.f12094D1 || this.f11951Q != C3799j.VALUE_STRING) {
            byte[] a = mo16699a(aVar);
            outputStream.write(a);
            return a.length;
        }
        byte[] a2 = this.f11917n0.mo16878a();
        try {
            int a3 = mo16956a(aVar, outputStream, a2);
            return a3;
        } finally {
            this.f11917n0.mo16876a(a2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo16956a(C3785a aVar, OutputStream outputStream, byte[] bArr) throws IOException, JsonParseException {
        int i;
        int length = bArr.length - 3;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            char[] cArr = this.f12096z1;
            int i4 = this.f11919p0;
            this.f11919p0 = i4 + 1;
            char c = cArr[i4];
            if (c > ' ') {
                int a = aVar.mo16488a(c);
                if (a < 0) {
                    if (c == '\"') {
                        break;
                    }
                    a = mo16817a(aVar, c, 0);
                    if (a < 0) {
                        continue;
                    }
                }
                if (i3 > length) {
                    i2 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                char[] cArr2 = this.f12096z1;
                int i5 = this.f11919p0;
                this.f11919p0 = i5 + 1;
                char c2 = cArr2[i5];
                int a2 = aVar.mo16488a(c2);
                if (a2 < 0) {
                    a2 = mo16817a(aVar, c2, 1);
                }
                int i6 = (a << 6) | a2;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                char[] cArr3 = this.f12096z1;
                int i7 = this.f11919p0;
                this.f11919p0 = i7 + 1;
                char c3 = cArr3[i7];
                int a3 = aVar.mo16488a(c3);
                if (a3 < 0) {
                    if (a3 != -2) {
                        if (c3 == '\"' && !aVar.mo16504f()) {
                            int i8 = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i8;
                            break;
                        }
                        a3 = mo16817a(aVar, c3, 2);
                    }
                    if (a3 == -2) {
                        if (this.f11919p0 >= this.f11920q0) {
                            mo16814H0();
                        }
                        char[] cArr4 = this.f12096z1;
                        int i9 = this.f11919p0;
                        this.f11919p0 = i9 + 1;
                        char c4 = cArr4[i9];
                        if (aVar.mo16499b(c4)) {
                            i = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(aVar.mo16503e());
                            sb.append("'");
                            throw mo16822a(aVar, (int) c4, 3, sb.toString());
                        }
                    }
                }
                int i10 = (i6 << 6) | a3;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                char[] cArr5 = this.f12096z1;
                int i11 = this.f11919p0;
                this.f11919p0 = i11 + 1;
                char c5 = cArr5[i11];
                int a4 = aVar.mo16488a(c5);
                if (a4 < 0) {
                    if (a4 != -2) {
                        if (c5 == '\"' && !aVar.mo16504f()) {
                            int i12 = i10 >> 2;
                            int i13 = i3 + 1;
                            bArr[i3] = (byte) (i12 >> 8);
                            i3 = i13 + 1;
                            bArr[i13] = (byte) i12;
                            break;
                        }
                        a4 = mo16817a(aVar, c5, 3);
                    }
                    if (a4 == -2) {
                        int i14 = i10 >> 2;
                        int i15 = i3 + 1;
                        bArr[i3] = (byte) (i14 >> 8);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) i14;
                    }
                }
                int i16 = (i10 << 6) | a4;
                int i17 = i3 + 1;
                bArr[i3] = (byte) (i16 >> 16);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (i16 >> 8);
                i = i18 + 1;
                bArr[i18] = (byte) i16;
                i3 = i;
            }
        }
        this.f12094D1 = false;
        if (i3 <= 0) {
            return i2;
        }
        int i19 = i2 + i3;
        outputStream.write(bArr, 0, i3);
        return i19;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo16961b(C3785a aVar) throws IOException, JsonParseException {
        C3857b w0 = mo16833w0();
        while (true) {
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            char[] cArr = this.f12096z1;
            int i = this.f11919p0;
            this.f11919p0 = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int a = aVar.mo16488a(c);
                if (a < 0) {
                    if (c == '\"') {
                        return w0.mo17095h();
                    }
                    a = mo16817a(aVar, c, 0);
                    if (a < 0) {
                        continue;
                    }
                }
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                char[] cArr2 = this.f12096z1;
                int i2 = this.f11919p0;
                this.f11919p0 = i2 + 1;
                char c2 = cArr2[i2];
                int a2 = aVar.mo16488a(c2);
                if (a2 < 0) {
                    a2 = mo16817a(aVar, c2, 1);
                }
                int i3 = (a << 6) | a2;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                char[] cArr3 = this.f12096z1;
                int i4 = this.f11919p0;
                this.f11919p0 = i4 + 1;
                char c3 = cArr3[i4];
                int a3 = aVar.mo16488a(c3);
                if (a3 < 0) {
                    if (a3 != -2) {
                        if (c3 != '\"' || aVar.mo16504f()) {
                            a3 = mo16817a(aVar, c3, 2);
                        } else {
                            w0.mo17083a(i3 >> 4);
                            return w0.mo17095h();
                        }
                    }
                    if (a3 == -2) {
                        if (this.f11919p0 >= this.f11920q0) {
                            mo16814H0();
                        }
                        char[] cArr4 = this.f12096z1;
                        int i5 = this.f11919p0;
                        this.f11919p0 = i5 + 1;
                        char c4 = cArr4[i5];
                        if (aVar.mo16499b(c4)) {
                            w0.mo17083a(i3 >> 4);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(aVar.mo16503e());
                            sb.append("'");
                            throw mo16822a(aVar, (int) c4, 3, sb.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | a3;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                char[] cArr5 = this.f12096z1;
                int i7 = this.f11919p0;
                this.f11919p0 = i7 + 1;
                char c5 = cArr5[i7];
                int a4 = aVar.mo16488a(c5);
                if (a4 < 0) {
                    if (a4 != -2) {
                        if (c5 != '\"' || aVar.mo16504f()) {
                            a4 = mo16817a(aVar, c5, 3);
                        } else {
                            w0.mo17090f(i6 >> 2);
                            return w0.mo17095h();
                        }
                    }
                    if (a4 == -2) {
                        w0.mo17090f(i6 >> 2);
                    }
                }
                w0.mo17088e((i6 << 6) | a4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=char, for r9v0, types: [int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.C3799j mo16957a(char r9, boolean r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            r0 = 73
            if (r9 != r0) goto L_0x008f
            int r9 = r8.f11919p0
            int r0 = r8.f11920q0
            if (r9 < r0) goto L_0x0013
            boolean r9 = r8.mo16813G0()
            if (r9 != 0) goto L_0x0013
            r8.mo16849r0()
        L_0x0013:
            char[] r9 = r8.f12096z1
            int r0 = r8.f11919p0
            int r1 = r0 + 1
            r8.f11919p0 = r1
            char r9 = r9[r0]
            r0 = 78
            r1 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.String r5 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            java.lang.String r6 = "Non-standard token '"
            r7 = 3
            if (r9 != r0) goto L_0x005b
            if (r10 == 0) goto L_0x002f
            java.lang.String r0 = "-INF"
            goto L_0x0031
        L_0x002f:
            java.lang.String r0 = "+INF"
        L_0x0031:
            r8.mo16959a(r0, r7)
            com.fasterxml.jackson.core.h$b r7 = com.fasterxml.jackson.core.C3794h.C3796b.ALLOW_NON_NUMERIC_NUMBERS
            boolean r7 = r8.mo16710c(r7)
            if (r7 == 0) goto L_0x0045
            if (r10 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            com.fasterxml.jackson.core.j r9 = r8.mo16819a(r0, r1)
            return r9
        L_0x0045:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r8.mo16844e(r10)
            goto L_0x008f
        L_0x005b:
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 != r0) goto L_0x008f
            if (r10 == 0) goto L_0x0064
            java.lang.String r0 = "-Infinity"
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = "+Infinity"
        L_0x0066:
            r8.mo16959a(r0, r7)
            com.fasterxml.jackson.core.h$b r7 = com.fasterxml.jackson.core.C3794h.C3796b.ALLOW_NON_NUMERIC_NUMBERS
            boolean r7 = r8.mo16710c(r7)
            if (r7 == 0) goto L_0x007a
            if (r10 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r3
        L_0x0075:
            com.fasterxml.jackson.core.j r9 = r8.mo16819a(r0, r1)
            return r9
        L_0x007a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r8.mo16844e(r10)
        L_0x008f:
            java.lang.String r10 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            r8.mo16826c(r9, r10)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3836f.mo16957a(int, boolean):com.fasterxml.jackson.core.j");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m16389a(int r5, int r6, int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.w.j r0 = r4.f11929z0
            char[] r1 = r4.f12096z1
            int r2 = r4.f11919p0
            int r2 = r2 - r5
            r0.mo17122c(r1, r5, r2)
            com.fasterxml.jackson.core.w.j r5 = r4.f11929z0
            char[] r5 = r5.mo17128i()
            com.fasterxml.jackson.core.w.j r0 = r4.f11929z0
            int r0 = r0.mo17129j()
        L_0x0016:
            int r1 = r4.f11919p0
            int r2 = r4.f11920q0
            if (r1 < r2) goto L_0x003c
            boolean r1 = r4.mo16813G0()
            if (r1 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": was expecting closing '"
            r1.append(r2)
            char r2 = (char) r7
            r1.append(r2)
            java.lang.String r2 = "' for name"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.mo16846f(r1)
        L_0x003c:
            char[] r1 = r4.f12096z1
            int r2 = r4.f11919p0
            int r3 = r2 + 1
            r4.f11919p0 = r3
            char r1 = r1[r2]
            r2 = 92
            if (r1 > r2) goto L_0x0078
            if (r1 != r2) goto L_0x0051
            char r2 = r4.mo16831u0()
            goto L_0x0079
        L_0x0051:
            if (r1 > r7) goto L_0x0078
            if (r1 != r7) goto L_0x006f
            com.fasterxml.jackson.core.w.j r5 = r4.f11929z0
            r5.mo17114a(r0)
            com.fasterxml.jackson.core.w.j r5 = r4.f11929z0
            char[] r7 = r5.mo17130k()
            int r0 = r5.mo17131l()
            int r5 = r5.mo17135p()
            com.fasterxml.jackson.core.u.b r1 = r4.f12092B1
            java.lang.String r5 = r1.mo17036a(r7, r0, r5, r6)
            return r5
        L_0x006f:
            r2 = 32
            if (r1 >= r2) goto L_0x0078
            java.lang.String r2 = "name"
            r4.mo16842b(r1, r2)
        L_0x0078:
            r2 = r1
        L_0x0079:
            int r6 = r6 * 33
            int r6 = r6 + r1
            int r1 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r1 < r0) goto L_0x008b
            com.fasterxml.jackson.core.w.j r5 = r4.f11929z0
            char[] r5 = r5.mo17127h()
            r0 = 0
            goto L_0x0016
        L_0x008b:
            r0 = r1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3836f.m16389a(int, int, int):java.lang.String");
    }

    /* renamed from: a */
    private String m16390a(int i, int i2, int[] iArr) throws IOException, JsonParseException {
        this.f11929z0.mo17122c(this.f12096z1, i, this.f11919p0 - i);
        char[] i3 = this.f11929z0.mo17128i();
        int j = this.f11929z0.mo17129j();
        int length = iArr.length;
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                break;
            }
            char c = this.f12096z1[this.f11919p0];
            if (c > length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this.f11919p0++;
            i2 = (i2 * 33) + c;
            int i4 = j + 1;
            i3[j] = c;
            if (i4 >= i3.length) {
                i3 = this.f11929z0.mo17127h();
                j = 0;
            } else {
                j = i4;
            }
        }
        this.f11929z0.mo17114a(j);
        C3869j jVar = this.f11929z0;
        return this.f12092B1.mo17036a(jVar.mo17130k(), jVar.mo17131l(), jVar.mo17135p(), i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16959a(String str, int i) throws IOException, JsonParseException {
        String str2;
        int length = str.length();
        do {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16849r0();
            }
            str2 = "'null', 'true', 'false' or NaN";
            if (this.f12096z1[this.f11919p0] != str.charAt(i)) {
                mo16960a(str.substring(0, i), str2);
            }
            this.f11919p0++;
            i++;
        } while (i < length);
        if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
            char c = this.f12096z1[this.f11919p0];
            if (c >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
                mo16960a(str.substring(0, i), str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16960a(String str, String str2) throws IOException, JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                break;
            }
            char c = this.f12096z1[this.f11919p0];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.f11919p0++;
            sb.append(c);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unrecognized token '");
        sb2.append(sb.toString());
        sb2.append("': was expecting ");
        mo16844e(sb2.toString());
    }
}
