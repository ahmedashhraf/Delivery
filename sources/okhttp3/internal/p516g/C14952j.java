package okhttp3.internal.p516g;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.C14910b;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p076c.p112d.p148d.p279f.C6610c;
import p468g.C13798a;
import p468g.C13813c0;
import p468g.C13813c0.C13814a;
import p468g.C13817d0;
import p468g.C13821e;
import p468g.C13823e0;
import p468g.C13826f0;
import p468g.C13829g;
import p468g.C13832g0;
import p468g.C13859r;
import p468g.C13868v;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p468g.C13876z;

/* renamed from: okhttp3.internal.g.j */
/* compiled from: RetryAndFollowUpInterceptor */
public final class C14952j implements C13870w {

    /* renamed from: f */
    private static final int f43354f = 20;

    /* renamed from: a */
    private final C13876z f43355a;

    /* renamed from: b */
    private final boolean f43356b;

    /* renamed from: c */
    private volatile C14921f f43357c;

    /* renamed from: d */
    private Object f43358d;

    /* renamed from: e */
    private volatile boolean f43359e;

    public C14952j(C13876z zVar, boolean z) {
        this.f43355a = zVar;
        this.f43356b = z;
    }

    /* renamed from: a */
    public void mo46467a() {
        this.f43359e = true;
        C14921f fVar = this.f43357c;
        if (fVar != null) {
            fVar.mo46398a();
        }
    }

    /* renamed from: b */
    public boolean mo46469b() {
        return this.f43359e;
    }

    /* renamed from: c */
    public C14921f mo46470c() {
        return this.f43357c;
    }

    /* renamed from: a */
    public void mo46468a(Object obj) {
        this.f43358d = obj;
    }

    /* renamed from: a */
    public C13823e0 mo23463a(C13871a aVar) throws IOException {
        C13813c0 request = aVar.request();
        C14949g gVar = (C14949g) aVar;
        C13821e call = gVar.call();
        C13859r e = gVar.mo46464e();
        C14921f fVar = new C14921f(this.f43355a.mo43736g(), m66265a(request.mo43359h()), call, e, this.f43358d);
        this.f43357c = fVar;
        C13823e0 e0Var = null;
        int i = 0;
        while (!this.f43359e) {
            try {
                C13823e0 a = gVar.mo46463a(request, fVar, null, null);
                if (e0Var != null) {
                    a = a.mo43410I().mo43444c(e0Var.mo43410I().mo43434a((C13826f0) null).mo43439a()).mo43439a();
                }
                try {
                    C13813c0 a2 = m66266a(a, fVar.mo46407g());
                    if (a2 == null) {
                        fVar.mo46406f();
                        return a;
                    }
                    C14910b.m66055a((Closeable) a.mo43416a());
                    int i2 = i + 1;
                    if (i2 > 20) {
                        fVar.mo46406f();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many follow-up requests: ");
                        sb.append(i2);
                        throw new ProtocolException(sb.toString());
                    } else if (!(a2.mo43349a() instanceof C14954l)) {
                        if (!m66267a(a, a2.mo43359h())) {
                            fVar.mo46406f();
                            fVar = new C14921f(this.f43355a.mo43736g(), m66265a(a2.mo43359h()), call, e, this.f43358d);
                            this.f43357c = fVar;
                        } else if (fVar.mo46402b() != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Closing the body of ");
                            sb2.append(a);
                            sb2.append(" didn't close its backing stream. Bad interceptor?");
                            throw new IllegalStateException(sb2.toString());
                        }
                        e0Var = a;
                        request = a2;
                        i = i2;
                    } else {
                        fVar.mo46406f();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", a.mo43425g());
                    }
                } catch (IOException e2) {
                    fVar.mo46406f();
                    throw e2;
                }
            } catch (RouteException e3) {
                if (!m66268a(e3.mo46372d(), fVar, false, request)) {
                    throw e3.mo46370a();
                }
            } catch (IOException e4) {
                if (!m66268a(e4, fVar, !(e4 instanceof ConnectionShutdownException), request)) {
                    throw e4;
                }
            } catch (Throwable th) {
                fVar.mo46399a((IOException) null);
                fVar.mo46406f();
                throw th;
            }
        }
        fVar.mo46406f();
        throw new IOException("Canceled");
    }

