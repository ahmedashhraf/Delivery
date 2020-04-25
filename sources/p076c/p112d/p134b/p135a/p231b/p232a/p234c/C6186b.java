package p076c.p112d.p134b.p135a.p231b.p232a.p234c;

import android.annotation.TargetApi;
import android.util.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6291e;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@TargetApi(11)
@C2766f
/* renamed from: c.d.b.a.b.a.c.b */
/* compiled from: AndroidJsonGenerator */
class C6186b extends C6291e {

    /* renamed from: a */
    private final JsonWriter f17420a;

    /* renamed from: b */
    private final C6184a f17421b;

    /* renamed from: c.d.b.a.b.a.c.b$a */
    /* compiled from: AndroidJsonGenerator */
    static final class C6187a extends Number {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        private final String f17422a;

        C6187a(String str) {
            this.f17422a = str;
        }

        public double doubleValue() {
            return 0.0d;
        }

        public float floatValue() {
            return 0.0f;
        }

        public int intValue() {
            return 0;
        }

        public long longValue() {
            return 0;
        }

        public String toString() {
            return this.f17422a;
        }
    }

    C6186b(C6184a aVar, JsonWriter jsonWriter) {
        this.f17421b = aVar;
        this.f17420a = jsonWriter;
        jsonWriter.setLenient(true);
    }

    /* renamed from: a */
    public void mo25145a() throws IOException {
        this.f17420a.close();
    }

    /* renamed from: b */
    public void mo25155b(String str) throws IOException {
        this.f17420a.value(new C6187a(str));
    }

    /* renamed from: c */
    public void mo25156c() throws IOException {
        this.f17420a.flush();
    }

    /* renamed from: d */
    public C6290d mo25158d() {
        return this.f17421b;
    }

    /* renamed from: e */
    public void mo25159e() throws IOException {
        this.f17420a.endArray();
    }

    /* renamed from: f */
    public void mo25160f() throws IOException {
        this.f17420a.endObject();
    }

    /* renamed from: g */
    public void mo25161g() throws IOException {
        this.f17420a.nullValue();
    }

    /* renamed from: h */
    public void mo25162h() throws IOException {
        this.f17420a.beginArray();
    }

    /* renamed from: i */
    public void mo25163i() throws IOException {
        this.f17420a.beginObject();
    }

    /* renamed from: a */
    public void mo25153a(boolean z) throws IOException {
        this.f17420a.value(z);
    }

    /* renamed from: b */
    public void mo25154b() throws IOException {
        this.f17420a.setIndent("  ");
    }

    /* renamed from: c */
    public void mo25157c(String str) throws IOException {
        this.f17420a.value(str);
    }

    /* renamed from: a */
    public void mo25150a(String str) throws IOException {
        this.f17420a.name(str);
    }

    /* renamed from: a */
    public void mo25148a(int i) throws IOException {
        this.f17420a.value((long) i);
    }

    /* renamed from: a */
    public void mo25149a(long j) throws IOException {
        this.f17420a.value(j);
    }

    /* renamed from: a */
    public void mo25152a(BigInteger bigInteger) throws IOException {
        this.f17420a.value(bigInteger);
    }

    /* renamed from: a */
    public void mo25146a(double d) throws IOException {
        this.f17420a.value(d);
    }

    /* renamed from: a */
    public void mo25147a(float f) throws IOException {
        this.f17420a.value((double) f);
    }

    /* renamed from: a */
    public void mo25151a(BigDecimal bigDecimal) throws IOException {
        this.f17420a.value(bigDecimal);
    }
}
