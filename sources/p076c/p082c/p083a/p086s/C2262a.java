package p076c.p082c.p083a.p086s;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: c.c.a.s.a */
/* compiled from: GifDecoder */
public class C2262a {

    /* renamed from: A */
    private static final int f8943A = -1;

    /* renamed from: B */
    private static final int f8944B = -1;

    /* renamed from: C */
    private static final Config f8945C = Config.ARGB_8888;

    /* renamed from: q */
    private static final String f8946q = "a";

    /* renamed from: r */
    public static final int f8947r = 0;

    /* renamed from: s */
    public static final int f8948s = 1;

    /* renamed from: t */
    public static final int f8949t = 2;

    /* renamed from: u */
    public static final int f8950u = 3;

    /* renamed from: v */
    private static final int f8951v = 4096;

    /* renamed from: w */
    private static final int f8952w = 0;

    /* renamed from: x */
    private static final int f8953x = 1;

    /* renamed from: y */
    private static final int f8954y = 2;

    /* renamed from: z */
    private static final int f8955z = 3;

    /* renamed from: a */
    private int[] f8956a;

    /* renamed from: b */
    private ByteBuffer f8957b;

    /* renamed from: c */
    private final byte[] f8958c = new byte[256];

    /* renamed from: d */
    private C2266d f8959d;

    /* renamed from: e */
    private short[] f8960e;

    /* renamed from: f */
    private byte[] f8961f;

    /* renamed from: g */
    private byte[] f8962g;

    /* renamed from: h */
    private byte[] f8963h;

    /* renamed from: i */
    private int[] f8964i;

    /* renamed from: j */
    private int f8965j;

    /* renamed from: k */
    private byte[] f8966k;

    /* renamed from: l */
    private C2265c f8967l;

    /* renamed from: m */
    private C2263a f8968m;

    /* renamed from: n */
    private Bitmap f8969n;

    /* renamed from: o */
    private boolean f8970o;

    /* renamed from: p */
    private int f8971p;

    /* renamed from: c.c.a.s.a$a */
    /* compiled from: GifDecoder */
    public interface C2263a {
        /* renamed from: a */
        Bitmap mo9597a(int i, int i2, Config config);

        /* renamed from: a */
        void mo9598a(Bitmap bitmap);
    }

    public C2262a(C2263a aVar) {
        this.f8968m = aVar;
        this.f8967l = new C2265c();
    }

    /* renamed from: m */
    private C2266d m11821m() {
        if (this.f8959d == null) {
            this.f8959d = new C2266d();
        }
        return this.f8959d;
    }

    /* renamed from: n */
    private Bitmap m11822n() {
        C2263a aVar = this.f8968m;
        C2265c cVar = this.f8967l;
        Bitmap a = aVar.mo9597a(cVar.f8988f, cVar.f8989g, f8945C);
        if (a == null) {
            C2265c cVar2 = this.f8967l;
            a = Bitmap.createBitmap(cVar2.f8988f, cVar2.f8989g, f8945C);
        }
        m11819a(a);
        return a;
    }

    /* renamed from: o */
    private int m11823o() {
        try {
            return this.f8957b.get() & 255;
        } catch (Exception unused) {
            this.f8971p = 1;
            return 0;
        }
    }

