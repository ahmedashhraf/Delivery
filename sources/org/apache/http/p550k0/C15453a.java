package org.apache.http.p550k0;

/* renamed from: org.apache.http.k0.a */
/* compiled from: ByteArrayBuffer */
public final class C15453a {

    /* renamed from: a */
    private byte[] f44615a;

    /* renamed from: b */
    private int f44616b;

    public C15453a(int i) {
        if (i >= 0) {
            this.f44615a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: d */
    private void m68454d(int i) {
        byte[] bArr = new byte[Math.max(this.f44615a.length << 1, i)];
        System.arraycopy(this.f44615a, 0, bArr, 0, this.f44616b);
        this.f44615a = bArr;
    }

    /* renamed from: a */
    public void mo47741a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f44616b + i2;
                        if (i4 > this.f44615a.length) {
                            m68454d(i4);
                        }
                        System.arraycopy(bArr, i, this.f44615a, this.f44616b, i2);
                        this.f44616b = i4;
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public int mo47745b(int i) {
        return this.f44615a[i];
    }

    /* renamed from: c */
    public void mo47746c() {
        this.f44616b = 0;
    }

    /* renamed from: e */
    public boolean mo47749e() {
        return this.f44616b == this.f44615a.length;
    }

    /* renamed from: f */
    public int mo47750f() {
        return this.f44616b;
    }

    /* renamed from: g */
    public byte[] mo47751g() {
        int i = this.f44616b;
        byte[] bArr = new byte[i];
        if (i > 0) {
            System.arraycopy(this.f44615a, 0, bArr, 0, i);
        }
        return bArr;
    }

    /* renamed from: b */
    public int mo47744b() {
        return this.f44615a.length;
    }

    /* renamed from: c */
    public void mo47747c(int i) {
        if (i < 0 || i > this.f44615a.length) {
            throw new IndexOutOfBoundsException();
        }
        this.f44616b = i;
    }

    /* renamed from: d */
    public boolean mo47748d() {
        return this.f44616b == 0;
    }

    /* renamed from: a */
    public void mo47739a(int i) {
        int i2 = this.f44616b + 1;
        if (i2 > this.f44615a.length) {
            m68454d(i2);
        }
        this.f44615a[this.f44616b] = (byte) i;
        this.f44616b = i2;
    }

    /* renamed from: a */
    public void mo47742a(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f44616b;
                        int i5 = i2 + i4;
                        if (i5 > this.f44615a.length) {
                            m68454d(i5);
                        }
                        while (i4 < i5) {
                            this.f44615a[i4] = (byte) cArr[i];
                            i++;
                            i4++;
                        }
                        this.f44616b = i5;
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public void mo47740a(C15454b bVar, int i, int i2) {
        if (bVar != null) {
            mo47742a(bVar.mo47763a(), i, i2);
        }
    }

    /* renamed from: a */
    public byte[] mo47743a() {
        return this.f44615a;
    }
}
