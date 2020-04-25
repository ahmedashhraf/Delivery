package org.apache.http.p547h0;

import org.apache.http.C15236d;
import org.apache.http.C15472x;
import org.apache.http.p550k0.C15454b;
import org.apache.http.p550k0.C15458f;

/* renamed from: org.apache.http.h0.c */
/* compiled from: BasicHeaderElement */
public class C15326c implements C15236d, Cloneable {

    /* renamed from: N */
    private final C15472x[] f44366N;

    /* renamed from: a */
    private final String f44367a;

    /* renamed from: b */
    private final String f44368b;

    public C15326c(String str, String str2, C15472x[] xVarArr) {
        if (str != null) {
            this.f44367a = str;
            this.f44368b = str2;
            if (xVarArr != null) {
                this.f44366N = xVarArr;
            } else {
                this.f44366N = new C15472x[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    /* renamed from: a */
    public C15472x mo47150a(int i) {
        return this.f44366N[i];
    }

    /* renamed from: b */
    public int mo47152b() {
        return this.f44366N.length;
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
        if (obj instanceof C15236d) {
            C15326c cVar = (C15326c) obj;
            if (this.f44367a.equals(cVar.f44367a) && C15458f.m68507a((Object) this.f44368b, (Object) cVar.f44368b) && C15458f.m68508a((Object[]) this.f44366N, (Object[]) cVar.f44366N)) {
                z = true;
            }
        }
        return z;
    }

    public String getName() {
        return this.f44367a;
    }

    public C15472x[] getParameters() {
        return (C15472x[]) this.f44366N.clone();
    }

    public String getValue() {
        return this.f44368b;
    }

    public int hashCode() {
        int a = C15458f.m68505a(C15458f.m68505a(17, (Object) this.f44367a), (Object) this.f44368b);
        int i = 0;
        while (true) {
            C15472x[] xVarArr = this.f44366N;
            if (i >= xVarArr.length) {
                return a;
            }
            a = C15458f.m68505a(a, (Object) xVarArr[i]);
            i++;
        }
    }

    public String toString() {
        C15454b bVar = new C15454b(64);
        bVar.mo47757a(this.f44367a);
        if (this.f44368b != null) {
            bVar.mo47757a("=");
            bVar.mo47757a(this.f44368b);
        }
        for (C15472x a : this.f44366N) {
            bVar.mo47757a("; ");
            bVar.mo47756a((Object) a);
        }
        return bVar.toString();
    }

    /* renamed from: a */
    public C15472x mo47151a(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                C15472x[] xVarArr = this.f44366N;
                if (i >= xVarArr.length) {
                    return null;
                }
                C15472x xVar = xVarArr[i];
                if (xVar.getName().equalsIgnoreCase(str)) {
                    return xVar;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    public C15326c(String str, String str2) {
        this(str, str2, null);
    }
}
