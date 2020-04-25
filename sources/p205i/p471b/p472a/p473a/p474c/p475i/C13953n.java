package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.n */
/* compiled from: Handle */
public final class C13953n {

    /* renamed from: a */
    final int f40656a;

    /* renamed from: b */
    final String f40657b;

    /* renamed from: c */
    final String f40658c;

    /* renamed from: d */
    final String f40659d;

    /* renamed from: e */
    final boolean f40660e;

    @Deprecated
    public C13953n(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, i == 9);
    }

    /* renamed from: a */
    public String mo44142a() {
        return this.f40659d;
    }

    /* renamed from: b */
    public String mo44143b() {
        return this.f40658c;
    }

    /* renamed from: c */
    public String mo44144c() {
        return this.f40657b;
    }

    /* renamed from: d */
    public int mo44145d() {
        return this.f40656a;
    }

    /* renamed from: e */
    public boolean mo44146e() {
        return this.f40660e;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13953n)) {
            return false;
        }
        C13953n nVar = (C13953n) obj;
        if (this.f40656a != nVar.f40656a || this.f40660e != nVar.f40660e || !this.f40657b.equals(nVar.f40657b) || !this.f40658c.equals(nVar.f40658c) || !this.f40659d.equals(nVar.f40659d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f40656a + (this.f40660e ? 64 : 0) + (this.f40657b.hashCode() * this.f40658c.hashCode() * this.f40659d.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40657b);
        sb.append('.');
        sb.append(this.f40658c);
        sb.append(this.f40659d);
        sb.append(" (");
        sb.append(this.f40656a);
        sb.append(this.f40660e ? " itf" : "");
        sb.append(')');
        return sb.toString();
    }

    public C13953n(int i, String str, String str2, String str3, boolean z) {
        this.f40656a = i;
        this.f40657b = str;
        this.f40658c = str2;
        this.f40659d = str3;
        this.f40660e = z;
    }
}
