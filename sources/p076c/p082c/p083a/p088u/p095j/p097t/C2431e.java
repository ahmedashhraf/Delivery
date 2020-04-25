package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p095j.C2392b;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;

/* renamed from: c.c.a.u.j.t.e */
/* compiled from: StreamFileLoader */
public class C2431e extends C2392b<InputStream> implements C2433f<File> {

    /* renamed from: c.c.a.u.j.t.e$a */
    /* compiled from: StreamFileLoader */
    public static class C2432a implements C2410m<File, InputStream> {
        /* renamed from: a */
        public C2409l<File, InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2431e(cVar.mo9813a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2431e(Context context) {
        this(C2232l.m11646b(Uri.class, context));
    }

    public C2431e(C2409l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
