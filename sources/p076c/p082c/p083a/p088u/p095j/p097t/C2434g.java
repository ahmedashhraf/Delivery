package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2411n;

/* renamed from: c.c.a.u.j.t.g */
/* compiled from: StreamResourceLoader */
public class C2434g extends C2411n<InputStream> implements C2433f<Integer> {

    /* renamed from: c.c.a.u.j.t.g$a */
    /* compiled from: StreamResourceLoader */
    public static class C2435a implements C2410m<Integer, InputStream> {
        /* renamed from: a */
        public C2409l<Integer, InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2434g(context, cVar.mo9813a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2434g(Context context) {
        this(context, C2232l.m11646b(Uri.class, context));
    }

    public C2434g(Context context, C2409l<Uri, InputStream> lVar) {
        super(context, lVar);
    }
}
