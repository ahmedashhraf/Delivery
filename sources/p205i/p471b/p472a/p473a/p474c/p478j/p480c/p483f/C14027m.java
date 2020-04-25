package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p475i.C13960u;

/* renamed from: i.b.a.a.c.j.c.f.m */
/* compiled from: ProbeInserter */
class C14027m extends C13957r implements C14019e {

    /* renamed from: l3 */
    private final C14018d f41217l3;

    /* renamed from: m3 */
    private final boolean f41218m3;

    /* renamed from: n3 */
    private final int f41219n3;

    /* renamed from: o3 */
    private int f41220o3;

    C14027m(int i, String str, String str2, C13957r rVar, C14018d dVar) {
        super(327680, rVar);
        this.f41218m3 = "<clinit>".equals(str);
        this.f41217l3 = dVar;
        int i2 = (i & 8) == 0 ? 1 : 0;
        for (C13960u i3 : C13960u.m60138a(str2)) {
            i2 += i3.mo44211i();
        }
        this.f41219n3 = i2;
    }

    /* renamed from: a */
    public void mo44313a(int i) {
        this.f40701k3.mo44197d(25, this.f41219n3);
        C14020f.m60480a(this.f40701k3, i);
        this.f40701k3.mo44189b(4);
        this.f40701k3.mo44189b(84);
    }

    /* renamed from: b */
    public void mo44188b() {
        this.f41220o3 = this.f41217l3.mo44311a(this.f40701k3, this.f41218m3, this.f41219n3);
        this.f40701k3.mo44188b();
    }

    /* renamed from: c */
    public void mo44196c(int i, int i2) {
        this.f40701k3.mo44196c(Math.max(i + 3, this.f41220o3), i2 + 1);
    }

    /* renamed from: d */
    public final void mo44197d(int i, int i2) {
        this.f40701k3.mo44197d(i, m60510c(i2));
    }

    /* renamed from: c */
    private int m60510c(int i) {
        return i < this.f41219n3 ? i : i + 1;
    }

    /* renamed from: a */
    public final void mo44172a(int i, int i2) {
        this.f40701k3.mo44172a(m60510c(i), i2);
    }

    /* renamed from: a */
    public final void mo44186a(String str, String str2, String str3, C13956q qVar, C13956q qVar2, int i) {
        this.f40701k3.mo44186a(str, str2, str3, qVar, qVar2, m60510c(i));
    }

    /* renamed from: a */
    public final void mo44174a(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        if (i == -1) {
            Object[] objArr3 = new Object[(Math.max(i2, this.f41219n3) + 1)];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i5 < i2 || i6 <= this.f41219n3) {
                    if (i6 == this.f41219n3) {
                        i4 = i7 + 1;
                        objArr3[i7] = C14020f.f41196e;
                    } else if (i5 < i2) {
                        int i8 = i5 + 1;
                        Integer num = objArr[i5];
                        int i9 = i7 + 1;
                        objArr3[i7] = num;
                        i6++;
                        if (num == C13959t.f40895f0 || num == C13959t.f40890e0) {
                            i6++;
                        }
                        i5 = i8;
                        i7 = i9;
                    } else {
                        i4 = i7 + 1;
                        objArr3[i7] = C13959t.f40875b0;
                    }
                    i6++;
                    i7 = i4;
                } else {
                    this.f40701k3.mo44174a(i, i7, objArr3, i3, objArr2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
    }
}
