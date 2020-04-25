package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4885n3 implements C4808i6 {

    /* renamed from: a */
    private final C4872m3 f14284a;

    /* renamed from: b */
    private int f14285b;

    /* renamed from: c */
    private int f14286c;

    /* renamed from: d */
    private int f14287d = 0;

    private C4885n3(C4872m3 m3Var) {
        this.f14284a = (C4872m3) C4819j4.m20396a(m3Var, "input");
        this.f14284a.f14264d = this;
    }

    /* renamed from: a */
    public static C4885n3 m20748a(C4872m3 m3Var) {
        C4885n3 n3Var = m3Var.f14264d;
        if (n3Var != null) {
            return n3Var;
        }
        return new C4885n3(m3Var);
    }

    /* renamed from: c */
    private final <T> T m20753c(C4790h6<T> h6Var, C5005u3 u3Var) throws IOException {
        int m = this.f14284a.mo19288m();
        C4872m3 m3Var = this.f14284a;
        if (m3Var.f14261a < m3Var.f14262b) {
            int c = m3Var.mo19277c(m);
            T a = h6Var.mo19029a();
            this.f14284a.f14261a++;
            h6Var.mo19030a(a, this, u3Var);
            h6Var.mo19036c(a);
            this.f14284a.mo19273a(0);
            C4872m3 m3Var2 = this.f14284a;
            m3Var2.f14261a--;
            m3Var2.mo19279d(c);
            return a;
        }
        throw new zzfn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    private final <T> T m20755d(C4790h6<T> h6Var, C5005u3 u3Var) throws IOException {
        int i = this.f14286c;
        this.f14286c = ((this.f14285b >>> 3) << 3) | 4;
        try {
            T a = h6Var.mo19029a();
            h6Var.mo19030a(a, this, u3Var);
            h6Var.mo19036c(a);
            if (this.f14285b == this.f14286c) {
                return a;
            }
            throw zzfn.m22034i();
        } finally {
            this.f14286c = i;
        }
    }

    /* renamed from: F */
    public final long mo19069F() throws IOException {
        m20750a(0);
        return this.f14284a.mo19293r();
    }

    /* renamed from: b */
    public final long mo19075b() throws IOException {
        m20750a(1);
        return this.f14284a.mo19282g();
    }

    /* renamed from: e */
    public final C5070z2 mo19083e() throws IOException {
        m20750a(2);
        return this.f14284a.mo19287l();
    }

    /* renamed from: f */
    public final int mo19085f() throws IOException {
        m20750a(5);
        return this.f14284a.mo19283h();
    }

    /* renamed from: g */
    public final String mo19087g() throws IOException {
        m20750a(2);
        return this.f14284a.mo19286k();
    }

    /* renamed from: h */
    public final int mo19089h() throws IOException {
        m20750a(0);
        return this.f14284a.mo19281f();
    }

    /* renamed from: i */
    public final int mo19091i() {
        return this.f14285b;
    }

    /* renamed from: j */
    public final void mo19093j(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    k4Var.mo19167b(this.f14284a.mo19288m());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    k4Var.mo19167b(this.f14284a.mo19288m());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19288m()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19288m()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: k */
    public final long mo19094k() throws IOException {
        m20750a(0);
        return this.f14284a.mo19278d();
    }

    /* renamed from: l */
    public final boolean mo19097l() throws IOException {
        if (!this.f14284a.mo19295t()) {
            int i = this.f14285b;
            if (i != this.f14286c) {
                return this.f14284a.mo19275b(i);
            }
        }
        return false;
    }

    /* renamed from: m */
    public final int mo19098m() throws IOException {
        m20750a(0);
        return this.f14284a.mo19289n();
    }

    /* renamed from: n */
    public final int mo19100n() throws IOException {
        m20750a(0);
        return this.f14284a.mo19288m();
    }

    /* renamed from: o */
    public final long mo19102o() throws IOException {
        m20750a(0);
        return this.f14284a.mo19280e();
    }

    /* renamed from: p */
    public final String mo19104p() throws IOException {
        m20750a(2);
        return this.f14284a.mo19285j();
    }

    /* renamed from: q */
    public final int mo19106q() throws IOException {
        m20750a(0);
        return this.f14284a.mo19292q();
    }

    /* renamed from: w */
    public final boolean mo19108w() throws IOException {
        m20750a(0);
        return this.f14284a.mo19284i();
    }

    public final double zzd() throws IOException {
        m20750a(1);
        return this.f14284a.mo19274b();
    }

    public final float zze() throws IOException {
        m20750a(5);
        return this.f14284a.mo19276c();
    }

    /* renamed from: i */
    public final void mo19092i(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    f5Var.mo18982a(this.f14284a.mo19293r());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    f5Var.mo18982a(this.f14284a.mo19293r());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f14284a.mo19293r()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Long.valueOf(this.f14284a.mo19293r()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: a */
    public final int mo19070a() throws IOException {
        int i = this.f14287d;
        if (i != 0) {
            this.f14285b = i;
            this.f14287d = 0;
        } else {
            this.f14285b = this.f14284a.mo19272a();
        }
        int i2 = this.f14285b;
        if (i2 == 0 || i2 == this.f14286c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: b */
    public final <T> T mo19076b(C4790h6<T> h6Var, C5005u3 u3Var) throws IOException {
        m20750a(2);
        return m20753c(h6Var, u3Var);
    }

    /* renamed from: e */
    public final void mo19084e(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            int i = this.f14285b & 7;
            if (i == 1) {
                do {
                    f5Var.mo18982a(this.f14284a.mo19282g());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int m = this.f14284a.mo19288m();
                m20752b(m);
                int u = this.f14284a.mo19296u() + m;
                do {
                    f5Var.mo18982a(this.f14284a.mo19282g());
                } while (this.f14284a.mo19296u() < u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f14284a.mo19282g()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int m2 = this.f14284a.mo19288m();
                m20752b(m2);
                int u2 = this.f14284a.mo19296u() + m2;
                do {
                    list.add(Long.valueOf(this.f14284a.mo19282g()));
                } while (this.f14284a.mo19296u() < u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: f */
    public final void mo19086f(List<String> list) throws IOException {
        m20751a(list, true);
    }

    /* renamed from: g */
    public final void mo19088g(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4992t3) {
            C4992t3 t3Var = (C4992t3) list;
            int i = this.f14285b & 7;
            if (i == 1) {
                do {
                    t3Var.mo19685a(this.f14284a.mo19274b());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int m = this.f14284a.mo19288m();
                m20752b(m);
                int u = this.f14284a.mo19296u() + m;
                do {
                    t3Var.mo19685a(this.f14284a.mo19274b());
                } while (this.f14284a.mo19296u() < u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f14284a.mo19274b()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int m2 = this.f14284a.mo19288m();
                m20752b(m2);
                int u2 = this.f14284a.mo19296u() + m2;
                do {
                    list.add(Double.valueOf(this.f14284a.mo19274b()));
                } while (this.f14284a.mo19296u() < u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: h */
    public final void mo19090h(List<String> list) throws IOException {
        m20751a(list, false);
    }

    /* renamed from: k */
    public final void mo19095k(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    f5Var.mo18982a(this.f14284a.mo19278d());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    f5Var.mo18982a(this.f14284a.mo19278d());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f14284a.mo19278d()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Long.valueOf(this.f14284a.mo19278d()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: l */
    public final void mo19096l(List<C5070z2> list) throws IOException {
        int a;
        if ((this.f14285b & 7) == 2) {
            do {
                list.add(mo19083e());
                if (!this.f14284a.mo19295t()) {
                    a = this.f14284a.mo19272a();
                } else {
                    return;
                }
            } while (a == this.f14285b);
            this.f14287d = a;
            return;
        }
        throw zzfn.m22033h();
    }

    /* renamed from: m */
    public final void mo19099m(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4724d4) {
            C4724d4 d4Var = (C4724d4) list;
            int i = this.f14285b & 7;
            if (i == 2) {
                int m = this.f14284a.mo19288m();
                m20754c(m);
                int u = this.f14284a.mo19296u() + m;
                do {
                    d4Var.mo18908a(this.f14284a.mo19276c());
                } while (this.f14284a.mo19296u() < u);
            } else if (i == 5) {
                do {
                    d4Var.mo18908a(this.f14284a.mo19276c());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 2) {
                int m2 = this.f14284a.mo19288m();
                m20754c(m2);
                int u2 = this.f14284a.mo19296u() + m2;
                do {
                    list.add(Float.valueOf(this.f14284a.mo19276c()));
                } while (this.f14284a.mo19296u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f14284a.mo19276c()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: n */
    public final void mo19101n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            int i = this.f14285b & 7;
            if (i == 2) {
                int m = this.f14284a.mo19288m();
                m20754c(m);
                int u = this.f14284a.mo19296u() + m;
                do {
                    k4Var.mo19167b(this.f14284a.mo19290o());
                } while (this.f14284a.mo19296u() < u);
            } else if (i == 5) {
                do {
                    k4Var.mo19167b(this.f14284a.mo19290o());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 2) {
                int m2 = this.f14284a.mo19288m();
                m20754c(m2);
                int u2 = this.f14284a.mo19296u() + m2;
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19290o()));
                } while (this.f14284a.mo19296u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19290o()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: o */
    public final void mo19103o(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    k4Var.mo19167b(this.f14284a.mo19281f());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    k4Var.mo19167b(this.f14284a.mo19281f());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19281f()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19281f()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: p */
    public final void mo19105p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    k4Var.mo19167b(this.f14284a.mo19289n());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    k4Var.mo19167b(this.f14284a.mo19289n());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19289n()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19289n()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: q */
    public final void mo19107q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    f5Var.mo18982a(this.f14284a.mo19280e());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    f5Var.mo18982a(this.f14284a.mo19280e());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f14284a.mo19280e()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Long.valueOf(this.f14284a.mo19280e()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: b */
    public final void mo19077b(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            int i = this.f14285b & 7;
            if (i == 2) {
                int m = this.f14284a.mo19288m();
                m20754c(m);
                int u = this.f14284a.mo19296u() + m;
                do {
                    k4Var.mo19167b(this.f14284a.mo19283h());
                } while (this.f14284a.mo19296u() < u);
            } else if (i == 5) {
                do {
                    k4Var.mo19167b(this.f14284a.mo19283h());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 2) {
                int m2 = this.f14284a.mo19288m();
                m20754c(m2);
                int u2 = this.f14284a.mo19296u() + m2;
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19283h()));
                } while (this.f14284a.mo19296u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19283h()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: a */
    private final void m20750a(int i) throws IOException {
        if ((this.f14285b & 7) != i) {
            throw zzfn.m22033h();
        }
    }

    /* renamed from: a */
    public final <T> T mo19071a(C4790h6<T> h6Var, C5005u3 u3Var) throws IOException {
        m20750a(3);
        return m20755d(h6Var, u3Var);
    }

    /* renamed from: d */
    public final long mo19081d() throws IOException {
        m20750a(1);
        return this.f14284a.mo19291p();
    }

    /* renamed from: a */
    public final void mo19072a(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C5044x2) {
            C5044x2 x2Var = (C5044x2) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    x2Var.mo19735a(this.f14284a.mo19284i());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    x2Var.mo19735a(this.f14284a.mo19284i());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f14284a.mo19284i()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Boolean.valueOf(this.f14284a.mo19284i()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: c */
    public final int mo19079c() throws IOException {
        m20750a(5);
        return this.f14284a.mo19290o();
    }

    /* renamed from: d */
    public final void mo19082d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            int i = this.f14285b & 7;
            if (i == 1) {
                do {
                    f5Var.mo18982a(this.f14284a.mo19291p());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int m = this.f14284a.mo19288m();
                m20752b(m);
                int u = this.f14284a.mo19296u() + m;
                do {
                    f5Var.mo18982a(this.f14284a.mo19291p());
                } while (this.f14284a.mo19296u() < u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f14284a.mo19291p()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int m2 = this.f14284a.mo19288m();
                m20752b(m2);
                int u2 = this.f14284a.mo19296u() + m2;
                do {
                    list.add(Long.valueOf(this.f14284a.mo19291p()));
                } while (this.f14284a.mo19296u() < u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: c */
    public final void mo19080c(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            int i = this.f14285b & 7;
            if (i == 0) {
                do {
                    k4Var.mo19167b(this.f14284a.mo19292q());
                    if (!this.f14284a.mo19295t()) {
                        a2 = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14285b);
                this.f14287d = a2;
            } else if (i == 2) {
                int u = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    k4Var.mo19167b(this.f14284a.mo19292q());
                } while (this.f14284a.mo19296u() < u);
                m20756d(u);
            } else {
                throw zzfn.m22033h();
            }
        } else {
            int i2 = this.f14285b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19292q()));
                    if (!this.f14284a.mo19295t()) {
                        a = this.f14284a.mo19272a();
                    } else {
                        return;
                    }
                } while (a == this.f14285b);
                this.f14287d = a;
            } else if (i2 == 2) {
                int u2 = this.f14284a.mo19296u() + this.f14284a.mo19288m();
                do {
                    list.add(Integer.valueOf(this.f14284a.mo19292q()));
                } while (this.f14284a.mo19296u() < u2);
                m20756d(u2);
            } else {
                throw zzfn.m22033h();
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo19078b(List<T> list, C4790h6<T> h6Var, C5005u3 u3Var) throws IOException {
        int a;
        int i = this.f14285b;
        if ((i & 7) == 3) {
            do {
                list.add(m20755d(h6Var, u3Var));
                if (!this.f14284a.mo19295t() && this.f14287d == 0) {
                    a = this.f14284a.mo19272a();
                } else {
                    return;
                }
            } while (a == i);
            this.f14287d = a;
            return;
        }
        throw zzfn.m22033h();
    }

    /* renamed from: b */
    private static void m20752b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzfn.m22034i();
        }
    }

    /* renamed from: a */
    private final void m20751a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f14285b & 7) != 2) {
            throw zzfn.m22033h();
        } else if (!(list instanceof C5046x4) || z) {
            do {
                list.add(z ? mo19087g() : mo19104p());
                if (!this.f14284a.mo19295t()) {
                    a = this.f14284a.mo19272a();
                } else {
                    return;
                }
            } while (a == this.f14285b);
            this.f14287d = a;
        } else {
            C5046x4 x4Var = (C5046x4) list;
            do {
                x4Var.mo18920a(mo19083e());
                if (!this.f14284a.mo19295t()) {
                    a2 = this.f14284a.mo19272a();
                } else {
                    return;
                }
            } while (a2 == this.f14285b);
            this.f14287d = a2;
        }
    }

    /* renamed from: d */
    private final void m20756d(int i) throws IOException {
        if (this.f14284a.mo19296u() != i) {
            throw zzfn.m22028a();
        }
    }

    /* renamed from: c */
    private static void m20754c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzfn.m22034i();
        }
    }

    /* renamed from: a */
    public final <T> void mo19073a(List<T> list, C4790h6<T> h6Var, C5005u3 u3Var) throws IOException {
        int a;
        int i = this.f14285b;
        if ((i & 7) == 2) {
            do {
                list.add(m20753c(h6Var, u3Var));
                if (!this.f14284a.mo19295t() && this.f14287d == 0) {
                    a = this.f14284a.mo19272a();
                } else {
                    return;
                }
            } while (a == i);
            this.f14287d = a;
            return;
        }
        throw zzfn.m22033h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo19097l() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.measurement.zzfn(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo19074a(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.C4807i5<K, V> r9, com.google.android.gms.internal.measurement.C5005u3 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m20750a(r0)
            com.google.android.gms.internal.measurement.m3 r1 = r7.f14284a
            int r1 = r1.mo19288m()
            com.google.android.gms.internal.measurement.m3 r2 = r7.f14284a
            int r1 = r2.mo19277c(r1)
            K r2 = r9.f14202b
            V r3 = r9.f14204d
        L_0x0014:
            int r4 = r7.mo19070a()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.measurement.m3 r5 = r7.f14284a     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.mo19295t()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.mo19097l()     // Catch:{ zzfm -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.measurement.zzfn r4 = new com.google.android.gms.internal.measurement.zzfn     // Catch:{ zzfm -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzfm -> 0x004e }
            throw r4     // Catch:{ zzfm -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.measurement.q7 r4 = r9.f14203c     // Catch:{ zzfm -> 0x004e }
            V r5 = r9.f14204d     // Catch:{ zzfm -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzfm -> 0x004e }
            java.lang.Object r3 = r7.m20749a(r4, r5, r10)     // Catch:{ zzfm -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.measurement.q7 r4 = r9.f14201a     // Catch:{ zzfm -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.m20749a(r4, r5, r5)     // Catch:{ zzfm -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.mo19097l()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.measurement.zzfn r8 = new com.google.android.gms.internal.measurement.zzfn     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.measurement.m3 r8 = r7.f14284a
            r8.mo19279d(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.measurement.m3 r9 = r7.f14284a
            r9.mo19279d(r1)
            goto L_0x006c
        L_0x006b:
            throw r8
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4885n3.mo19074a(java.util.Map, com.google.android.gms.internal.measurement.i5, com.google.android.gms.internal.measurement.u3):void");
    }

    /* renamed from: a */
    private final Object m20749a(C4934q7 q7Var, Class<?> cls, C5005u3 u3Var) throws IOException {
        switch (C4911p3.f14331a[q7Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo19108w());
            case 2:
                return mo19083e();
            case 3:
                return Double.valueOf(zzd());
            case 4:
                return Integer.valueOf(mo19098m());
            case 5:
                return Integer.valueOf(mo19085f());
            case 6:
                return Long.valueOf(mo19075b());
            case 7:
                return Float.valueOf(zze());
            case 8:
                return Integer.valueOf(mo19089h());
            case 9:
                return Long.valueOf(mo19102o());
            case 10:
                m20750a(2);
                return m20753c(C4712c6.m19997a().mo18887a(cls), u3Var);
            case 11:
                return Integer.valueOf(mo19079c());
            case 12:
                return Long.valueOf(mo19081d());
            case 13:
                return Integer.valueOf(mo19106q());
            case 14:
                return Long.valueOf(mo19069F());
            case 15:
                return mo19087g();
            case 16:
                return Integer.valueOf(mo19100n());
            case 17:
                return Long.valueOf(mo19094k());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }
}
