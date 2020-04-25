package com.fasterxml.jackson.core.p160u;

import com.fasterxml.jackson.core.p162w.C3864e;
import java.util.Arrays;

/* renamed from: com.fasterxml.jackson.core.u.b */
/* compiled from: CharsToNameCanonicalizer */
public final class C3845b {

    /* renamed from: l */
    public static final int f12185l = 33;

    /* renamed from: m */
    protected static final int f12186m = 64;

    /* renamed from: n */
    protected static final int f12187n = 65536;

    /* renamed from: o */
    static final int f12188o = 12000;

    /* renamed from: p */
    static final int f12189p = 255;

    /* renamed from: q */
    static final int f12190q = 63;

    /* renamed from: r */
    static final C3845b f12191r = new C3845b();

    /* renamed from: a */
    protected C3845b f12192a;

    /* renamed from: b */
    private final int f12193b;

    /* renamed from: c */
    protected final boolean f12194c;

    /* renamed from: d */
    protected final boolean f12195d;

    /* renamed from: e */
    protected String[] f12196e;

    /* renamed from: f */
    protected C3846a[] f12197f;

    /* renamed from: g */
    protected int f12198g;

    /* renamed from: h */
    protected int f12199h;

    /* renamed from: i */
    protected int f12200i;

    /* renamed from: j */
    protected int f12201j;

    /* renamed from: k */
    protected boolean f12202k;

    /* renamed from: com.fasterxml.jackson.core.u.b$a */
    /* compiled from: CharsToNameCanonicalizer */
    static final class C3846a {

        /* renamed from: a */
        private final String f12203a;

        /* renamed from: b */
        private final C3846a f12204b;

        /* renamed from: c */
        private final int f12205c;

        public C3846a(String str, C3846a aVar) {
            this.f12203a = str;
            this.f12204b = aVar;
            int i = 1;
            if (aVar != null) {
                i = 1 + aVar.f12205c;
            }
            this.f12205c = i;
        }

        /* renamed from: a */
        public C3846a mo17044a() {
            return this.f12204b;
        }

        /* renamed from: b */
        public String mo17046b() {
            return this.f12203a;
        }

        /* renamed from: c */
        public int mo17047c() {
            return this.f12205c;
        }

        /* renamed from: a */
        public String mo17045a(char[] cArr, int i, int i2) {
            String str = this.f12203a;
            C3846a aVar = this.f12204b;
            while (true) {
                if (str.length() == i2) {
                    int i3 = 0;
                    while (str.charAt(i3) == cArr[i + i3]) {
                        i3++;
                        if (i3 >= i2) {
                            break;
                        }
                    }
                    if (i3 == i2) {
                        return str;
                    }
                }
                if (aVar == null) {
                    return null;
                }
                str = aVar.mo17046b();
                aVar = aVar.mo17044a();
            }
        }
    }

    private C3845b() {
        this.f12195d = true;
        this.f12194c = true;
        this.f12202k = true;
        this.f12193b = 0;
        this.f12201j = 0;
        m16674e(64);
    }

    /* renamed from: c */
    private static int m16672c(int i) {
        return i - (i >> 2);
    }

    /* renamed from: d */
    protected static C3845b m16673d(int i) {
        return f12191r.m16675f(i);
    }

    /* renamed from: e */
    private void m16674e(int i) {
        this.f12196e = new String[i];
        this.f12197f = new C3846a[(i >> 1)];
        this.f12200i = i - 1;
        this.f12198g = 0;
        this.f12201j = 0;
        this.f12199h = m16672c(i);
    }

    /* renamed from: f */
    private C3845b m16675f(int i) {
        C3845b bVar = new C3845b(null, true, true, this.f12196e, this.f12197f, this.f12198g, i, this.f12201j);
        return bVar;
    }

    /* renamed from: h */
    private void m16676h() {
        String[] strArr = this.f12196e;
        int length = strArr.length;
        this.f12196e = new String[length];
        System.arraycopy(strArr, 0, this.f12196e, 0, length);
        C3846a[] aVarArr = this.f12197f;
        int length2 = aVarArr.length;
        this.f12197f = new C3846a[length2];
        System.arraycopy(aVarArr, 0, this.f12197f, 0, length2);
    }

