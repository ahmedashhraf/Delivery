package org.apache.http.auth;

import java.security.Principal;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15458f;

@C6144b
/* renamed from: org.apache.http.auth.f */
/* compiled from: BasicUserPrincipal */
public final class C15123f implements Principal {

    /* renamed from: a */
    private final String f43994a;

    public C15123f(String str) {
        if (str != null) {
            this.f43994a = str;
            return;
        }
        throw new IllegalArgumentException("User name may not be null");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15123f) {
            if (C15458f.m68507a((Object) this.f43994a, (Object) ((C15123f) obj).f43994a)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f43994a;
    }

    public int hashCode() {
        return C15458f.m68505a(17, (Object) this.f43994a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[principal: ");
        sb.append(this.f43994a);
        sb.append("]");
        return sb.toString();
    }
}
