package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p089h.C2295j;
import p076c.p082c.p083a.p088u.p089h.C2296k;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2395d;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2414q;

/* renamed from: c.c.a.u.j.t.i */
/* compiled from: StreamUriLoader */
public class C2438i extends C2414q<InputStream> implements C2433f<Uri> {

    /* renamed from: c.c.a.u.j.t.i$a */
    /* compiled from: StreamUriLoader */
    public static class C2439a implements C2410m<Uri, InputStream> {
        /* renamed from: a */
        public C2409l<Uri, InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2438i(context, cVar.mo9813a(C2395d.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2438i(Context context) {
        this(context, C2232l.m11646b(C2395d.class, context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2279c<InputStream> mo9852a(Context context, Uri uri) {
        return new C2296k(context, uri);
    }

    public C2438i(Context context, C2409l<C2395d, InputStream> lVar) {
        super(context, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2279c<InputStream> mo9853a(Context context, String str) {
        return new C2295j(context.getApplicationContext().getAssets(), str);
    }
}
