package p076c.p082c.p083a.p088u.p089h;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p082c.p083a.C2244p;
import p076c.p082c.p083a.p084a0.C2209b;
import p076c.p082c.p083a.p088u.p095j.C2395d;

/* renamed from: c.c.a.u.h.g */
/* compiled from: HttpUrlFetcher */
public class C2283g implements C2279c<InputStream> {

    /* renamed from: f */
    private static final String f9104f = "HttpUrlFetcher";

    /* renamed from: g */
    private static final int f9105g = 5;

    /* renamed from: h */
    private static final C2286c f9106h = new C2285b();

    /* renamed from: a */
    private final C2395d f9107a;

    /* renamed from: b */
    private final C2286c f9108b;

    /* renamed from: c */
    private HttpURLConnection f9109c;

    /* renamed from: d */
    private InputStream f9110d;

    /* renamed from: e */
    private volatile boolean f9111e;

    /* renamed from: c.c.a.u.h.g$b */
    /* compiled from: HttpUrlFetcher */
    private static class C2285b implements C2286c {
        private C2285b() {
        }

        /* renamed from: a */
        public HttpURLConnection mo9659a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: c.c.a.u.h.g$c */
    /* compiled from: HttpUrlFetcher */
    interface C2286c {
        /* renamed from: a */
        HttpURLConnection mo9659a(URL url) throws IOException;
    }

    public C2283g(C2395d dVar) {
        this(dVar, f9106h);
    }

    public void cancel() {
        this.f9111e = true;
    }

    public String getId() {
        return this.f9107a.mo9818a();
    }

    C2283g(C2395d dVar, C2286c cVar) {
        this.f9107a = dVar;
        this.f9108b = cVar;
    }

    /* renamed from: a */
    public InputStream m11929a(C2244p pVar) throws Exception {
        return m11927a(this.f9107a.mo9821d(), 0, null, this.f9107a.mo9819b());
    }

    /* renamed from: a */
    private InputStream m11927a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f9109c = this.f9108b.mo9659a(url);
            for (Entry entry : map.entrySet()) {
                this.f9109c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f9109c.setConnectTimeout(2500);
            this.f9109c.setReadTimeout(2500);
            this.f9109c.setUseCaches(false);
            this.f9109c.setDoInput(true);
            this.f9109c.connect();
            if (this.f9111e) {
                return null;
            }
            int responseCode = this.f9109c.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                return m11926a(this.f9109c);
            }
            if (i2 == 3) {
                String headerField = this.f9109c.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    return m11927a(new URL(url, headerField), i + 1, url, map);
                }
                throw new IOException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Request failed ");
                sb.append(responseCode);
                sb.append(": ");
                sb.append(this.f9109c.getResponseMessage());
                throw new IOException(sb.toString());
            }
        } else {
            throw new IOException("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    private InputStream m11926a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f9110d = C2209b.m11311a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable(f9104f, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
                sb.toString();
            }
            this.f9110d = httpURLConnection.getInputStream();
        }
        return this.f9110d;
    }

    /* renamed from: a */
    public void mo9645a() {
        InputStream inputStream = this.f9110d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9109c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
