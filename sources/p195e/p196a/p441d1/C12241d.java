package p195e.p196a.p441d1;

import java.util.concurrent.TimeUnit;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p451b.C12390b;

/* renamed from: e.a.d1.d */
/* compiled from: Timed */
public final class C12241d<T> {

    /* renamed from: a */
    final T f35351a;

    /* renamed from: b */
    final long f35352b;

    /* renamed from: c */
    final TimeUnit f35353c;

    public C12241d(@C5937f T t, long j, @C5937f TimeUnit timeUnit) {
        this.f35351a = t;
        this.f35352b = j;
        this.f35353c = (TimeUnit) C12390b.m55563a(timeUnit, "unit is null");
    }

    /* renamed from: a */
    public long mo41884a() {
        return this.f35352b;
    }

    @C5937f
    /* renamed from: b */
    public TimeUnit mo41886b() {
        return this.f35353c;
    }

    @C5937f
    /* renamed from: c */
    public T mo41887c() {
        return this.f35351a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12241d)) {
            return false;
        }
        C12241d dVar = (C12241d) obj;
        if (!C12390b.m55564a((Object) this.f35351a, (Object) dVar.f35351a) || this.f35352b != dVar.f35352b || !C12390b.m55564a((Object) this.f35353c, (Object) dVar.f35353c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f35351a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        long j = this.f35352b;
        return ((hashCode + ((int) (j ^ (j >>> 31)))) * 31) + this.f35353c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timed[time=");
        sb.append(this.f35352b);
        sb.append(", unit=");
        sb.append(this.f35353c);
        sb.append(", value=");
        sb.append(this.f35351a);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public long mo41885a(@C5937f TimeUnit timeUnit) {
        return timeUnit.convert(this.f35352b, this.f35353c);
    }
}
