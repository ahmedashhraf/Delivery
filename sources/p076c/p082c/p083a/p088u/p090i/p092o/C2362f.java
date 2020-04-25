package p076c.p082c.p083a.p088u.p090i.p092o;

import android.content.Context;
import java.io.File;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2350a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2357d.C2360c;

/* renamed from: c.c.a.u.i.o.f */
/* compiled from: ExternalCacheDiskCacheFactory */
public final class C2362f extends C2357d {

    /* renamed from: c.c.a.u.i.o.f$a */
    /* compiled from: ExternalCacheDiskCacheFactory */
    class C2363a implements C2360c {

        /* renamed from: a */
        final /* synthetic */ Context f9290a;

        /* renamed from: b */
        final /* synthetic */ String f9291b;

        C2363a(Context context, String str) {
            this.f9290a = context;
            this.f9291b = str;
        }

        /* renamed from: a */
        public File mo9767a() {
            File externalCacheDir = this.f9290a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            String str = this.f9291b;
            return str != null ? new File(externalCacheDir, str) : externalCacheDir;
        }
    }

    public C2362f(Context context) {
        this(context, C2350a.f9269b, C2350a.f9268a);
    }

    public C2362f(Context context, int i) {
        this(context, C2350a.f9269b, i);
    }

    public C2362f(Context context, String str, int i) {
        super((C2360c) new C2363a(context, str), i);
    }
}
