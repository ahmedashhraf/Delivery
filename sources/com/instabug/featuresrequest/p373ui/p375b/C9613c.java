package com.instabug.featuresrequest.p373ui.p375b;

import com.instabug.featuresrequest.models.C9567a;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.b.c */
/* compiled from: FeaturesListBo */
public class C9613c {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25443c;

    /* renamed from: a */
    private C9612b f25444a;

    /* renamed from: b */
    private boolean f25445b = true;

    public C9613c(C9612b bVar) {
        boolean[] g = m44978g();
        this.f25444a = bVar;
        g[0] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m44978g() {
        boolean[] zArr = f25443c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2066305421434711149L, "com/instabug/featuresrequest/ui/base/FeaturesListBo", 12);
        f25443c = a;
        return a;
    }

    /* renamed from: a */
    public List<C9567a> mo34427a() {
        boolean[] g = m44978g();
        List<C9567a> b = this.f25444a.mo34423b();
        g[1] = true;
        return b;
    }

    /* renamed from: b */
    public int mo34430b() {
        boolean[] g = m44978g();
        int c = this.f25444a.mo34424c();
        g[3] = true;
        return c;
    }

    /* renamed from: c */
    public int mo34431c() {
        boolean[] g = m44978g();
        int i = this.f25444a.f25442a;
        g[7] = true;
        return i;
    }

    /* renamed from: d */
    public void mo34432d() {
        boolean[] g = m44978g();
        this.f25444a.mo34421a();
        g[8] = true;
    }

    /* renamed from: e */
    public void mo34433e() {
        boolean[] g = m44978g();
        this.f25444a.mo34425d();
        this.f25444a.f25442a = 1;
        g[9] = true;
    }

    /* renamed from: f */
    public boolean mo34434f() {
        boolean[] g = m44978g();
        boolean z = this.f25445b;
        g[10] = true;
        return z;
    }

    /* renamed from: a */
    public C9567a mo34426a(int i) {
        boolean[] g = m44978g();
        C9567a a = this.f25444a.mo34420a(i);
        g[4] = true;
        return a;
    }

    /* renamed from: a */
    public void mo34428a(List<C9567a> list) {
        boolean[] g = m44978g();
        this.f25444a.mo34422a(list);
        g[5] = true;
    }

    /* renamed from: a */
    public void mo34429a(boolean z) {
        boolean[] g = m44978g();
        this.f25445b = z;
        g[11] = true;
    }
}
