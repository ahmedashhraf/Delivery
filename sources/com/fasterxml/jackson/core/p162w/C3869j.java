package com.fasterxml.jackson.core.p162w;

import com.fasterxml.jackson.core.p158s.C3823h;
import com.fasterxml.jackson.core.p162w.C3854a.C3856b;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: com.fasterxml.jackson.core.w.j */
/* compiled from: TextBuffer */
public final class C3869j {

    /* renamed from: l */
    static final char[] f12250l = new char[0];

    /* renamed from: m */
    static final int f12251m = 1000;

    /* renamed from: n */
    static final int f12252n = 262144;

    /* renamed from: a */
    private final C3854a f12253a;

    /* renamed from: b */
    private char[] f12254b;

    /* renamed from: c */
    private int f12255c;

    /* renamed from: d */
    private int f12256d;

    /* renamed from: e */
    private ArrayList<char[]> f12257e;

    /* renamed from: f */
    private boolean f12258f = false;

    /* renamed from: g */
    private int f12259g;

    /* renamed from: h */
    private char[] f12260h;

    /* renamed from: i */
    private int f12261i;

    /* renamed from: j */
    private String f12262j;

    /* renamed from: k */
    private char[] f12263k;

    public C3869j(C3854a aVar) {
        this.f12253a = aVar;
    }

    /* renamed from: d */
    private char[] m16901d(int i) {
        C3854a aVar = this.f12253a;
        if (aVar != null) {
            return aVar.mo17082a(C3856b.TEXT_BUFFER, i);
        }
        return new char[Math.max(i, 1000)];
    }

