package org.apache.http.impl.auth;

import org.apache.http.C15133c;
import org.apache.http.C15463o;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15124g;
import org.apache.http.auth.C15125h;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.auth.g */
/* compiled from: NTLMScheme */
public class C15366g extends C15360a {

    /* renamed from: b */
    private final C15365f f44449b;

    /* renamed from: c */
    private C15367a f44450c;

    /* renamed from: d */
    private String f44451d;

    /* renamed from: org.apache.http.impl.auth.g$a */
    /* compiled from: NTLMScheme */
    enum C15367a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public C15366g(C15365f fVar) {
        if (fVar != null) {
            this.f44449b = fVar;
            this.f44450c = C15367a.UNINITIATED;
            this.f44451d = null;
            return;
        }
        throw new IllegalArgumentException("NTLM engine may not be null");
    }

    /* renamed from: a */
    public String mo46866a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47568a(C15454b bVar, int i, int i2) throws MalformedChallengeException {
        String b = bVar.mo47765b(i, i2);
        if (b.length() == 0) {
            if (this.f44450c == C15367a.UNINITIATED) {
                this.f44450c = C15367a.CHALLENGE_RECEIVED;
            } else {
                this.f44450c = C15367a.FAILED;
            }
            this.f44451d = null;
            return;
        }
        this.f44450c = C15367a.MSG_TYPE2_RECEVIED;
        this.f44451d = b;
    }

    /* renamed from: b */
    public String mo46869b(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo46870b() {
        return true;
    }

    /* renamed from: c */
    public String mo46871c() {
        return "ntlm";
    }

    /* renamed from: d */
    public boolean mo46872d() {
        C15367a aVar = this.f44450c;
        return aVar == C15367a.MSG_TYPE3_GENERATED || aVar == C15367a.FAILED;
    }

    /* renamed from: a */
    public C15133c mo46867a(C15124g gVar, C15463o oVar) throws AuthenticationException {
        String str;
        try {
            C15125h hVar = (C15125h) gVar;
            C15367a aVar = this.f44450c;
            if (aVar == C15367a.CHALLENGE_RECEIVED || aVar == C15367a.FAILED) {
                str = this.f44449b.mo47572a(hVar.mo46893c(), hVar.mo46895e());
                this.f44450c = C15367a.MSG_TYPE1_GENERATED;
            } else if (aVar == C15367a.MSG_TYPE2_RECEVIED) {
                str = this.f44449b.mo47573a(hVar.mo46894d(), hVar.mo46892b(), hVar.mo46893c(), hVar.mo46895e(), this.f44451d);
                this.f44450c = C15367a.MSG_TYPE3_GENERATED;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state: ");
                sb.append(this.f44450c);
                throw new AuthenticationException(sb.toString());
            }
            C15454b bVar = new C15454b(32);
            if (mo47569e()) {
                bVar.mo47757a("Proxy-Authorization");
            } else {
                bVar.mo47757a("Authorization");
            }
            bVar.mo47757a(": NTLM ");
            bVar.mo47757a(str);
            return new C15341r(bVar);
        } catch (ClassCastException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Credentials cannot be used for NTLM authentication: ");
            sb2.append(gVar.getClass().getName());
            throw new InvalidCredentialsException(sb2.toString());
        }
    }
}
