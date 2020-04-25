package com.google.api.client.http;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6365c;
import p076c.p112d.p134b.p135a.p143g.C6370d;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6389k0;

@C2766f
/* renamed from: com.google.api.client.http.l */
/* compiled from: HttpBackOffUnsuccessfulResponseHandler */
public class C7290l implements C7255b0 {

    /* renamed from: a */
    private final C6365c f20615a;

    /* renamed from: b */
    private C7291a f20616b = C7291a.f20619b;

    /* renamed from: c */
    private C6389k0 f20617c = C6389k0.f17813a;

    @C2766f
    /* renamed from: com.google.api.client.http.l$a */
    /* compiled from: HttpBackOffUnsuccessfulResponseHandler */
    public interface C7291a {

        /* renamed from: a */
        public static final C7291a f20618a = new C7292a();

        /* renamed from: b */
        public static final C7291a f20619b = new C7293b();

        /* renamed from: com.google.api.client.http.l$a$a */
        /* compiled from: HttpBackOffUnsuccessfulResponseHandler */
        static class C7292a implements C7291a {
            C7292a() {
            }

            /* renamed from: a */
            public boolean mo28993a(C7309x xVar) {
                return true;
            }
        }

        /* renamed from: com.google.api.client.http.l$a$b */
        /* compiled from: HttpBackOffUnsuccessfulResponseHandler */
        static class C7293b implements C7291a {
            C7293b() {
            }

            /* renamed from: a */
            public boolean mo28993a(C7309x xVar) {
                return xVar.mo29153j() / 100 == 5;
            }
        }

        /* renamed from: a */
        boolean mo28993a(C7309x xVar);
    }

    public C7290l(C6365c cVar) {
        this.f20615a = (C6365c) C6381h0.m29663a(cVar);
    }

    /* renamed from: a */
    public final C6365c mo28988a() {
        return this.f20615a;
    }

    /* renamed from: b */
    public final C7291a mo28991b() {
        return this.f20616b;
    }

    /* renamed from: c */
    public final C6389k0 mo28992c() {
        return this.f20617c;
    }

    /* renamed from: a */
    public C7290l mo28990a(C7291a aVar) {
        this.f20616b = (C7291a) C6381h0.m29663a(aVar);
        return this;
    }

    /* renamed from: a */
    public C7290l mo28989a(C6389k0 k0Var) {
        this.f20617c = (C6389k0) C6381h0.m29663a(k0Var);
        return this;
    }

    /* renamed from: a */
    public final boolean mo25648a(C7305u uVar, C7309x xVar, boolean z) throws IOException {
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (this.f20616b.mo28993a(xVar)) {
            try {
                z2 = C6370d.m29639a(this.f20617c, this.f20615a);
            } catch (InterruptedException unused) {
            }
        }
        return z2;
    }
}
