package org.apache.http.impl.client;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.C15119b;
import org.apache.http.auth.C15124g;
import org.apache.http.client.C15143i;
import org.apache.http.client.p532m.C15162a;
import org.apache.http.conn.C15187k;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.impl.client.n */
/* compiled from: DefaultUserTokenHandler */
public class C15382n implements C15143i {
    /* renamed from: a */
    public Object mo46945a(C15431f fVar) {
        Principal principal;
        AuthState authState = (AuthState) fVar.mo47685a(C15162a.f44044h);
        if (authState != null) {
            principal = m68204a(authState);
            if (principal == null) {
                principal = m68204a((AuthState) fVar.mo47685a(C15162a.f44045i));
            }
        } else {
            principal = null;
        }
        if (principal != null) {
            return principal;
        }
        C15187k kVar = (C15187k) fVar.mo47685a(C15429d.f44564a);
        if (!kVar.isOpen()) {
            return principal;
        }
        SSLSession i = kVar.mo47021i();
        return i != null ? i.getLocalPrincipal() : principal;
    }

    /* renamed from: a */
    private static Principal m68204a(AuthState authState) {
        C15119b authScheme = authState.getAuthScheme();
        if (authScheme != null && authScheme.mo46872d() && authScheme.mo46870b()) {
            C15124g credentials = authState.getCredentials();
            if (credentials != null) {
                return credentials.mo46891a();
            }
        }
        return null;
    }
}
