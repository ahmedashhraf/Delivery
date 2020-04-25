package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* renamed from: c.d.b.a.g.e0 */
/* compiled from: ObjectParser */
public interface C6372e0 {
    /* renamed from: a */
    <T> T mo25503a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException;

    /* renamed from: a */
    Object mo25504a(InputStream inputStream, Charset charset, Type type) throws IOException;

    /* renamed from: a */
    <T> T mo25505a(Reader reader, Class<T> cls) throws IOException;

    /* renamed from: a */
    Object mo25506a(Reader reader, Type type) throws IOException;
}
