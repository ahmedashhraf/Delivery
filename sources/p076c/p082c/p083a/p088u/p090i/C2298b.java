package p076c.p082c.p083a.p088u.p090i;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p082c.p083a.C2244p;
import p076c.p082c.p083a.p084a0.C2212e;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2351b;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: c.c.a.u.i.b */
/* compiled from: DecodeJob */
class C2298b<A, T, Z> {

    /* renamed from: m */
    private static final String f9136m = "DecodeJob";

    /* renamed from: n */
    private static final C2300b f9137n = new C2300b();

    /* renamed from: a */
    private final C2314g f9138a;

    /* renamed from: b */
    private final int f9139b;

    /* renamed from: c */
    private final int f9140c;

    /* renamed from: d */
    private final C2279c<A> f9141d;

    /* renamed from: e */
    private final C2517b<A, T> f9142e;

    /* renamed from: f */
    private final C2276g<T> f9143f;

    /* renamed from: g */
    private final C2491f<T, Z> f9144g;

    /* renamed from: h */
    private final C2299a f9145h;

    /* renamed from: i */
    private final C2302c f9146i;

    /* renamed from: j */
    private final C2244p f9147j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C2300b f9148k;

    /* renamed from: l */
    private volatile boolean f9149l;

    /* renamed from: c.c.a.u.i.b$a */
    /* compiled from: DecodeJob */
    interface C2299a {
        /* renamed from: a */
        C2349a mo9674a();
    }

    /* renamed from: c.c.a.u.i.b$b */
    /* compiled from: DecodeJob */
    static class C2300b {
        C2300b() {
        }

