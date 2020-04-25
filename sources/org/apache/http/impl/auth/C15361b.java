package org.apache.http.impl.auth;

import org.apache.commons.codec.p523h.C15073a;
import org.apache.http.C15133c;
import org.apache.http.C15463o;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15124g;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.p528k.C15130c;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p550k0.C15454b;
import org.apache.http.p550k0.C15455c;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.BasicValidateElement;

@C6145c
/* renamed from: org.apache.http.impl.auth.b */
/* compiled from: BasicScheme */
public class C15361b extends C15368h {

    /* renamed from: c */
    private boolean f44440c = false;

    /* renamed from: a */
    public void mo46868a(C15133c cVar) throws MalformedChallengeException {
        super.mo46868a(cVar);
        this.f44440c = true;
    }

    /* renamed from: b */
    public boolean mo46870b() {
        return false;
    }

    /* renamed from: c */
    public String mo46871c() {
        return BasicValidateElement.METHOD;
    }

    /* renamed from: d */
    public boolean mo46872d() {
        return this.f44440c;
    }

    /* renamed from: a */
    public C15133c mo46867a(C15124g gVar, C15463o oVar) throws AuthenticationException {
        if (gVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (oVar != null) {
            return m68051a(gVar, C15130c.m67197a(oVar.getParams()), mo47569e());
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    /* renamed from: a */
    public static C15133c m68051a(C15124g gVar, String str, boolean z) {
        if (gVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(gVar.mo46891a().getName());
            sb.append(":");
            sb.append(gVar.mo46892b() == null ? "null" : gVar.mo46892b());
            byte[] f = C15073a.m66753f(C15455c.m68496a(sb.toString(), str));
            C15454b bVar = new C15454b(32);
            if (z) {
                bVar.mo47757a("Proxy-Authorization");
            } else {
                bVar.mo47757a("Authorization");
            }
            bVar.mo47757a(": Basic ");
            bVar.mo47761a(f, 0, f.length);
            return new C15341r(bVar);
        } else {
            throw new IllegalArgumentException("charset may not be null");
        }
    }
}
