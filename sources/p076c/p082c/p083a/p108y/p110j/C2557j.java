package p076c.p082c.p083a.p108y.p110j;

import p076c.p082c.p083a.p084a0.C2216i;

/* renamed from: c.c.a.y.j.j */
/* compiled from: SimpleTarget */
public abstract class C2557j<Z> extends C2549b<Z> {

    /* renamed from: N */
    private final int f9641N;

    /* renamed from: b */
    private final int f9642b;

    public C2557j() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo9506a(C2558k kVar) {
        if (C2216i.m11344a(this.f9642b, this.f9641N)) {
            kVar.mo9402a(this.f9642b, this.f9641N);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(this.f9642b);
        sb.append(" and height: ");
        sb.append(this.f9641N);
        sb.append(", either provide dimensions in the constructor");
        sb.append(" or call override()");
        throw new IllegalArgumentException(sb.toString());
    }

    public C2557j(int i, int i2) {
        this.f9642b = i;
        this.f9641N = i2;
    }
}