    /* renamed from: i */
    public static C3845b m16677i() {
        long currentTimeMillis = System.currentTimeMillis();
        return m16673d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: j */
    private void m16678j() {
        String[] strArr = this.f12196e;
        int i = r1 + r1;
        if (i > 65536) {
            this.f12198g = 0;
            Arrays.fill(strArr, null);
            Arrays.fill(this.f12197f, null);
            this.f12202k = true;
            return;
        }
        C3846a[] aVarArr = this.f12197f;
        this.f12196e = new String[i];
        this.f12197f = new C3846a[(i >> 1)];
        this.f12200i = i - 1;
        this.f12199h = m16672c(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int a = mo17032a(mo17033a(str));
                String[] strArr2 = this.f12196e;
                if (strArr2[a] == null) {
                    strArr2[a] = str;
                } else {
                    int i4 = a >> 1;
                    C3846a aVar = new C3846a(str, this.f12197f[i4]);
                    this.f12197f[i4] = aVar;
                    i3 = Math.max(i3, aVar.mo17047c());
                }
            }
        }
        int i5 = r1 >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (C3846a aVar2 = aVarArr[i6]; aVar2 != null; aVar2 = aVar2.mo17044a()) {
                i2++;
                String b = aVar2.mo17046b();
                int a2 = mo17032a(mo17033a(b));
                String[] strArr3 = this.f12196e;
                if (strArr3[a2] == null) {
                    strArr3[a2] = b;
                } else {
                    int i7 = a2 >> 1;
                    C3846a aVar3 = new C3846a(b, this.f12197f[i7]);
                    this.f12197f[i7] = aVar3;
                    i3 = Math.max(i3, aVar3.mo17047c());
                }
            }
        }
        this.f12201j = i3;
        if (i2 != this.f12198g) {
            StringBuilder sb = new StringBuilder();
            sb.append("Internal error on SymbolTable.rehash(): had ");
            sb.append(this.f12198g);
            sb.append(" entries; now have ");
            sb.append(i2);
            sb.append(".");
            throw new Error(sb.toString());
        }
    }

    /* renamed from: a */
    public C3845b mo17035a(boolean z, boolean z2) {
        String[] strArr;
        C3846a[] aVarArr;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            strArr = this.f12196e;
            aVarArr = this.f12197f;
            i = this.f12198g;
            i2 = this.f12193b;
            i3 = this.f12201j;
        }
        C3845b bVar = new C3845b(this, z, z2, strArr, aVarArr, i, i2, i3);
        return bVar;
    }

    /* renamed from: b */
    public int mo17037b() {
        C3846a[] aVarArr;
        int i = 0;
        for (C3846a aVar : this.f12197f) {
            if (aVar != null) {
                i += aVar.mo17047c();
            }
        }
        return i;
    }

    /* renamed from: c */
    public int mo17039c() {
        return this.f12193b;
    }

    /* renamed from: g */
    public int mo17043g() {
        return this.f12198g;
    }

    /* renamed from: d */
    public int mo17040d() {
        return this.f12201j;
    }

    /* renamed from: f */
    public void mo17042f() {
        if (mo17041e()) {
            C3845b bVar = this.f12192a;
            if (bVar != null) {
                bVar.m16671a(this);
                this.f12202k = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17038b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Longest collision chain in symbol table (of size ");
        sb.append(this.f12198g);
        sb.append(") now exceeds maximum, ");
        sb.append(i);
        sb.append(" -- suspect a DoS attack based on hash collisions");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public boolean mo17041e() {
        return this.f12202k;
    }

    private C3845b(C3845b bVar, boolean z, boolean z2, String[] strArr, C3846a[] aVarArr, int i, int i2, int i3) {
        this.f12192a = bVar;
        this.f12195d = z;
        this.f12194c = z2;
        this.f12196e = strArr;
        this.f12197f = aVarArr;
        this.f12198g = i;
        this.f12193b = i2;
        int length = strArr.length;
        this.f12199h = m16672c(length);
        this.f12200i = length - 1;
        this.f12201j = i3;
        this.f12202k = false;
    }

    /* renamed from: a */
    private void m16671a(C3845b bVar) {
        if (bVar.mo17043g() > f12188o || bVar.f12201j > 63) {
            synchronized (this) {
                m16674e(64);
                this.f12202k = false;
            }
        } else if (bVar.mo17043g() > mo17043g()) {
            synchronized (this) {
                this.f12196e = bVar.f12196e;
                this.f12197f = bVar.f12197f;
                this.f12198g = bVar.f12198g;
                this.f12199h = bVar.f12199h;
                this.f12200i = bVar.f12200i;
                this.f12201j = bVar.f12201j;
                this.f12202k = false;
            }
        }
    }

    /* renamed from: a */
    public int mo17031a() {
        return this.f12196e.length;
    }

    /* renamed from: a */
    public String mo17036a(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.f12195d) {
            return new String(cArr, i, i2);
        }
        int a = mo17032a(i3);
        String str = this.f12196e[a];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 >= i2) {
                        break;
                    }
                }
                if (i4 == i2) {
                    return str;
                }
            }
            C3846a aVar = this.f12197f[a >> 1];
            if (aVar != null) {
                String a2 = aVar.mo17045a(cArr, i, i2);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        if (!this.f12202k) {
            m16676h();
            this.f12202k = true;
        } else if (this.f12198g >= this.f12199h) {
            m16678j();
            a = mo17032a(mo17034a(cArr, i, i2));
        }
        String str2 = new String(cArr, i, i2);
        if (this.f12194c) {
            str2 = C3864e.f12243b.mo17107b(str2);
        }
        this.f12198g++;
        String[] strArr = this.f12196e;
        if (strArr[a] == null) {
            strArr[a] = str2;
        } else {
            int i5 = a >> 1;
            C3846a aVar2 = new C3846a(str2, this.f12197f[i5]);
            this.f12197f[i5] = aVar2;
            this.f12201j = Math.max(aVar2.mo17047c(), this.f12201j);
            if (this.f12201j > 255) {
                mo17038b(255);
            }
        }
        return str2;
    }

    /* renamed from: a */
    public int mo17032a(int i) {
        return (i + (i >>> 15)) & this.f12200i;
    }

    /* renamed from: a */
    public int mo17034a(char[] cArr, int i, int i2) {
        int i3 = this.f12193b;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 33) + cArr[i4];
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: a */
    public int mo17033a(String str) {
        int length = str.length();
        int i = this.f12193b;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
