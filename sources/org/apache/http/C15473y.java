package org.apache.http;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.Serializable;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.y */
/* compiled from: ProtocolVersion */
public class C15473y implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;

    /* renamed from: N */
    protected final int f44690N;

    /* renamed from: a */
    protected final String f44691a;

    /* renamed from: b */
    protected final int f44692b;

    public C15473y(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Protocol name must not be null.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Protocol major version number must not be negative.");
        } else if (i2 >= 0) {
            this.f44691a = str;
            this.f44692b = i;
            this.f44690N = i2;
        } else {
            throw new IllegalArgumentException("Protocol minor version number may not be negative");
        }
    }

    /* renamed from: a */
    public C15473y mo47790a(int i, int i2) {
        if (i == this.f44692b && i2 == this.f44690N) {
            return this;
        }
        return new C15473y(this.f44691a, i, i2);
    }

    /* renamed from: b */
    public final boolean mo47792b(C15473y yVar) {
        return mo47793c(yVar) && mo47791a(yVar) >= 0;
    }

    /* renamed from: c */
    public boolean mo47793c(C15473y yVar) {
        return yVar != null && this.f44691a.equals(yVar.f44691a);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final int mo47795d() {
        return this.f44692b;
    }

    /* renamed from: e */
    public final int mo47797e() {
        return this.f44690N;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15473y)) {
            return false;
        }
        C15473y yVar = (C15473y) obj;
        if (!(this.f44691a.equals(yVar.f44691a) && this.f44692b == yVar.f44692b && this.f44690N == yVar.f44690N)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public final String mo47799f() {
        return this.f44691a;
    }

    public final int hashCode() {
        return (this.f44691a.hashCode() ^ (this.f44692b * 100000)) ^ this.f44690N;
    }

    public String toString() {
        C15454b bVar = new C15454b(16);
        bVar.mo47757a(this.f44691a);
        bVar.mo47755a('/');
        bVar.mo47757a(Integer.toString(this.f44692b));
        bVar.mo47755a('.');
        bVar.mo47757a(Integer.toString(this.f44690N));
        return bVar.toString();
    }

    /* renamed from: d */
    public final boolean mo47796d(C15473y yVar) {
        return mo47793c(yVar) && mo47791a(yVar) <= 0;
    }

    /* renamed from: a */
    public int mo47791a(C15473y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        } else if (this.f44691a.equals(yVar.f44691a)) {
            int d = mo47795d() - yVar.mo47795d();
            return d == 0 ? mo47797e() - yVar.mo47797e() : d;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Versions for different protocols cannot be compared. ");
            stringBuffer.append(this);
            stringBuffer.append(C3868i.f12248b);
            stringBuffer.append(yVar);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }
}
