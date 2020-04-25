package org.apache.http;

import java.io.Serializable;
import java.util.Locale;
import org.apache.http.p550k0.C15454b;
import org.apache.http.p550k0.C15458f;

/* renamed from: org.apache.http.l */
/* compiled from: HttpHost */
public final class C15460l implements Cloneable, Serializable {

    /* renamed from: P */
    public static final String f44633P = "http";
    private static final long serialVersionUID = -7529410654042457626L;

    /* renamed from: N */
    protected final int f44634N;

    /* renamed from: O */
    protected final String f44635O;

    /* renamed from: a */
    protected final String f44636a;

    /* renamed from: b */
    protected final String f44637b;

    public C15460l(String str, int i, String str2) {
        if (str != null) {
            this.f44636a = str;
            this.f44637b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f44635O = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f44635O = "http";
            }
            this.f44634N = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public String mo47782d() {
        return this.f44636a;
    }

    /* renamed from: e */
    public int mo47783e() {
        return this.f44634N;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15460l) {
            C15460l lVar = (C15460l) obj;
            if (this.f44637b.equals(lVar.f44637b) && this.f44634N == lVar.f44634N && this.f44635O.equals(lVar.f44635O)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    public String mo47785f() {
        return this.f44635O;
    }

    /* renamed from: g */
    public String mo47786g() {
        C15454b bVar = new C15454b(32);
        bVar.mo47757a(this.f44636a);
        if (this.f44634N != -1) {
            bVar.mo47755a(':');
            bVar.mo47757a(Integer.toString(this.f44634N));
        }
        return bVar.toString();
    }

    /* renamed from: h */
    public String mo47787h() {
        C15454b bVar = new C15454b(32);
        bVar.mo47757a(this.f44635O);
        bVar.mo47757a("://");
        bVar.mo47757a(this.f44636a);
        if (this.f44634N != -1) {
            bVar.mo47755a(':');
            bVar.mo47757a(Integer.toString(this.f44634N));
        }
        return bVar.toString();
    }

    public int hashCode() {
        return C15458f.m68505a(C15458f.m68504a(C15458f.m68505a(17, (Object) this.f44637b), this.f44634N), (Object) this.f44635O);
    }

    public String toString() {
        return mo47787h();
    }

    public C15460l(String str, int i) {
        this(str, i, null);
    }

    public C15460l(String str) {
        this(str, -1, null);
    }

    public C15460l(C15460l lVar) {
        this(lVar.f44636a, lVar.f44634N, lVar.f44635O);
    }
}
