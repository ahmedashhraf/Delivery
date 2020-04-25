package org.apache.http.p547h0;

import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.ParseException;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.b */
/* compiled from: BasicHeader */
public class C15325b implements C15133c, Cloneable {

    /* renamed from: a */
    private final String f44364a;

    /* renamed from: b */
    private final String f44365b;

    public C15325b(String str, String str2) {
        if (str != null) {
            this.f44364a = str;
            this.f44365b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    /* renamed from: b */
    public C15236d[] mo46915b() throws ParseException {
        String str = this.f44365b;
        return str != null ? C15330g.m67860a(str, (C15344u) null) : new C15236d[0];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return this.f44364a;
    }

    public String getValue() {
        return this.f44365b;
    }

    public String toString() {
        return C15334k.f44392a.mo47474a((C15454b) null, (C15133c) this).toString();
    }
}
