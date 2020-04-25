package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2413p;

/* renamed from: c.c.a.u.j.t.h */
/* compiled from: StreamStringLoader */
public class C2436h extends C2413p<InputStream> implements C2433f<String> {

    /* renamed from: c.c.a.u.j.t.h$a */
    /* compiled from: StreamStringLoader */
    public static class C2437a implements C2410m<String, InputStream> {
        /* renamed from: a */
        public C2409l<String, InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2436h(cVar.mo9813a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2436h(Context context) {
        this(C2232l.m11646b(Uri.class, context));
    }

    public C2436h(C2409l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
