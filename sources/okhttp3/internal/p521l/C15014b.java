package okhttp3.internal.p521l;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.l.b */
/* compiled from: BasicTrustRootIndex */
public final class C15014b implements C15018f {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f43643a = new LinkedHashMap();

    public C15014b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f43643a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f43643a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo46627a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f43643a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15014b) || !((C15014b) obj).f43643a.equals(this.f43643a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f43643a.hashCode();
    }
}
