package com.fasterxml.jackson.core.p156q;

import com.fasterxml.jackson.core.C3785a;
import com.fasterxml.jackson.core.C3793g;
import com.fasterxml.jackson.core.C3794h.C3797c;
import com.fasterxml.jackson.core.C3799j;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p158s.C3823h;
import com.fasterxml.jackson.core.p159t.C3834d;
import com.fasterxml.jackson.core.p162w.C3857b;
import com.fasterxml.jackson.core.p162w.C3869j;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.fasterxml.jackson.core.q.b */
/* compiled from: ParserBase */
public abstract class C3808b extends C3809c {

    /* renamed from: O0 */
    protected static final int f11867O0 = 0;

    /* renamed from: P0 */
    protected static final int f11868P0 = 1;

    /* renamed from: Q0 */
    protected static final int f11869Q0 = 2;

    /* renamed from: R0 */
    protected static final int f11870R0 = 4;

    /* renamed from: S0 */
    protected static final int f11871S0 = 8;

    /* renamed from: T0 */
    protected static final int f11872T0 = 16;

    /* renamed from: U0 */
    static final BigInteger f11873U0 = BigInteger.valueOf(f11881c1);

    /* renamed from: V0 */
    static final BigInteger f11874V0 = BigInteger.valueOf(f11882d1);

    /* renamed from: W0 */
    static final BigInteger f11875W0 = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: X0 */
    static final BigInteger f11876X0 = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: Y0 */
    static final BigDecimal f11877Y0 = new BigDecimal(f11875W0);

    /* renamed from: Z0 */
    static final BigDecimal f11878Z0 = new BigDecimal(f11876X0);

    /* renamed from: a1 */
    static final BigDecimal f11879a1 = new BigDecimal(f11873U0);

    /* renamed from: b1 */
    static final BigDecimal f11880b1 = new BigDecimal(f11874V0);

    /* renamed from: c1 */
    static final long f11881c1 = -2147483648L;

    /* renamed from: d1 */
    static final long f11882d1 = 2147483647L;

    /* renamed from: e1 */
    static final double f11883e1 = -9.223372036854776E18d;

    /* renamed from: f1 */
    static final double f11884f1 = 9.223372036854776E18d;

    /* renamed from: g1 */
    static final double f11885g1 = -2.147483648E9d;

    /* renamed from: h1 */
    static final double f11886h1 = 2.147483647E9d;

    /* renamed from: i1 */
    protected static final int f11887i1 = 48;

    /* renamed from: j1 */
    protected static final int f11888j1 = 49;

    /* renamed from: k1 */
    protected static final int f11889k1 = 50;

    /* renamed from: l1 */
    protected static final int f11890l1 = 51;

    /* renamed from: m1 */
    protected static final int f11891m1 = 52;

    /* renamed from: n1 */
    protected static final int f11892n1 = 53;

    /* renamed from: o1 */
    protected static final int f11893o1 = 54;

    /* renamed from: p1 */
    protected static final int f11894p1 = 55;

    /* renamed from: q1 */
    protected static final int f11895q1 = 56;

    /* renamed from: r1 */
    protected static final int f11896r1 = 57;

    /* renamed from: s1 */
    protected static final int f11897s1 = 45;

    /* renamed from: t1 */
    protected static final int f11898t1 = 43;

    /* renamed from: u1 */
    protected static final int f11899u1 = 46;

    /* renamed from: v1 */
    protected static final int f11900v1 = 101;

    /* renamed from: w1 */
    protected static final int f11901w1 = 69;

    /* renamed from: x1 */
    protected static final char f11902x1 = 0;

    /* renamed from: A0 */
    protected char[] f11903A0 = null;

    /* renamed from: B0 */
    protected boolean f11904B0 = false;

    /* renamed from: C0 */
    protected C3857b f11905C0 = null;

    /* renamed from: D0 */
    protected byte[] f11906D0;

    /* renamed from: E0 */
    protected int f11907E0 = 0;

    /* renamed from: F0 */
    protected int f11908F0;

    /* renamed from: G0 */
    protected long f11909G0;

    /* renamed from: H0 */
    protected double f11910H0;

    /* renamed from: I0 */
    protected BigInteger f11911I0;

    /* renamed from: J0 */
    protected BigDecimal f11912J0;

    /* renamed from: K0 */
    protected boolean f11913K0;

    /* renamed from: L0 */
    protected int f11914L0;

