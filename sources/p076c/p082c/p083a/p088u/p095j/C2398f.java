package p076c.p082c.p083a.p088u.p095j;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.p089h.C2279c;

/* renamed from: c.c.a.u.j.f */
/* compiled from: ImageVideoModelLoader */
public class C2398f<A> implements C2409l<A, C2400g> {

    /* renamed from: c */
    private static final String f9362c = "IVML";

    /* renamed from: a */
    private final C2409l<A, InputStream> f9363a;

    /* renamed from: b */
    private final C2409l<A, ParcelFileDescriptor> f9364b;

    /* renamed from: c.c.a.u.j.f$a */
    /* compiled from: ImageVideoModelLoader */
    static class C2399a implements C2279c<C2400g> {

        /* renamed from: a */
        private final C2279c<InputStream> f9365a;

        /* renamed from: b */
        private final C2279c<ParcelFileDescriptor> f9366b;

        public C2399a(C2279c<InputStream> cVar, C2279c<ParcelFileDescriptor> cVar2) {
            this.f9365a = cVar;
            this.f9366b = cVar2;
        }

        public void cancel() {
            C2279c<InputStream> cVar = this.f9365a;
            if (cVar != null) {
                cVar.cancel();
            }
            C2279c<ParcelFileDescriptor> cVar2 = this.f9366b;
            if (cVar2 != null) {
                cVar2.cancel();
            }
        }

        public String getId() {
            C2279c<InputStream> cVar = this.f9365a;
            if (cVar != null) {
                return cVar.getId();
            }
            return this.f9366b.getId();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x001f A[SYNTHETIC, Splitter:B:11:0x001f] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p076c.p082c.p083a.p088u.p095j.C2400g m12240a(p076c.p082c.p083a.C2244p r6) throws java.lang.Exception {
            /*
                r5 = this;
                c.c.a.u.h.c<java.io.InputStream> r0 = r5.f9365a
                r1 = 2
                java.lang.String r2 = "IVML"
                r3 = 0
                if (r0 == 0) goto L_0x001a
                java.lang.Object r0 = r0.mo9644a(r6)     // Catch:{ Exception -> 0x000f }
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x000f }
                goto L_0x001b
            L_0x000f:
                r0 = move-exception
                boolean r4 = android.util.Log.isLoggable(r2, r1)
                c.c.a.u.h.c<android.os.ParcelFileDescriptor> r4 = r5.f9366b
                if (r4 == 0) goto L_0x0019
                goto L_0x001a
            L_0x0019:
                throw r0
            L_0x001a:
                r0 = r3
            L_0x001b:
                c.c.a.u.h.c<android.os.ParcelFileDescriptor> r4 = r5.f9366b
                if (r4 == 0) goto L_0x002f
                java.lang.Object r6 = r4.mo9644a(r6)     // Catch:{ Exception -> 0x0026 }
                android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6     // Catch:{ Exception -> 0x0026 }
                goto L_0x0030
            L_0x0026:
                r6 = move-exception
                boolean r1 = android.util.Log.isLoggable(r2, r1)
                if (r0 == 0) goto L_0x002e
                goto L_0x002f
            L_0x002e:
                throw r6
            L_0x002f:
                r6 = r3
            L_0x0030:
                c.c.a.u.j.g r1 = new c.c.a.u.j.g
                r1.<init>(r0, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p088u.p095j.C2398f.C2399a.m12240a(c.c.a.p):c.c.a.u.j.g");
        }

        /* renamed from: a */
        public void mo9645a() {
            C2279c<InputStream> cVar = this.f9365a;
            if (cVar != null) {
                cVar.mo9645a();
            }
            C2279c<ParcelFileDescriptor> cVar2 = this.f9366b;
            if (cVar2 != null) {
                cVar2.mo9645a();
            }
        }
    }

    public C2398f(C2409l<A, InputStream> lVar, C2409l<A, ParcelFileDescriptor> lVar2) {
        if (lVar == null && lVar2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f9363a = lVar;
        this.f9364b = lVar2;
    }

    /* renamed from: a */
    public C2279c<C2400g> mo9812a(A a, int i, int i2) {
        C2409l<A, InputStream> lVar = this.f9363a;
        C2279c a2 = lVar != null ? lVar.mo9812a(a, i, i2) : null;
        C2409l<A, ParcelFileDescriptor> lVar2 = this.f9364b;
        C2279c a3 = lVar2 != null ? lVar2.mo9812a(a, i, i2) : null;
        if (a2 == null && a3 == null) {
            return null;
        }
        return new C2399a(a2, a3);
    }
}
