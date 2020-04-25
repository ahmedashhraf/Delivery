package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.C15139e;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.impl.client.i */
/* compiled from: DefaultHttpRequestRetryHandler */
public class C15377i implements C15139e {

    /* renamed from: a */
    private final int f44480a;

    /* renamed from: b */
    private final boolean f44481b;

    public C15377i(int i, boolean z) {
        this.f44480a = i;
        this.f44481b = z;
    }

    /* renamed from: a */
    public boolean mo46941a(IOException iOException, int i, C15431f fVar) {
        if (iOException == null) {
            throw new IllegalArgumentException("Exception parameter may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (i > this.f44480a) {
            return false;
        } else {
            if (iOException instanceof NoHttpResponseException) {
                return true;
            }
            if ((iOException instanceof InterruptedIOException) || (iOException instanceof UnknownHostException) || (iOException instanceof ConnectException) || (iOException instanceof SSLHandshakeException)) {
                return false;
            }
            if (!(((C15463o) fVar.mo47685a(C15429d.f44565b)) instanceof C15452k)) {
                return true;
            }
            Boolean bool = (Boolean) fVar.mo47685a(C15429d.f44569f);
            if (!(bool != null && bool.booleanValue()) || this.f44481b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo47643b() {
        return this.f44481b;
    }

    public C15377i() {
        this(3, false);
    }

    /* renamed from: a */
    public int mo47642a() {
        return this.f44480a;
    }
}
