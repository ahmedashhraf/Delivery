package okhttp3.internal.p519j;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.p521l.C15013a;
import okhttp3.internal.p521l.C15014b;
import okhttp3.internal.p521l.C15015c;
import okhttp3.internal.p521l.C15018f;
import org.jivesoftware.smack.util.TLSUtils;
import p201f.p202a.C5952h;
import p468g.C13799a0;
import p468g.C13876z;
import p470h.C13887c;

/* renamed from: okhttp3.internal.j.f */
/* compiled from: Platform */
public class C15011f {

    /* renamed from: a */
    private static final C15011f f43637a = m66570c();

    /* renamed from: b */
    public static final int f43638b = 4;

    /* renamed from: c */
    public static final int f43639c = 5;

    /* renamed from: d */
    private static final Logger f43640d = Logger.getLogger(C13876z.class.getName());

    /* renamed from: b */
    static byte[] m66569b(List<C13799a0> list) {
        C13887c cVar = new C13887c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13799a0 a0Var = (C13799a0) list.get(i);
            if (a0Var != C13799a0.HTTP_1_0) {
                cVar.writeByte(a0Var.toString().length());
                cVar.m59515a(a0Var.toString());
            }
        }
        return cVar.mo43903o();
    }

    /* renamed from: d */
    public static C15011f m66571d() {
        return f43637a;
    }

    /* renamed from: e */
    public static boolean m66572e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public String mo46640a() {
        return "OkHttp";
    }

    /* renamed from: a */
    public void mo46617a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo46633a(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public void mo46618a(SSLSocket sSLSocket, @C5952h String str, List<C13799a0> list) {
    }

    @C5952h
    /* renamed from: b */
    public String mo46619b(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: b */
    public void mo46632b(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: b */
    public boolean mo46622b(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    @C5952h
    /* renamed from: c */
    public X509TrustManager mo46623c(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a = m66567a((Object) sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) m66567a(a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo46615a(int i, String str, @C5952h Throwable th) {
        f43640d.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: c */
    private static C15011f m66570c() {
        C15011f c = C15002a.m66527c();
        if (c != null) {
            return c;
        }
        if (m66572e()) {
            C15006b c2 = C15006b.m66545c();
            if (c2 != null) {
                return c2;
            }
        }
        C15007c c3 = C15007c.m66552c();
        if (c3 != null) {
            return c3;
        }
        C15011f c4 = C15008d.m66556c();
        if (c4 != null) {
            return c4;
        }
        return new C15011f();
    }

    /* renamed from: a */
    public Object mo46613a(String str) {
        if (f43640d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo46616a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo46615a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public static List<String> m66568a(List<C13799a0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13799a0 a0Var = (C13799a0) list.get(i);
            if (a0Var != C13799a0.HTTP_1_0) {
                arrayList.add(a0Var.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public SSLContext mo46620b() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance(TLSUtils.PROTO_TLSV1_2);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: a */
    public C15015c mo46614a(X509TrustManager x509TrustManager) {
        return new C15013a(mo46621b(x509TrustManager));
    }

    /* renamed from: b */
    public C15018f mo46621b(X509TrustManager x509TrustManager) {
        return new C15014b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: a */
    public C15015c mo46641a(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager c = mo46623c(sSLSocketFactory);
        if (c != null) {
            return mo46614a(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to extract the trust manager on ");
        sb.append(m66571d());
        sb.append(", sslSocketFactory is ");
        sb.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb.toString());
    }

    @C5952h
    /* renamed from: a */
    static <T> T m66567a(Object obj, Class<T> cls, String str) {
        Class<Object> cls2 = Object.class;
        Class<Object> cls3 = obj.getClass();
        while (cls3 != cls2) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                }
                return null;
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        String str2 = "delegate";
        if (!str.equals(str2)) {
            Object a = m66567a(obj, cls2, str2);
            if (a != null) {
                return m66567a(a, cls, str);
            }
        }
        return null;
    }
}
