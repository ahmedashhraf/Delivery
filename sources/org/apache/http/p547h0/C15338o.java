package org.apache.http.p547h0;

import org.apache.http.C15117a0;
import org.apache.http.C15473y;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.o */
/* compiled from: BasicRequestLine */
public class C15338o implements C15117a0, Cloneable {

    /* renamed from: N */
    private final String f44401N;

    /* renamed from: a */
    private final C15473y f44402a;

    /* renamed from: b */
    private final String f44403b;

    public C15338o(String str, String str2, C15473y yVar) {
        if (str == null) {
            throw new IllegalArgumentException("Method must not be null.");
        } else if (str2 == null) {
            throw new IllegalArgumentException("URI must not be null.");
        } else if (yVar != null) {
            this.f44403b = str;
            this.f44401N = str2;
            this.f44402a = yVar;
        } else {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
    }

    /* renamed from: b */
    public C15473y mo46854b() {
        return this.f44402a;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: e */
    public String mo46855e() {
        return this.f44403b;
    }

    /* renamed from: f */
    public String mo46856f() {
        return this.f44401N;
    }

    public String toString() {
        return C15334k.f44392a.mo47472a((C15454b) null, (C15117a0) this).toString();
    }
}
