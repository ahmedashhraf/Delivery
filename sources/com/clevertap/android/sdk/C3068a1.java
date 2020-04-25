package com.clevertap.android.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: com.clevertap.android.sdk.a1 */
/* compiled from: GifDecoder */
class C3068a1 {

    /* renamed from: A */
    static final int f10931A = 1;

    /* renamed from: B */
    static final int f10932B = 2;

    /* renamed from: C */
    static final int f10933C = 3;

    /* renamed from: D */
    private static final int f10934D = 4096;

    /* renamed from: E */
    private static final int f10935E = 0;

    /* renamed from: F */
    private static final int f10936F = 1;

    /* renamed from: G */
    private static final int f10937G = 2;

    /* renamed from: H */
    private static final int f10938H = 3;

    /* renamed from: I */
    private static final int f10939I = -1;

    /* renamed from: J */
    private static final int f10940J = -1;

    /* renamed from: K */
    static final int f10941K = -1;

    /* renamed from: L */
    private static final int f10942L = 4;

    /* renamed from: M */
    private static final int f10943M = 16384;

    /* renamed from: y */
    private static final String f10944y = "a1";

    /* renamed from: z */
    static final int f10945z = 0;

    /* renamed from: a */
    private int[] f10946a;

    /* renamed from: b */
    private final int[] f10947b;

    /* renamed from: c */
    private ByteBuffer f10948c;

    /* renamed from: d */
    private byte[] f10949d;
    @C0195i0

    /* renamed from: e */
    private byte[] f10950e;

    /* renamed from: f */
    private int f10951f;

    /* renamed from: g */
    private int f10952g;

    /* renamed from: h */
    private C3082d1 f10953h;

    /* renamed from: i */
    private short[] f10954i;

    /* renamed from: j */
    private byte[] f10955j;

    /* renamed from: k */
    private byte[] f10956k;

    /* renamed from: l */
    private byte[] f10957l;

    /* renamed from: m */
    private int[] f10958m;

    /* renamed from: n */
    private int f10959n;

    /* renamed from: o */
    private int f10960o;

    /* renamed from: p */
    private C3075c1 f10961p;

    /* renamed from: q */
    private C3069a f10962q;

    /* renamed from: r */
    private Bitmap f10963r;

    /* renamed from: s */
    private boolean f10964s;

    /* renamed from: t */
    private int f10965t;

    /* renamed from: u */
    private int f10966u;

    /* renamed from: v */
    private int f10967v;

    /* renamed from: w */
    private int f10968w;

    /* renamed from: x */
    private boolean f10969x;

    /* renamed from: com.clevertap.android.sdk.a1$a */
    /* compiled from: GifDecoder */
    interface C3069a {
        @C0193h0
        /* renamed from: a */
        Bitmap mo12204a(int i, int i2, Config config);

        /* renamed from: a */
        void mo12205a(Bitmap bitmap);

        /* renamed from: a */
        void mo12206a(byte[] bArr);

        /* renamed from: a */
        void mo12207a(int[] iArr);

        /* renamed from: a */
        int[] mo12208a(int i);

        /* renamed from: b */
        byte[] mo12209b(int i);
    }

    C3068a1(C3069a aVar, C3075c1 c1Var, ByteBuffer byteBuffer) {
        this(aVar, c1Var, byteBuffer, 1);
    }

    /* renamed from: p */
    private C3082d1 m14717p() {
        if (this.f10953h == null) {
            this.f10953h = new C3082d1();
        }
        return this.f10953h;
    }

    /* renamed from: q */
    private Bitmap m14718q() {
        Bitmap a = this.f10962q.mo12204a(this.f10968w, this.f10967v, this.f10969x ? Config.ARGB_8888 : Config.RGB_565);
        m14714a(a);
        return a;
    }

    /* renamed from: r */
    private int m14719r() {
        int s = m14720s();
        if (s > 0) {
            try {
                if (this.f10949d == null) {
                    this.f10949d = this.f10962q.mo12209b(255);
                }
                int i = this.f10951f - this.f10952g;
                if (i >= s) {
                    System.arraycopy(this.f10950e, this.f10952g, this.f10949d, 0, s);
                    this.f10952g += s;
                } else if (this.f10948c.remaining() + i >= s) {
                    System.arraycopy(this.f10950e, this.f10952g, this.f10949d, 0, i);
                    this.f10952g = this.f10951f;
                    m14721t();
                    int i2 = s - i;
                    System.arraycopy(this.f10950e, 0, this.f10949d, i, i2);
                    this.f10952g += i2;
                } else {
                    this.f10965t = 1;
                }
            } catch (Exception e) {
                C3111h1.m14932d(f10944y, "Error Reading Block", e);
                this.f10965t = 1;
            }
        }
        return s;
    }

