package p470h;

import p201f.p202a.C5952h;

/* renamed from: h.w */
/* compiled from: Segment */
final class C13921w {

    /* renamed from: h */
    static final int f40424h = 8192;

    /* renamed from: i */
    static final int f40425i = 1024;

    /* renamed from: a */
    final byte[] f40426a;

    /* renamed from: b */
    int f40427b;

    /* renamed from: c */
    int f40428c;

    /* renamed from: d */
    boolean f40429d;

    /* renamed from: e */
    boolean f40430e;

    /* renamed from: f */
    C13921w f40431f;

    /* renamed from: g */
    C13921w f40432g;

    C13921w() {
        this.f40426a = new byte[8192];
        this.f40430e = true;
        this.f40429d = false;
    }

    /* renamed from: a */
    public final C13921w mo44029a(C13921w wVar) {
        wVar.f40432g = this;
        wVar.f40431f = this.f40431f;
        this.f40431f.f40432g = wVar;
        this.f40431f = wVar;
        return wVar;
    }

    @C5952h
    /* renamed from: b */
    public final C13921w mo44032b() {
        C13921w wVar = this.f40431f;
        if (wVar == this) {
            wVar = null;
        }
        C13921w wVar2 = this.f40432g;
        wVar2.f40431f = this.f40431f;
        this.f40431f.f40432g = wVar2;
        this.f40431f = null;
        this.f40432g = null;
        return wVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C13921w mo44033c() {
        this.f40429d = true;
        C13921w wVar = new C13921w(this.f40426a, this.f40427b, this.f40428c, true, false);
        return wVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C13921w mo44034d() {
        C13921w wVar = new C13921w((byte[]) this.f40426a.clone(), this.f40427b, this.f40428c, false, true);
        return wVar;
    }

    C13921w(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f40426a = bArr;
        this.f40427b = i;
        this.f40428c = i2;
        this.f40429d = z;
        this.f40430e = z2;
    }

    /* renamed from: a */
    public final C13921w mo44028a(int i) {
        C13921w wVar;
        if (i <= 0 || i > this.f40428c - this.f40427b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            wVar = mo44033c();
        } else {
            wVar = C13922x.m59826a();
            System.arraycopy(this.f40426a, this.f40427b, wVar.f40426a, 0, i);
        }
        wVar.f40428c = wVar.f40427b + i;
        this.f40427b += i;
        this.f40432g.mo44029a(wVar);
        return wVar;
    }

    /* renamed from: a */
    public final void mo44030a() {
        C13921w wVar = this.f40432g;
        if (wVar == this) {
            throw new IllegalStateException();
        } else if (wVar.f40430e) {
            int i = this.f40428c - this.f40427b;
            if (i <= (8192 - wVar.f40428c) + (wVar.f40429d ? 0 : wVar.f40427b)) {
                mo44031a(this.f40432g, i);
                mo44032b();
                C13922x.m59827a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo44031a(C13921w wVar, int i) {
        if (wVar.f40430e) {
            int i2 = wVar.f40428c;
            if (i2 + i > 8192) {
                if (!wVar.f40429d) {
                    int i3 = i2 + i;
                    int i4 = wVar.f40427b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = wVar.f40426a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        wVar.f40428c -= wVar.f40427b;
                        wVar.f40427b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f40426a, this.f40427b, wVar.f40426a, wVar.f40428c, i);
            wVar.f40428c += i;
            this.f40427b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
