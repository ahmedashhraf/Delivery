package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p089h.C2283g;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2395d;
import p076c.p082c.p083a.p088u.p095j.C2406k;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;

/* renamed from: c.c.a.u.j.t.b */
/* compiled from: HttpUrlGlideUrlLoader */
public class C2426b implements C2409l<C2395d, InputStream> {

    /* renamed from: a */
    private final C2406k<C2395d, C2395d> f9401a;

    /* renamed from: c.c.a.u.j.t.b$a */
    /* compiled from: HttpUrlGlideUrlLoader */
    public static class C2427a implements C2410m<C2395d, InputStream> {

        /* renamed from: a */
        private final C2406k<C2395d, C2395d> f9402a = new C2406k<>(500);

        /* renamed from: a */
        public C2409l<C2395d, InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2426b(this.f9402a);
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2426b() {
        this(null);
    }

    public C2426b(C2406k<C2395d, C2395d> kVar) {
        this.f9401a = kVar;
    }

    /* renamed from: a */
    public C2279c<InputStream> mo9812a(C2395d dVar, int i, int i2) {
        C2406k<C2395d, C2395d> kVar = this.f9401a;
        if (kVar != null) {
            C2395d dVar2 = (C2395d) kVar.mo9841a(dVar, 0, 0);
            if (dVar2 == null) {
                this.f9401a.mo9842a(dVar, 0, 0, dVar);
            } else {
                dVar = dVar2;
            }
        }
        return new C2283g(dVar);
    }
}
