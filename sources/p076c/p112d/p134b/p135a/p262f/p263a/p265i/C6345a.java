package p076c.p112d.p134b.p135a.p262f.p263a.p265i;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.f.a.i.a */
/* compiled from: MockHttpURLConnection */
public class C6345a extends HttpURLConnection {
    @Deprecated

    /* renamed from: f */
    public static final byte[] f17736f = new byte[1];
    @Deprecated

    /* renamed from: g */
    public static final byte[] f17737g = new byte[5];

    /* renamed from: a */
    private boolean f17738a;

    /* renamed from: b */
    private OutputStream f17739b = new ByteArrayOutputStream(0);

    /* renamed from: c */
    private InputStream f17740c = null;

    /* renamed from: d */
    private InputStream f17741d = null;

    /* renamed from: e */
    private Map<String, List<String>> f17742e = new LinkedHashMap();

    public C6345a(URL url) {
        super(url);
    }

    /* renamed from: a */
    public final boolean mo25681a() {
        return this.f17738a;
    }

    /* renamed from: b */
    public C6345a mo25682b(InputStream inputStream) {
        C6381h0.m29663a(inputStream);
        if (this.f17740c == null) {
            this.f17740c = inputStream;
        }
        return this;
    }

    public void connect() throws IOException {
    }

    public void disconnect() {
    }

    public InputStream getErrorStream() {
        return this.f17741d;
    }

    public String getHeaderField(String str) {
        List list = (List) this.f17742e.get(str);
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f17742e;
    }

    public InputStream getInputStream() throws IOException {
        if (this.responseCode < 400) {
            return this.f17740c;
        }
        throw new IOException();
    }

    public OutputStream getOutputStream() throws IOException {
        OutputStream outputStream = this.f17739b;
        if (outputStream != null) {
            return outputStream;
        }
        return super.getOutputStream();
    }

    public int getResponseCode() throws IOException {
        return this.responseCode;
    }

    public void setDoOutput(boolean z) {
        this.f17738a = true;
    }

    public boolean usingProxy() {
        return false;
    }

    /* renamed from: a */
    public C6345a mo25679a(OutputStream outputStream) {
        this.f17739b = outputStream;
        return this;
    }

    /* renamed from: a */
    public C6345a mo25677a(int i) {
        C6381h0.m29666a(i >= -1);
        this.responseCode = i;
        return this;
    }

    /* renamed from: a */
    public C6345a mo25680a(String str, String str2) {
        C6381h0.m29663a(str);
        C6381h0.m29663a(str2);
        if (this.f17742e.containsKey(str)) {
            ((List) this.f17742e.get(str)).add(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.f17742e.put(str, arrayList);
        }
        return this;
    }

    /* renamed from: a */
    public C6345a mo25678a(InputStream inputStream) {
        C6381h0.m29663a(inputStream);
        if (this.f17741d == null) {
            this.f17741d = inputStream;
        }
        return this;
    }
}
