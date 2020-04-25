package p076c.p082c.p083a.p088u.p090i.p092o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p076c.p082c.p083a.p085r.C2254a;
import p076c.p082c.p083a.p085r.C2254a.C2256b;
import p076c.p082c.p083a.p085r.C2254a.C2258d;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2351b;

/* renamed from: c.c.a.u.i.o.e */
/* compiled from: DiskLruCacheWrapper */
public class C2361e implements C2349a {

    /* renamed from: f */
    private static final String f9281f = "DiskLruCacheWrapper";

    /* renamed from: g */
    private static final int f9282g = 1;

    /* renamed from: h */
    private static final int f9283h = 1;

    /* renamed from: i */
    private static C2361e f9284i;

    /* renamed from: a */
    private final C2353c f9285a = new C2353c();

    /* renamed from: b */
    private final C2373l f9286b;

    /* renamed from: c */
    private final File f9287c;

    /* renamed from: d */
    private final int f9288d;

    /* renamed from: e */
    private C2254a f9289e;

    protected C2361e(File file, int i) {
        this.f9287c = file;
        this.f9288d = i;
        this.f9286b = new C2373l();
    }

    /* renamed from: a */
    public static synchronized C2349a m12149a(File file, int i) {
        C2361e eVar;
        synchronized (C2361e.class) {
            if (f9284i == null) {
                f9284i = new C2361e(file, i);
            }
            eVar = f9284i;
        }
        return eVar;
    }

    /* renamed from: b */
    private synchronized void m12150b() {
        this.f9289e = null;
    }

    public synchronized void clear() {
        try {
            m12148a().mo9552a();
            m12150b();
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable(f9281f, 5);
        }
    }

    /* renamed from: b */
    public void mo9761b(C2272c cVar) {
        try {
            m12148a().mo9558d(this.f9286b.mo9782a(cVar));
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable(f9281f, 5);
        }
    }

    /* renamed from: a */
    private synchronized C2254a m12148a() throws IOException {
        if (this.f9289e == null) {
            this.f9289e = C2254a.m11759a(this.f9287c, 1, 1, (long) this.f9288d);
        }
        return this.f9289e;
    }

    /* renamed from: a */
    public File mo9759a(C2272c cVar) {
        try {
            C2258d c = m12148a().mo9555c(this.f9286b.mo9782a(cVar));
            if (c != null) {
                return c.mo9574a(0);
            }
            return null;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable(f9281f, 5);
            return null;
        }
    }

    /* renamed from: a */
    public void mo9760a(C2272c cVar, C2351b bVar) {
        C2256b b;
        String a = this.f9286b.mo9782a(cVar);
        this.f9285a.mo9763a(cVar);
        try {
            b = m12148a().mo9554b(a);
            if (b != null) {
                if (bVar.mo9676a(b.mo9564a(0))) {
                    b.mo9569c();
                }
                b.mo9568b();
            }
        } catch (IOException unused) {
            try {
                boolean isLoggable = Log.isLoggable(f9281f, 5);
            } catch (Throwable th) {
                this.f9285a.mo9764b(cVar);
                throw th;
            }
        } catch (Throwable th2) {
            b.mo9568b();
            throw th2;
        }
        this.f9285a.mo9764b(cVar);
    }
}
