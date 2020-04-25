package p076c.p082c.p083a.p088u.p090i;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a;

/* renamed from: c.c.a.u.i.a */
/* compiled from: CacheLoader */
class C2297a {

    /* renamed from: b */
    private static final String f9134b = "CacheLoader";

    /* renamed from: a */
    private final C2349a f9135a;

    public C2297a(C2349a aVar) {
        this.f9135a = aVar;
    }

    /* renamed from: a */
    public <Z> C2322l<Z> mo9669a(C2272c cVar, C2274e<File, Z> eVar, int i, int i2) {
        String str = f9134b;
        File a = this.f9135a.mo9759a(cVar);
        C2322l<Z> lVar = null;
        if (a == null) {
            return null;
        }
        try {
            lVar = eVar.mo9641a(a, i, i2);
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable(str, 3);
        }
        if (lVar == null) {
            boolean isLoggable2 = Log.isLoggable(str, 3);
            this.f9135a.mo9761b(cVar);
        }
        return lVar;
    }
}
