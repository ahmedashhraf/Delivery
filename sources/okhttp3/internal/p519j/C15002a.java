package okhttp3.internal.p519j;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.C14910b;
import okhttp3.internal.p521l.C15015c;
import okhttp3.internal.p521l.C15018f;
import org.jivesoftware.smack.util.TLSUtils;
import p201f.p202a.C5952h;
import p468g.C13799a0;

/* renamed from: okhttp3.internal.j.a */
/* compiled from: AndroidPlatform */
class C15002a extends C15011f {

    /* renamed from: k */
    private static final int f43610k = 4000;

    /* renamed from: e */
    private final Class<?> f43611e;

    /* renamed from: f */
    private final C15010e<Socket> f43612f;

    /* renamed from: g */
    private final C15010e<Socket> f43613g;

    /* renamed from: h */
    private final C15010e<Socket> f43614h;

    /* renamed from: i */
    private final C15010e<Socket> f43615i;

    /* renamed from: j */
    private final C15005c f43616j = C15005c.m66542a();

    /* renamed from: okhttp3.internal.j.a$a */
    /* compiled from: AndroidPlatform */
    static final class C15003a extends C15015c {

        /* renamed from: a */
        private final Object f43617a;

        /* renamed from: b */
        private final Method f43618b;

        C15003a(Object obj, Method method) {
            this.f43617a = obj;
            this.f43618b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo46624a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f43618b.invoke(this.f43617a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C15003a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: okhttp3.internal.j.a$b */
    /* compiled from: AndroidPlatform */
    static final class C15004b implements C15018f {

        /* renamed from: a */
        private final X509TrustManager f43619a;

        /* renamed from: b */
        private final Method f43620b;

        C15004b(X509TrustManager x509TrustManager, Method method) {
            this.f43620b = method;
            this.f43619a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo46627a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f43620b.invoke(this.f43619a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C14910b.m66042a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C15004b)) {
                return false;
            }
            C15004b bVar = (C15004b) obj;
            if (!this.f43619a.equals(bVar.f43619a) || !this.f43620b.equals(bVar.f43620b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f43619a.hashCode() + (this.f43620b.hashCode() * 31);
        }
    }

    /* renamed from: okhttp3.internal.j.a$c */
    /* compiled from: AndroidPlatform */
    static final class C15005c {

        /* renamed from: a */
        private final Method f43621a;

        /* renamed from: b */
        private final Method f43622b;

        /* renamed from: c */
        private final Method f43623c;

        C15005c(Method method, Method method2, Method method3) {
            this.f43621a = method;
            this.f43622b = method2;
            this.f43623c = method3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo46630a(String str) {
            Method method = this.f43621a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f43622b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo46631a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f43623c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        static C15005c m66542a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C15005c(method3, method, method2);
        }
    }

    C15002a(Class<?> cls, C15010e<Socket> eVar, C15010e<Socket> eVar2, C15010e<Socket> eVar3, C15010e<Socket> eVar4) {
        this.f43611e = cls;
        this.f43612f = eVar;
        this.f43613g = eVar2;
        this.f43614h = eVar3;
        this.f43615i = eVar4;
    }

    /* renamed from: f */
    private static boolean m66528f() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo46617a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        String str = "Exception in connect";
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C14910b.m66060a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException(str);
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException(str);
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    @C5952h
    /* renamed from: b */
    public String mo46619b(SSLSocket sSLSocket) {
        C15010e<Socket> eVar = this.f43614h;
        String str = null;
        if (eVar == null || !eVar.mo46636a(sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f43614h.mo46639d(sSLSocket, new Object[0]);
        if (bArr != null) {
            str = new String(bArr, C14910b.f43167j);
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @C5952h
    /* renamed from: c */
    public X509TrustManager mo46623c(SSLSocketFactory sSLSocketFactory) {
        String str = "sslParameters";
        Object a = C15011f.m66567a((Object) sSLSocketFactory, this.f43611e, str);
        if (a == null) {
            try {
                a = C15011f.m66567a((Object) sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), str);
            } catch (ClassNotFoundException unused) {
                return super.mo46623c(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C15011f.m66567a(a, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) C15011f.m66567a(a, X509TrustManager.class, "trustManager");
    }

    /* renamed from: b */
    public boolean mo46622b(String str) {
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m66526b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo46622b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C14910b.m66042a("unable to determine cleartext support", e);
        }
    }

    /* renamed from: c */
    public static C15011f m66527c() {
        Class cls;
        C15010e eVar;
        C15010e eVar2;
        Class<byte[]> cls2 = byte[].class;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class cls3 = cls;
        C15010e eVar3 = new C15010e(null, "setUseSessionTickets", Boolean.TYPE);
        C15010e eVar4 = new C15010e(null, "setHostname", String.class);
        if (m66528f()) {
            C15010e eVar5 = new C15010e(cls2, "getAlpnSelectedProtocol", new Class[0]);
            eVar = new C15010e(null, "setAlpnProtocols", cls2);
            eVar2 = eVar5;
        } else {
            eVar2 = null;
            eVar = null;
        }
        C15002a aVar = new C15002a(cls3, eVar3, eVar4, eVar2, eVar);
        return aVar;
    }

    /* renamed from: b */
    private boolean m66526b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m66525a(str, cls, obj);
        }
    }

    /* renamed from: a */
    public void mo46618a(SSLSocket sSLSocket, String str, List<C13799a0> list) {
        if (str != null) {
            this.f43612f.mo46638c(sSLSocket, Boolean.valueOf(true));
            this.f43613g.mo46638c(sSLSocket, str);
        }
        C15010e<Socket> eVar = this.f43615i;
        if (eVar != null && eVar.mo46636a(sSLSocket)) {
            this.f43615i.mo46639d(sSLSocket, C15011f.m66569b(list));
        }
    }

    /* renamed from: b */
    public C15018f mo46621b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C15004b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo46621b(x509TrustManager);
        }
    }

    /* renamed from: a */
    public void mo46615a(int i, String str, @C5952h Throwable th) {
        int min;
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i2 = 0;
        int length = str.length();
        while (i2 < length) {
            int indexOf = str.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + f43610k);
                str.substring(i2, min);
                if (min >= indexOf) {
                    break;
                }
                i2 = min;
            }
            i2 = min + 1;
        }
    }

    /* renamed from: b */
    public SSLContext mo46620b() {
        boolean z = true;
        try {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance(TLSUtils.PROTO_TLSV1_2);
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: a */
    public Object mo46613a(String str) {
        return this.f43616j.mo46630a(str);
    }

    /* renamed from: a */
    public void mo46616a(String str, Object obj) {
        if (!this.f43616j.mo46631a(obj)) {
            mo46615a(5, str, (Throwable) null);
        }
    }

    /* renamed from: a */
    private boolean m66525a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo46622b(str);
        }
    }

    /* renamed from: a */
    public C15015c mo46614a(X509TrustManager x509TrustManager) {
        try {
            Class cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C15003a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.mo46614a(x509TrustManager);
        }
    }
}
