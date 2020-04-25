package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.k */
/* compiled from: FieldVisitor */
public abstract class C13950k {

    /* renamed from: a */
    protected final int f40610a;

    /* renamed from: b */
    protected C13950k f40611b;

    public C13950k(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public C13940a mo44133a(String str, boolean z) {
        C13950k kVar = this.f40611b;
        if (kVar != null) {
            return kVar.mo44133a(str, z);
        }
        return null;
    }

    public C13950k(int i, C13950k kVar) {
        if (i == 262144 || i == 327680) {
            this.f40610a = i;
            this.f40611b = kVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C13940a mo44132a(int i, C13961v vVar, String str, boolean z) {
        if (this.f40610a >= 327680) {
            C13950k kVar = this.f40611b;
            if (kVar != null) {
                return kVar.mo44132a(i, vVar, str, z);
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    public void mo44135a(C13942c cVar) {
        C13950k kVar = this.f40611b;
        if (kVar != null) {
            kVar.mo44135a(cVar);
        }
    }

    /* renamed from: a */
    public void mo44134a() {
        C13950k kVar = this.f40611b;
        if (kVar != null) {
            kVar.mo44134a();
        }
    }
}
