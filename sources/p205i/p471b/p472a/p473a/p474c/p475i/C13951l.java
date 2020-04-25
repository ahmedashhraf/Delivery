package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.l */
/* compiled from: FieldWriter */
final class C13951l extends C13950k {

    /* renamed from: c */
    private final C13946g f40612c;

    /* renamed from: d */
    private final int f40613d;

    /* renamed from: e */
    private final int f40614e;

    /* renamed from: f */
    private final int f40615f;

    /* renamed from: g */
    private int f40616g;

    /* renamed from: h */
    private int f40617h;

    /* renamed from: i */
    private C13941b f40618i;

    /* renamed from: j */
    private C13941b f40619j;

    /* renamed from: k */
    private C13941b f40620k;

    /* renamed from: l */
    private C13941b f40621l;

    /* renamed from: m */
    private C13942c f40622m;

    C13951l(C13946g gVar, int i, String str, String str2, String str3, Object obj) {
        super(327680);
        if (gVar.f40555I == null) {
            gVar.f40555I = this;
        } else {
            gVar.f40556J.f40611b = this;
        }
        gVar.f40556J = this;
        this.f40612c = gVar;
        this.f40613d = i;
        this.f40614e = gVar.mo44130f(str);
        this.f40615f = gVar.mo44130f(str2);
        if (str3 != null) {
            this.f40616g = gVar.mo44130f(str3);
        }
        if (obj != null) {
            this.f40617h = gVar.mo44119b(obj).f40667a;
        }
    }

    /* renamed from: a */
    public C13940a mo44133a(String str, boolean z) {
        C13943d dVar = new C13943d();
        dVar.mo44074c(this.f40612c.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40612c, true, dVar, dVar, 2);
        if (z) {
            bVar.f40479i = this.f40618i;
            this.f40618i = bVar;
        } else {
            bVar.f40479i = this.f40619j;
            this.f40619j = bVar;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo44134a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo44137b() {
        int i;
        if (this.f40617h != 0) {
            this.f40612c.mo44130f("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int i2 = this.f40613d;
        if ((i2 & 4096) != 0 && ((this.f40612c.f40562d & 65535) < 49 || (i2 & 262144) != 0)) {
            this.f40612c.mo44130f("Synthetic");
            i += 6;
        }
        if ((this.f40613d & 131072) != 0) {
            this.f40612c.mo44130f("Deprecated");
            i += 6;
        }
        if (this.f40616g != 0) {
            this.f40612c.mo44130f("Signature");
            i += 8;
        }
        if (this.f40618i != null) {
            this.f40612c.mo44130f("RuntimeVisibleAnnotations");
            i += this.f40618i.mo44057b() + 8;
        }
        if (this.f40619j != null) {
            this.f40612c.mo44130f("RuntimeInvisibleAnnotations");
            i += this.f40619j.mo44057b() + 8;
        }
        if (this.f40620k != null) {
            this.f40612c.mo44130f("RuntimeVisibleTypeAnnotations");
            i += this.f40620k.mo44057b() + 8;
        }
        if (this.f40621l != null) {
            this.f40612c.mo44130f("RuntimeInvisibleTypeAnnotations");
            i += this.f40621l.mo44057b() + 8;
        }
        C13942c cVar = this.f40622m;
        return cVar != null ? i + cVar.mo44059a(this.f40612c, null, 0, -1, -1) : i;
    }

    /* renamed from: a */
    public C13940a mo44132a(int i, C13961v vVar, String str, boolean z) {
        C13943d dVar = new C13943d();
        C13941b.m59893a(i, vVar, dVar);
        dVar.mo44074c(this.f40612c.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40612c, true, dVar, dVar, dVar.f40485b - 2);
        if (z) {
            bVar.f40479i = this.f40620k;
            this.f40620k = bVar;
        } else {
            bVar.f40479i = this.f40621l;
            this.f40621l = bVar;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo44135a(C13942c cVar) {
        cVar.f40483c = this.f40622m;
        this.f40622m = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44136a(C13943d dVar) {
        int i = this.f40613d;
        dVar.mo44074c(i & ((((i & 262144) / 64) | 393216) ^ -1)).mo44074c(this.f40614e).mo44074c(this.f40615f);
        int i2 = this.f40617h != 0 ? 1 : 0;
        int i3 = this.f40613d;
        if ((i3 & 4096) != 0 && ((this.f40612c.f40562d & 65535) < 49 || (i3 & 262144) != 0)) {
            i2++;
        }
        if ((this.f40613d & 131072) != 0) {
            i2++;
        }
        if (this.f40616g != 0) {
            i2++;
        }
        if (this.f40618i != null) {
            i2++;
        }
        if (this.f40619j != null) {
            i2++;
        }
        if (this.f40620k != null) {
            i2++;
        }
        if (this.f40621l != null) {
            i2++;
        }
        C13942c cVar = this.f40622m;
        if (cVar != null) {
            i2 += cVar.mo44058a();
        }
        dVar.mo44074c(i2);
        if (this.f40617h != 0) {
            dVar.mo44074c(this.f40612c.mo44130f("ConstantValue"));
            dVar.mo44072b(2).mo44074c(this.f40617h);
        }
        int i4 = this.f40613d;
        if ((i4 & 4096) != 0 && ((65535 & this.f40612c.f40562d) < 49 || (i4 & 262144) != 0)) {
            dVar.mo44074c(this.f40612c.mo44130f("Synthetic")).mo44072b(0);
        }
        if ((this.f40613d & 131072) != 0) {
            dVar.mo44074c(this.f40612c.mo44130f("Deprecated")).mo44072b(0);
        }
        if (this.f40616g != 0) {
            dVar.mo44074c(this.f40612c.mo44130f("Signature"));
            dVar.mo44072b(2).mo44074c(this.f40616g);
        }
        if (this.f40618i != null) {
            dVar.mo44074c(this.f40612c.mo44130f("RuntimeVisibleAnnotations"));
            this.f40618i.mo44056a(dVar);
        }
        if (this.f40619j != null) {
            dVar.mo44074c(this.f40612c.mo44130f("RuntimeInvisibleAnnotations"));
            this.f40619j.mo44056a(dVar);
        }
        if (this.f40620k != null) {
            dVar.mo44074c(this.f40612c.mo44130f("RuntimeVisibleTypeAnnotations"));
            this.f40620k.mo44056a(dVar);
        }
        if (this.f40621l != null) {
            dVar.mo44074c(this.f40612c.mo44130f("RuntimeInvisibleTypeAnnotations"));
            this.f40621l.mo44056a(dVar);
        }
        C13942c cVar2 = this.f40622m;
        if (cVar2 != null) {
            cVar2.mo44061a(this.f40612c, (byte[]) null, 0, -1, -1, dVar);
        }
    }
}
