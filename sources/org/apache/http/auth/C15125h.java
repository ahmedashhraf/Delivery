package org.apache.http.auth;

import java.security.Principal;
import java.util.Locale;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15458f;

@C6144b
/* renamed from: org.apache.http.auth.h */
/* compiled from: NTCredentials */
public class C15125h implements C15124g {

    /* renamed from: a */
    private final C15126i f43995a;

    /* renamed from: b */
    private final String f43996b;

    /* renamed from: c */
    private final String f43997c;

    public C15125h(String str) {
        if (str != null) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                String substring = str.substring(0, indexOf);
                this.f43996b = str.substring(indexOf + 1);
                str = substring;
            } else {
                this.f43996b = null;
            }
            int indexOf2 = str.indexOf(47);
            if (indexOf2 >= 0) {
                this.f43995a = new C15126i(str.substring(0, indexOf2).toUpperCase(Locale.ENGLISH), str.substring(indexOf2 + 1));
            } else {
                this.f43995a = new C15126i(null, str.substring(indexOf2 + 1));
            }
            this.f43997c = null;
            return;
        }
        throw new IllegalArgumentException("Username:password string may not be null");
    }

    /* renamed from: a */
    public Principal mo46891a() {
        return this.f43995a;
    }

    /* renamed from: b */
    public String mo46892b() {
        return this.f43996b;
    }

    /* renamed from: c */
    public String mo46893c() {
        return this.f43995a.mo46899a();
    }

    /* renamed from: d */
    public String mo46894d() {
        return this.f43995a.mo46900b();
    }

    /* renamed from: e */
    public String mo46895e() {
        return this.f43997c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15125h) {
            C15125h hVar = (C15125h) obj;
            return C15458f.m68507a((Object) this.f43995a, (Object) hVar.f43995a) && C15458f.m68507a((Object) this.f43997c, (Object) hVar.f43997c);
        }
    }

    public int hashCode() {
        return C15458f.m68505a(C15458f.m68505a(17, (Object) this.f43995a), (Object) this.f43997c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[principal: ");
        sb.append(this.f43995a);
        sb.append("][workstation: ");
        sb.append(this.f43997c);
        sb.append("]");
        return sb.toString();
    }

    public C15125h(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.f43995a = new C15126i(str4, str);
            this.f43996b = str2;
            if (str3 != null) {
                this.f43997c = str3.toUpperCase(Locale.ENGLISH);
            } else {
                this.f43997c = null;
            }
        } else {
            throw new IllegalArgumentException("User name may not be null");
        }
    }
}
