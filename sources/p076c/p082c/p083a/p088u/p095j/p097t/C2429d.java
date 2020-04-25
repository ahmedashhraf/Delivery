package p076c.p082c.p083a.p088u.p095j.p097t;

import android.content.Context;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.p089h.C2278b;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;

/* renamed from: c.c.a.u.j.t.d */
/* compiled from: StreamByteArrayLoader */
public class C2429d implements C2433f<byte[]> {

    /* renamed from: a */
    private final String f9405a;

    /* renamed from: c.c.a.u.j.t.d$a */
    /* compiled from: StreamByteArrayLoader */
    public static class C2430a implements C2410m<byte[], InputStream> {
        /* renamed from: a */
        public C2409l<byte[], InputStream> mo9847a(Context context, C2393c cVar) {
            return new C2429d();
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2429d() {
        this("");
    }

    @Deprecated
    public C2429d(String str) {
        this.f9405a = str;
    }

    /* renamed from: a */
    public C2279c<InputStream> mo9812a(byte[] bArr, int i, int i2) {
        return new C2278b(bArr, this.f9405a);
    }
}
