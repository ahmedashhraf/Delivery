package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.a */
/* compiled from: AnnotationVisitor */
public abstract class C13940a {

    /* renamed from: a */
    protected final int f40471a;

    /* renamed from: b */
    protected C13940a f40472b;

    public C13940a(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public void mo44054a(String str, Object obj) {
        C13940a aVar = this.f40472b;
        if (aVar != null) {
            aVar.mo44054a(str, obj);
        }
    }

    public C13940a(int i, C13940a aVar) {
        if (i == 262144 || i == 327680) {
            this.f40471a = i;
            this.f40472b = aVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo44055a(String str, String str2, String str3) {
        C13940a aVar = this.f40472b;
        if (aVar != null) {
            aVar.mo44055a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public C13940a mo44052a(String str, String str2) {
        C13940a aVar = this.f40472b;
        if (aVar != null) {
            return aVar.mo44052a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public C13940a mo44051a(String str) {
        C13940a aVar = this.f40472b;
        if (aVar != null) {
            return aVar.mo44051a(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo44053a() {
        C13940a aVar = this.f40472b;
        if (aVar != null) {
            aVar.mo44053a();
        }
    }
}
