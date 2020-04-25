package org.apache.http.p550k0;

import org.apache.http.p549j0.C15430e;

/* renamed from: org.apache.http.k0.b */
/* compiled from: CharArrayBuffer */
public final class C15454b {

    /* renamed from: a */
    private char[] f44617a;

    /* renamed from: b */
    private int f44618b;

    public C15454b(int i) {
        if (i >= 0) {
            this.f44617a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: e */
    private void m68468e(int i) {
        char[] cArr = new char[Math.max(this.f44617a.length << 1, i)];
        System.arraycopy(this.f44617a, 0, cArr, 0, this.f44618b);
        this.f44617a = cArr;
    }

    /* renamed from: a */
    public void mo47762a(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f44618b + i2;
                        if (i4 > this.f44617a.length) {
                            m68468e(i4);
                        }
                        System.arraycopy(cArr, i, this.f44617a, this.f44618b, i2);
                        this.f44618b = i4;
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public int mo47764b() {
        return this.f44617a.length;
    }

    /* renamed from: c */
    public void mo47768c() {
        this.f44618b = 0;
    }

    /* renamed from: d */
    public void mo47769d(int i) {
        if (i < 0 || i > this.f44617a.length) {
            throw new IndexOutOfBoundsException();
        }
        this.f44618b = i;
    }

    /* renamed from: f */
    public int mo47772f() {
        return this.f44618b;
    }

    /* renamed from: g */
    public char[] mo47773g() {
        int i = this.f44618b;
        char[] cArr = new char[i];
        if (i > 0) {
            System.arraycopy(this.f44617a, 0, cArr, 0, i);
        }
        return cArr;
    }

    public String toString() {
        return new String(this.f44617a, 0, this.f44618b);
    }

    /* renamed from: b */
    public void mo47766b(int i) {
        if (i > 0) {
            int length = this.f44617a.length;
            int i2 = this.f44618b;
            if (i > length - i2) {
                m68468e(i2 + i);
            }
        }
    }

    /* renamed from: c */
    public int mo47767c(int i) {
        return mo47753a(i, 0, this.f44618b);
    }

    /* renamed from: b */
    public String mo47765b(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f44618b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && C15430e.m68400a(this.f44617a[i])) {
                i++;
            }
            while (i2 > i && C15430e.m68400a(this.f44617a[i2 - 1])) {
                i2--;
            }
            return new String(this.f44617a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: d */
    public boolean mo47770d() {
        return this.f44618b == 0;
    }

    /* renamed from: e */
    public boolean mo47771e() {
        return this.f44618b == this.f44617a.length;
    }

    /* renamed from: a */
    public void mo47757a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f44618b + length;
        if (i > this.f44617a.length) {
            m68468e(i);
        }
        str.getChars(0, length, this.f44617a, this.f44618b);
        this.f44618b = i;
    }

    /* renamed from: a */
    public void mo47760a(C15454b bVar, int i, int i2) {
        if (bVar != null) {
            mo47762a(bVar.f44617a, i, i2);
        }
    }

    /* renamed from: a */
    public void mo47759a(C15454b bVar) {
        if (bVar != null) {
            mo47762a(bVar.f44617a, 0, bVar.f44618b);
        }
    }

    /* renamed from: a */
    public void mo47755a(char c) {
        int i = this.f44618b + 1;
        if (i > this.f44617a.length) {
            m68468e(i);
        }
        this.f44617a[this.f44618b] = c;
        this.f44618b = i;
    }

    /* renamed from: a */
    public void mo47761a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f44618b;
                        int i5 = i2 + i4;
                        if (i5 > this.f44617a.length) {
                            m68468e(i5);
                        }
                        while (i4 < i5) {
                            this.f44617a[i4] = (char) (bArr[i] & 255);
                            i++;
                            i4++;
                        }
                        this.f44618b = i5;
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public void mo47758a(C15453a aVar, int i, int i2) {
        if (aVar != null) {
            mo47761a(aVar.mo47743a(), i, i2);
        }
    }

    /* renamed from: a */
    public void mo47756a(Object obj) {
        mo47757a(String.valueOf(obj));
    }

    /* renamed from: a */
    public char mo47752a(int i) {
        return this.f44617a[i];
    }

    /* renamed from: a */
    public char[] mo47763a() {
        return this.f44617a;
    }

    /* renamed from: a */
    public int mo47753a(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = this.f44618b;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.f44617a[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public String mo47754a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f44618b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.f44617a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
