package okhttp3.internal.p519j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p468g.C13799a0;

/* renamed from: okhttp3.internal.j.c */
/* compiled from: Jdk9Platform */
final class C15007c extends C15011f {

    /* renamed from: e */
    final Method f43624e;

    /* renamed from: f */
    final Method f43625f;

    C15007c(Method method, Method method2) {
        this.f43624e = method;
        this.f43625f = method2;
    }

    /* renamed from: a */
    public void mo46618a(SSLSocket sSLSocket, String str, List<C13799a0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = C15011f.m66568a(list);
            this.f43624e.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14910b.m66042a("unable to set ssl parameters", (Exception) e);
        }
    }

    @C5952h
    /* renamed from: b */
    public String mo46619b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f43625f.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14910b.m66042a("unable to get selected protocols", (Exception) e);
        }
    }

    /* renamed from: c */
    public X509TrustManager mo46623c(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    /* renamed from: c */
    public static C15007c m66552c() {
        try {
            return new C15007c(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
