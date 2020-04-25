package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.o3 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C5347o3 extends C5429v8 {

    /* renamed from: d */
    private final SSLSocketFactory f15355d;

    public C5347o3(C5461y8 y8Var) {
        super(y8Var);
        this.f15355d = VERSION.SDK_INT < 19 ? new C5298j9() : null;
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: a */
    public static byte[] m23299a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5281i3 mo21211j() {
        return super.mo21211j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5254f9 mo21212k() {
        return super.mo21212k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5446x3 mo21213l() {
        return super.mo21213l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5386r9 mo21214m() {
        return super.mo21214m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5320l9 mo21215n() {
        return super.mo21215n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5221c9 mo21216o() {
        return super.mo21216o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5397s9 mo21217p() {
        return super.mo21217p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C5293j4 mo21218q() {
        return super.mo21218q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo21219u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo21576v() {
        NetworkInfo networkInfo;
        mo21739s();
        try {
            networkInfo = ((ConnectivityManager) mo21206e().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @C4476d0
    /* renamed from: a */
    public final HttpURLConnection mo21575a(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f15355d;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