    /* renamed from: s */
    private int m14720s() {
        try {
            m14721t();
            byte[] bArr = this.f10950e;
            int i = this.f10952g;
            this.f10952g = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f10965t = 1;
            return 0;
        }
    }

    /* renamed from: t */
    private void m14721t() {
        if (this.f10951f <= this.f10952g) {
            if (this.f10950e == null) {
                this.f10950e = this.f10962q.mo12209b(16384);
            }
            this.f10952g = 0;
            this.f10951f = Math.min(this.f10948c.remaining(), 16384);
            this.f10948c.get(this.f10950e, 0, this.f10951f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12188a() {
        if (this.f10961p.f10995c <= 0) {
            return false;
        }
        if (this.f10959n == mo12194f() - 1) {
            this.f10960o++;
        }
        int i = this.f10961p.f11005m;
        if (i != -1 && this.f10960o > i) {
            return false;
        }
        this.f10959n = (this.f10959n + 1) % this.f10961p.f10995c;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo12190b(int i) {
        if (i < -1 || i >= mo12194f()) {
            return false;
        }
        this.f10959n = i;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo12191c() {
        return this.f10948c.limit() + this.f10957l.length + (this.f10958m.length * 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo12192d() {
        return this.f10959n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ByteBuffer mo12193e() {
        return this.f10948c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo12194f() {
        return this.f10961p.f10995c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo12195g() {
        return this.f10961p.f10999g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo12196h() {
        return this.f10961p.f11005m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo12197i() {
        return this.f10960o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo12198j() {
        if (this.f10961p.f10995c > 0) {
            int i = this.f10959n;
            if (i >= 0) {
                return mo12182a(i);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public synchronized Bitmap mo12199k() {
        if (this.f10961p.f10995c <= 0 || this.f10959n < 0) {
            String str = f10944y;
            StringBuilder sb = new StringBuilder();
            sb.append("unable to decode frame, frameCount=");
            sb.append(this.f10961p.f10995c);
            sb.append(" framePointer=");
            sb.append(this.f10959n);
            C3111h1.m14931d(str, sb.toString());
            this.f10965t = 1;
        }
        if (this.f10965t != 1) {
            if (this.f10965t != 2) {
                this.f10965t = 0;
                C3072b1 b1Var = (C3072b1) this.f10961p.f10997e.get(this.f10959n);
                int i = this.f10959n - 1;
                C3072b1 b1Var2 = i >= 0 ? (C3072b1) this.f10961p.f10997e.get(i) : null;
                this.f10946a = b1Var.f10980k != null ? b1Var.f10980k : this.f10961p.f10993a;
                if (this.f10946a == null) {
                    String str2 = f10944y;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No Valid Color Table for frame #");
                    sb2.append(this.f10959n);
                    C3111h1.m14931d(str2, sb2.toString());
                    this.f10965t = 1;
                    return null;
                }
                if (b1Var.f10975f) {
                    System.arraycopy(this.f10946a, 0, this.f10947b, 0, this.f10946a.length);
                    this.f10946a = this.f10947b;
                    this.f10946a[b1Var.f10977h] = 0;
                }
                return m14713a(b1Var, b1Var2);
            }
        }
        String str3 = f10944y;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unable to decode frame, status=");
        sb3.append(this.f10965t);
        C3111h1.m14931d(str3, sb3.toString());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public int mo12200l() {
        return this.f10965t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public int mo12201m() {
        return this.f10961p.f10998f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo12202n() {
        this.f10959n = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo12203o() {
        this.f10960o = 0;
    }

    C3068a1(C3069a aVar, C3075c1 c1Var, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo12186a(c1Var, byteBuffer, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12189b() {
        this.f10961p = null;
        byte[] bArr = this.f10957l;
        if (bArr != null) {
            this.f10962q.mo12206a(bArr);
        }
        int[] iArr = this.f10958m;
        if (iArr != null) {
            this.f10962q.mo12207a(iArr);
        }
        Bitmap bitmap = this.f10963r;
        if (bitmap != null) {
            this.f10962q.mo12205a(bitmap);
        }
        this.f10963r = null;
        this.f10948c = null;
        this.f10969x = false;
        byte[] bArr2 = this.f10949d;
        if (bArr2 != null) {
            this.f10962q.mo12206a(bArr2);
        }
        byte[] bArr3 = this.f10950e;
        if (bArr3 != null) {
            this.f10962q.mo12206a(bArr3);
        }
    }

    C3068a1(C3069a aVar) {
        this.f10947b = new int[256];
        this.f10951f = 0;
        this.f10952g = 0;
        this.f10962q = aVar;
        this.f10961p = new C3075c1();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo12182a(int i) {
        if (i >= 0) {
            C3075c1 c1Var = this.f10961p;
            if (i < c1Var.f10995c) {
                return ((C3072b1) c1Var.f10997e.get(i)).f10978i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo12183a(InputStream inputStream, int i) {
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
                mo12184a(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                C3111h1.m14932d(f10944y, "Error reading data from stream", e);
            }
        } else {
            this.f10965t = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                C3111h1.m14932d(f10944y, "Error closing stream", e2);
            }
        }
        return this.f10965t;
    }

    C3068a1() {
        this(new C3214r1());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo12187a(C3075c1 c1Var, byte[] bArr) {
        mo12185a(c1Var, ByteBuffer.wrap(bArr));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo12185a(C3075c1 c1Var, ByteBuffer byteBuffer) {
        mo12186a(c1Var, byteBuffer, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo12186a(C3075c1 c1Var, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f10965t = 0;
            this.f10961p = c1Var;
            this.f10969x = false;
            this.f10959n = -1;
            mo12203o();
            this.f10948c = byteBuffer.asReadOnlyBuffer();
            this.f10948c.position(0);
            this.f10948c.order(ByteOrder.LITTLE_ENDIAN);
            this.f10964s = false;
            Iterator it = c1Var.f10997e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C3072b1) it.next()).f10976g == 3) {
                        this.f10964s = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f10966u = highestOneBit;
            this.f10968w = c1Var.f10998f / highestOneBit;
            this.f10967v = c1Var.f10999g / highestOneBit;
            this.f10957l = this.f10962q.mo12209b(c1Var.f10998f * c1Var.f10999g);
            this.f10958m = this.f10962q.mo12208a(this.f10968w * this.f10967v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized int mo12184a(byte[] bArr) {
        this.f10961p = m14717p().mo12234a(bArr).mo12237c();
        if (bArr != null) {
            mo12187a(this.f10961p, bArr);
        }
        return this.f10965t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3.f11002j == r1.f10977h) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m14713a(com.clevertap.android.sdk.C3072b1 r18, com.clevertap.android.sdk.C3072b1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int[] r10 = r0.f10958m
            r11 = 0
            if (r2 != 0) goto L_0x000e
            java.util.Arrays.fill(r10, r11)
        L_0x000e:
            r12 = 3
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L_0x005e
            int r3 = r2.f10976g
            if (r3 <= 0) goto L_0x005e
            if (r3 != r13) goto L_0x0037
            boolean r3 = r1.f10975f
            if (r3 != 0) goto L_0x002c
            com.clevertap.android.sdk.c1 r3 = r0.f10961p
            int r4 = r3.f11004l
            int[] r5 = r1.f10980k
            if (r5 == 0) goto L_0x0033
            int r3 = r3.f11002j
            int r5 = r1.f10977h
            if (r3 != r5) goto L_0x0033
            goto L_0x0032
        L_0x002c:
            int r3 = r0.f10959n
            if (r3 != 0) goto L_0x0032
            r0.f10969x = r14
        L_0x0032:
            r4 = 0
        L_0x0033:
            r0.m14716a(r10, r2, r4)
            goto L_0x005e
        L_0x0037:
            if (r3 != r12) goto L_0x005e
            android.graphics.Bitmap r3 = r0.f10963r
            if (r3 != 0) goto L_0x0041
            r0.m14716a(r10, r2, r11)
            goto L_0x005e
        L_0x0041:
            int r4 = r2.f10973d
            int r5 = r0.f10966u
            int r9 = r4 / r5
            int r4 = r2.f10971b
            int r7 = r4 / r5
            int r4 = r2.f10972c
            int r8 = r4 / r5
            int r2 = r2.f10970a
            int r6 = r2 / r5
            int r5 = r0.f10968w
            int r2 = r7 * r5
            int r4 = r2 + r6
            r2 = r3
            r3 = r10
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x005e:
            r17.m14715a(r18)
            int r2 = r1.f10973d
            int r3 = r0.f10966u
            int r2 = r2 / r3
            int r4 = r1.f10971b
            int r4 = r4 / r3
            int r5 = r1.f10972c
            int r5 = r5 / r3
            int r6 = r1.f10970a
            int r6 = r6 / r3
            r3 = 8
            int r7 = r0.f10959n
            if (r7 != 0) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r3 = 0
            r8 = 1
            r9 = 8
        L_0x007c:
            if (r11 >= r2) goto L_0x0100
            boolean r15 = r1.f10974e
            if (r15 == 0) goto L_0x0098
            r15 = 4
            if (r3 < r2) goto L_0x0095
            int r8 = r8 + 1
            if (r8 == r13) goto L_0x0094
            if (r8 == r12) goto L_0x0091
            if (r8 == r15) goto L_0x008e
            goto L_0x0095
        L_0x008e:
            r3 = 1
            r9 = 2
            goto L_0x0095
        L_0x0091:
            r3 = 2
            r9 = 4
            goto L_0x0095
        L_0x0094:
            r3 = 4
        L_0x0095:
            int r15 = r3 + r9
            goto L_0x009a
        L_0x0098:
            r15 = r3
            r3 = r11
        L_0x009a:
            int r3 = r3 + r4
            int r12 = r0.f10967v
            if (r3 >= r12) goto L_0x00f0
            int r12 = r0.f10968w
            int r3 = r3 * r12
            int r16 = r3 + r6
            int r13 = r16 + r5
            int r14 = r3 + r12
            if (r14 >= r13) goto L_0x00ad
            int r13 = r3 + r12
        L_0x00ad:
            int r3 = r0.f10966u
            int r12 = r11 * r3
            int r14 = r1.f10972c
            int r12 = r12 * r14
            int r14 = r13 - r16
            int r14 = r14 * r3
            int r14 = r14 + r12
            r3 = r16
        L_0x00bc:
            if (r3 >= r13) goto L_0x00f0
            r19 = r2
            int r2 = r0.f10966u
            r16 = r4
            r4 = 1
            if (r2 != r4) goto L_0x00d2
            byte[] r2 = r0.f10957l
            byte r2 = r2[r12]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int[] r4 = r0.f10946a
            r2 = r4[r2]
            goto L_0x00d8
        L_0x00d2:
            int r2 = r1.f10972c
            int r2 = r0.m14712a(r12, r14, r2)
        L_0x00d8:
            if (r2 == 0) goto L_0x00dd
            r10[r3] = r2
            goto L_0x00e6
        L_0x00dd:
            boolean r2 = r0.f10969x
            if (r2 != 0) goto L_0x00e6
            if (r7 == 0) goto L_0x00e6
            r2 = 1
            r0.f10969x = r2
        L_0x00e6:
            int r2 = r0.f10966u
            int r12 = r12 + r2
            int r3 = r3 + 1
            r2 = r19
            r4 = r16
            goto L_0x00bc
        L_0x00f0:
            r19 = r2
            r16 = r4
            int r11 = r11 + 1
            r2 = r19
            r3 = r15
            r4 = r16
            r12 = 3
            r13 = 2
            r14 = 1
            goto L_0x007c
        L_0x0100:
            boolean r2 = r0.f10964s
            if (r2 == 0) goto L_0x0123
            int r1 = r1.f10976g
            if (r1 == 0) goto L_0x010b
            r2 = 1
            if (r1 != r2) goto L_0x0123
        L_0x010b:
            android.graphics.Bitmap r1 = r0.f10963r
            if (r1 != 0) goto L_0x0115
            android.graphics.Bitmap r1 = r17.m14718q()
            r0.f10963r = r1
        L_0x0115:
            android.graphics.Bitmap r1 = r0.f10963r
            r3 = 0
            int r7 = r0.f10968w
            r5 = 0
            r6 = 0
            int r8 = r0.f10967v
            r2 = r10
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0123:
            android.graphics.Bitmap r9 = r17.m14718q()
            r3 = 0
            int r7 = r0.f10968w
            r5 = 0
            r6 = 0
            int r8 = r0.f10967v
            r1 = r9
            r2 = r10
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3068a1.m14713a(com.clevertap.android.sdk.b1, com.clevertap.android.sdk.b1):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private void m14716a(int[] iArr, C3072b1 b1Var, int i) {
        int i2 = b1Var.f10973d;
        int i3 = this.f10966u;
        int i4 = i2 / i3;
        int i5 = b1Var.f10971b / i3;
        int i6 = b1Var.f10972c / i3;
        int i7 = b1Var.f10970a / i3;
        int i8 = this.f10968w;
        int i9 = (i5 * i8) + i7;
        int i10 = (i4 * i8) + i9;
        while (i9 < i10) {
            int i11 = i9 + i6;
            for (int i12 = i9; i12 < i11; i12++) {
                iArr[i12] = i;
            }
            i9 += this.f10968w;
        }
    }

    /* renamed from: a */
    private int m14712a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f10966u + i; i9++) {
            byte[] bArr = this.f10957l;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f10946a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f10966u + i11; i12++) {
            byte[] bArr2 = this.f10957l;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f10946a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
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
    /* JADX WARNING: type inference failed for: r2v14, types: [short[]] */
    /* JADX WARNING: type inference failed for: r1v22, types: [short] */
    /* JADX WARNING: type inference failed for: r1v24, types: [int] */
    /* JADX WARNING: type inference failed for: r23v7 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r23v8 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r23v9 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r23v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r1v22, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r2v14, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v3
      assigns: []
      uses: []
      mth insns count: 198
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d A[LOOP:4: B:58:0x013b->B:59:0x013d, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14715a(com.clevertap.android.sdk.C3072b1 r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 0
            r0.f10951f = r2
            r0.f10952g = r2
            if (r1 == 0) goto L_0x0012
            java.nio.ByteBuffer r3 = r0.f10948c
            int r4 = r1.f10979j
            r3.position(r4)
        L_0x0012:
            if (r1 != 0) goto L_0x001b
            com.clevertap.android.sdk.c1 r1 = r0.f10961p
            int r3 = r1.f10998f
            int r1 = r1.f10999g
            goto L_0x001f
        L_0x001b:
            int r3 = r1.f10972c
            int r1 = r1.f10973d
        L_0x001f:
            int r3 = r3 * r1
            byte[] r1 = r0.f10957l
            if (r1 == 0) goto L_0x0028
            int r1 = r1.length
            if (r1 >= r3) goto L_0x0030
        L_0x0028:
            com.clevertap.android.sdk.a1$a r1 = r0.f10962q
            byte[] r1 = r1.mo12209b(r3)
            r0.f10957l = r1
        L_0x0030:
            short[] r1 = r0.f10954i
            r4 = 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x003a
            short[] r1 = new short[r4]
            r0.f10954i = r1
        L_0x003a:
            byte[] r1 = r0.f10955j
            if (r1 != 0) goto L_0x0042
            byte[] r1 = new byte[r4]
            r0.f10955j = r1
        L_0x0042:
            byte[] r1 = r0.f10956k
            if (r1 != 0) goto L_0x004c
            r1 = 4097(0x1001, float:5.741E-42)
            byte[] r1 = new byte[r1]
            r0.f10956k = r1
        L_0x004c:
            int r1 = r27.m14720s()
            r5 = 1
            int r6 = r5 << r1
            int r7 = r6 + 1
            int r8 = r6 + 2
            int r1 = r1 + r5
            int r9 = r5 << r1
            int r9 = r9 - r5
            r10 = 0
        L_0x005c:
            if (r10 >= r6) goto L_0x006a
            short[] r11 = r0.f10954i
            r11[r10] = r2
            byte[] r11 = r0.f10955j
            byte r12 = (byte) r10
            r11[r10] = r12
            int r10 = r10 + 1
            goto L_0x005c
        L_0x006a:
            r10 = -1
            r21 = r1
            r19 = r8
            r20 = r9
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = -1
        L_0x007e:
            if (r11 >= r3) goto L_0x0177
            r2 = 3
            if (r12 != 0) goto L_0x008e
            int r12 = r27.m14719r()
            if (r12 > 0) goto L_0x008d
            r0.f10965t = r2
            goto L_0x0177
        L_0x008d:
            r14 = 0
        L_0x008e:
            byte[] r4 = r0.f10949d
            byte r4 = r4[r14]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r15
            int r13 = r13 + r4
            int r15 = r15 + 8
            int r14 = r14 + r5
            int r12 = r12 + r10
            r23 = r17
            r4 = r21
            r5 = r22
            r26 = r16
            r16 = r11
            r11 = r19
            r19 = r18
            r18 = r26
        L_0x00aa:
            if (r15 < r4) goto L_0x015b
            r10 = r13 & r20
            int r13 = r13 >> r4
            int r15 = r15 - r4
            if (r10 != r6) goto L_0x00b9
            r4 = r1
            r11 = r8
            r20 = r9
            r5 = -1
        L_0x00b7:
            r10 = -1
            goto L_0x00aa
        L_0x00b9:
            if (r10 <= r11) goto L_0x00be
            r0.f10965t = r2
            goto L_0x00c0
        L_0x00be:
            if (r10 != r7) goto L_0x00cd
        L_0x00c0:
            r21 = r4
            r22 = r5
            r17 = r23
            r2 = 0
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 1
            r10 = -1
            goto L_0x016b
        L_0x00cd:
            r2 = -1
            if (r5 != r2) goto L_0x00e1
            byte[] r5 = r0.f10956k
            int r21 = r19 + 1
            byte[] r2 = r0.f10955j
            byte r2 = r2[r10]
            r5[r19] = r2
            r5 = r10
            r23 = r5
            r19 = r21
            r2 = 3
            goto L_0x00b7
        L_0x00e1:
            if (r10 < r11) goto L_0x00f2
            byte[] r2 = r0.f10956k
            int r21 = r19 + 1
            r24 = r1
            r1 = r23
            byte r1 = (byte) r1
            r2[r19] = r1
            r1 = r5
            r19 = r21
            goto L_0x00f5
        L_0x00f2:
            r24 = r1
            r1 = r10
        L_0x00f5:
            if (r1 < r6) goto L_0x010c
            byte[] r2 = r0.f10956k
            int r21 = r19 + 1
            r23 = r6
            byte[] r6 = r0.f10955j
            byte r6 = r6[r1]
            r2[r19] = r6
            short[] r2 = r0.f10954i
            short r1 = r2[r1]
            r19 = r21
            r6 = r23
            goto L_0x00f5
        L_0x010c:
            r23 = r6
            byte[] r2 = r0.f10955j
            byte r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r6 = r0.f10956k
            int r21 = r19 + 1
            r25 = r7
            byte r7 = (byte) r1
            r6[r19] = r7
            r6 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r6) goto L_0x0137
            short[] r6 = r0.f10954i
            short r5 = (short) r5
            r6[r11] = r5
            r2[r11] = r7
            int r11 = r11 + 1
            r2 = r11 & r20
            if (r2 != 0) goto L_0x0137
            r2 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r2) goto L_0x0139
            int r4 = r4 + 1
            int r20 = r20 + r11
            goto L_0x0139
        L_0x0137:
            r2 = 4096(0x1000, float:5.74E-42)
        L_0x0139:
            r19 = r21
        L_0x013b:
            if (r19 <= 0) goto L_0x014e
            byte[] r5 = r0.f10957l
            int r6 = r18 + 1
            byte[] r7 = r0.f10956k
            int r19 = r19 + -1
            byte r7 = r7[r19]
            r5[r18] = r7
            int r16 = r16 + 1
            r18 = r6
            goto L_0x013b
        L_0x014e:
            r5 = r10
            r6 = r23
            r7 = r25
            r2 = 3
            r10 = -1
            r23 = r1
            r1 = r24
            goto L_0x00aa
        L_0x015b:
            r24 = r1
            r1 = r23
            r17 = r1
            r21 = r4
            r22 = r5
            r1 = r24
            r2 = 0
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 1
        L_0x016b:
            r26 = r19
            r19 = r11
            r11 = r16
            r16 = r18
            r18 = r26
            goto L_0x007e
        L_0x0177:
            r1 = r16
        L_0x0179:
            if (r1 >= r3) goto L_0x0183
            byte[] r2 = r0.f10957l
            r4 = 0
            r2[r1] = r4
            int r1 = r1 + 1
            goto L_0x0179
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3068a1.m14715a(com.clevertap.android.sdk.b1):void");
    }

    @TargetApi(12)
    /* renamed from: a */
    private static void m14714a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }
}
