package p076c.p082c.p083a.p088u.p098k.p101h;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.C2322l;

/* renamed from: c.c.a.u.k.h.c */
/* compiled from: FileToStreamDecoder */
public class C2452c<T> implements C2274e<File, T> {

    /* renamed from: c */
    private static final C2453a f9415c = new C2453a();

    /* renamed from: a */
    private C2274e<InputStream, T> f9416a;

    /* renamed from: b */
    private final C2453a f9417b;

    /* renamed from: c.c.a.u.k.h.c$a */
    /* compiled from: FileToStreamDecoder */
    static class C2453a {
        C2453a() {
        }

        /* renamed from: a */
        public InputStream mo9866a(File file) throws FileNotFoundException {
            return new FileInputStream(file);
        }
    }

    public C2452c(C2274e<InputStream, T> eVar) {
        this(eVar, f9415c);
    }

    public String getId() {
        return "";
    }

    C2452c(C2274e<InputStream, T> eVar, C2453a aVar) {
        this.f9416a = eVar;
        this.f9417b = aVar;
    }

    /* renamed from: a */
    public C2322l<T> mo9641a(File file, int i, int i2) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = this.f9417b.mo9866a(file);
            C2322l<T> a = this.f9416a.mo9641a(inputStream, i, i2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
