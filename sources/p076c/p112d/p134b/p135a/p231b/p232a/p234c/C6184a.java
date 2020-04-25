package p076c.p112d.p134b.p135a.p231b.p232a.p234c;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6291e;
import p076c.p112d.p134b.p135a.p136d.C6294g;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6385j;
import p076c.p112d.p134b.p135a.p231b.p232a.C6181a;

@TargetApi(11)
@C2766f
/* renamed from: c.d.b.a.b.a.c.a */
/* compiled from: AndroidJsonFactory */
public class C6184a extends C6290d {

    @C2766f
    /* renamed from: c.d.b.a.b.a.c.a$a */
    /* compiled from: AndroidJsonFactory */
    static class C6185a {

        /* renamed from: a */
        static final C6184a f17419a = new C6184a();

        C6185a() {
        }
    }

    public C6184a() {
        C6181a.m28396a(11);
    }

    /* renamed from: b */
    public static C6184a m28399b() {
        return C6185a.f17419a;
    }

    /* renamed from: a */
    public C6294g mo25141a(InputStream inputStream) {
        return mo25143a((Reader) new InputStreamReader(inputStream, C6385j.f17804a));
    }

    /* renamed from: a */
    public C6294g mo25142a(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return mo25141a(inputStream);
        }
        return mo25143a((Reader) new InputStreamReader(inputStream, charset));
    }

    /* renamed from: a */
    public C6294g mo25144a(String str) {
        return mo25143a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public C6294g mo25143a(Reader reader) {
        return new C6188c(this, new JsonReader(reader));
    }

    /* renamed from: a */
    public C6291e mo25139a(OutputStream outputStream, Charset charset) {
        return mo25140a((Writer) new OutputStreamWriter(outputStream, charset));
    }

    /* renamed from: a */
    public C6291e mo25140a(Writer writer) {
        return new C6186b(this, new JsonWriter(writer));
    }
}
