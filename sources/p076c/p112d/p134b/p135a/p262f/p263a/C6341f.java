package p076c.p112d.p134b.p135a.p262f.p263a;

import com.google.api.client.http.C7259d0;
import com.google.api.client.http.C7261e0;
import com.google.api.client.http.C7303s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6385j;
import p076c.p112d.p134b.p135a.p143g.C6423t;
import p212io.fabric.sdk.android.services.network.HttpRequest;

@C2766f
/* renamed from: c.d.b.a.f.a.f */
/* compiled from: MockLowLevelHttpRequest */
public class C6341f extends C7259d0 {

    /* renamed from: e */
    private String f17722e;

    /* renamed from: f */
    private final Map<String, List<String>> f17723f = new HashMap();

    /* renamed from: g */
    private C6342g f17724g = new C6342g();

    public C6341f() {
    }

    /* renamed from: a */
    public void mo25349a(String str, String str2) throws IOException {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f17723f.get(lowerCase);
        if (list == null) {
            list = new ArrayList();
            this.f17723f.put(lowerCase, list);
        }
        list.add(str2);
    }

    /* renamed from: c */
    public String mo25650c(String str) {
        List list = (List) this.f17723f.get(str.toLowerCase());
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: d */
    public List<String> mo25651d(String str) {
        List list = (List) this.f17723f.get(str.toLowerCase());
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    /* renamed from: e */
    public C6341f mo25652e(String str) {
        this.f17722e = str;
        return this;
    }

    /* renamed from: f */
    public String mo25653f() throws IOException {
        if (mo28880e() == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo28880e().writeTo(byteArrayOutputStream);
        String b = mo28876b();
        if (b != null && b.contains(HttpRequest.f42459o)) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream = new ByteArrayOutputStream();
            C6423t.m29817a((InputStream) gZIPInputStream, (OutputStream) byteArrayOutputStream);
        }
        String d = mo28879d();
        C7303s sVar = d != null ? new C7303s(d) : null;
        return byteArrayOutputStream.toString(((sVar == null || sVar.mo29070c() == null) ? C6385j.f17805b : sVar.mo29070c()).name());
    }

    /* renamed from: g */
    public Map<String, List<String>> mo25654g() {
        return Collections.unmodifiableMap(this.f17723f);
    }

    /* renamed from: h */
    public C6342g mo25655h() {
        return this.f17724g;
    }

    /* renamed from: i */
    public String mo25656i() {
        return this.f17722e;
    }

    public C6341f(String str) {
        this.f17722e = str;
    }

    /* renamed from: a */
    public C7261e0 mo25348a() throws IOException {
        return this.f17724g;
    }

    /* renamed from: a */
    public C6341f mo25649a(C6342g gVar) {
        this.f17724g = gVar;
        return this;
    }
}
