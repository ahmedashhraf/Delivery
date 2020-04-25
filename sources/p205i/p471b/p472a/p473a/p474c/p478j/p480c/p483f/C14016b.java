package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13950k;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14005b;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14013j;

/* renamed from: i.b.a.a.c.j.c.f.b */
/* compiled from: ClassInstrumenter */
public class C14016b extends C14005b {

    /* renamed from: c */
    private final C14018d f41189c;

    /* renamed from: d */
    private String f41190d;

    public C14016b(C14018d dVar, C13945f fVar) {
        super(fVar);
        this.f41189c = dVar;
    }

    /* renamed from: a */
    public void mo44098a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f41190d = str;
        super.mo44098a(i, i2, str, str2, str3, strArr);
    }

    /* renamed from: a */
    public C13950k mo44096a(int i, String str, String str2, String str3, Object obj) {
        C14020f.m60481a(str, this.f41190d);
        return super.mo44096a(i, str, str2, str3, obj);
    }

    /* renamed from: a */
    public C14013j m60460a(int i, String str, String str2, String str3, String[] strArr) {
        C14020f.m60481a(str, this.f41190d);
        C13957r a = this.f40502b.mo44097a(i, str, str2, str3, strArr);
        if (a == null) {
            return null;
        }
        C14027m mVar = new C14027m(i, str, str2, new C14017c(a), this.f41189c);
        return new C14023i(mVar, mVar);
    }

    /* renamed from: a */
    public void mo44297a(int i) {
        this.f41189c.mo44312a(this.f40502b, i);
    }
}
