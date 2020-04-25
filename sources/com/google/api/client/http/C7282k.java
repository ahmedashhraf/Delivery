package com.google.api.client.http;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6365c;
import p076c.p112d.p134b.p135a.p143g.C6370d;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6389k0;

@C2766f
/* renamed from: com.google.api.client.http.k */
/* compiled from: HttpBackOffIOExceptionHandler */
public class C7282k implements C7302r {

    /* renamed from: a */
    private final C6365c f20596a;

    /* renamed from: b */
    private C6389k0 f20597b = C6389k0.f17813a;

    public C7282k(C6365c cVar) {
        this.f20596a = (C6365c) C6381h0.m29663a(cVar);
    }

    /* renamed from: a */
    public final C6365c mo28971a() {
        return this.f20596a;
    }

    /* renamed from: b */
    public final C6389k0 mo28973b() {
        return this.f20597b;
    }

    /* renamed from: a */
    public C7282k mo28972a(C6389k0 k0Var) {
        this.f20597b = (C6389k0) C6381h0.m29663a(k0Var);
        return this;
    }

    /* renamed from: a */
    public boolean mo28836a(C7305u uVar, boolean z) throws IOException {
        boolean z2 = false;
        if (!z) {
            return false;
        }
        try {
            z2 = C6370d.m29639a(this.f20597b, this.f20596a);
        } catch (InterruptedException unused) {
        }
        return z2;
    }
}
