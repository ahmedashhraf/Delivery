package p076c.p082c.p083a.p088u.p089h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p076c.p082c.p083a.C2244p;

/* renamed from: c.c.a.u.h.b */
/* compiled from: ByteArrayFetcher */
public class C2278b implements C2279c<InputStream> {

    /* renamed from: a */
    private final byte[] f9096a;

    /* renamed from: b */
    private final String f9097b;

    public C2278b(byte[] bArr, String str) {
        this.f9096a = bArr;
        this.f9097b = str;
    }

    /* renamed from: a */
    public void mo9645a() {
    }

    public void cancel() {
    }

    public String getId() {
        return this.f9097b;
    }

    /* renamed from: a */
    public InputStream m11914a(C2244p pVar) {
        return new ByteArrayInputStream(this.f9096a);
    }
}
