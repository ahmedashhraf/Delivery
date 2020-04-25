package p076c.p082c.p083a.p088u.p090i;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.u.i.k */
/* compiled from: OriginalKey */
class C2321k implements C2272c {

    /* renamed from: b */
    private final String f9218b;

    /* renamed from: c */
    private final C2272c f9219c;

    public C2321k(String str, C2272c cVar) {
        this.f9218b = str;
        this.f9219c = cVar;
    }

    /* renamed from: a */
    public void mo9636a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(this.f9218b.getBytes("UTF-8"));
        this.f9219c.mo9636a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2321k.class != obj.getClass()) {
            return false;
        }
        C2321k kVar = (C2321k) obj;
        return this.f9218b.equals(kVar.f9218b) && this.f9219c.equals(kVar.f9219c);
    }

    public int hashCode() {
        return (this.f9218b.hashCode() * 31) + this.f9219c.hashCode();
    }
}
