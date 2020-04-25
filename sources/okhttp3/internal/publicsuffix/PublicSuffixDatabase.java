package okhttp3.internal.publicsuffix;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.C14910b;
import p205i.p489f.C14069f;
import p470h.C13883a0;
import p470h.C13894e;
import p470h.C13902l;
import p470h.C13906p;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final String f43743e = "publicsuffixes.gz";

    /* renamed from: f */
    private static final byte[] f43744f = {42};

    /* renamed from: g */
    private static final String[] f43745g = new String[0];

    /* renamed from: h */
    private static final String[] f43746h = {C14069f.f41343G};

    /* renamed from: i */
    private static final byte f43747i = 33;

    /* renamed from: j */
    private static final PublicSuffixDatabase f43748j = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f43749a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f43750b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f43751c;

    /* renamed from: d */
    private byte[] f43752d;

    /* renamed from: a */
    public static PublicSuffixDatabase m66658a() {
        return f43748j;
    }

    /* renamed from: b */
    private void m66660b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f43743e);
        if (resourceAsStream != null) {
            C13894e a = C13906p.m59739a((C13883a0) new C13902l(C13906p.m59736a(resourceAsStream)));
            try {
                byte[] bArr = new byte[a.readInt()];
                a.readFully(bArr);
                byte[] bArr2 = new byte[a.readInt()];
                a.readFully(bArr2);
                synchronized (this) {
                    this.f43751c = bArr;
                    this.f43752d = bArr2;
                }
                this.f43750b.countDown();
            } finally {
                C14910b.m66055a((Closeable) a);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66661c() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m66660b()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.j.f r2 = okhttp3.internal.p519j.C15011f.m66571d()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.mo46615a(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            goto L_0x0035
        L_0x0034:
            throw r1
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m66661c():void");
    }

    /* renamed from: a */
    public String mo46682a(String str) {
        int i;
        int i2;
        if (str != null) {
            String str2 = "\\.";
            String[] split = IDN.toUnicode(str).split(str2);
            String[] a = m66659a(split);
            if (split.length == a.length && a[0].charAt(0) != '!') {
                return null;
            }
            if (a[0].charAt(0) == '!') {
                i2 = split.length;
                i = a.length;
            } else {
                i2 = split.length;
                i = a.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split(str2);
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] m66659a(java.lang.String[] r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f43749a
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0016
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f43749a
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0016
            r7.m66661c()
            goto L_0x0023
        L_0x0016:
            java.util.concurrent.CountDownLatch r0 = r7.f43750b     // Catch:{ InterruptedException -> 0x001c }
            r0.await()     // Catch:{ InterruptedException -> 0x001c }
            goto L_0x0023
        L_0x001c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0023:
            monitor-enter(r7)
            byte[] r0 = r7.f43751c     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00bf
            monitor-exit(r7)     // Catch:{ all -> 0x00c7 }
            int r0 = r8.length
            byte[][] r0 = new byte[r0][]
            r3 = 0
        L_0x002d:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x003d
            r4 = r8[r3]
            java.nio.charset.Charset r5 = okhttp3.internal.C14910b.f43167j
            byte[] r4 = r4.getBytes(r5)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x002d
        L_0x003d:
            r8 = 0
        L_0x003e:
            int r3 = r0.length
            r4 = 0
            if (r8 >= r3) goto L_0x004e
            byte[] r3 = r7.f43751c
            java.lang.String r3 = m66657a(r3, r0, r8)
            if (r3 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            int r8 = r8 + 1
            goto L_0x003e
        L_0x004e:
            r3 = r4
        L_0x004f:
            int r8 = r0.length
            if (r8 <= r2) goto L_0x006d
            java.lang.Object r8 = r0.clone()
            byte[][] r8 = (byte[][]) r8
            r5 = 0
        L_0x0059:
            int r6 = r8.length
            int r6 = r6 - r2
            if (r5 >= r6) goto L_0x006d
            byte[] r6 = f43744f
            r8[r5] = r6
            byte[] r6 = r7.f43751c
            java.lang.String r6 = m66657a(r6, r8, r5)
            if (r6 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x006d:
            r6 = r4
        L_0x006e:
            if (r6 == 0) goto L_0x0080
        L_0x0070:
            int r8 = r0.length
            int r8 = r8 - r2
            if (r1 >= r8) goto L_0x0080
            byte[] r8 = r7.f43752d
            java.lang.String r8 = m66657a(r8, r0, r1)
            if (r8 == 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0070
        L_0x0080:
            r8 = r4
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "!"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "\\."
            java.lang.String[] r8 = r8.split(r0)
            return r8
        L_0x009b:
            if (r3 != 0) goto L_0x00a2
            if (r6 != 0) goto L_0x00a2
            java.lang.String[] r8 = f43746h
            return r8
        L_0x00a2:
            if (r3 == 0) goto L_0x00ab
            java.lang.String r8 = "\\."
            java.lang.String[] r8 = r3.split(r8)
            goto L_0x00ad
        L_0x00ab:
            java.lang.String[] r8 = f43745g
        L_0x00ad:
            if (r6 == 0) goto L_0x00b6
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r6.split(r0)
            goto L_0x00b8
        L_0x00b6:
            java.lang.String[] r0 = f43745g
        L_0x00b8:
            int r1 = r8.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r8 = r0
        L_0x00be:
            return r8
        L_0x00bf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r8.<init>(r0)     // Catch:{ all -> 0x00c7 }
            throw r8     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c7 }
            goto L_0x00cb
        L_0x00ca:
            throw r8
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m66659a(java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: a */
    private static String m66657a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z) {
                    z = false;
                    b = 46;
                } else {
                    b = bArr4[i9][i10] & 255;
                }
                i3 = b - (bArr3[i6 + i11] & 255);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length == i10) {
                        if (i9 == bArr4.length - 1) {
                            break;
                        }
                        i9++;
                        z = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, C14910b.f43167j);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46683a(byte[] bArr, byte[] bArr2) {
        this.f43751c = bArr;
        this.f43752d = bArr2;
        this.f43749a.set(true);
        this.f43750b.countDown();
    }
}
