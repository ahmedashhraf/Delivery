package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.f */
/* compiled from: ClassVisitor */
public abstract class C13945f {

    /* renamed from: a */
    protected final int f40501a;

    /* renamed from: b */
    protected C13945f f40502b;

    public C13945f(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public void mo44098a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            fVar.mo44098a(i, i2, str, str2, str3, strArr);
        }
    }

    /* renamed from: b */
    public void mo44103b() {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            fVar.mo44103b();
        }
    }

    public C13945f(int i, C13945f fVar) {
        if (i == 262144 || i == 327680) {
            this.f40501a = i;
            this.f40502b = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo44100a(String str, String str2) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            fVar.mo44100a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo44101a(String str, String str2, String str3) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            fVar.mo44101a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public C13940a mo44095a(String str, boolean z) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            return fVar.mo44095a(str, z);
        }
        return null;
    }

    /* renamed from: a */
    public C13940a mo44094a(int i, C13961v vVar, String str, boolean z) {
        if (this.f40501a >= 327680) {
            C13945f fVar = this.f40502b;
            if (fVar != null) {
                return fVar.mo44094a(i, vVar, str, z);
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    public void mo44099a(C13942c cVar) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            fVar.mo44099a(cVar);
        }
    }

    /* renamed from: a */
    public void mo44102a(String str, String str2, String str3, int i) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            fVar.mo44102a(str, str2, str3, i);
        }
    }

    /* renamed from: a */
    public C13950k mo44096a(int i, String str, String str2, String str3, Object obj) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            return fVar.mo44096a(i, str, str2, str3, obj);
        }
        return null;
    }

    /* renamed from: a */
    public C13957r mo44097a(int i, String str, String str2, String str3, String[] strArr) {
        C13945f fVar = this.f40502b;
        if (fVar != null) {
            return fVar.mo44097a(i, str, str2, str3, strArr);
        }
        return null;
    }
}
