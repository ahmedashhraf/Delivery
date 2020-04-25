package org.apache.http.p541f0.p542m;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.C15348i;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.HttpException;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15187k;
import org.apache.http.conn.C15189m;

/* renamed from: org.apache.http.f0.m.a */
/* compiled from: AbstractClientConnAdapter */
public abstract class C15263a implements C15187k {

    /* renamed from: N */
    private volatile boolean f44211N = false;

    /* renamed from: O */
    private volatile boolean f44212O = false;

    /* renamed from: P */
    private volatile long f44213P = Long.MAX_VALUE;

    /* renamed from: a */
    private volatile C15179c f44214a;

    /* renamed from: b */
    private volatile C15189m f44215b;

    protected C15263a(C15179c cVar, C15189m mVar) {
        this.f44214a = cVar;
        this.f44215b = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo46983B() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f44212O     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.f44212O = r0     // Catch:{ all -> 0x0019 }
            org.apache.http.conn.c r0 = r4.f44214a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            org.apache.http.conn.c r0 = r4.f44214a     // Catch:{ all -> 0x0019 }
            long r1 = r4.f44213P     // Catch:{ all -> 0x0019 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0019 }
            r0.mo46990a(r4, r1, r3)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p542m.C15263a.mo46983B():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|11|12|(1:14)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0014  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo46984F() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f44212O     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.f44212O = r0     // Catch:{ all -> 0x001f }
            r4.mo47017f()     // Catch:{ all -> 0x001f }
            r4.shutdown()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            org.apache.http.conn.c r0 = r4.f44214a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            org.apache.http.conn.c r0 = r4.f44214a     // Catch:{ all -> 0x001f }
            long r1 = r4.f44213P     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001f }
            r0.mo46990a(r4, r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p542m.C15263a.mo46984F():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47245a(C15189m mVar) throws IllegalStateException {
        if (mVar == null) {
            throw new IllegalStateException("No wrapped connection");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47246b() throws InterruptedIOException {
        if (this.f44212O) {
            throw new InterruptedIOException("Connection has been shut down");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public synchronized void mo47247c() {
        this.f44215b = null;
        this.f44214a = null;
        this.f44213P = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public boolean mo47015d() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.mo47029d();
    }

    /* renamed from: e */
    public boolean mo47016e() {
        return this.f44211N;
    }

    /* renamed from: f */
    public void mo47017f() {
        this.f44211N = false;
    }

    public void flush() throws IOException {
        mo47246b();
        C15189m k = mo47249k();
        mo47245a(k);
        k.flush();
    }

    /* renamed from: g */
    public void mo47018g() {
        this.f44211N = true;
    }

    public InetAddress getLocalAddress() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.getLocalAddress();
    }

    public int getLocalPort() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.getLocalPort();
    }

    public C15348i getMetrics() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.getMetrics();
    }

    public InetAddress getRemoteAddress() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.getRemoteAddress();
    }

    public int getRemotePort() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.getRemotePort();
    }

    public int getSocketTimeout() {
        C15189m k = mo47249k();
        mo47245a(k);
        return k.getSocketTimeout();
    }

    /* renamed from: i */
    public SSLSession mo47021i() {
        C15189m k = mo47249k();
        mo47245a(k);
        SSLSession sSLSession = null;
        if (!isOpen()) {
            return null;
        }
        Socket c = k.mo47028c();
        if (c instanceof SSLSocket) {
            sSLSession = ((SSLSocket) c).getSession();
        }
        return sSLSession;
    }

    public boolean isOpen() {
        C15189m k = mo47249k();
        if (k == null) {
            return false;
        }
        return k.isOpen();
    }

    public boolean isStale() {
        if (this.f44212O) {
            return true;
        }
        C15189m k = mo47249k();
        if (k == null) {
            return true;
        }
        return k.isStale();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C15179c mo47248j() {
        return this.f44214a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C15189m mo47249k() {
        return this.f44215b;
    }

    public void sendRequestEntity(C15452k kVar) throws HttpException, IOException {
        mo47246b();
        C15189m k = mo47249k();
        mo47245a(k);
        mo47017f();
        k.sendRequestEntity(kVar);
    }

    public void sendRequestHeader(C15463o oVar) throws HttpException, IOException {
        mo47246b();
        C15189m k = mo47249k();
        mo47245a(k);
        mo47017f();
        k.sendRequestHeader(oVar);
    }

    public void setSocketTimeout(int i) {
        C15189m k = mo47249k();
        mo47245a(k);
        k.setSocketTimeout(i);
    }

    /* renamed from: a */
    public boolean mo47180a(int i) throws IOException {
        mo47246b();
        C15189m k = mo47249k();
        mo47245a(k);
        return k.mo47180a(i);
    }

    /* renamed from: a */
    public void mo47179a(C15466r rVar) throws HttpException, IOException {
        mo47246b();
        C15189m k = mo47249k();
        mo47245a(k);
        mo47017f();
        k.mo47179a(rVar);
    }

    /* renamed from: a */
    public C15466r mo47177a() throws HttpException, IOException {
        mo47246b();
        C15189m k = mo47249k();
        mo47245a(k);
        mo47017f();
        return k.mo47177a();
    }

    /* renamed from: a */
    public void mo47009a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f44213P = timeUnit.toMillis(j);
        } else {
            this.f44213P = -1;
        }
    }
}
