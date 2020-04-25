package org.apache.http.p548i0;

/* renamed from: org.apache.http.i0.a */
/* compiled from: AbstractHttpParams */
public abstract class C15349a implements C15357i {
    protected C15349a() {
    }

    /* renamed from: a */
    public long mo47536a(String str, long j) {
        Object b = mo47549b(str);
        if (b == null) {
            return j;
        }
        return ((Long) b).longValue();
    }

    /* renamed from: b */
    public C15357i mo47542b(String str, long j) {
        mo47546a(str, (Object) new Long(j));
        return this;
    }

    /* renamed from: c */
    public boolean mo47544c(String str) {
        return !mo47543b(str, false);
    }

    /* renamed from: e */
    public boolean mo47545e(String str) {
        return mo47543b(str, false);
    }

    /* renamed from: b */
    public int mo47541b(String str, int i) {
        Object b = mo47549b(str);
        if (b == null) {
            return i;
        }
        return ((Integer) b).intValue();
    }

    /* renamed from: a */
    public C15357i mo47538a(String str, int i) {
        mo47546a(str, (Object) new Integer(i));
        return this;
    }

    /* renamed from: a */
    public C15357i mo47537a(String str, double d) {
        mo47546a(str, (Object) new Double(d));
        return this;
    }

    /* renamed from: b */
    public double mo47540b(String str, double d) {
        Object b = mo47549b(str);
        if (b == null) {
            return d;
        }
        return ((Double) b).doubleValue();
    }

    /* renamed from: a */
    public C15357i mo47539a(String str, boolean z) {
        mo47546a(str, (Object) z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    /* renamed from: b */
    public boolean mo47543b(String str, boolean z) {
        Object b = mo47549b(str);
        if (b == null) {
            return z;
        }
        return ((Boolean) b).booleanValue();
    }
}
