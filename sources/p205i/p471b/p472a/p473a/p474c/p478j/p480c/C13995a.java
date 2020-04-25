package p205i.p471b.p472a.p473a.p474c.p478j.p480c;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i.b.a.a.c.j.c.a */
/* compiled from: ContentTypeDetector */
public class C13995a {

    /* renamed from: c */
    public static final int f41142c = -1;

    /* renamed from: d */
    public static final int f41143d = -889275714;

    /* renamed from: e */
    public static final int f41144e = 1347093252;

    /* renamed from: f */
    public static final int f41145f = 529203200;

    /* renamed from: g */
    public static final int f41146g = -889270259;

    /* renamed from: h */
    private static final int f41147h = 8;

    /* renamed from: a */
    private final InputStream f41148a;

    /* renamed from: b */
    private final int f41149b;

    public C13995a(InputStream inputStream) throws IOException {
        if (inputStream.markSupported()) {
            this.f41148a = inputStream;
        } else {
            this.f41148a = new BufferedInputStream(inputStream, 8);
        }
        this.f41148a.mark(8);
        this.f41149b = m60358a(this.f41148a);
        this.f41148a.reset();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0 != 1347093252) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m60358a(java.io.InputStream r3) throws java.io.IOException {
        /*
            int r0 = m60359b(r3)
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            if (r0 == r1) goto L_0x0015
            r3 = -889270259(0xffffffffcafed00d, float:-8349702.5)
            if (r0 == r3) goto L_0x0014
            r3 = 1347093252(0x504b0304, float:1.36238899E10)
            if (r0 == r3) goto L_0x0014
            goto L_0x0021
        L_0x0014:
            return r3
        L_0x0015:
            int r3 = m60359b(r3)
            r2 = 196653(0x3002d, float:2.7557E-40)
            if (r3 == r2) goto L_0x002b
            switch(r3) {
                case 46: goto L_0x002b;
                case 47: goto L_0x002b;
                case 48: goto L_0x002b;
                case 49: goto L_0x002b;
                case 50: goto L_0x002b;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                default: goto L_0x0021;
            }
        L_0x0021:
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r0
            r0 = 529203200(0x1f8b0000, float:5.886879E-20)
            if (r3 != r0) goto L_0x0029
            return r0
        L_0x0029:
            r3 = -1
            return r3
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p478j.p480c.C13995a.m60358a(java.io.InputStream):int");
    }

    /* renamed from: b */
    private static int m60359b(InputStream inputStream) throws IOException {
        return inputStream.read() | (inputStream.read() << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
    }

    /* renamed from: b */
    public int mo44290b() {
        return this.f41149b;
    }

    /* renamed from: a */
    public InputStream mo44289a() {
        return this.f41148a;
    }
}
