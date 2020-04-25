package p076c.p082c.p083a.p111z;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.z.c */
/* compiled from: MediaStoreSignature */
public class C2567c implements C2272c {

    /* renamed from: b */
    private final String f9662b;

    /* renamed from: c */
    private final long f9663c;

    /* renamed from: d */
    private final int f9664d;

    public C2567c(String str, long j, int i) {
        this.f9662b = str;
        this.f9663c = j;
        this.f9664d = i;
    }

    /* renamed from: a */
    public void mo9636a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f9663c).putInt(this.f9664d).array());
        messageDigest.update(this.f9662b.getBytes("UTF-8"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2567c.class != obj.getClass()) {
            return false;
        }
        C2567c cVar = (C2567c) obj;
        if (this.f9663c != cVar.f9663c || this.f9664d != cVar.f9664d) {
            return false;
        }
        String str = this.f9662b;
        String str2 = cVar.f9662b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f9662b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f9663c;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f9664d;
    }
}
