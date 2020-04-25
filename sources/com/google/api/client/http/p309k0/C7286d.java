package com.google.api.client.http.p309k0;

import com.google.api.client.http.C7261e0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.http.k0.d */
/* compiled from: NetHttpResponse */
final class C7286d extends C7261e0 {

    /* renamed from: a */
    private final HttpURLConnection f20600a;

    /* renamed from: b */
    private final int f20601b;

    /* renamed from: c */
    private final String f20602c;

    /* renamed from: d */
    private final ArrayList<String> f20603d = new ArrayList<>();

    /* renamed from: e */
    private final ArrayList<String> f20604e = new ArrayList<>();

    /* renamed from: com.google.api.client.http.k0.d$a */
    /* compiled from: NetHttpResponse */
    private final class C7287a extends FilterInputStream {

        /* renamed from: a */
        private long f20605a = 0;

        public C7287a(InputStream inputStream) {
            super(inputStream);
        }

        /* renamed from: a */
        private void m35193a() throws IOException {
            long d = C7286d.this.mo25354d();
            if (d != -1) {
                long j = this.f20605a;
                if (j != 0 && j < d) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("Connection closed prematurely: bytesRead = ");
                    sb.append(j);
                    sb.append(", Content-Length = ");
                    sb.append(d);
                    throw new IOException(sb.toString());
                }
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.in.read(bArr, i, i2);
            if (read == -1) {
                m35193a();
            } else {
                this.f20605a += (long) read;
            }
            return read;
        }

        public int read() throws IOException {
            int read = this.in.read();
            if (read == -1) {
                m35193a();
            } else {
                this.f20605a++;
            }
            return read;
        }
    }

    C7286d(HttpURLConnection httpURLConnection) throws IOException {
        this.f20600a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            responseCode = 0;
        }
        this.f20601b = responseCode;
        this.f20602c = httpURLConnection.getResponseMessage();
        ArrayList<String> arrayList = this.f20603d;
        ArrayList<String> arrayList2 = this.f20604e;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String mo25350a(int i) {
        return (String) this.f20603d.get(i);
    }

    /* renamed from: b */
    public InputStream mo25351b() throws IOException {
        InputStream inputStream;
        try {
            inputStream = this.f20600a.getInputStream();
        } catch (IOException unused) {
            inputStream = this.f20600a.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new C7287a(inputStream);
    }

    /* renamed from: c */
    public String mo25353c() {
        return this.f20600a.getContentEncoding();
    }

    /* renamed from: d */
    public long mo25354d() {
        String headerField = this.f20600a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    /* renamed from: e */
    public String mo25355e() {
        return this.f20600a.getHeaderField("Content-Type");
    }

    /* renamed from: f */
    public int mo25356f() {
        return this.f20603d.size();
    }

    /* renamed from: g */
    public String mo25357g() {
        return this.f20602c;
    }

    /* renamed from: h */
    public int mo25358h() {
        return this.f20601b;
    }

    /* renamed from: i */
    public String mo25359i() {
        String headerField = this.f20600a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* renamed from: a */
    public void mo25663a() {
        this.f20600a.disconnect();
    }

    /* renamed from: b */
    public String mo25352b(int i) {
        return (String) this.f20604e.get(i);
    }
}
