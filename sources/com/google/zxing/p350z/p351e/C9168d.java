package com.google.zxing.p350z.p351e;

/* renamed from: com.google.zxing.z.e.d */
/* compiled from: Codeword */
final class C9168d {

    /* renamed from: f */
    private static final int f24061f = -1;

    /* renamed from: a */
    private final int f24062a;

    /* renamed from: b */
    private final int f24063b;

    /* renamed from: c */
    private final int f24064c;

    /* renamed from: d */
    private final int f24065d;

    /* renamed from: e */
    private int f24066e = -1;

    C9168d(int i, int i2, int i3, int i4) {
        this.f24062a = i;
        this.f24063b = i2;
        this.f24064c = i3;
        this.f24065d = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33224a(int i) {
        return i != -1 && this.f24064c == (i % 3) * 3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33225b() {
        return this.f24063b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo33227c() {
        return this.f24066e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo33228d() {
        return this.f24062a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo33229e() {
        return this.f24065d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo33230f() {
        return this.f24063b - this.f24062a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo33231g() {
        return mo33224a(this.f24066e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo33232h() {
        this.f24066e = ((this.f24065d / 30) * 3) + (this.f24064c / 3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24066e);
        sb.append("|");
        sb.append(this.f24065d);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33223a() {
        return this.f24064c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33226b(int i) {
        this.f24066e = i;
    }
}
