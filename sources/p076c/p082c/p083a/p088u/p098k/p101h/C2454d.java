package p076c.p082c.p083a.p088u.p098k.p101h;

import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p095j.C2412o;
import p076c.p082c.p083a.p088u.p098k.C2444c;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: c.c.a.u.k.h.d */
/* compiled from: StreamFileDataLoadProvider */
public class C2454d implements C2517b<InputStream, File> {

    /* renamed from: N */
    private static final C2456b f9418N = new C2456b();

    /* renamed from: a */
    private final C2274e<File, File> f9419a = new C2450a();

    /* renamed from: b */
    private final C2271b<InputStream> f9420b = new C2412o();

    /* renamed from: c.c.a.u.k.h.d$b */
    /* compiled from: StreamFileDataLoadProvider */
    private static class C2456b implements C2274e<InputStream, File> {
        private C2456b() {
        }

        public String getId() {
            return "";
        }

        /* renamed from: a */
        public C2322l<File> mo9641a(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }
    }

    /* renamed from: b */
    public C2271b<InputStream> mo9867b() {
        return this.f9420b;
    }

    /* renamed from: d */
    public C2275f<File> mo9868d() {
        return C2444c.m12321a();
    }

    /* renamed from: e */
    public C2274e<InputStream, File> mo9869e() {
        return f9418N;
    }

    /* renamed from: f */
    public C2274e<File, File> mo9870f() {
        return this.f9419a;
    }
}
