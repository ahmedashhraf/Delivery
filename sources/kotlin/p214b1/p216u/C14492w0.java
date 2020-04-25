package kotlin.p214b1.p216u;

import java.util.Collection;
import kotlin.C6096e0;
import kotlin.p214b1.C14414m;
import kotlin.p505f1.C14538b;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
/* renamed from: kotlin.b1.u.w0 */
/* compiled from: PackageReference.kt */
public final class C14492w0 implements C14481r {
    @C6003d

    /* renamed from: a */
    private final Class<?> f42625a;

    /* renamed from: b */
    private final String f42626b;

    public C14492w0(@C6003d Class<?> cls, @C6003d String str) {
        C14445h0.m62478f(cls, "jClass");
        C14445h0.m62478f(str, "moduleName");
        this.f42625a = cls;
        this.f42626b = str;
    }

    @C6003d
    /* renamed from: b */
    public Collection<C14538b<?>> mo45628b() {
        throw new C14414m();
    }

    public boolean equals(@C6004e Object obj) {
        return (obj instanceof C14492w0) && C14445h0.m62463a((Object) mo45626f(), (Object) ((C14492w0) obj).mo45626f());
    }

    @C6003d
    /* renamed from: f */
    public Class<?> mo45626f() {
        return this.f42625a;
    }

    public int hashCode() {
        return mo45626f().hashCode();
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo45626f().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
