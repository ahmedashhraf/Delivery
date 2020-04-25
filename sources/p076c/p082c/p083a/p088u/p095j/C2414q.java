package p076c.p082c.p083a.p088u.p095j;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.util.UriUtil;
import p076c.p082c.p083a.p088u.p089h.C2279c;

/* renamed from: c.c.a.u.j.q */
/* compiled from: UriLoader */
public abstract class C2414q<T> implements C2409l<Uri, T> {

    /* renamed from: a */
    private final Context f9396a;

    /* renamed from: b */
    private final C2409l<C2395d, T> f9397b;

    public C2414q(Context context, C2409l<C2395d, T> lVar) {
        this.f9396a = context;
        this.f9397b = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2279c<T> mo9852a(Context context, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2279c<T> mo9853a(Context context, String str);

    /* renamed from: a */
    public final C2279c<T> mo9812a(Uri uri, int i, int i2) {
        String scheme = uri.getScheme();
        if (m12275a(scheme)) {
            if (!C2391a.m12217a(uri)) {
                return mo9852a(this.f9396a, uri);
            }
            return mo9853a(this.f9396a, C2391a.m12218b(uri));
        } else if (this.f9397b == null || (!"http".equals(scheme) && !UriUtil.HTTPS_SCHEME.equals(scheme))) {
            return null;
        } else {
            return this.f9397b.mo9812a(new C2395d(uri.toString()), i, i2);
        }
    }

    /* renamed from: a */
    private static boolean m12275a(String str) {
        return UriUtil.LOCAL_FILE_SCHEME.equals(str) || "content".equals(str) || UriUtil.QUALIFIED_RESOURCE_SCHEME.equals(str);
    }
}
