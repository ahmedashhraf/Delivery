package com.fasterxml.jackson.core.p162w;

import com.fasterxml.jackson.core.p162w.C3854a.C3855a;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fasterxml.jackson.core.w.b */
/* compiled from: ByteArrayBuilder */
public final class C3857b extends OutputStream {

    /* renamed from: Q */
    private static final byte[] f12221Q = new byte[0];

    /* renamed from: R */
    private static final int f12222R = 500;

    /* renamed from: S */
    private static final int f12223S = 262144;

    /* renamed from: T */
    static final int f12224T = 40;

    /* renamed from: N */
    private int f12225N;

    /* renamed from: O */
    private byte[] f12226O;

    /* renamed from: P */
    private int f12227P;

    /* renamed from: a */
    private final C3854a f12228a;

    /* renamed from: b */
    private final LinkedList<byte[]> f12229b;

    public C3857b() {
        this((C3854a) null);
    }

    /* renamed from: i */
    private void m16742i() {
        this.f12225N += this.f12226O.length;
        int max = Math.max(this.f12225N >> 1, 1000);
        if (max > 262144) {
            max = 262144;
        }
        this.f12229b.add(this.f12226O);
        this.f12226O = new byte[max];
        this.f12227P = 0;
    }

    /* renamed from: a */
    public void mo17083a(int i) {
        if (this.f12227P >= this.f12226O.length) {
            m16742i();
        }
        byte[] bArr = this.f12226O;
        int i2 = this.f12227P;
        this.f12227P = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void close() {
    }

    /* renamed from: d */
    public byte[] mo17086d() {
        return this.f12226O;
    }

    /* renamed from: e */
    public void mo17088e(int i) {
        int i2 = this.f12227P;
        int i3 = i2 + 2;
        byte[] bArr = this.f12226O;
        if (i3 < bArr.length) {
            this.f12227P = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            int i4 = this.f12227P;
            this.f12227P = i4 + 1;
            bArr[i4] = (byte) (i >> 8);
            int i5 = this.f12227P;
            this.f12227P = i5 + 1;
            bArr[i5] = (byte) i;
            return;
        }
        mo17083a(i >> 16);
        mo17083a(i >> 8);
        mo17083a(i);
    }

    /* renamed from: f */
    public void mo17089f() {
        this.f12225N = 0;
        this.f12227P = 0;
        if (!this.f12229b.isEmpty()) {
            this.f12229b.clear();
        }
    }

    public void flush() {
    }

    /* renamed from: g */
    public byte[] mo17092g() {
        mo17089f();
        return this.f12226O;
    }

    /* renamed from: h */
    public byte[] mo17095h() {
        int i = this.f12225N + this.f12227P;
        if (i == 0) {
            return f12221Q;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f12229b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f12226O, 0, bArr, i2, this.f12227P);
        int i3 = i2 + this.f12227P;
        if (i3 == i) {
            if (!this.f12229b.isEmpty()) {
                mo17089f();
            }
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Internal error: total len assumed to be ");
        sb.append(i);
        sb.append(", copied ");
        sb.append(i3);
        sb.append(" bytes");
        throw new RuntimeException(sb.toString());
    }

    public void release() {
        mo17089f();
        C3854a aVar = this.f12228a;
        if (aVar != null) {
            byte[] bArr = this.f12226O;
            if (bArr != null) {
                aVar.mo17078a(C3855a.WRITE_CONCAT_BUFFER, bArr);
                this.f12226O = null;
            }
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public C3857b(C3854a aVar) {
        this(aVar, 500);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f12226O.length - this.f12227P, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f12226O, this.f12227P, min);
                i += min;
                this.f12227P += min;
                i2 -= min;
            }
            if (i2 > 0) {
                m16742i();
            } else {
                return;
            }
        }
    }

    public C3857b(int i) {
        this(null, i);
    }

    /* renamed from: g */
    public byte[] mo17093g(int i) {
        this.f12227P = i;
        return mo17095h();
    }

    public C3857b(C3854a aVar, int i) {
        this.f12229b = new LinkedList<>();
        this.f12228a = aVar;
        if (aVar == null) {
            this.f12226O = new byte[i];
        } else {
            this.f12226O = aVar.mo17080a(C3855a.WRITE_CONCAT_BUFFER);
        }
    }

    /* renamed from: a */
    public byte[] mo17084a() {
        m16742i();
        return this.f12226O;
    }

    /* renamed from: f */
    public void mo17090f(int i) {
        int i2 = this.f12227P;
        int i3 = i2 + 1;
        byte[] bArr = this.f12226O;
        if (i3 < bArr.length) {
            this.f12227P = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            int i4 = this.f12227P;
            this.f12227P = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        mo17083a(i >> 8);
        mo17083a(i);
    }

    public void write(int i) {
        mo17083a(i);
    }

    /* renamed from: e */
    public int mo17087e() {
        return this.f12227P;
    }

    /* renamed from: h */
    public void mo17094h(int i) {
        this.f12227P = i;
    }
}
