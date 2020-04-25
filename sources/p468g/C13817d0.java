package p468g;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p470h.C13883a0;
import p470h.C13892d;
import p470h.C13896f;
import p470h.C13906p;

/* renamed from: g.d0 */
/* compiled from: RequestBody */
public abstract class C13817d0 {

    /* renamed from: g.d0$a */
    /* compiled from: RequestBody */
    class C13818a extends C13817d0 {

        /* renamed from: a */
        final /* synthetic */ C13872x f39957a;

        /* renamed from: b */
        final /* synthetic */ C13896f f39958b;

        C13818a(C13872x xVar, C13896f fVar) {
            this.f39957a = xVar;
            this.f39958b = fVar;
        }

        public long contentLength() throws IOException {
            return (long) this.f39958b.mo43985r();
        }

        @C5952h
        public C13872x contentType() {
            return this.f39957a;
        }

        public void writeTo(C13892d dVar) throws IOException {
            dVar.mo43847a(this.f39958b);
        }
    }

    /* renamed from: g.d0$b */
    /* compiled from: RequestBody */
    class C13819b extends C13817d0 {

        /* renamed from: a */
        final /* synthetic */ C13872x f39959a;

        /* renamed from: b */
        final /* synthetic */ int f39960b;

        /* renamed from: c */
        final /* synthetic */ byte[] f39961c;

        /* renamed from: d */
        final /* synthetic */ int f39962d;

        C13819b(C13872x xVar, int i, byte[] bArr, int i2) {
            this.f39959a = xVar;
            this.f39960b = i;
            this.f39961c = bArr;
            this.f39962d = i2;
        }

        public long contentLength() {
            return (long) this.f39960b;
        }

        @C5952h
        public C13872x contentType() {
            return this.f39959a;
        }

        public void writeTo(C13892d dVar) throws IOException {
            dVar.write(this.f39961c, this.f39962d, this.f39960b);
        }
    }

    /* renamed from: g.d0$c */
    /* compiled from: RequestBody */
    class C13820c extends C13817d0 {

        /* renamed from: a */
        final /* synthetic */ C13872x f39963a;

        /* renamed from: b */
        final /* synthetic */ File f39964b;

        C13820c(C13872x xVar, File file) {
            this.f39963a = xVar;
            this.f39964b = file;
        }

        public long contentLength() {
            return this.f39964b.length();
        }

        @C5952h
        public C13872x contentType() {
            return this.f39963a;
        }

        public void writeTo(C13892d dVar) throws IOException {
            C13883a0 a0Var = null;
            try {
                a0Var = C13906p.m59750c(this.f39964b);
                dVar.mo43842a(a0Var);
            } finally {
                C14910b.m66055a((Closeable) a0Var);
            }
        }
    }

    public static C13817d0 create(@C5952h C13872x xVar, String str) {
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
        return create(xVar, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @C5952h
    public abstract C13872x contentType();

    public abstract void writeTo(C13892d dVar) throws IOException;

    public static C13817d0 create(@C5952h C13872x xVar, C13896f fVar) {
        return new C13818a(xVar, fVar);
    }

    public static C13817d0 create(@C5952h C13872x xVar, byte[] bArr) {
        return create(xVar, bArr, 0, bArr.length);
    }

    public static C13817d0 create(@C5952h C13872x xVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C14910b.m66054a((long) bArr.length, (long) i, (long) i2);
            return new C13819b(xVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public static C13817d0 create(@C5952h C13872x xVar, File file) {
        if (file != null) {
            return new C13820c(xVar, file);
        }
        throw new NullPointerException("file == null");
    }
}
