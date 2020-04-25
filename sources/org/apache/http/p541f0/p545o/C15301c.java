package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p546g0.C15320d;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p548i0.C15351c;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p548i0.C15359k;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p550k0.C15453a;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.f0.o.c */
/* compiled from: AbstractSessionInputBuffer */
public abstract class C15301c implements C15321e {

    /* renamed from: a */
    private InputStream f44312a;

    /* renamed from: b */
    private byte[] f44313b;

    /* renamed from: c */
    private int f44314c;

    /* renamed from: d */
    private int f44315d;

    /* renamed from: e */
    private C15453a f44316e = null;

    /* renamed from: f */
    private String f44317f = "US-ASCII";

    /* renamed from: g */
    private boolean f44318g = true;

    /* renamed from: h */
    private int f44319h = -1;

    /* renamed from: i */
    private C15311m f44320i;

    /* renamed from: d */
    private int m67779d() {
        for (int i = this.f44314c; i < this.f44315d; i++) {
            if (this.f44313b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47370a(InputStream inputStream, int i, C15357i iVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (iVar != null) {
            this.f44312a = inputStream;
            this.f44313b = new byte[i];
            boolean z = false;
            this.f44314c = 0;
            this.f44315d = 0;
            this.f44316e = new C15453a(i);
            this.f44317f = C15359k.m68042b(iVar);
            if (this.f44317f.equalsIgnoreCase("US-ASCII") || this.f44317f.equalsIgnoreCase(C15430e.f44596w)) {
                z = true;
            }
            this.f44318g = z;
            this.f44319h = iVar.mo47541b(C15351c.f44421B, -1);
            this.f44320i = new C15311m();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47371b() throws IOException {
        int i = this.f44314c;
        if (i > 0) {
            int i2 = this.f44315d - i;
            if (i2 > 0) {
                byte[] bArr = this.f44313b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.f44314c = 0;
            this.f44315d = i2;
        }
        int i3 = this.f44315d;
        byte[] bArr2 = this.f44313b;
        int read = this.f44312a.read(bArr2, i3, bArr2.length - i3);
        if (read == -1) {
            return -1;
        }
        this.f44315d = i3 + read;
        this.f44320i.mo47400a((long) read);
        return read;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo47372c() {
        return this.f44314c < this.f44315d;
    }

    public C15320d getMetrics() {
        return this.f44320i;
    }

    public int read() throws IOException {
        while (!mo47372c()) {
            if (mo47371b() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f44313b;
        int i = this.f44314c;
        this.f44314c = i + 1;
        return bArr[i] & 255;
    }

    public String readLine() throws IOException {
        C15454b bVar = new C15454b(64);
        if (mo47265a(bVar) != -1) {
            return bVar.toString();
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        while (!mo47372c()) {
            if (mo47371b() == -1) {
                return -1;
            }
        }
        int i3 = this.f44315d - this.f44314c;
        if (i3 <= i2) {
            i2 = i3;
        }
        System.arraycopy(this.f44313b, this.f44314c, bArr, i, i2);
        this.f44314c += i2;
        return i2;
    }

    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    private int m67778b(C15454b bVar) throws IOException {
        int f = this.f44316e.mo47750f();
        if (f > 0) {
            if (this.f44316e.mo47745b(f - 1) == 10) {
                f--;
                this.f44316e.mo47747c(f);
            }
            if (f > 0 && this.f44316e.mo47745b(f - 1) == 13) {
                this.f44316e.mo47747c(f - 1);
            }
        }
        int f2 = this.f44316e.mo47750f();
        if (this.f44318g) {
            bVar.mo47758a(this.f44316e, 0, f2);
        } else {
            bVar.mo47757a(new String(this.f44316e.mo47743a(), 0, f2, this.f44317f));
        }
        return f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r2 == -1) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo47265a(org.apache.http.p550k0.C15454b r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0075
            org.apache.http.k0.a r0 = r7.f44316e
            r0.mo47746c()
            r0 = 1
            r1 = 0
            r2 = 0
        L_0x000a:
            r3 = -1
            if (r0 == 0) goto L_0x0065
            int r4 = r7.m67779d()
            if (r4 == r3) goto L_0x0031
            org.apache.http.k0.a r0 = r7.f44316e
            boolean r0 = r0.mo47748d()
            if (r0 == 0) goto L_0x0020
            int r8 = r7.m67777a(r8, r4)
            return r8
        L_0x0020:
            int r4 = r4 + 1
            int r0 = r7.f44314c
            int r3 = r4 - r0
            org.apache.http.k0.a r5 = r7.f44316e
            byte[] r6 = r7.f44313b
            r5.mo47741a(r6, r0, r3)
            r7.f44314c = r4
        L_0x002f:
            r0 = 0
            goto L_0x004e
        L_0x0031:
            boolean r2 = r7.mo47372c()
            if (r2 == 0) goto L_0x0047
            int r2 = r7.f44315d
            int r4 = r7.f44314c
            int r2 = r2 - r4
            org.apache.http.k0.a r5 = r7.f44316e
            byte[] r6 = r7.f44313b
            r5.mo47741a(r6, r4, r2)
            int r2 = r7.f44315d
            r7.f44314c = r2
        L_0x0047:
            int r2 = r7.mo47371b()
            if (r2 != r3) goto L_0x004e
            goto L_0x002f
        L_0x004e:
            int r3 = r7.f44319h
            if (r3 <= 0) goto L_0x000a
            org.apache.http.k0.a r3 = r7.f44316e
            int r3 = r3.mo47750f()
            int r4 = r7.f44319h
            if (r3 >= r4) goto L_0x005d
            goto L_0x000a
        L_0x005d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L_0x0065:
            if (r2 != r3) goto L_0x0070
            org.apache.http.k0.a r0 = r7.f44316e
            boolean r0 = r0.mo47748d()
            if (r0 == 0) goto L_0x0070
            return r3
        L_0x0070:
            int r8 = r7.m67778b(r8)
            return r8
        L_0x0075:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Char array buffer may not be null"
            r8.<init>(r0)
            goto L_0x007e
        L_0x007d:
            throw r8
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p545o.C15301c.mo47265a(org.apache.http.k0.b):int");
    }

    /* renamed from: a */
    private int m67777a(C15454b bVar, int i) throws IOException {
        int i2 = this.f44314c;
        this.f44314c = i + 1;
        if (i > 0 && this.f44313b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f44318g) {
            bVar.mo47761a(this.f44313b, i2, i3);
        } else {
            bVar.mo47757a(new String(this.f44313b, i2, i3, this.f44317f));
        }
        return i3;
    }
}
