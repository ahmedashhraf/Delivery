package androidx.core.p033k;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;

/* renamed from: androidx.core.k.f */
/* compiled from: Pair */
public class C0938f<F, S> {
    @C0195i0

    /* renamed from: a */
    public final F f4243a;
    @C0195i0

    /* renamed from: b */
    public final S f4244b;

    public C0938f(@C0195i0 F f, @C0195i0 S s) {
        this.f4243a = f;
        this.f4244b = s;
    }

    @C0193h0
    /* renamed from: a */
    public static <A, B> C0938f<A, B> m5329a(@C0195i0 A a, @C0195i0 B b) {
        return new C0938f<>(a, b);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0938f)) {
            return false;
        }
        C0938f fVar = (C0938f) obj;
        if (C0937e.m5328a(fVar.f4243a, this.f4243a) && C0937e.m5328a(fVar.f4244b, this.f4244b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        F f = this.f4243a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f4244b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f4243a));
        sb.append(C3868i.f12248b);
        sb.append(String.valueOf(this.f4244b));
        sb.append("}");
        return sb.toString();
    }
}
