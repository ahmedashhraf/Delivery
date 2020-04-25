package p468g;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p470h.C13887c;
import p470h.C13894e;
import p470h.C13896f;

/* renamed from: g.f0 */
/* compiled from: ResponseBody */
public abstract class C13826f0 implements Closeable {
    @C5952h
    private Reader reader;

    /* renamed from: g.f0$a */
    /* compiled from: ResponseBody */
    class C13827a extends C13826f0 {

        /* renamed from: N */
        final /* synthetic */ C13894e f39990N;

        /* renamed from: a */
        final /* synthetic */ C13872x f39991a;

        /* renamed from: b */
        final /* synthetic */ long f39992b;

        C13827a(C13872x xVar, long j, C13894e eVar) {
            this.f39991a = xVar;
            this.f39992b = j;
            this.f39990N = eVar;
        }

        public long contentLength() {
            return this.f39992b;
        }

        @C5952h
        public C13872x contentType() {
            return this.f39991a;
        }

        public C13894e source() {
            return this.f39990N;
        }
    }

    /* renamed from: g.f0$b */
    /* compiled from: ResponseBody */
    static final class C13828b extends Reader {

        /* renamed from: N */
        private boolean f39993N;
        @C5952h

        /* renamed from: O */
        private Reader f39994O;

        /* renamed from: a */
        private final C13894e f39995a;

        /* renamed from: b */
        private final Charset f39996b;

        C13828b(C13894e eVar, Charset charset) {
            this.f39995a = eVar;
            this.f39996b = charset;
        }

        public void close() throws IOException {
            this.f39993N = true;
            Reader reader = this.f39994O;
            if (reader != null) {
                reader.close();
            } else {
                this.f39995a.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f39993N) {
                Reader reader = this.f39994O;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.f39995a.mo43833A(), C14910b.m66048a(this.f39995a, this.f39996b));
                    this.f39994O = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset charset() {
        C13872x contentType = contentType();
        return contentType != null ? contentType.mo43708a(C14910b.f43167j) : C14910b.f43167j;
    }

    public static C13826f0 create(@C5952h C13872x xVar, String str) {
        Charset charset = C14910b.f43167j;
        if (xVar != null) {
            charset = xVar.mo43707a();
            if (charset == null) {
                charset = C14910b.f43167j;
                StringBuilder sb = new StringBuilder();
                sb.append(xVar);
                sb.append("; charset=utf-8");
                xVar = C13872x.m59361b(sb.toString());
            }
        }
        C13887c a = new C13887c().m59518a(str, charset);
        return create(xVar, a.size(), a);
    }

    public final InputStream byteStream() {
        return source().mo43833A();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            C13894e source = source();
            try {
                byte[] o = source.mo43903o();
                C14910b.m66055a((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) o.length)) {
                    return o;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Content-Length (");
                sb.append(contentLength);
                sb.append(") and stream length (");
                sb.append(o.length);
                sb.append(") disagree");
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                C14910b.m66055a((Closeable) source);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot buffer entire body for content length: ");
            sb2.append(contentLength);
            throw new IOException(sb2.toString());
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        C13828b bVar = new C13828b(source(), charset());
        this.reader = bVar;
        return bVar;
    }

    public void close() {
        C14910b.m66055a((Closeable) source());
    }

    public abstract long contentLength();

    @C5952h
    public abstract C13872x contentType();

    public abstract C13894e source();

    public final String string() throws IOException {
        C13894e source = source();
        try {
            return source.mo43860a(C14910b.m66048a(source, charset()));
        } finally {
            C14910b.m66055a((Closeable) source);
        }
    }

    public static C13826f0 create(@C5952h C13872x xVar, byte[] bArr) {
        return create(xVar, (long) bArr.length, new C13887c().write(bArr));
    }

    public static C13826f0 create(@C5952h C13872x xVar, C13896f fVar) {
        return create(xVar, (long) fVar.mo43985r(), new C13887c().m59514a(fVar));
    }

    public static C13826f0 create(@C5952h C13872x xVar, long j, C13894e eVar) {
        if (eVar != null) {
            return new C13827a(xVar, j, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