        /* renamed from: a */
        public OutputStream mo9675a(File file) throws FileNotFoundException {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* renamed from: c.c.a.u.i.b$c */
    /* compiled from: DecodeJob */
    class C2301c<DataType> implements C2351b {

        /* renamed from: a */
        private final C2271b<DataType> f9150a;

        /* renamed from: b */
        private final DataType f9151b;

        public C2301c(C2271b<DataType> bVar, DataType datatype) {
            this.f9150a = bVar;
            this.f9151b = datatype;
        }

        /* renamed from: a */
        public boolean mo9676a(File file) {
            OutputStream outputStream = null;
            try {
                outputStream = C2298b.this.f9148k.mo9675a(file);
                boolean a = this.f9150a.mo9634a(this.f9151b, outputStream);
                if (outputStream == null) {
                    return a;
                }
                try {
                    outputStream.close();
                    return a;
                } catch (IOException unused) {
                    return a;
                }
            } catch (FileNotFoundException unused2) {
                boolean isLoggable = Log.isLoggable(C2298b.f9136m, 3);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } finally {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }
    }

    public C2298b(C2314g gVar, int i, int i2, C2279c<A> cVar, C2517b<A, T> bVar, C2276g<T> gVar2, C2491f<T, Z> fVar, C2299a aVar, C2302c cVar2, C2244p pVar) {
        this(gVar, i, i2, cVar, bVar, gVar2, fVar, aVar, cVar2, pVar, f9137n);
    }

    /* renamed from: e */
    private C2322l<T> m11973e() throws Exception {
        try {
            long a = C2212e.m11320a();
            Object a2 = this.f9141d.mo9644a(this.f9147j);
            if (Log.isLoggable(f9136m, 2)) {
                m11968a("Fetched data", a);
            }
            if (this.f9149l) {
                return null;
            }
            C2322l<T> b = m11970b((A) a2);
            this.f9141d.mo9645a();
            return b;
        } finally {
            this.f9141d.mo9645a();
        }
    }

    /* renamed from: b */
    public C2322l<Z> mo9671b() throws Exception {
        return m11971c(m11973e());
    }

    /* renamed from: c */
    public C2322l<Z> mo9672c() throws Exception {
        if (!this.f9146i.mo9677d()) {
            return null;
        }
        long a = C2212e.m11320a();
        C2322l a2 = m11965a((C2272c) this.f9138a);
        String str = f9136m;
        if (Log.isLoggable(str, 2)) {
            m11968a("Decoded transformed from cache", a);
        }
        long a3 = C2212e.m11320a();
        C2322l<Z> a4 = m11966a(a2);
        if (Log.isLoggable(str, 2)) {
            m11968a("Transcoded transformed from cache", a3);
        }
        return a4;
    }

    /* renamed from: d */
    public C2322l<Z> mo9673d() throws Exception {
        if (!this.f9146i.mo9678e()) {
            return null;
        }
        long a = C2212e.m11320a();
        C2322l a2 = m11965a(this.f9138a.mo9699a());
        if (Log.isLoggable(f9136m, 2)) {
            m11968a("Decoded source from cache", a);
        }
        return m11971c(a2);
    }

    C2298b(C2314g gVar, int i, int i2, C2279c<A> cVar, C2517b<A, T> bVar, C2276g<T> gVar2, C2491f<T, Z> fVar, C2299a aVar, C2302c cVar2, C2244p pVar, C2300b bVar2) {
        this.f9138a = gVar;
        this.f9139b = i;
        this.f9140c = i2;
        this.f9141d = cVar;
        this.f9142e = bVar;
        this.f9143f = gVar2;
        this.f9144g = fVar;
        this.f9145h = aVar;
        this.f9146i = cVar2;
        this.f9147j = pVar;
        this.f9148k = bVar2;
    }

    /* renamed from: a */
    public void mo9670a() {
        this.f9149l = true;
        this.f9141d.cancel();
    }

    /* renamed from: b */
    private C2322l<T> m11970b(A a) throws IOException {
        if (this.f9146i.mo9678e()) {
            return m11967a(a);
        }
        long a2 = C2212e.m11320a();
        C2322l<T> a3 = this.f9142e.mo9869e().mo9641a(a, this.f9139b, this.f9140c);
        if (!Log.isLoggable(f9136m, 2)) {
            return a3;
        }
        m11968a("Decoded from source", a2);
        return a3;
    }

    /* renamed from: a */
    private C2322l<T> m11967a(A a) throws IOException {
        long a2 = C2212e.m11320a();
        this.f9145h.mo9674a().mo9760a(this.f9138a.mo9699a(), new C2301c(this.f9142e.mo9867b(), a));
        String str = f9136m;
        if (Log.isLoggable(str, 2)) {
            m11968a("Wrote source to cache", a2);
        }
        long a3 = C2212e.m11320a();
        C2322l<T> a4 = m11965a(this.f9138a.mo9699a());
        if (Log.isLoggable(str, 2) && a4 != null) {
            m11968a("Decoded source from cache", a3);
        }
        return a4;
    }

    /* renamed from: d */
    private void m11972d(C2322l<T> lVar) {
        if (lVar != null && this.f9146i.mo9677d()) {
            long a = C2212e.m11320a();
            this.f9145h.mo9674a().mo9760a(this.f9138a, new C2301c(this.f9142e.mo9868d(), lVar));
            if (Log.isLoggable(f9136m, 2)) {
                m11968a("Wrote transformed from source to cache", a);
            }
        }
    }

    /* renamed from: b */
    private C2322l<T> m11969b(C2322l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        C2322l<T> a = this.f9143f.mo9639a(lVar, this.f9139b, this.f9140c);
        if (!lVar.equals(a)) {
            lVar.mo9702a();
        }
        return a;
    }

    /* renamed from: c */
    private C2322l<Z> m11971c(C2322l<T> lVar) {
        long a = C2212e.m11320a();
        C2322l b = m11969b(lVar);
        String str = f9136m;
        if (Log.isLoggable(str, 2)) {
            m11968a("Transformed resource from source", a);
        }
        m11972d(b);
        long a2 = C2212e.m11320a();
        C2322l<Z> a3 = m11966a(b);
        if (Log.isLoggable(str, 2)) {
            m11968a("Transcoded transformed from source", a2);
        }
        return a3;
    }

    /* renamed from: a */
    private C2322l<T> m11965a(C2272c cVar) throws IOException {
        File a = this.f9145h.mo9674a().mo9759a(cVar);
        if (a == null) {
            return null;
        }
        try {
            C2322l<T> a2 = this.f9142e.mo9870f().mo9641a(a, this.f9139b, this.f9140c);
            if (a2 == null) {
            }
            return a2;
        } finally {
            this.f9145h.mo9674a().mo9761b(cVar);
        }
    }

    /* renamed from: a */
    private C2322l<Z> m11966a(C2322l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        return this.f9144g.mo9926a(lVar);
    }

    /* renamed from: a */
    private void m11968a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2212e.m11319a(j));
        sb.append(", key: ");
        sb.append(this.f9138a);
        sb.toString();
    }
}
