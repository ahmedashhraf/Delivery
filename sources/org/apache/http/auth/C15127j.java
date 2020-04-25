package org.apache.http.auth;

import java.security.Principal;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15458f;

@C6144b
/* renamed from: org.apache.http.auth.j */
/* compiled from: UsernamePasswordCredentials */
public class C15127j implements C15124g {

    /* renamed from: a */
    private final C15123f f44001a;

    /* renamed from: b */
    private final String f44002b;

    public C15127j(String str) {
        if (str != null) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                this.f44001a = new C15123f(str.substring(0, indexOf));
                this.f44002b = str.substring(indexOf + 1);
                return;
            }
            this.f44001a = new C15123f(str);
            this.f44002b = null;
            return;
        }
        throw new IllegalArgumentException("Username:password string may not be null");
    }

    /* renamed from: a */
    public Principal mo46891a() {
        return this.f44001a;
    }

    /* renamed from: b */
    public String mo46892b() {
        return this.f44002b;
    }

    /* renamed from: c */
    public String mo46905c() {
        return this.f44001a.getName();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15127j) {
            if (C15458f.m68507a((Object) this.f44001a, (Object) ((C15127j) obj).f44001a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f44001a.hashCode();
    }

    public String toString() {
        return this.f44001a.toString();
    }

    public C15127j(String str, String str2) {
        if (str != null) {
            this.f44001a = new C15123f(str);
            this.f44002b = str2;
            return;
        }
        throw new IllegalArgumentException("Username may not be null");
    }
}
