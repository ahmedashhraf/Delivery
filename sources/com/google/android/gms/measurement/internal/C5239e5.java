package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5239e5 {

    /* renamed from: A */
    private long f14971A;

    /* renamed from: B */
    private long f14972B;

    /* renamed from: C */
    private String f14973C;

    /* renamed from: D */
    private boolean f14974D;

    /* renamed from: E */
    private long f14975E;

    /* renamed from: F */
    private long f14976F;

    /* renamed from: a */
    private final C5359p4 f14977a;

    /* renamed from: b */
    private final String f14978b;

    /* renamed from: c */
    private String f14979c;

    /* renamed from: d */
    private String f14980d;

    /* renamed from: e */
    private String f14981e;

    /* renamed from: f */
    private String f14982f;

    /* renamed from: g */
    private long f14983g;

    /* renamed from: h */
    private long f14984h;

    /* renamed from: i */
    private long f14985i;

    /* renamed from: j */
    private String f14986j;

    /* renamed from: k */
    private long f14987k;

    /* renamed from: l */
    private String f14988l;

    /* renamed from: m */
    private long f14989m;

    /* renamed from: n */
    private long f14990n;

    /* renamed from: o */
    private boolean f14991o;

    /* renamed from: p */
    private long f14992p;

    /* renamed from: q */
    private boolean f14993q;

    /* renamed from: r */
    private boolean f14994r;

    /* renamed from: s */
    private String f14995s;

    /* renamed from: t */
    private Boolean f14996t;

    /* renamed from: u */
    private long f14997u;

    /* renamed from: v */
    private List<String> f14998v;

    /* renamed from: w */
    private long f14999w;

    /* renamed from: x */
    private long f15000x;

    /* renamed from: y */
    private long f15001y;

    /* renamed from: z */
    private long f15002z;

    @C0226w0
    C5239e5(C5359p4 p4Var, String str) {
        C4300a0.m18620a(p4Var);
        C4300a0.m18630b(str);
        this.f14977a = p4Var;
        this.f14978b = str;
        this.f14977a.mo21203c().mo21209h();
    }

    @C0226w0
    /* renamed from: A */
    public final void mo21242A() {
        this.f14977a.mo21203c().mo21209h();
        long j = this.f14983g + 1;
        if (j > 2147483647L) {
            this.f14977a.mo21205d().mo21536w().mo21550a("Bundle index overflow. appId", C5303k3.m23051a(this.f14978b));
            j = 0;
        }
        this.f14974D = true;
        this.f14983g = j;
    }

    @C0226w0
    /* renamed from: B */
    public final long mo21243B() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14999w;
    }

    @C0226w0
    /* renamed from: C */
    public final long mo21244C() {
        this.f14977a.mo21203c().mo21209h();
        return this.f15000x;
    }

    @C0226w0
    /* renamed from: D */
    public final long mo21245D() {
        this.f14977a.mo21203c().mo21209h();
        return this.f15001y;
    }

    @C0226w0
    /* renamed from: E */
    public final long mo21246E() {
        this.f14977a.mo21203c().mo21209h();
        return this.f15002z;
    }

    @C0226w0
    /* renamed from: F */
    public final long mo21247F() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14972B;
    }

    @C0226w0
    /* renamed from: G */
    public final long mo21248G() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14971A;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21249a() {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D = false;
    }

    @C0226w0
    /* renamed from: b */
    public final void mo21257b(String str) {
        this.f14977a.mo21203c().mo21209h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f14974D |= !C5254f9.m22842d(this.f14980d, str);
        this.f14980d = str;
    }

    @C0226w0
    /* renamed from: c */
    public final void mo21261c(String str) {
        this.f14977a.mo21203c().mo21209h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f14974D |= !C5254f9.m22842d(this.f14995s, str);
        this.f14995s = str;
    }

    @C0226w0
    /* renamed from: d */
    public final void mo21265d(String str) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= !C5254f9.m22842d(this.f14981e, str);
        this.f14981e = str;
    }

    @C0226w0
    /* renamed from: e */
    public final void mo21267e(String str) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= !C5254f9.m22842d(this.f14982f, str);
        this.f14982f = str;
    }

    @C0226w0
    /* renamed from: f */
    public final void mo21270f(String str) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= !C5254f9.m22842d(this.f14986j, str);
        this.f14986j = str;
    }

    @C0226w0
    /* renamed from: g */
    public final void mo21274g(String str) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= !C5254f9.m22842d(this.f14988l, str);
        this.f14988l = str;
    }

    @C0226w0
    /* renamed from: h */
    public final void mo21276h(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14975E != j;
        this.f14975E = j;
    }

    @C0226w0
    /* renamed from: i */
    public final String mo21278i() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14978b;
    }

    @C0226w0
    /* renamed from: j */
    public final String mo21280j() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14979c;
    }

    @C0226w0
    /* renamed from: k */
    public final String mo21282k() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14980d;
    }

    @C0226w0
    /* renamed from: l */
    public final String mo21284l() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14995s;
    }

    @C0226w0
    /* renamed from: m */
    public final String mo21286m() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14981e;
    }

    @C0226w0
    /* renamed from: n */
    public final String mo21288n() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14982f;
    }

    @C0226w0
    /* renamed from: o */
    public final long mo21290o() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14984h;
    }

    @C0226w0
    /* renamed from: p */
    public final long mo21292p() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14985i;
    }

    @C0226w0
    /* renamed from: q */
    public final String mo21294q() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14986j;
    }

    @C0226w0
    /* renamed from: r */
    public final long mo21295r() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14987k;
    }

    @C0226w0
    /* renamed from: s */
    public final String mo21296s() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14988l;
    }

    @C0226w0
    /* renamed from: t */
    public final long mo21297t() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14989m;
    }

    @C0226w0
    /* renamed from: u */
    public final long mo21298u() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14990n;
    }

    @C0226w0
    /* renamed from: v */
    public final long mo21299v() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14997u;
    }

    @C0226w0
    /* renamed from: w */
    public final boolean mo21300w() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14991o;
    }

    @C0226w0
    /* renamed from: x */
    public final long mo21301x() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14983g;
    }

    @C0226w0
    /* renamed from: y */
    public final long mo21302y() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14975E;
    }

    @C0226w0
    /* renamed from: z */
    public final long mo21303z() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14976F;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21252a(String str) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= !C5254f9.m22842d(this.f14979c, str);
        this.f14979c = str;
    }

    @C0226w0
    /* renamed from: i */
    public final void mo21279i(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14976F != j;
        this.f14976F = j;
    }

    @C0226w0
    /* renamed from: j */
    public final void mo21281j(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14999w != j;
        this.f14999w = j;
    }

    @C0226w0
    /* renamed from: k */
    public final void mo21283k(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f15000x != j;
        this.f15000x = j;
    }

    @C0226w0
    /* renamed from: l */
    public final void mo21285l(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f15001y != j;
        this.f15001y = j;
    }

    @C0226w0
    /* renamed from: m */
    public final void mo21287m(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f15002z != j;
        this.f15002z = j;
    }

    @C0226w0
    /* renamed from: n */
    public final void mo21289n(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14972B != j;
        this.f14972B = j;
    }

    @C0226w0
    /* renamed from: o */
    public final void mo21291o(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14971A != j;
        this.f14971A = j;
    }

    @C0226w0
    /* renamed from: p */
    public final void mo21293p(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14992p != j;
        this.f14992p = j;
    }

    @C0226w0
    /* renamed from: d */
    public final void mo21264d(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14989m != j;
        this.f14989m = j;
    }

    @C0226w0
    /* renamed from: e */
    public final void mo21266e(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14990n != j;
        this.f14990n = j;
    }

    @C0226w0
    /* renamed from: f */
    public final void mo21269f(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14997u != j;
        this.f14997u = j;
    }

    @C0226w0
    /* renamed from: g */
    public final void mo21273g(long j) {
        boolean z = true;
        C4300a0.m18627a(j >= 0);
        this.f14977a.mo21203c().mo21209h();
        boolean z2 = this.f14974D;
        if (this.f14983g == j) {
            z = false;
        }
        this.f14974D = z | z2;
        this.f14983g = j;
    }

    @C0226w0
    /* renamed from: h */
    public final void mo21277h(String str) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= !C5254f9.m22842d(this.f14973C, str);
        this.f14973C = str;
    }

    @C0226w0
    /* renamed from: b */
    public final void mo21256b(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14985i != j;
        this.f14985i = j;
    }

    @C0226w0
    /* renamed from: c */
    public final void mo21260c(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14987k != j;
        this.f14987k = j;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21250a(long j) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14984h != j;
        this.f14984h = j;
    }

    @C0226w0
    /* renamed from: d */
    public final long mo21263d() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14992p;
    }

    @C0226w0
    /* renamed from: e */
    public final boolean mo21268e() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14993q;
    }

    @C0226w0
    /* renamed from: f */
    public final boolean mo21271f() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14994r;
    }

    @C0226w0
    @C0195i0
    /* renamed from: h */
    public final List<String> mo21275h() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14998v;
    }

    @C0226w0
    /* renamed from: b */
    public final String mo21255b() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14973C;
    }

    @C0226w0
    /* renamed from: c */
    public final String mo21259c() {
        this.f14977a.mo21203c().mo21209h();
        String str = this.f14973C;
        mo21277h((String) null);
        return str;
    }

    @C0226w0
    /* renamed from: g */
    public final Boolean mo21272g() {
        this.f14977a.mo21203c().mo21209h();
        return this.f14996t;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21254a(boolean z) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D |= this.f14991o != z;
        this.f14991o = z;
    }

    @C0226w0
    /* renamed from: b */
    public final void mo21258b(boolean z) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D = this.f14993q != z;
        this.f14993q = z;
    }

    @C0226w0
    /* renamed from: c */
    public final void mo21262c(boolean z) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D = this.f14994r != z;
        this.f14994r = z;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21251a(Boolean bool) {
        this.f14977a.mo21203c().mo21209h();
        this.f14974D = !C5254f9.m22832a(this.f14996t, bool);
        this.f14996t = bool;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21253a(@C0195i0 List<String> list) {
        this.f14977a.mo21203c().mo21209h();
        if (!C5254f9.m22835a(this.f14998v, list)) {
            this.f14974D = true;
            this.f14998v = list != null ? new ArrayList(list) : null;
        }
    }
}
