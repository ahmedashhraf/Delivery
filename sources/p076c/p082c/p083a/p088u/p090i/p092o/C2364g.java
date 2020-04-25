package p076c.p082c.p083a.p088u.p090i.p092o;

import android.content.Context;
import java.io.File;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2350a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2357d.C2360c;

/* renamed from: c.c.a.u.i.o.g */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C2364g extends C2357d {

    /* renamed from: c.c.a.u.i.o.g$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C2365a implements C2360c {

        /* renamed from: a */
        final /* synthetic */ Context f9292a;

        /* renamed from: b */
        final /* synthetic */ String f9293b;

        C2365a(Context context, String str) {
            this.f9292a = context;
            this.f9293b = str;
        }

        /* renamed from: a */
        public File mo9767a() {
            File cacheDir = this.f9292a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            String str = this.f9293b;
            return str != null ? new File(cacheDir, str) : cacheDir;
        }
    }

    public C2364g(Context context) {
        this(context, C2350a.f9269b, C2350a.f9268a);
    }

    public C2364g(Context context, int i) {
        this(context, C2350a.f9269b, i);
    }

    public C2364g(Context context, String str, int i) {
        super((C2360c) new C2365a(context, str), i);
    }
}