    /* renamed from: a */
    private C13798a m66265a(C13868v vVar) {
        C13829g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.mo43651i()) {
            SSLSocketFactory C = this.f43355a.mo43729C();
            hostnameVerifier = this.f43355a.mo43744o();
            sSLSocketFactory = C;
            gVar = this.f43355a.mo43734e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        C13798a aVar = new C13798a(vVar.mo43649h(), vVar.mo43656n(), this.f43355a.mo43740k(), this.f43355a.mo43728A(), sSLSocketFactory, hostnameVerifier, gVar, this.f43355a.mo43752w(), this.f43355a.mo43751v(), this.f43355a.mo43750u(), this.f43355a.mo43737h(), this.f43355a.mo43753x());
        return aVar;
    }

    /* renamed from: a */
    private boolean m66268a(IOException iOException, C14921f fVar, boolean z, C13813c0 c0Var) {
        fVar.mo46399a(iOException);
        if (!this.f43355a.mo43755z()) {
            return false;
        }
        if ((!z || !(c0Var.mo43349a() instanceof C14954l)) && m66269a(iOException, z) && fVar.mo46404d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m66269a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private C13813c0 m66266a(C13823e0 e0Var, C13832g0 g0Var) throws IOException {
        Proxy proxy;
        if (e0Var != null) {
            int g = e0Var.mo43425g();
            String e = e0Var.mo43414M().mo43356e();
            String str = "GET";
            C13817d0 d0Var = null;
            if (g == 307 || g == 308) {
                if (!e.equals(str) && !e.equals("HEAD")) {
                    return null;
                }
            } else if (g == 401) {
                return this.f43355a.mo43731b().mo43289a(g0Var, e0Var);
            } else {
                if (g != 503) {
                    if (g == 407) {
                        if (g0Var != null) {
                            proxy = g0Var.mo43467b();
                        } else {
                            proxy = this.f43355a.mo43751v();
                        }
                        if (proxy.type() == Type.HTTP) {
                            return this.f43355a.mo43752w().mo43289a(g0Var, e0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (g != 408) {
                        switch (g) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f43355a.mo43755z() || (e0Var.mo43414M().mo43349a() instanceof C14954l)) {
                        return null;
                    } else {
                        if ((e0Var.mo43411J() == null || e0Var.mo43411J().mo43425g() != 408) && m66264a(e0Var, 0) <= 0) {
                            return e0Var.mo43414M();
                        }
                        return null;
                    }
                } else if ((e0Var.mo43411J() == null || e0Var.mo43411J().mo43425g() != 503) && m66264a(e0Var, Integer.MAX_VALUE) == 0) {
                    return e0Var.mo43414M();
                } else {
                    return null;
                }
            }
            if (!this.f43355a.mo43742m()) {
                return null;
            }
            String b = e0Var.mo43419b("Location");
            if (b == null) {
                return null;
            }
            C13868v d = e0Var.mo43414M().mo43359h().mo43643d(b);
            if (d == null) {
                return null;
            }
            if (!d.mo43661s().equals(e0Var.mo43414M().mo43359h().mo43661s()) && !this.f43355a.mo43743n()) {
                return null;
            }
            C13814a f = e0Var.mo43414M().mo43357f();
            if (C14948f.m66245b(e)) {
                boolean d2 = C14948f.m66247d(e);
                if (C14948f.m66246c(e)) {
                    f.mo43368a(str, (C13817d0) null);
                } else {
                    if (d2) {
                        d0Var = e0Var.mo43414M().mo43349a();
                    }
                    f.mo43368a(e, d0Var);
                }
                if (!d2) {
                    f.mo43367a("Transfer-Encoding");
                    f.mo43367a("Content-Length");
                    f.mo43367a("Content-Type");
                }
            }
            if (!m66267a(e0Var, d)) {
                f.mo43367a("Authorization");
            }
            return f.mo43364a(d).mo43371a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private int m66264a(C13823e0 e0Var, int i) {
        String b = e0Var.mo43419b(C6610c.f18420h0);
        if (b == null) {
            return i;
        }
        if (b.matches("\\d+")) {
            return Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private boolean m66267a(C13823e0 e0Var, C13868v vVar) {
        C13868v h = e0Var.mo43414M().mo43359h();
        return h.mo43649h().equals(vVar.mo43649h()) && h.mo43656n() == vVar.mo43656n() && h.mo43661s().equals(vVar.mo43661s());
    }
}
