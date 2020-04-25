package p076c.p082c.p083a.p111z;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.z.d */
/* compiled from: StringSignature */
public class C2568d implements C2272c {

    /* renamed from: b */
    private final String f9665b;

    public C2568d(String str) {
        if (str != null) {
            this.f9665b = str;
            return;
        }
        throw new NullPointerException("Signature cannot be null!");
    }

    /* renamed from: a */
    public void mo9636a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(this.f9665b.getBytes("UTF-8"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2568d.class != obj.getClass()) {
            return false;
        }
        return this.f9665b.equals(((C2568d) obj).f9665b);
    }

    public int hashCode() {
        return this.f9665b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringSignature{signature='");
        sb.append(this.f9665b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