    /* renamed from: M0 */
    protected int f11915M0;

    /* renamed from: N0 */
    protected int f11916N0;

    /* renamed from: n0 */
    protected final C3819d f11917n0;

    /* renamed from: o0 */
    protected boolean f11918o0;

    /* renamed from: p0 */
    protected int f11919p0 = 0;

    /* renamed from: q0 */
    protected int f11920q0 = 0;

    /* renamed from: r0 */
    protected long f11921r0 = 0;

    /* renamed from: s0 */
    protected int f11922s0 = 1;

    /* renamed from: t0 */
    protected int f11923t0 = 0;

    /* renamed from: u0 */
    protected long f11924u0 = 0;

    /* renamed from: v0 */
    protected int f11925v0 = 1;

    /* renamed from: w0 */
    protected int f11926w0 = 0;

    /* renamed from: x0 */
    protected C3834d f11927x0;

    /* renamed from: y0 */
    protected C3799j f11928y0;

    /* renamed from: z0 */
    protected final C3869j f11929z0;

    protected C3808b(C3819d dVar, int i) {
        this.f11846a = i;
        this.f11917n0 = dVar;
        this.f11929z0 = dVar.mo16888f();
        this.f11927x0 = C3834d.m16362j();
    }

    /* renamed from: i */
    private void mo16963i(int i) throws IOException, JsonParseException {
        if (i == 16) {
            try {
                this.f11912J0 = this.f11929z0.mo17119b();
                this.f11907E0 = 16;
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed numeric value '");
                sb.append(this.f11929z0.mo17123d());
                sb.append("'");
                mo16843b(sb.toString(), (Throwable) e);
            }
        } else {
            this.f11910H0 = this.f11929z0.mo17121c();
            this.f11907E0 = 8;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public void mo16807A0() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 16) != 0) {
            this.f11910H0 = this.f11912J0.doubleValue();
        } else if ((i & 4) != 0) {
            this.f11910H0 = this.f11911I0.doubleValue();
        } else if ((i & 2) != 0) {
            this.f11910H0 = (double) this.f11909G0;
        } else if ((i & 1) != 0) {
            this.f11910H0 = (double) this.f11908F0;
        } else {
            mo16850s0();
        }
        this.f11907E0 |= 8;
    }

    /* renamed from: B */
    public C3793g mo16662B() {
        C3793g gVar = new C3793g(this.f11917n0.mo16890h(), (this.f11921r0 + ((long) this.f11919p0)) - 1, this.f11922s0, (this.f11919p0 - this.f11923t0) + 1);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public void mo16808B0() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 2) != 0) {
            long j = this.f11909G0;
            int i2 = (int) j;
            if (((long) i2) != j) {
                StringBuilder sb = new StringBuilder();
                sb.append("Numeric value (");
                sb.append(mo16678U());
                sb.append(") out of range of int");
                mo16844e(sb.toString());
            }
            this.f11908F0 = i2;
        } else if ((i & 4) != 0) {
            if (f11873U0.compareTo(this.f11911I0) > 0 || f11874V0.compareTo(this.f11911I0) < 0) {
                mo16815I0();
            }
            this.f11908F0 = this.f11911I0.intValue();
        } else if ((i & 8) != 0) {
            double d = this.f11910H0;
            if (d < f11885g1 || d > f11886h1) {
                mo16815I0();
            }
            this.f11908F0 = (int) this.f11910H0;
        } else if ((i & 16) != 0) {
            if (f11879a1.compareTo(this.f11912J0) > 0 || f11880b1.compareTo(this.f11912J0) < 0) {
                mo16815I0();
            }
            this.f11908F0 = this.f11912J0.intValue();
        } else {
            mo16850s0();
        }
        this.f11907E0 |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public void mo16809C0() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 1) != 0) {
            this.f11909G0 = (long) this.f11908F0;
        } else if ((i & 4) != 0) {
            if (f11875W0.compareTo(this.f11911I0) > 0 || f11876X0.compareTo(this.f11911I0) < 0) {
                mo16816J0();
            }
            this.f11909G0 = this.f11911I0.longValue();
        } else if ((i & 8) != 0) {
            double d = this.f11910H0;
            if (d < f11883e1 || d > f11884f1) {
                mo16816J0();
            }
            this.f11909G0 = (long) this.f11910H0;
        } else if ((i & 16) != 0) {
            if (f11877Y0.compareTo(this.f11912J0) > 0 || f11878Z0.compareTo(this.f11912J0) < 0) {
                mo16816J0();
            }
            this.f11909G0 = this.f11912J0.longValue();
        } else {
            mo16850s0();
        }
        this.f11907E0 |= 2;
    }

    /* renamed from: D0 */
    public long mo16810D0() {
        return this.f11924u0;
    }

    /* renamed from: E0 */
    public int mo16811E0() {
        int i = this.f11926w0;
        return i < 0 ? i : i + 1;
    }

    /* renamed from: F */
    public String mo16663F() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == C3799j.START_OBJECT || jVar == C3799j.START_ARRAY) {
            return this.f11927x0.mo16738d().mo16736b();
        }
        return this.f11927x0.mo16736b();
    }

    /* renamed from: F0 */
    public int mo16812F0() {
        return this.f11925v0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public abstract boolean mo16813G0() throws IOException;

    /* renamed from: H */
    public BigDecimal mo16665H() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 16) == 0) {
            if (i == 0) {
                mo16828h(16);
            }
            if ((this.f11907E0 & 16) == 0) {
                mo16835y0();
            }
        }
        return this.f11912J0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public final void mo16814H0() throws IOException {
        if (!mo16813G0()) {
            mo16848q0();
        }
    }

    /* renamed from: I */
    public double mo16666I() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 8) == 0) {
            if (i == 0) {
                mo16828h(8);
            }
            if ((this.f11907E0 & 8) == 0) {
                mo16807A0();
            }
        }
        return this.f11910H0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo16815I0() throws IOException, JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric value (");
        sb.append(mo16678U());
        sb.append(") out of range of int (");
        sb.append(Integer.MIN_VALUE);
        sb.append(" - ");
        sb.append(Integer.MAX_VALUE);
        sb.append(")");
        mo16844e(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo16816J0() throws IOException, JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric value (");
        sb.append(mo16678U());
        sb.append(") out of range of long (");
        sb.append(Long.MIN_VALUE);
        sb.append(" - ");
        sb.append(Long.MAX_VALUE);
        sb.append(")");
        mo16844e(sb.toString());
    }

    /* renamed from: K */
    public float mo16668K() throws IOException, JsonParseException {
        return (float) mo16666I();
    }

    /* renamed from: M */
    public int mo16670M() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 1) == 0) {
            if (i == 0) {
                mo16828h(1);
            }
            if ((this.f11907E0 & 1) == 0) {
                mo16808B0();
            }
        }
        return this.f11908F0;
    }

    /* renamed from: O */
    public long mo16672O() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 2) == 0) {
            if (i == 0) {
                mo16828h(2);
            }
            if ((this.f11907E0 & 2) == 0) {
                mo16809C0();
            }
        }
        return this.f11909G0;
    }

    /* renamed from: P */
    public C3797c mo16673P() throws IOException, JsonParseException {
        if (this.f11907E0 == 0) {
            mo16828h(0);
        }
        if (this.f11951Q == C3799j.VALUE_NUMBER_INT) {
            int i = this.f11907E0;
            if ((i & 1) != 0) {
                return C3797c.INT;
            }
            if ((i & 2) != 0) {
                return C3797c.LONG;
            }
            return C3797c.BIG_INTEGER;
        } else if ((this.f11907E0 & 16) != 0) {
            return C3797c.BIG_DECIMAL;
        } else {
            return C3797c.DOUBLE;
        }
    }

    /* renamed from: Q */
    public Number mo16674Q() throws IOException, JsonParseException {
        if (this.f11907E0 == 0) {
            mo16828h(0);
        }
        if (this.f11951Q == C3799j.VALUE_NUMBER_INT) {
            int i = this.f11907E0;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.f11908F0);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.f11909G0);
            }
            if ((i & 4) != 0) {
                return this.f11911I0;
            }
            return this.f11912J0;
        }
        int i2 = this.f11907E0;
        if ((i2 & 16) != 0) {
            return this.f11912J0;
        }
        if ((i2 & 8) == 0) {
            mo16850s0();
        }
        return Double.valueOf(this.f11910H0);
    }

    /* renamed from: Y */
    public C3793g mo16682Y() {
        C3793g gVar = new C3793g(this.f11917n0.mo16890h(), mo16810D0(), mo16812F0(), mo16811E0());
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16823a(int i, char c) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f11927x0.mo16937a(this.f11917n0.mo16890h()));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected close marker '");
        sb3.append((char) i);
        sb3.append("': expected '");
        sb3.append(c);
        sb3.append("' (for ");
        sb3.append(this.f11927x0.mo16739e());
        sb3.append(" starting at ");
        sb3.append(sb2);
        sb3.append(")");
        mo16844e(sb3.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3799j mo16824b(boolean z, int i, int i2, int i3) {
        this.f11913K0 = z;
        this.f11914L0 = i;
        this.f11915M0 = i2;
        this.f11916N0 = i3;
        this.f11907E0 = 0;
        return C3799j.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16826c(int i, String str) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected character (");
        sb.append(C3809c.m16200g(i));
        sb.append(") in numeric value");
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

    public void close() throws IOException {
        if (!this.f11918o0) {
            this.f11918o0 = true;
            try {
                mo16830t0();
            } finally {
                mo16834x0();
            }
        }
    }

    /* renamed from: d */
    public void mo16714d(String str) {
        C3834d dVar = this.f11927x0;
        C3799j jVar = this.f11951Q;
        if (jVar == C3799j.START_OBJECT || jVar == C3799j.START_ARRAY) {
            dVar = dVar.mo16738d();
        }
        dVar.mo16940a(str);
    }

    /* renamed from: e */
    public BigInteger mo16717e() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 4) == 0) {
            if (i == 0) {
                mo16828h(4);
            }
            if ((this.f11907E0 & 4) == 0) {
                mo16836z0();
            }
        }
        return this.f11911I0;
    }

    /* renamed from: f0 */
    public boolean mo16720f0() {
        C3799j jVar = this.f11951Q;
        if (jVar == C3799j.VALUE_STRING) {
            return true;
        }
        if (jVar == C3799j.FIELD_NAME) {
            return this.f11904B0;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16827g(String str) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid numeric value: ");
        sb.append(str);
        mo16844e(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16828h(int i) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == C3799j.VALUE_NUMBER_INT) {
            char[] k = this.f11929z0.mo17130k();
            int l = this.f11929z0.mo17131l();
            int i2 = this.f11914L0;
            if (this.f11913K0) {
                l++;
            }
            if (i2 <= 9) {
                int a = C3823h.m16304a(k, l, i2);
                if (this.f11913K0) {
                    a = -a;
                }
                this.f11908F0 = a;
                this.f11907E0 = 1;
            } else if (i2 <= 18) {
                long b = C3823h.m16309b(k, l, i2);
                if (this.f11913K0) {
                    b = -b;
                }
                if (i2 == 10) {
                    if (this.f11913K0) {
                        if (b >= f11881c1) {
                            this.f11908F0 = (int) b;
                            this.f11907E0 = 1;
                            return;
                        }
                    } else if (b <= f11882d1) {
                        this.f11908F0 = (int) b;
                        this.f11907E0 = 1;
                        return;
                    }
                }
                this.f11909G0 = b;
                this.f11907E0 = 2;
            } else {
                m16153a(i, k, l, i2);
            }
        } else if (jVar == C3799j.VALUE_NUMBER_FLOAT) {
            mo16963i(i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Current token (");
            sb.append(this.f11951Q);
            sb.append(") not numeric, can not use numeric value accessors");
            mo16844e(sb.toString());
        }
    }

    public boolean isClosed() {
        return this.f11918o0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void mo16829o0() throws JsonParseException {
        if (!this.f11927x0.mo16742h()) {
            StringBuilder sb = new StringBuilder();
            sb.append(": expected close marker for ");
            sb.append(this.f11927x0.mo16739e());
            sb.append(" (from ");
            sb.append(this.f11927x0.mo16937a(this.f11917n0.mo16890h()));
            sb.append(")");
            mo16846f(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public abstract void mo16830t0() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public char mo16831u0() throws IOException, JsonParseException {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public abstract void mo16832v0() throws IOException, JsonParseException;

    /* renamed from: w0 */
    public C3857b mo16833w0() {
        C3857b bVar = this.f11905C0;
        if (bVar == null) {
            this.f11905C0 = new C3857b();
        } else {
            bVar.mo17089f();
        }
        return this.f11905C0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo16834x0() throws IOException {
        this.f11929z0.mo17133n();
        char[] cArr = this.f11903A0;
        if (cArr != null) {
            this.f11903A0 = null;
            this.f11917n0.mo16881b(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo16835y0() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 8) != 0) {
            this.f11912J0 = new BigDecimal(mo16678U());
        } else if ((i & 4) != 0) {
            this.f11912J0 = new BigDecimal(this.f11911I0);
        } else if ((i & 2) != 0) {
            this.f11912J0 = BigDecimal.valueOf(this.f11909G0);
        } else if ((i & 1) != 0) {
            this.f11912J0 = BigDecimal.valueOf((long) this.f11908F0);
        } else {
            mo16850s0();
        }
        this.f11907E0 |= 16;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo16836z0() throws IOException, JsonParseException {
        int i = this.f11907E0;
        if ((i & 16) != 0) {
            this.f11911I0 = this.f11912J0.toBigInteger();
        } else if ((i & 2) != 0) {
            this.f11911I0 = BigInteger.valueOf(this.f11909G0);
        } else if ((i & 1) != 0) {
            this.f11911I0 = BigInteger.valueOf((long) this.f11908F0);
        } else if ((i & 8) != 0) {
            this.f11911I0 = BigDecimal.valueOf(this.f11910H0).toBigInteger();
        } else {
            mo16850s0();
        }
        this.f11907E0 |= 4;
    }

    /* renamed from: R */
    public C3834d m16175R() {
        return this.f11927x0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3799j mo16821a(boolean z, int i, int i2, int i3) {
        if (i2 >= 1 || i3 >= 1) {
            return mo16824b(z, i, i2, i3);
        }
        return mo16820a(z, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3799j mo16820a(boolean z, int i) {
        this.f11913K0 = z;
        this.f11914L0 = i;
        this.f11915M0 = 0;
        this.f11916N0 = 0;
        this.f11907E0 = 0;
        return C3799j.VALUE_NUMBER_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IllegalArgumentException mo16825b(C3785a aVar, int i, int i2) throws IllegalArgumentException {
        return mo16822a(aVar, i, i2, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3799j mo16819a(String str, double d) {
        this.f11929z0.mo17115a(str);
        this.f11910H0 = d;
        this.f11907E0 = 8;
        return C3799j.VALUE_NUMBER_FLOAT;
    }

    /* renamed from: a */
    private void m16153a(int i, char[] cArr, int i2, int i3) throws IOException, JsonParseException {
        String d = this.f11929z0.mo17123d();
        try {
            if (C3823h.m16307a(cArr, i2, i3, this.f11913K0)) {
                this.f11909G0 = Long.parseLong(d);
                this.f11907E0 = 2;
                return;
            }
            this.f11911I0 = new BigInteger(d);
            this.f11907E0 = 4;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Malformed numeric value '");
            sb.append(d);
            sb.append("'");
            mo16843b(sb.toString(), (Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo16818a(C3785a aVar, int i, int i2) throws IOException, JsonParseException {
        if (i == 92) {
            char u0 = mo16831u0();
            if (u0 <= ' ' && i2 == 0) {
                return -1;
            }
            int a = aVar.mo16489a((int) u0);
            if (a >= 0) {
                return a;
            }
            throw mo16825b(aVar, u0, i2);
        }
        throw mo16825b(aVar, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo16817a(C3785a aVar, char c, int i) throws IOException, JsonParseException {
        if (c == '\\') {
            char u0 = mo16831u0();
            if (u0 <= ' ' && i == 0) {
                return -1;
            }
            int a = aVar.mo16488a(u0);
            if (a >= 0) {
                return a;
            }
            throw mo16825b(aVar, u0, i);
        }
        throw mo16825b(aVar, c, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IllegalArgumentException mo16822a(C3785a aVar, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal white space character (code 0x");
            sb.append(Integer.toHexString(i));
            sb.append(") as character #");
            sb.append(i2 + 1);
            sb.append(" of 4-char base64 unit: can only used between units");
            str2 = sb.toString();
        } else if (aVar.mo16502d(i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected padding character ('");
            sb2.append(aVar.mo16503e());
            sb2.append("') as character #");
            sb2.append(i2 + 1);
            sb2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            str2 = sb2.toString();
        } else {
            String str3 = ") in base64 content";
            if (!Character.isDefined(i) || Character.isISOControl(i)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Illegal character (code 0x");
                sb3.append(Integer.toHexString(i));
                sb3.append(str3);
                str2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Illegal character '");
                sb4.append((char) i);
                sb4.append("' (code 0x");
                sb4.append(Integer.toHexString(i));
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
        return new IllegalArgumentException(str2);
    }
}
