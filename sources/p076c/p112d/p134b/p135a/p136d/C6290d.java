package p076c.p112d.p134b.p135a.p136d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import p076c.p112d.p134b.p135a.p143g.C6385j;

/* renamed from: c.d.b.a.d.d */
/* compiled from: JsonFactory */
public abstract class C6290d {
    /* renamed from: a */
    public abstract C6291e mo25139a(OutputStream outputStream, Charset charset) throws IOException;

    /* renamed from: a */
    public abstract C6291e mo25140a(Writer writer) throws IOException;

    /* renamed from: a */
    public final C6292f mo25493a() {
        return new C6292f(this);
    }

    /* renamed from: a */
    public abstract C6294g mo25141a(InputStream inputStream) throws IOException;

    /* renamed from: a */
    public abstract C6294g mo25142a(InputStream inputStream, Charset charset) throws IOException;

    /* renamed from: a */
    public abstract C6294g mo25143a(Reader reader) throws IOException;

    /* renamed from: a */
    public abstract C6294g mo25144a(String str) throws IOException;

    /* renamed from: b */
    public final String mo25499b(Object obj) throws IOException {
        return m29156b(obj, true);
    }

    /* renamed from: c */
    public final String mo25500c(Object obj) throws IOException {
        return m29156b(obj, false);
    }

    /* renamed from: b */
    private String m29156b(Object obj, boolean z) throws IOException {
        return m29155a(obj, z).toString("UTF-8");
    }

    /* renamed from: a */
    public final byte[] mo25498a(Object obj) throws IOException {
        return m29155a(obj, false).toByteArray();
    }

    /* renamed from: a */
    private ByteArrayOutputStream m29155a(Object obj, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6291e a = mo25139a((OutputStream) byteArrayOutputStream, C6385j.f17804a);
        if (z) {
            a.mo25154b();
        }
        a.mo25501a(obj);
        a.mo25156c();
        return byteArrayOutputStream;
    }

    /* renamed from: a */
    public final <T> T mo25497a(String str, Class<T> cls) throws IOException {
        return mo25144a(str).mo25512a(cls);
    }

    /* renamed from: a */
    public final <T> T mo25494a(InputStream inputStream, Class<T> cls) throws IOException {
        return mo25141a(inputStream).mo25524b(cls);
    }

    /* renamed from: a */
    public final <T> T mo25495a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo25142a(inputStream, charset).mo25524b(cls);
    }

    /* renamed from: a */
    public final <T> T mo25496a(Reader reader, Class<T> cls) throws IOException {
        return mo25143a(reader).mo25524b(cls);
    }
}
