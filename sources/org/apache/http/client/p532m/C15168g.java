package org.apache.http.client.p532m;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15119b;
import org.apache.http.auth.C15124g;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.client.m.g */
/* compiled from: RequestTargetAuthentication */
public class C15168g implements C15465q {

    /* renamed from: a */
    private final C15089a f44052a = C15096h.m66940c(C15168g.class);

    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!oVar.mo46956h().mo46855e().equalsIgnoreCase(C7304t.f20665a) && !oVar.mo47425e("Authorization")) {
            AuthState authState = (AuthState) fVar.mo47685a(C15162a.f44044h);
            if (authState != null) {
                C15119b authScheme = authState.getAuthScheme();
                if (authScheme != null) {
                    C15124g credentials = authState.getCredentials();
                    if (credentials == null) {
                        this.f44052a.mo46776a("User credentials not available");
                        return;
                    }
                    if (authState.getAuthScope() != null || !authScheme.mo46870b()) {
                        try {
                            oVar.mo47415a(authScheme.mo46867a(credentials, oVar));
                        } catch (AuthenticationException e) {
                            if (this.f44052a.mo46788e()) {
                                C15089a aVar = this.f44052a;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Authentication error: ");
                                sb.append(e.getMessage());
                                aVar.mo46786e(sb.toString());
                            }
                        }
                    }
                }
            }
        }
    }
}
