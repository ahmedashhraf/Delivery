package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7270h0;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import com.mrsool.utils.webservice.C11687c;
import java.io.IOException;
import java.util.Map;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6398n;

/* renamed from: com.google.api.client.auth.oauth2.i */
/* compiled from: ClientParametersAuthentication */
public class C7221i implements C7308w, C7298p {

    /* renamed from: a */
    private final String f20397a;

    /* renamed from: b */
    private final String f20398b;

    public C7221i(String str, String str2) {
        this.f20397a = (String) C6381h0.m29663a(str);
        this.f20398b = str2;
    }

    /* renamed from: a */
    public void mo25080a(C7305u uVar) throws IOException {
        Map d = C6398n.m29725d(C7270h0.m35092a(uVar).mo28921f());
        d.put("client_id", this.f20397a);
        String str = this.f20398b;
        if (str != null) {
            d.put(C11687c.f33834s0, str);
        }
    }

    /* renamed from: b */
    public void mo25083b(C7305u uVar) throws IOException {
        uVar.mo29086a((C7298p) this);
    }

    /* renamed from: b */
    public final String mo28690b() {
        return this.f20398b;
    }

    /* renamed from: a */
    public final String mo28689a() {
        return this.f20397a;
    }
}
