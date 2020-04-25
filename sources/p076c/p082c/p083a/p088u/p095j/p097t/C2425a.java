package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import android.text.TextUtils;
import java.io.InputStream;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p095j.C2395d;
import p076c.p082c.p083a.p088u.p095j.C2396e;
import p076c.p082c.p083a.p088u.p095j.C2406k;
import p076c.p082c.p083a.p088u.p095j.C2409l;

/* renamed from: c.c.a.u.j.t.a */
/* compiled from: BaseGlideUrlLoader */
public abstract class C2425a<T> implements C2433f<T> {

    /* renamed from: a */
    private final C2409l<C2395d, InputStream> f9399a;

    /* renamed from: b */
    private final C2406k<T, C2395d> f9400b;

    public C2425a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public C2279c<InputStream> mo9812a(T t, int i, int i2) {
        C2406k<T, C2395d> kVar = this.f9400b;
        Object obj = kVar != null ? (C2395d) kVar.mo9841a(t, i, i2) : null;
        if (obj == null) {
            String c = mo9857c(t, i, i2);
            if (TextUtils.isEmpty(c)) {
                return null;
            }
            C2395d dVar = new C2395d(c, mo9856b(t, i, i2));
            C2406k<T, C2395d> kVar2 = this.f9400b;
            if (kVar2 != null) {
                kVar2.mo9842a(t, i, i2, dVar);
            }
            obj = dVar;
        }
        return this.f9399a.mo9812a(obj, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2396e mo9856b(T t, int i, int i2) {
        return C2396e.f9361b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo9857c(T t, int i, int i2);

    public C2425a(Context context, C2406k<T, C2395d> kVar) {
        this(C2232l.m11638a(C2395d.class, InputStream.class, context), kVar);
    }

    public C2425a(C2409l<C2395d, InputStream> lVar) {
        this(lVar, null);
    }

    public C2425a(C2409l<C2395d, InputStream> lVar, C2406k<T, C2395d> kVar) {
        this.f9399a = lVar;
        this.f9400b = kVar;
    }
}
