package p076c.p082c.p083a.p084a0;

/* renamed from: c.c.a.a0.h */
/* compiled from: MultiClassKey */
public class C2215h {

    /* renamed from: a */
    private Class<?> f8771a;

    /* renamed from: b */
    private Class<?> f8772b;

    public C2215h() {
    }

    /* renamed from: a */
    public void mo9398a(Class<?> cls, Class<?> cls2) {
        this.f8771a = cls;
        this.f8772b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2215h.class != obj.getClass()) {
            return false;
        }
        C2215h hVar = (C2215h) obj;
        return this.f8771a.equals(hVar.f8771a) && this.f8772b.equals(hVar.f8772b);
    }

    public int hashCode() {
        return (this.f8771a.hashCode() * 31) + this.f8772b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.f8771a);
        sb.append(", second=");
        sb.append(this.f8772b);
        sb.append('}');
        return sb.toString();
    }

    public C2215h(Class<?> cls, Class<?> cls2) {
        mo9398a(cls, cls2);
    }
}
