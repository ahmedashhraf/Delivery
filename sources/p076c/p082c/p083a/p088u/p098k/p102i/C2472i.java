package p076c.p082c.p083a.p088u.p098k.p102i;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p086s.C2262a;
import p076c.p082c.p083a.p086s.C2262a.C2263a;
import p076c.p082c.p083a.p086s.C2265c;
import p076c.p082c.p083a.p086s.C2266d;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p098k.C2446e;

/* renamed from: c.c.a.u.k.i.i */
/* compiled from: GifResourceDecoder */
public class C2472i implements C2274e<InputStream, C2458b> {

    /* renamed from: f */
    private static final String f9468f = "GifResourceDecoder";

    /* renamed from: g */
    private static final C2474b f9469g = new C2474b();

    /* renamed from: h */
    private static final C2473a f9470h = new C2473a();

    /* renamed from: a */
    private final Context f9471a;

    /* renamed from: b */
    private final C2474b f9472b;

    /* renamed from: c */
    private final C2330c f9473c;

    /* renamed from: d */
    private final C2473a f9474d;

    /* renamed from: e */
    private final C2457a f9475e;

    /* renamed from: c.c.a.u.k.i.i$a */
    /* compiled from: GifResourceDecoder */
    static class C2473a {

        /* renamed from: a */
        private final Queue<C2262a> f9476a = C2216i.m11342a(0);

        C2473a() {
        }

        /* renamed from: a */
        public synchronized C2262a mo9909a(C2263a aVar) {
            C2262a aVar2;
            aVar2 = (C2262a) this.f9476a.poll();
            if (aVar2 == null) {
                aVar2 = new C2262a(aVar);
            }
            return aVar2;
        }

        /* renamed from: a */
        public synchronized void mo9910a(C2262a aVar) {
            aVar.mo9586b();
            this.f9476a.offer(aVar);
        }
    }

    /* renamed from: c.c.a.u.k.i.i$b */
    /* compiled from: GifResourceDecoder */
    static class C2474b {

        /* renamed from: a */
        private final Queue<C2266d> f9477a = C2216i.m11342a(0);

        C2474b() {
        }

        /* renamed from: a */
        public synchronized C2266d mo9911a(byte[] bArr) {
            C2266d dVar;
            dVar = (C2266d) this.f9477a.poll();
            if (dVar == null) {
                dVar = new C2266d();
            }
            return dVar.mo9603a(bArr);
        }

        /* renamed from: a */
        public synchronized void mo9912a(C2266d dVar) {
            dVar.mo9604a();
            this.f9477a.offer(dVar);
        }
    }

    public C2472i(Context context) {
        this(context, C2232l.m11632a(context).mo9480e());
    }

    public String getId() {
        return "";
    }

    public C2472i(Context context, C2330c cVar) {
        this(context, cVar, f9469g, f9470h);
    }

    /* renamed from: a */
    public C2461d mo9641a(InputStream inputStream, int i, int i2) {
        byte[] a = m12388a(inputStream);
        C2266d a2 = this.f9472b.mo9911a(a);
        C2262a a3 = this.f9474d.mo9909a((C2263a) this.f9475e);
        try {
            C2461d a4 = m12387a(a, i, i2, a2, a3);
            return a4;
        } finally {
            this.f9472b.mo9912a(a2);
            this.f9474d.mo9910a(a3);
        }
    }

    C2472i(Context context, C2330c cVar, C2474b bVar, C2473a aVar) {
        this.f9471a = context;
        this.f9473c = cVar;
        this.f9474d = aVar;
        this.f9475e = new C2457a(cVar);
        this.f9472b = bVar;
    }

    /* renamed from: a */
    private C2461d m12387a(byte[] bArr, int i, int i2, C2266d dVar, C2262a aVar) {
        C2265c b = dVar.mo9605b();
        if (b.mo9600b() <= 0 || b.mo9601c() != 0) {
            return null;
        }
        Bitmap a = m12386a(aVar, b, bArr);
        if (a == null) {
            return null;
        }
        C2458b bVar = new C2458b(this.f9471a, this.f9475e, this.f9473c, C2446e.m12325a(), i, i2, b, bArr, a);
        return new C2461d(bVar);
    }

    /* renamed from: a */
    private Bitmap m12386a(C2262a aVar, C2265c cVar, byte[] bArr) {
        aVar.mo9585a(cVar, bArr);
        aVar.mo9584a();
        return aVar.mo9593i();
    }

    /* renamed from: a */
    private static byte[] m12388a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
