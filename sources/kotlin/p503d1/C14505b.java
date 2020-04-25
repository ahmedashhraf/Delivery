package kotlin.p503d1;

import kotlin.p214b1.p216u.C14445h0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.d1.b */
/* compiled from: Delegates.kt */
final class C14505b<T> implements C14508e<Object, T> {

    /* renamed from: a */
    private T f42659a;

    @C6003d
    /* renamed from: a */
    public T mo45679a(@C6004e Object obj, @C6003d C14557l<?> lVar) {
        C14445h0.m62478f(lVar, "property");
        T t = this.f42659a;
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Property ");
        sb.append(lVar.getName());
        sb.append(" should be initialized before get.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo45680a(@C6004e Object obj, @C6003d C14557l<?> lVar, @C6003d T t) {
        C14445h0.m62478f(lVar, "property");
        C14445h0.m62478f(t, "value");
        this.f42659a = t;
    }
}
