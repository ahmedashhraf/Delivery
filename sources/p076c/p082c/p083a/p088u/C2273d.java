package p076c.p082c.p083a.p088u;

import java.util.Arrays;
import java.util.Collection;
import p076c.p082c.p083a.p088u.p090i.C2322l;

/* renamed from: c.c.a.u.d */
/* compiled from: MultiTransformation */
public class C2273d<T> implements C2276g<T> {

    /* renamed from: a */
    private final Collection<? extends C2276g<T>> f9090a;

    /* renamed from: b */
    private String f9091b;

    @SafeVarargs
    public C2273d(C2276g<T>... gVarArr) {
        if (gVarArr.length >= 1) {
            this.f9090a = Arrays.asList(gVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    /* renamed from: a */
    public C2322l<T> mo9639a(C2322l<T> lVar, int i, int i2) {
        C2322l<T> lVar2 = lVar;
        for (C2276g a : this.f9090a) {
            C2322l<T> a2 = a.mo9639a(lVar2, i, i2);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(a2)) {
                lVar2.mo9702a();
            }
            lVar2 = a2;
        }
        return lVar2;
    }

    public String getId() {
        if (this.f9091b == null) {
            StringBuilder sb = new StringBuilder();
            for (C2276g id : this.f9090a) {
                sb.append(id.getId());
            }
            this.f9091b = sb.toString();
        }
        return this.f9091b;
    }

    public C2273d(Collection<? extends C2276g<T>> collection) {
        if (collection.size() >= 1) {
            this.f9090a = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
