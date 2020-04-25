package com.google.api.client.http.p308j0;

import com.google.api.client.http.C7259d0;
import com.google.api.client.http.C7261e0;
import java.io.IOException;
import org.apache.http.C15452k;
import org.apache.http.client.C15138d;
import org.apache.http.client.p530k.C15153i;
import org.apache.http.conn.p534n.C15194e;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.http.j0.a */
/* compiled from: ApacheHttpRequest */
final class C7275a extends C7259d0 {

    /* renamed from: e */
    private final C15138d f20583e;

    /* renamed from: f */
    private final C15153i f20584f;

    C7275a(C15138d dVar, C15153i iVar) {
        this.f20583e = dVar;
        this.f20584f = iVar;
    }

    /* renamed from: a */
    public void mo25349a(String str, String str2) {
        this.f20584f.mo47414a(str, str2);
    }

    /* renamed from: a */
    public void mo28872a(int i, int i2) throws IOException {
        C15357i params = this.f20584f.getParams();
        C15194e.m67360a(params, (long) i);
        C15356h.m68008a(params, i);
        C15356h.m68014c(params, i2);
    }

    /* renamed from: a */
    public C7261e0 mo25348a() throws IOException {
        if (mo28880e() != null) {
            C15153i iVar = this.f20584f;
            C6381h0.m29668a(iVar instanceof C15452k, "Apache HTTP client does not support %s requests with content.", iVar.mo46956h().mo46855e());
            C7279d dVar = new C7279d(mo28878c(), mo28880e());
            dVar.mo47158a(mo28876b());
            dVar.mo47162b(mo28879d());
            ((C15452k) this.f20584f).mo46949a(dVar);
        }
        C15153i iVar2 = this.f20584f;
        return new C7276b(iVar2, this.f20583e.execute(iVar2));
    }
}
