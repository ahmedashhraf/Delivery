package p076c.p112d.p134b.p135a.p262f.p263a;

import com.google.api.client.http.C7261e0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6399n0;
import p076c.p112d.p134b.p135a.p262f.p268c.C6355e;

@C2766f
/* renamed from: c.d.b.a.f.a.g */
/* compiled from: MockLowLevelHttpResponse */
public class C6342g extends C7261e0 {

    /* renamed from: a */
    private InputStream f17725a;

    /* renamed from: b */
    private String f17726b;

    /* renamed from: c */
    private int f17727c = 200;

    /* renamed from: d */
    private String f17728d;

    /* renamed from: e */
    private List<String> f17729e = new ArrayList();

    /* renamed from: f */
    private List<String> f17730f = new ArrayList();

    /* renamed from: g */
    private String f17731g;

    /* renamed from: h */
    private long f17732h = -1;

    /* renamed from: i */
    private boolean f17733i;

    /* renamed from: a */
    public C6342g mo25660a(String str, String str2) {
        this.f17729e.add(C6381h0.m29663a(str));
        this.f17730f.add(C6381h0.m29663a(str2));
        return this;
    }

    /* renamed from: b */
    public InputStream mo25351b() throws IOException {
        return this.f17725a;
    }

    /* renamed from: c */
    public String mo25353c() {
        return this.f17731g;
    }

    /* renamed from: d */
    public long mo25354d() {
        return this.f17732h;
    }

    /* renamed from: e */
    public final String mo25355e() {
        return this.f17726b;
    }

    /* renamed from: f */
    public int mo25356f() {
        return this.f17729e.size();
    }

    /* renamed from: g */
    public String mo25357g() {
        return this.f17728d;
    }

    /* renamed from: h */
    public int mo25358h() {
        return this.f17727c;
    }

    /* renamed from: i */
    public String mo25359i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17727c);
        String str = this.f17728d;
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: j */
    public final List<String> mo25669j() {
        return this.f17729e;
    }

    /* renamed from: k */
    public final List<String> mo25670k() {
        return this.f17730f;
    }

    /* renamed from: l */
    public boolean mo25671l() {
        return this.f17733i;
    }

    /* renamed from: m */
    public C6342g mo25672m() {
        this.f17725a = null;
        mo25657a(0);
        return this;
    }

    /* renamed from: b */
    public String mo25352b(int i) {
        return (String) this.f17730f.get(i);
    }

    /* renamed from: c */
    public C6342g mo25667c(String str) {
        this.f17726b = str;
        return this;
    }

    /* renamed from: d */
    public C6342g mo25668d(String str) {
        this.f17728d = str;
        return this;
    }

    /* renamed from: a */
    public C6342g mo25659a(String str) {
        return str == null ? mo25672m() : mo25662a(C6399n0.m29727a(str));
    }

    /* renamed from: b */
    public C6342g mo25665b(List<String> list) {
        this.f17730f = (List) C6381h0.m29663a(list);
        return this;
    }

    /* renamed from: c */
    public C6342g mo25666c(int i) {
        this.f17727c = i;
        return this;
    }

    /* renamed from: a */
    public C6342g mo25662a(byte[] bArr) {
        if (bArr == null) {
            return mo25672m();
        }
        this.f17725a = new C6355e(bArr);
        mo25657a((long) bArr.length);
        return this;
    }

    /* renamed from: b */
    public C6342g mo25664b(String str) {
        this.f17731g = str;
        return this;
    }

    /* renamed from: a */
    public String mo25350a(int i) {
        return (String) this.f17729e.get(i);
    }

    /* renamed from: a */
    public C6342g mo25661a(List<String> list) {
        this.f17729e = (List) C6381h0.m29663a(list);
        return this;
    }

    /* renamed from: a */
    public C6342g mo25658a(InputStream inputStream) {
        this.f17725a = inputStream;
        return this;
    }

    /* renamed from: a */
    public C6342g mo25657a(long j) {
        this.f17732h = j;
        C6381h0.m29666a(j >= -1);
        return this;
    }

    /* renamed from: a */
    public void mo25663a() throws IOException {
        this.f17733i = true;
        super.mo25663a();
    }
}
