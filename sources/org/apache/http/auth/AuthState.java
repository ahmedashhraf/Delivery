package org.apache.http.auth;

import com.facebook.internal.ServerProtocol;
import org.apache.http.p224d0.C6145c;

@C6145c
public class AuthState {
    private C15119b authScheme;
    private C15122e authScope;
    private C15124g credentials;

    public C15119b getAuthScheme() {
        return this.authScheme;
    }

    public C15122e getAuthScope() {
        return this.authScope;
    }

    public C15124g getCredentials() {
        return this.credentials;
    }

    public void invalidate() {
        this.authScheme = null;
        this.authScope = null;
        this.credentials = null;
    }

    public boolean isValid() {
        return this.authScheme != null;
    }

    public void setAuthScheme(C15119b bVar) {
        if (bVar == null) {
            invalidate();
        } else {
            this.authScheme = bVar;
        }
    }

    public void setAuthScope(C15122e eVar) {
        this.authScope = eVar;
    }

    public void setCredentials(C15124g gVar) {
        this.credentials = gVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("auth scope [");
        sb.append(this.authScope);
        sb.append("]; credentials set [");
        sb.append(this.credentials != null ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        sb.append("]");
        return sb.toString();
    }
}
