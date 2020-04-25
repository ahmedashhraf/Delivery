package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.c */
/* compiled from: Attribute */
public class C13942c {

    /* renamed from: a */
    public final String f40481a;

    /* renamed from: b */
    byte[] f40482b;

    /* renamed from: c */
    C13942c f40483c;

    protected C13942c(String str) {
        this.f40481a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13942c mo44060a(C13944e eVar, int i, int i2, char[] cArr, int i3, C13956q[] qVarArr) {
        C13942c cVar = new C13942c(this.f40481a);
        cVar.f40482b = new byte[i2];
        System.arraycopy(eVar.f40496a, i, cVar.f40482b, 0, i2);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13943d mo44062b(C13946g gVar, byte[] bArr, int i, int i2, int i3) {
        C13943d dVar = new C13943d();
        byte[] bArr2 = this.f40482b;
        dVar.f40484a = bArr2;
        dVar.f40485b = bArr2.length;
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13956q[] mo44063b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo44064c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo44065d() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo44058a() {
        int i = 0;
        for (C13942c cVar = this; cVar != null; cVar = cVar.f40483c) {
            i++;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo44059a(C13946g gVar, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (C13942c cVar = this; cVar != null; cVar = cVar.f40483c) {
            gVar.mo44130f(cVar.f40481a);
            i4 += cVar.mo44062b(gVar, bArr, i, i2, i3).f40485b + 6;
        }
        return i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44061a(C13946g gVar, byte[] bArr, int i, int i2, int i3, C13943d dVar) {
        for (C13942c cVar = this; cVar != null; cVar = cVar.f40483c) {
            C13943d b = cVar.mo44062b(gVar, bArr, i, i2, i3);
            dVar.mo44074c(gVar.mo44130f(cVar.f40481a)).mo44072b(b.f40485b);
            dVar.mo44071a(b.f40484a, 0, b.f40485b);
        }
    }
}
