package org.apache.http.p549j0;

import java.util.Map;

/* renamed from: org.apache.http.j0.l */
/* compiled from: HttpRequestHandlerRegistry */
public class C15437l implements C15438m {

    /* renamed from: a */
    private final C15427b0 f44606a = new C15427b0();

    /* renamed from: a */
    public void mo47725a(String str, C15436k kVar) {
        if (str == null) {
            throw new IllegalArgumentException("URI request pattern may not be null");
        } else if (kVar != null) {
            this.f44606a.mo47710a(str, (Object) kVar);
        } else {
            throw new IllegalArgumentException("Request handler may not be null");
        }
    }

    public C15436k lookup(String str) {
        return (C15436k) this.f44606a.mo47709a(str);
    }

    /* renamed from: a */
    public void mo47724a(String str) {
        this.f44606a.mo47713b(str);
    }

    /* renamed from: a */
    public void mo47726a(Map map) {
        this.f44606a.mo47711a(map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47727a(String str, String str2) {
        return this.f44606a.mo47712a(str, str2);
    }
}