    /* renamed from: q */
    private char[] m16903q() {
        char[] cArr;
        int i;
        String str = this.f12262j;
        if (str != null) {
            return str.toCharArray();
        }
        if (this.f12255c >= 0) {
            int i2 = this.f12256d;
            if (i2 < 1) {
                return f12250l;
            }
            cArr = m16899b(i2);
            System.arraycopy(this.f12254b, this.f12255c, cArr, 0, this.f12256d);
        } else {
            int p = mo17135p();
            if (p < 1) {
                return f12250l;
            }
            cArr = m16899b(p);
            ArrayList<char[]> arrayList = this.f12257e;
            if (arrayList != null) {
                int size = arrayList.size();
                i = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    char[] cArr2 = (char[]) this.f12257e.get(i3);
                    int length = cArr2.length;
                    System.arraycopy(cArr2, 0, cArr, i, length);
                    i += length;
                }
            } else {
                i = 0;
            }
            System.arraycopy(this.f12260h, 0, cArr, i, this.f12261i);
        }
        return cArr;
    }

    /* renamed from: r */
    private void m16904r() {
        this.f12258f = false;
        this.f12257e.clear();
        this.f12259g = 0;
        this.f12261i = 0;
    }

    /* renamed from: a */
    public void mo17115a(String str) {
        this.f12254b = null;
        this.f12255c = -1;
        this.f12256d = 0;
        this.f12262j = str;
        this.f12263k = null;
        if (this.f12258f) {
            m16904r();
        }
        this.f12261i = 0;
    }

    /* renamed from: b */
    public void mo17120b(char[] cArr, int i, int i2) {
        this.f12254b = null;
        this.f12255c = -1;
        this.f12256d = 0;
        this.f12262j = null;
        this.f12263k = null;
        if (this.f12258f) {
            m16904r();
        } else if (this.f12260h == null) {
            this.f12260h = m16901d(i2);
        }
        this.f12259g = 0;
        this.f12261i = 0;
        mo17117a(cArr, i, i2);
    }

    /* renamed from: c */
    public void mo17122c(char[] cArr, int i, int i2) {
        this.f12262j = null;
        this.f12263k = null;
        this.f12254b = cArr;
        this.f12255c = i;
        this.f12256d = i2;
        if (this.f12258f) {
            m16904r();
        }
    }

    /* renamed from: e */
    public char[] mo17124e() {
        this.f12255c = -1;
        this.f12261i = 0;
        this.f12256d = 0;
        this.f12254b = null;
        this.f12262j = null;
        this.f12263k = null;
        if (this.f12258f) {
            m16904r();
        }
        char[] cArr = this.f12260h;
        if (cArr != null) {
            return cArr;
        }
        char[] d = m16901d(0);
        this.f12260h = d;
        return d;
    }

    /* renamed from: f */
    public void mo17125f() {
        if (this.f12255c >= 0) {
            m16902e(16);
        }
    }

    /* renamed from: g */
    public char[] mo17126g() {
        int i;
        char[] cArr = this.f12260h;
        int length = cArr.length;
        if (length == 262144) {
            i = 262145;
        } else {
            i = Math.min(262144, (length >> 1) + length);
        }
        this.f12260h = m16899b(i);
        System.arraycopy(cArr, 0, this.f12260h, 0, length);
        return this.f12260h;
    }

    /* renamed from: h */
    public char[] mo17127h() {
        if (this.f12257e == null) {
            this.f12257e = new ArrayList<>();
        }
        this.f12258f = true;
        this.f12257e.add(this.f12260h);
        int length = this.f12260h.length;
        this.f12259g += length;
        char[] b = m16899b(Math.min(length + (length >> 1), 262144));
        this.f12261i = 0;
        this.f12260h = b;
        return b;
    }

    /* renamed from: i */
    public char[] mo17128i() {
        if (this.f12255c >= 0) {
            m16902e(1);
        } else {
            char[] cArr = this.f12260h;
            if (cArr == null) {
                this.f12260h = m16901d(0);
            } else if (this.f12261i >= cArr.length) {
                m16900c(1);
            }
        }
        return this.f12260h;
    }

    /* renamed from: j */
    public int mo17129j() {
        return this.f12261i;
    }

    /* renamed from: k */
    public char[] mo17130k() {
        if (this.f12255c >= 0) {
            return this.f12254b;
        }
        char[] cArr = this.f12263k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f12262j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f12263k = charArray;
            return charArray;
        } else if (!this.f12258f) {
            return this.f12260h;
        } else {
            return mo17118a();
        }
    }

    /* renamed from: l */
    public int mo17131l() {
        int i = this.f12255c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: m */
    public boolean mo17132m() {
        if (this.f12255c >= 0 || this.f12263k != null || this.f12262j == null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void mo17133n() {
        if (this.f12253a == null) {
            mo17134o();
        } else if (this.f12260h != null) {
            mo17134o();
            char[] cArr = this.f12260h;
            this.f12260h = null;
            this.f12253a.mo17079a(C3856b.TEXT_BUFFER, cArr);
        }
    }

    /* renamed from: o */
    public void mo17134o() {
        this.f12255c = -1;
        this.f12261i = 0;
        this.f12256d = 0;
        this.f12254b = null;
        this.f12262j = null;
        this.f12263k = null;
        if (this.f12258f) {
            m16904r();
        }
    }

    /* renamed from: p */
    public int mo17135p() {
        if (this.f12255c >= 0) {
            return this.f12256d;
        }
        char[] cArr = this.f12263k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f12262j;
        if (str != null) {
            return str.length();
        }
        return this.f12259g + this.f12261i;
    }

    public String toString() {
        return mo17123d();
    }

    /* renamed from: d */
    public String mo17123d() {
        if (this.f12262j == null) {
            char[] cArr = this.f12263k;
            if (cArr != null) {
                this.f12262j = new String(cArr);
            } else {
                int i = this.f12255c;
                String str = "";
                if (i >= 0) {
                    int i2 = this.f12256d;
                    if (i2 < 1) {
                        this.f12262j = str;
                        return str;
                    }
                    this.f12262j = new String(this.f12254b, i, i2);
                } else {
                    int i3 = this.f12259g;
                    int i4 = this.f12261i;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.f12260h, 0, i4);
                        }
                        this.f12262j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.f12257e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.f12257e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f12260h, 0, this.f12261i);
                        this.f12262j = sb.toString();
                    }
                }
            }
        }
        return this.f12262j;
    }

    /* renamed from: c */
    public double mo17121c() throws NumberFormatException {
        return C3823h.m16301a(mo17123d());
    }

    /* renamed from: c */
    private void m16900c(int i) {
        if (this.f12257e == null) {
            this.f12257e = new ArrayList<>();
        }
        char[] cArr = this.f12260h;
        this.f12258f = true;
        this.f12257e.add(cArr);
        this.f12259g += cArr.length;
        int length = cArr.length;
        int i2 = length >> 1;
        if (i2 >= i) {
            i = i2;
        }
        char[] b = m16899b(Math.min(262144, length + i));
        this.f12261i = 0;
        this.f12260h = b;
    }

    /* renamed from: a */
    public char[] mo17118a() {
        char[] cArr = this.f12263k;
        if (cArr != null) {
            return cArr;
        }
        char[] q = m16903q();
        this.f12263k = q;
        return q;
    }

    /* renamed from: e */
    private void m16902e(int i) {
        int i2 = this.f12256d;
        this.f12256d = 0;
        char[] cArr = this.f12254b;
        this.f12254b = null;
        int i3 = this.f12255c;
        this.f12255c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f12260h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f12260h = m16901d(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f12260h, 0, i2);
        }
        this.f12259g = 0;
        this.f12261i = i2;
    }

    /* renamed from: a */
    public void mo17113a(char c) {
        if (this.f12255c >= 0) {
            m16902e(16);
        }
        this.f12262j = null;
        this.f12263k = null;
        char[] cArr = this.f12260h;
        if (this.f12261i >= cArr.length) {
            m16900c(1);
            cArr = this.f12260h;
        }
        int i = this.f12261i;
        this.f12261i = i + 1;
        cArr[i] = c;
    }

    /* renamed from: b */
    public BigDecimal mo17119b() throws NumberFormatException {
        char[] cArr = this.f12263k;
        if (cArr != null) {
            return new BigDecimal(cArr);
        }
        int i = this.f12255c;
        if (i >= 0) {
            return new BigDecimal(this.f12254b, i, this.f12256d);
        }
        if (this.f12259g == 0) {
            return new BigDecimal(this.f12260h, 0, this.f12261i);
        }
        return new BigDecimal(mo17118a());
    }

    /* renamed from: b */
    private char[] m16899b(int i) {
        return new char[i];
    }

    /* renamed from: a */
    public void mo17117a(char[] cArr, int i, int i2) {
        if (this.f12255c >= 0) {
            m16902e(i2);
        }
        this.f12262j = null;
        this.f12263k = null;
        char[] cArr2 = this.f12260h;
        int length = cArr2.length;
        int i3 = this.f12261i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f12261i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            m16900c(i2);
            int min = Math.min(this.f12260h.length, i2);
            System.arraycopy(cArr, i, this.f12260h, 0, min);
            this.f12261i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: a */
    public void mo17116a(String str, int i, int i2) {
        if (this.f12255c >= 0) {
            m16902e(i2);
        }
        this.f12262j = null;
        this.f12263k = null;
        char[] cArr = this.f12260h;
        int length = cArr.length;
        int i3 = this.f12261i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.f12261i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            m16900c(i2);
            int min = Math.min(this.f12260h.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this.f12260h, 0);
            this.f12261i += min;
            i2 -= min;
            if (i2 > 0) {
                i = i6;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo17114a(int i) {
        this.f12261i = i;
    }
}
