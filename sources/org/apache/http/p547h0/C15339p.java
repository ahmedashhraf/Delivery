package org.apache.http.p547h0;

import org.apache.http.C15132b0;
import org.apache.http.C15473y;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.p */
/* compiled from: BasicStatusLine */
public class C15339p implements C15132b0, Cloneable {

    /* renamed from: N */
    private final String f44404N;

    /* renamed from: a */
    private final C15473y f44405a;

    /* renamed from: b */
    private final int f44406b;

    public C15339p(C15473y yVar, int i, String str) {
        if (yVar == null) {
            throw new IllegalArgumentException("Protocol version may not be null.");
        } else if (i >= 0) {
            this.f44405a = yVar;
            this.f44406b = i;
            this.f44404N = str;
        } else {
            throw new IllegalArgumentException("Status code may not be negative.");
        }
    }

    /* renamed from: b */
    public C15473y mo46912b() {
        return this.f44405a;
    }

    /* renamed from: c */
    public int mo46913c() {
        return this.f44406b;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public String mo46914d() {
        return this.f44404N;
    }

    public String toString() {
        return C15334k.f44392a.mo47473a((C15454b) null, (C15132b0) this).toString();
    }
}
