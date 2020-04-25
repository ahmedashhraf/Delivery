package org.apache.http.auth;

import java.security.Principal;
import java.util.Locale;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15458f;

@C6144b
/* renamed from: org.apache.http.auth.i */
/* compiled from: NTUserPrincipal */
public class C15126i implements Principal {

    /* renamed from: N */
    private final String f43998N;

    /* renamed from: a */
    private final String f43999a;

    /* renamed from: b */
    private final String f44000b;

    public C15126i(String str, String str2) {
        if (str2 != null) {
            this.f43999a = str2;
            if (str != null) {
                this.f44000b = str.toUpperCase(Locale.ENGLISH);
            } else {
                this.f44000b = null;
            }
            String str3 = this.f44000b;
            if (str3 == null || str3.length() <= 0) {
                this.f43998N = this.f43999a;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f44000b);
            sb.append('/');
            sb.append(this.f43999a);
            this.f43998N = sb.toString();
            return;
        }
        throw new IllegalArgumentException("User name may not be null");
    }

    /* renamed from: a */
    public String mo46899a() {
        return this.f44000b;
    }

    /* renamed from: b */
    public String mo46900b() {
        return this.f43999a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15126i) {
            C15126i iVar = (C15126i) obj;
            return C15458f.m68507a((Object) this.f43999a, (Object) iVar.f43999a) && C15458f.m68507a((Object) this.f44000b, (Object) iVar.f44000b);
        }
    }

    public String getName() {
        return this.f43998N;
    }

    public int hashCode() {
        return C15458f.m68505a(C15458f.m68505a(17, (Object) this.f43999a), (Object) this.f44000b);
    }

    public String toString() {
        return this.f43998N;
    }
}
