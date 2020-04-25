package p195e.p196a;

import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12390b;

/* renamed from: e.a.a0 */
/* compiled from: Notification */
public final class C12200a0<T> {

    /* renamed from: b */
    static final C12200a0<Object> f35223b = new C12200a0<>(null);

    /* renamed from: a */
    final Object f35224a;

    private C12200a0(Object obj) {
        this.f35224a = obj;
    }

    @C5937f
    /* renamed from: f */
    public static <T> C12200a0<T> m54847f() {
        return f35223b;
    }

    @C5938g
    /* renamed from: a */
    public Throwable mo41771a() {
        Object obj = this.f35224a;
        if (C13761q.m58754g(obj)) {
            return C13761q.m58746b(obj);
        }
        return null;
    }

    @C5938g
    /* renamed from: b */
    public T mo41772b() {
        Object obj = this.f35224a;
        if (obj == null || C13761q.m58754g(obj)) {
            return null;
        }
        return this.f35224a;
    }

    /* renamed from: c */
    public boolean mo41773c() {
        return this.f35224a == null;
    }

    /* renamed from: d */
    public boolean mo41774d() {
        return C13761q.m58754g(this.f35224a);
    }

    /* renamed from: e */
    public boolean mo41775e() {
        Object obj = this.f35224a;
        return obj != null && !C13761q.m58754g(obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12200a0)) {
            return false;
        }
        return C12390b.m55564a(this.f35224a, ((C12200a0) obj).f35224a);
    }

    public int hashCode() {
        Object obj = this.f35224a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f35224a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        String str = "]";
        if (C13761q.m58754g(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnErrorNotification[");
            sb.append(C13761q.m58746b(obj));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnNextNotification[");
        sb2.append(this.f35224a);
        sb2.append(str);
        return sb2.toString();
    }

    @C5937f
    /* renamed from: a */
    public static <T> C12200a0<T> m54845a(@C5937f T t) {
        C12390b.m55563a(t, "value is null");
        return new C12200a0<>(t);
    }

    @C5937f
    /* renamed from: a */
    public static <T> C12200a0<T> m54846a(@C5937f Throwable th) {
        C12390b.m55563a(th, "error is null");
        return new C12200a0<>(C13761q.m58743a(th));
    }
}
