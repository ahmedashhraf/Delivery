package p076c.p082c.p083a.p088u.p090i.p092o;

import java.io.File;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.u.i.o.a */
/* compiled from: DiskCache */
public interface C2349a {

    /* renamed from: c.c.a.u.i.o.a$a */
    /* compiled from: DiskCache */
    public interface C2350a {

        /* renamed from: a */
        public static final int f9268a = 262144000;

        /* renamed from: b */
        public static final String f9269b = "image_manager_disk_cache";

        C2349a build();
    }

    /* renamed from: c.c.a.u.i.o.a$b */
    /* compiled from: DiskCache */
    public interface C2351b {
        /* renamed from: a */
        boolean mo9676a(File file);
    }

    /* renamed from: a */
    File mo9759a(C2272c cVar);

    /* renamed from: a */
    void mo9760a(C2272c cVar, C2351b bVar);

    /* renamed from: b */
    void mo9761b(C2272c cVar);

    void clear();
}
