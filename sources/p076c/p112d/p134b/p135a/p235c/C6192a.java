package p076c.p112d.p134b.p135a.p235c;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import p076c.p112d.p134b.p135a.p143g.C6384i0;

/* renamed from: c.d.b.a.c.a */
/* compiled from: GoogleUtils */
public final class C6192a {

    /* renamed from: a */
    public static final Integer f17430a = Integer.valueOf(1);

    /* renamed from: b */
    public static final Integer f17431b = Integer.valueOf(23);

    /* renamed from: c */
    public static final Integer f17432c = Integer.valueOf(0);

    /* renamed from: d */
    public static final String f17433d;

    /* renamed from: e */
    static KeyStore f17434e;

    static {
        String valueOf = String.valueOf(String.valueOf(f17430a));
        String valueOf2 = String.valueOf(String.valueOf(f17431b));
        String valueOf3 = String.valueOf(String.valueOf(f17432c));
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        String str = ".";
        sb.append(str);
        sb.append(valueOf2);
        sb.append(str);
        sb.append(valueOf3);
        f17433d = sb.toString().toString();
    }

    private C6192a() {
    }

    /* renamed from: a */
    public static synchronized KeyStore m28441a() throws IOException, GeneralSecurityException {
        KeyStore keyStore;
        Class<C6192a> cls = C6192a.class;
        synchronized (cls) {
            if (f17434e == null) {
                f17434e = C6384i0.m29683b();
                C6384i0.m29679a(f17434e, cls.getResourceAsStream("google.jks"), "notasecret");
            }
            keyStore = f17434e;
        }
        return keyStore;
    }
}
