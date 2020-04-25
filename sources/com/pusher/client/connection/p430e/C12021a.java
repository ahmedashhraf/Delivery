package com.pusher.client.connection.p430e;

import java.io.IOException;
import java.net.Proxy;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import p076c.p284e.p285a.p286j.C6748b;
import p076c.p284e.p285a.p288l.C6764h;

/* renamed from: com.pusher.client.connection.e.a */
/* compiled from: WebSocketClientWrapper */
public class C12021a extends C6748b {

    /* renamed from: Z */
    private static final String f34632Z = "wss";

    /* renamed from: Y */
    private C12035c f34633Y;

    public C12021a(URI uri, Proxy proxy, C12035c cVar) throws SSLException {
        super(uri);
        if (uri.getScheme().equals(f34632Z)) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                mo26981a(instance.getSocketFactory().createSocket());
            } catch (IOException e) {
                throw new SSLException(e);
            } catch (NoSuchAlgorithmException e2) {
                throw new SSLException(e2);
            } catch (KeyManagementException e3) {
                throw new SSLException(e3);
            }
        }
        this.f34633Y = cVar;
        mo26980a(proxy);
    }

    /* renamed from: a */
    public void mo26978a(C6764h hVar) {
        C12035c cVar = this.f34633Y;
        if (cVar != null) {
            cVar.mo41146a(hVar);
        }
    }

    /* renamed from: b */
    public void mo26984b(String str) {
        C12035c cVar = this.f34633Y;
        if (cVar != null) {
            cVar.mo41147b(str);
        }
    }

    /* renamed from: o */
    public void mo41144o() {
        this.f34633Y = null;
    }

    /* renamed from: a */
    public void mo26977a(int i, String str, boolean z) {
        C12035c cVar = this.f34633Y;
        if (cVar != null) {
            cVar.mo41145a(i, str, z);
        }
    }

    /* renamed from: a */
    public void mo26979a(Exception exc) {
        C12035c cVar = this.f34633Y;
        if (cVar != null) {
            cVar.onError(exc);
        }
    }
}
