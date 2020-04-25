package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p089h.C2288i;
import p076c.p082c.p083a.p088u.p095j.C2409l;

/* renamed from: c.c.a.u.j.t.c */
/* compiled from: MediaStoreStreamLoader */
public class C2428c implements C2409l<Uri, InputStream> {

    /* renamed from: a */
    private final Context f9403a;

    /* renamed from: b */
    private final C2409l<Uri, InputStream> f9404b;

    public C2428c(Context context, C2409l<Uri, InputStream> lVar) {
        this.f9403a = context;
        this.f9404b = lVar;
    }

    /* renamed from: a */
    public C2279c<InputStream> mo9812a(Uri uri, int i, int i2) {
        C2288i iVar = new C2288i(this.f9403a, uri, this.f9404b.mo9812a(uri, i, i2), i, i2);
        return iVar;
    }
}
