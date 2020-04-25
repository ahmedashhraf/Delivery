package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import java.io.InputStream;
import java.net.URL;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2395d;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2415r;

/* renamed from: c.c.a.u.j.t.j */
/* compiled from: StreamUrlLoader */
public class C2440j extends C2415r<InputStream> {

    /* renamed from: c.c.a.u.j.t.j$a */
    /* compiled from: StreamUrlLoader */
    public static class C2441a implements C2410m<URL, InputStream> {
        /* renamed from: a */
        public C2409l<URL, InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2440j(cVar.mo9813a(C2395d.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2440j(C2409l<C2395d, InputStream> lVar) {
        super(lVar);
    }
}
