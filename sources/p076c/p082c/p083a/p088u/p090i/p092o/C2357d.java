package p076c.p082c.p083a.p088u.p090i.p092o;

import java.io.File;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2350a;

/* renamed from: c.c.a.u.i.o.d */
/* compiled from: DiskLruCacheFactory */
public class C2357d implements C2350a {

    /* renamed from: c */
    private final int f9276c;

    /* renamed from: d */
    private final C2360c f9277d;

    /* renamed from: c.c.a.u.i.o.d$a */
    /* compiled from: DiskLruCacheFactory */
    class C2358a implements C2360c {

        /* renamed from: a */
        final /* synthetic */ String f9278a;

        C2358a(String str) {
            this.f9278a = str;
        }

        /* renamed from: a */
        public File mo9767a() {
            return new File(this.f9278a);
        }
    }

    /* renamed from: c.c.a.u.i.o.d$b */
    /* compiled from: DiskLruCacheFactory */
    class C2359b implements C2360c {

        /* renamed from: a */
        final /* synthetic */ String f9279a;

        /* renamed from: b */
        final /* synthetic */ String f9280b;

        C2359b(String str, String str2) {
            this.f9279a = str;
            this.f9280b = str2;
        }

        /* renamed from: a */
        public File mo9767a() {
            return new File(this.f9279a, this.f9280b);
        }
    }

    /* renamed from: c.c.a.u.i.o.d$c */
    /* compiled from: DiskLruCacheFactory */
    public interface C2360c {
        /* renamed from: a */
        File mo9767a();
    }

    public C2357d(String str, int i) {
        this((C2360c) new C2358a(str), i);
    }

    public C2349a build() {
        File a = this.f9277d.mo9767a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C2361e.m12149a(a, this.f9276c);
        }
        return null;
    }

    public C2357d(String str, String str2, int i) {
        this((C2360c) new C2359b(str, str2), i);
    }

    public C2357d(C2360c cVar, int i) {
        this.f9276c = i;
        this.f9277d = cVar;
    }
}
