package com.google.zxing.p346y.p347c0.p348g.p349e;

/* renamed from: com.google.zxing.y.c0.g.e.m */
/* compiled from: CurrentParsingState */
final class C9129m {

    /* renamed from: a */
    private int f23944a = 0;

    /* renamed from: b */
    private C9130a f23945b = C9130a.NUMERIC;

    /* renamed from: com.google.zxing.y.c0.g.e.m$a */
    /* compiled from: CurrentParsingState */
    private enum C9130a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C9129m() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33168a() {
        return this.f23944a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33170b(int i) {
        this.f23944a = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo33172c() {
        return this.f23945b == C9130a.ISO_IEC_646;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo33173d() {
        return this.f23945b == C9130a.NUMERIC;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo33174e() {
        this.f23945b = C9130a.ALPHA;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo33175f() {
        this.f23945b = C9130a.ISO_IEC_646;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo33176g() {
        this.f23945b = C9130a.NUMERIC;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33169a(int i) {
        this.f23944a += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo33171b() {
        return this.f23945b == C9130a.ALPHA;
    }
}
