package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7270h0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C7251a;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6399n0;
import p076c.p112d.p134b.p135a.p143g.C6404o0;

@C2766f
/* renamed from: com.google.api.client.googleapis.auth.clientlogin.b */
/* compiled from: ClientLogin */
public final class C7238b {

    /* renamed from: a */
    public C7253a0 f20452a;

    /* renamed from: b */
    public C7274j f20453b = new C7274j("https://www.google.com");
    @C2768v("source")

    /* renamed from: c */
    public String f20454c;
    @C2768v("service")

    /* renamed from: d */
    public String f20455d;
    @C2768v("Email")

    /* renamed from: e */
    public String f20456e;
    @C2768v("Passwd")

    /* renamed from: f */
    public String f20457f;
    @C2768v

    /* renamed from: g */
    public String f20458g;
    @C2768v("logintoken")

    /* renamed from: h */
    public String f20459h;
    @C2768v("logincaptcha")

    /* renamed from: i */
    public String f20460i;

    /* renamed from: com.google.api.client.googleapis.auth.clientlogin.b$a */
    /* compiled from: ClientLogin */
    public static final class C7239a {
        @C2768v("Error")

        /* renamed from: a */
        public String f20461a;
        @C2768v("Url")

        /* renamed from: b */
        public String f20462b;
        @C2768v("CaptchaToken")

        /* renamed from: c */
        public String f20463c;
        @C2768v("CaptchaUrl")

        /* renamed from: d */
        public String f20464d;
    }

    /* renamed from: com.google.api.client.googleapis.auth.clientlogin.b$b */
    /* compiled from: ClientLogin */
    public static final class C7240b implements C7298p, C7308w {
        @C2768v("Auth")

        /* renamed from: a */
        public String f20465a;

        /* renamed from: a */
        public String mo28759a() {
            return C7238b.m34839a(this.f20465a);
        }

        /* renamed from: b */
        public void mo25083b(C7305u uVar) {
            uVar.mo29086a((C7298p) this);
        }

        /* renamed from: a */
        public void mo25080a(C7305u uVar) {
            uVar.mo29111i().mo29020f(mo28759a());
        }
    }

    /* renamed from: a */
    public C7240b mo28758a() throws IOException {
        C7274j clone = this.f20453b.clone();
        clone.mo28926a("/accounts/ClientLogin");
        C7305u b = this.f20452a.mo28859b().mo29136b(clone, new C7270h0(this));
        b.mo29079a((C6372e0) C7237a.f20451a);
        b.mo29095b(0);
        b.mo29108f(false);
        C7309x a = b.mo29092a();
        if (a.mo29158o()) {
            return (C7240b) a.mo29141a(C7240b.class);
        }
        C7251a aVar = new C7251a(a.mo29153j(), a.mo29154k(), a.mo29150g());
        C7239a aVar2 = (C7239a) a.mo29141a(C7239a.class);
        String obj = aVar2.toString();
        StringBuilder a2 = HttpResponseException.m34952a(a);
        if (!C6404o0.m29729a(obj)) {
            a2.append(C6399n0.f17828a);
            a2.append(obj);
            aVar.mo28844a(obj);
        }
        aVar.mo28846b(a2.toString());
        throw new ClientLoginResponseException(aVar, aVar2);
    }

    /* renamed from: a */
    public static String m34839a(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "GoogleLogin auth=";
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }
}
