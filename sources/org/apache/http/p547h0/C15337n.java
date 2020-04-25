package org.apache.http.p547h0;

import java.io.Serializable;
import org.apache.http.C15472x;
import org.apache.http.p550k0.C15454b;
import org.apache.http.p550k0.C15458f;

/* renamed from: org.apache.http.h0.n */
/* compiled from: BasicNameValuePair */
public class C15337n implements C15472x, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;

    /* renamed from: a */
    private final String f44399a;

    /* renamed from: b */
    private final String f44400b;

    public C15337n(String str, String str2) {
        if (str != null) {
            this.f44399a = str;
            this.f44400b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15472x) {
            C15337n nVar = (C15337n) obj;
            if (this.f44399a.equals(nVar.f44399a) && C15458f.m68507a((Object) this.f44400b, (Object) nVar.f44400b)) {
                z = true;
            }
        }
        return z;
    }

    public String getName() {
        return this.f44399a;
    }

    public String getValue() {
        return this.f44400b;
    }

    public int hashCode() {
        return C15458f.m68505a(C15458f.m68505a(17, (Object) this.f44399a), (Object) this.f44400b);
    }

    public String toString() {
        if (this.f44400b == null) {
            return this.f44399a;
        }
        C15454b bVar = new C15454b(this.f44399a.length() + 1 + this.f44400b.length());
        bVar.mo47757a(this.f44399a);
        bVar.mo47757a("=");
        bVar.mo47757a(this.f44400b);
        return bVar.toString();
    }
}