    /* renamed from: p */
    private int m11824p() {
        int o = m11823o();
        int i = 0;
        if (o > 0) {
            while (i < o) {
                int i2 = o - i;
                try {
                    this.f8957b.get(this.f8958c, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    this.f8971p = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo9584a() {
        this.f8965j = (this.f8965j + 1) % this.f8967l.f8985c;
    }

    /* renamed from: b */
    public void mo9586b() {
        this.f8967l = null;
        this.f8966k = null;
        this.f8963h = null;
        this.f8964i = null;
        Bitmap bitmap = this.f8969n;
        if (bitmap != null) {
            this.f8968m.mo9598a(bitmap);
        }
        this.f8969n = null;
        this.f8957b = null;
    }

    /* renamed from: c */
    public int mo9587c() {
        return this.f8965j;
    }

    /* renamed from: d */
    public byte[] mo9588d() {
        return this.f8966k;
    }

    /* renamed from: e */
    public int mo9589e() {
        return this.f8967l.f8985c;
    }

    /* renamed from: f */
    public int mo9590f() {
        return this.f8967l.f8989g;
    }

    /* renamed from: g */
    public int mo9591g() {
        return this.f8967l.f8995m;
    }

    /* renamed from: h */
    public int mo9592h() {
        if (this.f8967l.f8985c > 0) {
            int i = this.f8965j;
            if (i >= 0) {
                return mo9581a(i);
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a9, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo9593i() {
        /*
            r9 = this;
            monitor-enter(r9)
            c.c.a.s.c r0 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            int r0 = r0.f8985c     // Catch:{ all -> 0x00c6 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r9.f8965j     // Catch:{ all -> 0x00c6 }
            if (r0 >= 0) goto L_0x0035
        L_0x000d:
            java.lang.String r0 = f8946q     // Catch:{ all -> 0x00c6 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = "unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00c6 }
            c.c.a.s.c r3 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            int r3 = r3.f8985c     // Catch:{ all -> 0x00c6 }
            r0.append(r3)     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = " framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00c6 }
            int r3 = r9.f8965j     // Catch:{ all -> 0x00c6 }
            r0.append(r3)     // Catch:{ all -> 0x00c6 }
            r0.toString()     // Catch:{ all -> 0x00c6 }
        L_0x0033:
            r9.f8971p = r2     // Catch:{ all -> 0x00c6 }
        L_0x0035:
            int r0 = r9.f8971p     // Catch:{ all -> 0x00c6 }
            r3 = 0
            if (r0 == r2) goto L_0x00aa
            int r0 = r9.f8971p     // Catch:{ all -> 0x00c6 }
            r4 = 2
            if (r0 != r4) goto L_0x0040
            goto L_0x00aa
        L_0x0040:
            r0 = 0
            r9.f8971p = r0     // Catch:{ all -> 0x00c6 }
            c.c.a.s.c r4 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            java.util.List<c.c.a.s.b> r4 = r4.f8987e     // Catch:{ all -> 0x00c6 }
            int r5 = r9.f8965j     // Catch:{ all -> 0x00c6 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00c6 }
            c.c.a.s.b r4 = (p076c.p082c.p083a.p086s.C2264b) r4     // Catch:{ all -> 0x00c6 }
            int r5 = r9.f8965j     // Catch:{ all -> 0x00c6 }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x005f
            c.c.a.s.c r6 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            java.util.List<c.c.a.s.b> r6 = r6.f8987e     // Catch:{ all -> 0x00c6 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x00c6 }
            c.c.a.s.b r5 = (p076c.p082c.p083a.p086s.C2264b) r5     // Catch:{ all -> 0x00c6 }
            goto L_0x0060
        L_0x005f:
            r5 = r3
        L_0x0060:
            int[] r6 = r4.f8982k     // Catch:{ all -> 0x00c6 }
            if (r6 != 0) goto L_0x006b
            c.c.a.s.c r6 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            int[] r6 = r6.f8983a     // Catch:{ all -> 0x00c6 }
            r9.f8956a = r6     // Catch:{ all -> 0x00c6 }
            goto L_0x007b
        L_0x006b:
            int[] r6 = r4.f8982k     // Catch:{ all -> 0x00c6 }
            r9.f8956a = r6     // Catch:{ all -> 0x00c6 }
            c.c.a.s.c r6 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            int r6 = r6.f8992j     // Catch:{ all -> 0x00c6 }
            int r7 = r4.f8979h     // Catch:{ all -> 0x00c6 }
            if (r6 != r7) goto L_0x007b
            c.c.a.s.c r6 = r9.f8967l     // Catch:{ all -> 0x00c6 }
            r6.f8994l = r0     // Catch:{ all -> 0x00c6 }
        L_0x007b:
            boolean r6 = r4.f8977f     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x008c
            int[] r6 = r9.f8956a     // Catch:{ all -> 0x00c6 }
            int r7 = r4.f8979h     // Catch:{ all -> 0x00c6 }
            r6 = r6[r7]     // Catch:{ all -> 0x00c6 }
            int[] r7 = r9.f8956a     // Catch:{ all -> 0x00c6 }
            int r8 = r4.f8979h     // Catch:{ all -> 0x00c6 }
            r7[r8] = r0     // Catch:{ all -> 0x00c6 }
            r0 = r6
        L_0x008c:
            int[] r6 = r9.f8956a     // Catch:{ all -> 0x00c6 }
            if (r6 != 0) goto L_0x009a
            java.lang.String r0 = f8946q     // Catch:{ all -> 0x00c6 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c6 }
            r9.f8971p = r2     // Catch:{ all -> 0x00c6 }
            monitor-exit(r9)
            return r3
        L_0x009a:
            android.graphics.Bitmap r1 = r9.m11818a(r4, r5)     // Catch:{ all -> 0x00c6 }
            boolean r2 = r4.f8977f     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00a8
            int[] r2 = r9.f8956a     // Catch:{ all -> 0x00c6 }
            int r3 = r4.f8979h     // Catch:{ all -> 0x00c6 }
            r2[r3] = r0     // Catch:{ all -> 0x00c6 }
        L_0x00a8:
            monitor-exit(r9)
            return r1
        L_0x00aa:
            java.lang.String r0 = f8946q     // Catch:{ all -> 0x00c6 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00c6 }
            int r1 = r9.f8971p     // Catch:{ all -> 0x00c6 }
            r0.append(r1)     // Catch:{ all -> 0x00c6 }
            r0.toString()     // Catch:{ all -> 0x00c6 }
        L_0x00c4:
            monitor-exit(r9)
            return r3
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p086s.C2262a.mo9593i():android.graphics.Bitmap");
    }

    /* renamed from: j */
    public int mo9594j() {
        return this.f8971p;
    }

    /* renamed from: k */
    public int mo9595k() {
        return this.f8967l.f8988f;
    }

    /* renamed from: l */
    public void mo9596l() {
        this.f8965j = -1;
    }

    /* renamed from: a */
    public int mo9581a(int i) {
        if (i >= 0) {
            C2265c cVar = this.f8967l;
            if (i < cVar.f8985c) {
                return ((C2264b) cVar.f8987e.get(i)).f8980i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int mo9582a(InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                mo9583a(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.f8971p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f8971p;
    }

    /* renamed from: a */
    public void mo9585a(C2265c cVar, byte[] bArr) {
        this.f8967l = cVar;
        this.f8966k = bArr;
        this.f8971p = 0;
        this.f8965j = -1;
        this.f8957b = ByteBuffer.wrap(bArr);
        this.f8957b.rewind();
        this.f8957b.order(ByteOrder.LITTLE_ENDIAN);
        this.f8970o = false;
        Iterator it = cVar.f8987e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C2264b) it.next()).f8978g == 3) {
                    this.f8970o = true;
                    break;
                }
            } else {
                break;
            }
        }
        int i = cVar.f8988f;
        int i2 = cVar.f8989g;
        this.f8963h = new byte[(i * i2)];
        this.f8964i = new int[(i * i2)];
    }

    /* renamed from: a */
    public int mo9583a(byte[] bArr) {
        this.f8966k = bArr;
        this.f8967l = m11821m().mo9603a(bArr).mo9605b();
        if (bArr != null) {
            this.f8957b = ByteBuffer.wrap(bArr);
            this.f8957b.rewind();
            this.f8957b.order(ByteOrder.LITTLE_ENDIAN);
            C2265c cVar = this.f8967l;
            int i = cVar.f8988f;
            int i2 = cVar.f8989g;
            this.f8963h = new byte[(i * i2)];
            this.f8964i = new int[(i * i2)];
            this.f8970o = false;
            Iterator it = cVar.f8987e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C2264b) it.next()).f8978g == 3) {
                        this.f8970o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return this.f8971p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009c A[EDGE_INSN: B:54:0x009c->B:43:0x009c ?: BREAK  
    EDGE_INSN: B:54:0x009c->B:43:0x009c ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m11818a(p076c.p082c.p083a.p086s.C2264b r18, p076c.p082c.p083a.p086s.C2264b r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            c.c.a.s.c r3 = r0.f8967l
            int r12 = r3.f8988f
            int r13 = r3.f8989g
            int[] r14 = r0.f8964i
            r15 = 3
            r16 = 0
            r11 = 2
            if (r2 == 0) goto L_0x0038
            int r2 = r2.f8978g
            if (r2 <= 0) goto L_0x0038
            if (r2 != r11) goto L_0x0026
            boolean r2 = r1.f8977f
            if (r2 != 0) goto L_0x0021
            int r2 = r3.f8994l
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            java.util.Arrays.fill(r14, r2)
            goto L_0x0038
        L_0x0026:
            if (r2 != r15) goto L_0x0038
            android.graphics.Bitmap r4 = r0.f8969n
            if (r4 == 0) goto L_0x0038
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r7 = r12
            r10 = r12
            r2 = 2
            r11 = r13
            r4.getPixels(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x0038:
            r2 = 2
        L_0x0039:
            r17.m11820a(r18)
            r3 = 8
            r11 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 8
        L_0x0044:
            int r7 = r1.f8975d
            if (r3 >= r7) goto L_0x009c
            boolean r8 = r1.f8976e
            if (r8 == 0) goto L_0x0062
            r8 = 4
            if (r4 < r7) goto L_0x005f
            int r5 = r5 + 1
            if (r5 == r2) goto L_0x005e
            if (r5 == r15) goto L_0x005b
            if (r5 == r8) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            r4 = 1
            r6 = 2
            goto L_0x005f
        L_0x005b:
            r4 = 2
            r6 = 4
            goto L_0x005f
        L_0x005e:
            r4 = 4
        L_0x005f:
            int r7 = r4 + r6
            goto L_0x0064
        L_0x0062:
            r7 = r4
            r4 = r3
        L_0x0064:
            int r8 = r1.f8973b
            int r4 = r4 + r8
            c.c.a.s.c r8 = r0.f8967l
            int r9 = r8.f8989g
            if (r4 >= r9) goto L_0x0097
            int r8 = r8.f8988f
            int r4 = r4 * r8
            int r9 = r1.f8972a
            int r9 = r9 + r4
            int r10 = r1.f8974c
            int r10 = r10 + r9
            int r2 = r4 + r8
            if (r2 >= r10) goto L_0x007d
            int r10 = r4 + r8
        L_0x007d:
            int r2 = r1.f8974c
            int r2 = r2 * r3
        L_0x0081:
            if (r9 >= r10) goto L_0x0097
            byte[] r4 = r0.f8963h
            int r8 = r2 + 1
            byte r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int[] r4 = r0.f8956a
            r2 = r4[r2]
            if (r2 == 0) goto L_0x0093
            r14[r9] = r2
        L_0x0093:
            int r9 = r9 + 1
            r2 = r8
            goto L_0x0081
        L_0x0097:
            int r3 = r3 + 1
            r4 = r7
            r2 = 2
            goto L_0x0044
        L_0x009c:
            boolean r2 = r0.f8970o
            if (r2 == 0) goto L_0x00bc
            int r1 = r1.f8978g
            if (r1 == 0) goto L_0x00a6
            if (r1 != r11) goto L_0x00bc
        L_0x00a6:
            android.graphics.Bitmap r1 = r0.f8969n
            if (r1 != 0) goto L_0x00b0
            android.graphics.Bitmap r1 = r17.m11822n()
            r0.f8969n = r1
        L_0x00b0:
            android.graphics.Bitmap r4 = r0.f8969n
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r7 = r12
            r10 = r12
            r11 = r13
            r4.setPixels(r5, r6, r7, r8, r9, r10, r11)
        L_0x00bc:
            android.graphics.Bitmap r1 = r17.m11822n()
            r6 = 0
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r14
            r7 = r12
            r10 = r12
            r11 = r13
            r4.setPixels(r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p086s.C2262a.m11818a(c.c.a.s.b, c.c.a.s.b):android.graphics.Bitmap");
    }

    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r23v0 */
    /* JADX WARNING: type inference failed for: r23v1 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r23v2 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r5v11, types: [short[]] */
    /* JADX WARNING: type inference failed for: r1v22, types: [short] */
    /* JADX WARNING: type inference failed for: r1v24, types: [int] */
    /* JADX WARNING: type inference failed for: r23v7 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r23v8 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r23v9 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r23v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r1v22, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r5v11, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v3
      assigns: []
      uses: []
      mth insns count: 195
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0135 A[LOOP:4: B:58:0x0133->B:59:0x0135, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11820a(p076c.p082c.p083a.p086s.C2264b r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f8957b
            int r3 = r1.f8981j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            c.c.a.s.c r1 = r0.f8967l
            int r2 = r1.f8988f
            int r1 = r1.f8989g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f8974c
            int r1 = r1.f8975d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f8963h
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x0027
        L_0x0023:
            byte[] r1 = new byte[r2]
            r0.f8963h = r1
        L_0x0027:
            short[] r1 = r0.f8960e
            r3 = 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x0031
            short[] r1 = new short[r3]
            r0.f8960e = r1
        L_0x0031:
            byte[] r1 = r0.f8961f
            if (r1 != 0) goto L_0x0039
            byte[] r1 = new byte[r3]
            r0.f8961f = r1
        L_0x0039:
            byte[] r1 = r0.f8962g
            if (r1 != 0) goto L_0x0043
            r1 = 4097(0x1001, float:5.741E-42)
            byte[] r1 = new byte[r1]
            r0.f8962g = r1
        L_0x0043:
            int r1 = r27.m11823o()
            r4 = 1
            int r5 = r4 << r1
            int r6 = r5 + 1
            int r7 = r5 + 2
            int r1 = r1 + r4
            int r8 = r4 << r1
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x0054:
            if (r10 >= r5) goto L_0x0062
            short[] r11 = r0.f8960e
            r11[r10] = r9
            byte[] r11 = r0.f8961f
            byte r12 = (byte) r10
            r11[r10] = r12
            int r10 = r10 + 1
            goto L_0x0054
        L_0x0062:
            r10 = -1
            r21 = r1
            r19 = r7
            r20 = r8
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = -1
        L_0x0076:
            if (r11 >= r2) goto L_0x016f
            r9 = 3
            if (r12 != 0) goto L_0x0086
            int r12 = r27.m11824p()
            if (r12 > 0) goto L_0x0085
            r0.f8971p = r9
            goto L_0x016f
        L_0x0085:
            r14 = 0
        L_0x0086:
            byte[] r3 = r0.f8958c
            byte r3 = r3[r14]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r15
            int r13 = r13 + r3
            int r15 = r15 + 8
            int r14 = r14 + r4
            int r12 = r12 + r10
            r23 = r17
            r3 = r21
            r4 = r22
            r26 = r16
            r16 = r11
            r11 = r19
            r19 = r18
            r18 = r26
        L_0x00a2:
            if (r15 < r3) goto L_0x0153
            r10 = r13 & r20
            int r13 = r13 >> r3
            int r15 = r15 - r3
            if (r10 != r5) goto L_0x00b1
            r3 = r1
            r11 = r7
            r20 = r8
            r4 = -1
        L_0x00af:
            r10 = -1
            goto L_0x00a2
        L_0x00b1:
            if (r10 <= r11) goto L_0x00b6
            r0.f8971p = r9
            goto L_0x00b8
        L_0x00b6:
            if (r10 != r6) goto L_0x00c5
        L_0x00b8:
            r21 = r3
            r22 = r4
            r17 = r23
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 1
            r9 = 0
            r10 = -1
            goto L_0x0163
        L_0x00c5:
            r9 = -1
            if (r4 != r9) goto L_0x00d9
            byte[] r4 = r0.f8962g
            int r21 = r19 + 1
            byte[] r9 = r0.f8961f
            byte r9 = r9[r10]
            r4[r19] = r9
            r4 = r10
            r23 = r4
            r19 = r21
            r9 = 3
            goto L_0x00af
        L_0x00d9:
            if (r10 < r11) goto L_0x00ea
            byte[] r9 = r0.f8962g
            int r21 = r19 + 1
            r24 = r1
            r1 = r23
            byte r1 = (byte) r1
            r9[r19] = r1
            r1 = r4
            r19 = r21
            goto L_0x00ed
        L_0x00ea:
            r24 = r1
            r1 = r10
        L_0x00ed:
            if (r1 < r5) goto L_0x0104
            byte[] r9 = r0.f8962g
            int r21 = r19 + 1
            r23 = r5
            byte[] r5 = r0.f8961f
            byte r5 = r5[r1]
            r9[r19] = r5
            short[] r5 = r0.f8960e
            short r1 = r5[r1]
            r19 = r21
            r5 = r23
            goto L_0x00ed
        L_0x0104:
            r23 = r5
            byte[] r5 = r0.f8961f
            byte r1 = r5[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r9 = r0.f8962g
            int r21 = r19 + 1
            r25 = r6
            byte r6 = (byte) r1
            r9[r19] = r6
            r9 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r9) goto L_0x012f
            short[] r9 = r0.f8960e
            short r4 = (short) r4
            r9[r11] = r4
            r5[r11] = r6
            int r11 = r11 + 1
            r4 = r11 & r20
            if (r4 != 0) goto L_0x012f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x0131
            int r3 = r3 + 1
            int r20 = r20 + r11
            goto L_0x0131
        L_0x012f:
            r5 = 4096(0x1000, float:5.74E-42)
        L_0x0131:
            r19 = r21
        L_0x0133:
            if (r19 <= 0) goto L_0x0146
            int r19 = r19 + -1
            byte[] r4 = r0.f8963h
            int r6 = r18 + 1
            byte[] r9 = r0.f8962g
            byte r9 = r9[r19]
            r4[r18] = r9
            int r16 = r16 + 1
            r18 = r6
            goto L_0x0133
        L_0x0146:
            r4 = r10
            r5 = r23
            r6 = r25
            r9 = 3
            r10 = -1
            r23 = r1
            r1 = r24
            goto L_0x00a2
        L_0x0153:
            r24 = r1
            r1 = r23
            r17 = r1
            r21 = r3
            r22 = r4
            r1 = r24
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 1
            r9 = 0
        L_0x0163:
            r26 = r19
            r19 = r11
            r11 = r16
            r16 = r18
            r18 = r26
            goto L_0x0076
        L_0x016f:
            r1 = r16
        L_0x0171:
            if (r1 >= r2) goto L_0x017b
            byte[] r3 = r0.f8963h
            r4 = 0
            r3[r1] = r4
            int r1 = r1 + 1
            goto L_0x0171
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p086s.C2262a.m11820a(c.c.a.s.b):void");
    }

    @TargetApi(12)
    /* renamed from: a */
    private static void m11819a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }
}
