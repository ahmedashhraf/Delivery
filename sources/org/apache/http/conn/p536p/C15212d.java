package org.apache.http.conn.p536p;

import java.util.Locale;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15458f;

@C6144b
/* renamed from: org.apache.http.conn.p.d */
/* compiled from: Scheme */
public final class C15212d {

    /* renamed from: a */
    private final String f44114a;

    /* renamed from: b */
    private final C15214f f44115b;

    /* renamed from: c */
    private final int f44116c;

    /* renamed from: d */
    private final boolean f44117d;

    /* renamed from: e */
    private String f44118e;

    public C15212d(String str, C15214f fVar, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("Socket factory may not be null");
        } else if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder();
            sb.append("Port is invalid: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.f44114a = str.toLowerCase(Locale.ENGLISH);
            this.f44115b = fVar;
            this.f44116c = i;
            this.f44117d = fVar instanceof C15210b;
        }
    }

    /* renamed from: a */
    public final int mo47074a() {
        return this.f44116c;
    }

    /* renamed from: b */
    public final String mo47076b() {
        return this.f44114a;
    }

    /* renamed from: c */
    public final C15214f mo47077c() {
        return this.f44115b;
    }

    /* renamed from: d */
    public final boolean mo47078d() {
        return this.f44117d;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15212d)) {
            return false;
        }
        C15212d dVar = (C15212d) obj;
        if (this.f44114a.equals(dVar.f44114a) && this.f44116c == dVar.f44116c && this.f44117d == dVar.f44117d && this.f44115b.equals(dVar.f44115b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C15458f.m68505a(C15458f.m68506a(C15458f.m68505a(C15458f.m68504a(17, this.f44116c), (Object) this.f44114a), this.f44117d), (Object) this.f44115b);
    }

    public final String toString() {
        if (this.f44118e == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f44114a);
            sb.append(':');
            sb.append(Integer.toString(this.f44116c));
            this.f44118e = sb.toString();
        }
        return this.f44118e;
    }

    /* renamed from: a */
    public final int mo47075a(int i) {
        return i <= 0 ? this.f44116c : i;
    }
}
