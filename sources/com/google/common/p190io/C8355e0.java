package com.google.common.p190io;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C8309z3;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.io.e0 */
/* compiled from: Resources */
public final class C8355e0 {

    /* renamed from: com.google.common.io.e0$a */
    /* compiled from: Resources */
    static class C8356a implements C8423w<List<String>> {

        /* renamed from: a */
        final List<String> f22249a = C8309z3.m39648a();

        C8356a() {
        }

        /* renamed from: a */
        public boolean mo31447a(String str) {
            this.f22249a.add(str);
            return true;
        }

        public List<String> getResult() {
            return this.f22249a;
        }
    }

    /* renamed from: com.google.common.io.e0$b */
    /* compiled from: Resources */
    private static final class C8357b extends C8358f {

        /* renamed from: c */
        private final URL f22250c;

        /* synthetic */ C8357b(URL url, C8356a aVar) {
            this(url);
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return this.f22250c.openStream();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Resources.asByteSource(");
            sb.append(this.f22250c);
            sb.append(")");
            return sb.toString();
        }

        private C8357b(URL url) {
            this.f22250c = (URL) C7397x.m35664a(url);
        }
    }

    private C8355e0() {
    }

    /* renamed from: a */
    public static C8358f m39727a(URL url) {
        return new C8357b(url, null);
    }

    @Deprecated
    /* renamed from: b */
    public static C8421u<InputStream> m39733b(URL url) {
        return C8366g.m39799a(m39727a(url));
    }

    /* renamed from: c */
    public static byte[] m39736c(URL url) throws IOException {
        return m39727a(url).mo31460e();
    }

    /* renamed from: d */
    public static String m39737d(URL url, Charset charset) throws IOException {
        return m39728a(url, charset).mo31500e();
    }

    /* renamed from: a */
    public static C8377j m39728a(URL url, Charset charset) {
        return m39727a(url).mo31454a(charset);
    }

    @Deprecated
    /* renamed from: b */
    public static C8421u<InputStreamReader> m39734b(URL url, Charset charset) {
        return C8383k.m39875a(m39728a(url, charset));
    }

    /* renamed from: c */
    public static List<String> m39735c(URL url, Charset charset) throws IOException {
        return (List) m39729a(url, charset, new C8356a());
    }

    /* renamed from: a */
    public static <T> T m39729a(URL url, Charset charset, C8423w<T> wVar) throws IOException {
        return C8383k.m39883a(m39734b(url, charset), wVar);
    }

    /* renamed from: a */
    public static void m39732a(URL url, OutputStream outputStream) throws IOException {
        m39727a(url).mo31451a(outputStream);
    }

    /* renamed from: a */
    public static URL m39731a(String str) {
        URL resource = ((ClassLoader) C5827t.m25564b(Thread.currentThread().getContextClassLoader(), C8355e0.class.getClassLoader())).getResource(str);
        C7397x.m35672a(resource != null, "resource %s not found.", str);
        return resource;
    }

    /* renamed from: a */
    public static URL m39730a(Class<?> cls, String str) {
        URL resource = cls.getResource(str);
        C7397x.m35672a(resource != null, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }
}
