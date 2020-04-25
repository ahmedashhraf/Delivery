package p205i.p471b.p472a.p473a.p474c.p475i.p476w;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13953n;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p475i.C13960u;

/* renamed from: i.b.a.a.c.i.w.a */
/* compiled from: AnalyzerAdapter */
public class C13962a extends C13957r {

    /* renamed from: l3 */
    public List<Object> f41013l3;

    /* renamed from: m3 */
    public List<Object> f41014m3;

    /* renamed from: n3 */
    private List<C13956q> f41015n3;

    /* renamed from: o3 */
    public Map<Object, Object> f41016o3;

    /* renamed from: p3 */
    private int f41017p3;

    /* renamed from: q3 */
    private int f41018q3;

    /* renamed from: r3 */
    private String f41019r3;

    public C13962a(String str, int i, String str2, String str3, C13957r rVar) {
        Class<C13962a> cls = C13962a.class;
        this(327680, str, i, str2, str3, rVar);
        if (cls != cls) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo44174a(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (i == -1) {
            C13957r rVar = this.f40701k3;
            if (rVar != null) {
                rVar.mo44174a(i, i2, objArr, i3, objArr2);
            }
            List<Object> list = this.f41013l3;
            if (list != null) {
                list.clear();
                this.f41014m3.clear();
            } else {
                this.f41013l3 = new ArrayList();
                this.f41014m3 = new ArrayList();
            }
            m60169a(i2, objArr, this.f41013l3);
            m60169a(i3, objArr2, this.f41014m3);
            this.f41017p3 = Math.max(this.f41017p3, this.f41014m3.size());
            return;
        }
        throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
    }

    /* renamed from: b */
    public void mo44189b(int i) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44189b(i);
        }
        m60167a(i, 0, (String) null);
        if ((i >= 172 && i <= 177) || i == 191) {
            this.f41013l3 = null;
            this.f41014m3 = null;
        }
    }

    /* renamed from: c */
    public void mo44196c(int i, int i2) {
        if (this.f40701k3 != null) {
            this.f41017p3 = Math.max(this.f41017p3, i);
            this.f41018q3 = Math.max(this.f41018q3, i2);
            this.f40701k3.mo44196c(this.f41017p3, this.f41018q3);
        }
    }

    /* renamed from: d */
    public void mo44197d(int i, int i2) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44197d(i, i2);
        }
        m60167a(i, i2, (String) null);
    }

    protected C13962a(int i, String str, int i2, String str2, String str3, C13957r rVar) {
        super(i, rVar);
        this.f41019r3 = str;
        this.f41013l3 = new ArrayList();
        this.f41014m3 = new ArrayList();
        this.f41016o3 = new HashMap();
        if ((i2 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.f41013l3.add(C13959t.f40905h0);
            } else {
                this.f41013l3.add(str);
            }
        }
        C13960u[] a = C13960u.m60138a(str3);
        for (int i3 = 0; i3 < a.length; i3++) {
            switch (a[i3].mo44212j()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.f41013l3.add(C13959t.f40880c0);
                    break;
                case 6:
                    this.f41013l3.add(C13959t.f40885d0);
                    break;
                case 7:
                    this.f41013l3.add(C13959t.f40895f0);
                    this.f41013l3.add(C13959t.f40875b0);
                    break;
                case 8:
                    this.f41013l3.add(C13959t.f40890e0);
                    this.f41013l3.add(C13959t.f40875b0);
                    break;
                case 9:
                    this.f41013l3.add(a[i3].mo44204d());
                    break;
                default:
                    this.f41013l3.add(a[i3].mo44208g());
                    break;
            }
        }
        this.f41018q3 = this.f41013l3.size();
    }

    /* renamed from: d */
    private Object m60175d() {
        List<Object> list = this.f41014m3;
        return list.remove(list.size() - 1);
    }

    /* renamed from: c */
    private Object m60174c(int i) {
        this.f41018q3 = Math.max(this.f41018q3, i + 1);
        return i < this.f41013l3.size() ? this.f41013l3.get(i) : C13959t.f40875b0;
    }

    /* renamed from: d */
    private void m60176d(int i) {
        int size = this.f41014m3.size();
        int i2 = size - i;
        for (int i3 = size - 1; i3 >= i2; i3--) {
            this.f41014m3.remove(i3);
        }
    }

    /* renamed from: b */
    public void mo44190b(int i, int i2) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44190b(i, i2);
        }
        m60167a(i, i2, (String) null);
    }

    @Deprecated
    /* renamed from: b */
    public void mo44192b(int i, String str, String str2, String str3) {
        if (this.f40700j3 >= 327680) {
            super.mo44192b(i, str, str2, str3);
        } else {
            m60171b(i, str, str2, str3, i == 185);
        }
    }

    /* renamed from: a */
    private static void m60169a(int i, Object[] objArr, List<Object> list) {
        for (int i2 = 0; i2 < i; i2++) {
            Integer num = objArr[i2];
            list.add(num);
            if (num == C13959t.f40895f0 || num == C13959t.f40890e0) {
                list.add(C13959t.f40875b0);
            }
        }
    }

    /* renamed from: b */
    private void m60171b(int i, String str, String str2, String str3, boolean z) {
        Object obj;
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44178a(i, str, str2, str3, z);
        }
        if (this.f41013l3 == null) {
            this.f41015n3 = null;
            return;
        }
        m60170a(str3);
        if (i != 184) {
            Object d = m60175d();
            if (i == 183) {
                if (str2.charAt(0) == '<') {
                    if (d == C13959t.f40905h0) {
                        obj = this.f41019r3;
                    } else {
                        obj = this.f41016o3.get(d);
                    }
                    for (int i2 = 0; i2 < this.f41013l3.size(); i2++) {
                        if (this.f41013l3.get(i2) == d) {
                            this.f41013l3.set(i2, obj);
                        }
                    }
                    for (int i3 = 0; i3 < this.f41014m3.size(); i3++) {
                        if (this.f41014m3.get(i3) == d) {
                            this.f41014m3.set(i3, obj);
                        }
                    }
                }
            }
        }
        m60173b(str3);
        this.f41015n3 = null;
    }

    /* renamed from: a */
    public void mo44176a(int i, String str) {
        if (i == 187) {
            if (this.f41015n3 == null) {
                C13956q qVar = new C13956q();
                this.f41015n3 = new ArrayList(3);
                this.f41015n3.add(qVar);
                C13957r rVar = this.f40701k3;
                if (rVar != null) {
                    rVar.mo44180a(qVar);
                }
            }
            for (int i2 = 0; i2 < this.f41015n3.size(); i2++) {
                this.f41016o3.put(this.f41015n3.get(i2), str);
            }
        }
        C13957r rVar2 = this.f40701k3;
        if (rVar2 != null) {
            rVar2.mo44176a(i, str);
        }
        m60167a(i, 0, str);
    }

    /* renamed from: a */
    public void mo44177a(int i, String str, String str2, String str3) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44177a(i, str, str2, str3);
        }
        m60167a(i, 0, str3);
    }

    /* renamed from: b */
    private void m60172b(Object obj) {
        this.f41014m3.add(obj);
        this.f41017p3 = Math.max(this.f41017p3, this.f41014m3.size());
    }

    /* renamed from: a */
    public void mo44178a(int i, String str, String str2, String str3, boolean z) {
        if (this.f40700j3 < 327680) {
            super.mo44178a(i, str, str2, str3, z);
        } else {
            m60171b(i, str, str2, str3, z);
        }
    }

    /* renamed from: b */
    private void m60173b(String str) {
        int i = 0;
        if (str.charAt(0) == '(') {
            i = str.indexOf(41) + 1;
        }
        char charAt = str.charAt(i);
        if (charAt != 'F') {
            if (charAt != 'S') {
                if (charAt != 'V') {
                    if (charAt != 'I') {
                        if (charAt == 'J') {
                            m60172b((Object) C13959t.f40895f0);
                            m60172b((Object) C13959t.f40875b0);
                        } else if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                    case 'C':
                                        break;
                                    case 'D':
                                        m60172b((Object) C13959t.f40890e0);
                                        m60172b((Object) C13959t.f40875b0);
                                        return;
                                    default:
                                        if (i != 0) {
                                            m60172b((Object) str.substring(i + 1, str.length() - 1));
                                            break;
                                        } else {
                                            m60172b((Object) str.substring(1, str.length() - 1));
                                            break;
                                        }
                                }
                            } else if (i == 0) {
                                m60172b((Object) str);
                            } else {
                                m60172b((Object) str.substring(i, str.length()));
                            }
                            return;
                        }
                    }
                }
                return;
            }
            m60172b((Object) C13959t.f40880c0);
            return;
        }
        m60172b((Object) C13959t.f40885d0);
    }

    /* renamed from: a */
    public void mo44185a(String str, String str2, C13953n nVar, Object... objArr) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44185a(str, str2, nVar, objArr);
        }
        if (this.f41013l3 == null) {
            this.f41015n3 = null;
            return;
        }
        m60170a(str2);
        m60173b(str2);
        this.f41015n3 = null;
    }

    /* renamed from: a */
    public void mo44175a(int i, C13956q qVar) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44175a(i, qVar);
        }
        m60167a(i, 0, (String) null);
        if (i == 167) {
            this.f41013l3 = null;
            this.f41014m3 = null;
        }
    }

    /* renamed from: a */
    public void mo44180a(C13956q qVar) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44180a(qVar);
        }
        if (this.f41015n3 == null) {
            this.f41015n3 = new ArrayList(3);
        }
        this.f41015n3.add(qVar);
    }

    /* renamed from: a */
    public void mo44183a(Object obj) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44183a(obj);
        }
        if (this.f41013l3 == null) {
            this.f41015n3 = null;
            return;
        }
        if (obj instanceof Integer) {
            m60172b((Object) C13959t.f40880c0);
        } else if (obj instanceof Long) {
            m60172b((Object) C13959t.f40895f0);
            m60172b((Object) C13959t.f40875b0);
        } else if (obj instanceof Float) {
            m60172b((Object) C13959t.f40885d0);
        } else if (obj instanceof Double) {
            m60172b((Object) C13959t.f40890e0);
            m60172b((Object) C13959t.f40875b0);
        } else if (obj instanceof String) {
            m60172b((Object) "java/lang/String");
        } else if (obj instanceof C13960u) {
            int j = ((C13960u) obj).mo44212j();
            if (j == 10 || j == 9) {
                m60172b((Object) "java/lang/Class");
            } else if (j == 11) {
                m60172b((Object) "java/lang/invoke/MethodType");
            } else {
                throw new IllegalArgumentException();
            }
        } else if (obj instanceof C13953n) {
            m60172b((Object) "java/lang/invoke/MethodHandle");
        } else {
            throw new IllegalArgumentException();
        }
        this.f41015n3 = null;
    }

    /* renamed from: a */
    public void mo44172a(int i, int i2) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44172a(i, i2);
        }
        m60167a((int) C13959t.f40847U1, i, (String) null);
    }

    /* renamed from: a */
    public void mo44173a(int i, int i2, C13956q qVar, C13956q... qVarArr) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44173a(i, i2, qVar, qVarArr);
        }
        m60167a((int) C13959t.f40792G2, 0, (String) null);
        this.f41013l3 = null;
        this.f41014m3 = null;
    }

    /* renamed from: a */
    public void mo44182a(C13956q qVar, int[] iArr, C13956q[] qVarArr) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44182a(qVar, iArr, qVarArr);
        }
        m60167a((int) C13959t.f40796H2, 0, (String) null);
        this.f41013l3 = null;
        this.f41014m3 = null;
    }

    /* renamed from: a */
    public void mo44184a(String str, int i) {
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            rVar.mo44184a(str, i);
        }
        m60167a((int) C13959t.f40903g3, i, str);
    }

    /* renamed from: a */
    private void m60168a(int i, Object obj) {
        this.f41018q3 = Math.max(this.f41018q3, i + 1);
        while (i >= this.f41013l3.size()) {
            this.f41013l3.add(C13959t.f40875b0);
        }
        this.f41013l3.set(i, obj);
    }

    /* renamed from: a */
    private void m60170a(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            int i = 0;
            for (C13960u i2 : C13960u.m60138a(str)) {
                i += i2.mo44211i();
            }
            m60176d(i);
        } else if (charAt == 'J' || charAt == 'D') {
            m60176d(2);
        } else {
            m60176d(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        m60176d(1);
        m60172b((java.lang.Object) p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0258, code lost:
        m60176d(2);
        m60172b((java.lang.Object) p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0);
        m60172b((java.lang.Object) p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x026f, code lost:
        m60176d(2);
        m60172b((java.lang.Object) p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0);
        m60172b((java.lang.Object) p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m60167a(int r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f41013l3
            r1 = 0
            if (r0 != 0) goto L_0x0008
            r5.f41015n3 = r1
            return
        L_0x0008:
            r0 = 198(0xc6, float:2.77E-43)
            r2 = 1
            if (r6 == r0) goto L_0x02c3
            r0 = 199(0xc7, float:2.79E-43)
            if (r6 == r0) goto L_0x02c3
            switch(r6) {
                case 0: goto L_0x02c6;
                case 1: goto L_0x02bd;
                case 2: goto L_0x02b7;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02b7;
                case 5: goto L_0x02b7;
                case 6: goto L_0x02b7;
                case 7: goto L_0x02b7;
                case 8: goto L_0x02b7;
                case 9: goto L_0x02ac;
                case 10: goto L_0x02ac;
                case 11: goto L_0x02a6;
                case 12: goto L_0x02a6;
                case 13: goto L_0x02a6;
                case 14: goto L_0x029b;
                case 15: goto L_0x029b;
                case 16: goto L_0x02b7;
                case 17: goto L_0x02b7;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r6) {
                case 21: goto L_0x0293;
                case 22: goto L_0x0286;
                case 23: goto L_0x0293;
                case 24: goto L_0x0286;
                case 25: goto L_0x0293;
                default: goto L_0x0017;
            }
        L_0x0017:
            r0 = 2
            switch(r6) {
                case 46: goto L_0x027d;
                case 47: goto L_0x026f;
                case 48: goto L_0x0266;
                case 49: goto L_0x0258;
                case 50: goto L_0x023b;
                case 51: goto L_0x027d;
                case 52: goto L_0x027d;
                case 53: goto L_0x027d;
                case 54: goto L_0x021e;
                case 55: goto L_0x01f7;
                case 56: goto L_0x021e;
                case 57: goto L_0x01f7;
                case 58: goto L_0x021e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r3 = 3
            r4 = 4
            switch(r6) {
                case 79: goto L_0x01f2;
                case 80: goto L_0x01ed;
                case 81: goto L_0x01f2;
                case 82: goto L_0x01ed;
                case 83: goto L_0x01f2;
                case 84: goto L_0x01f2;
                case 85: goto L_0x01f2;
                case 86: goto L_0x01f2;
                case 87: goto L_0x02c3;
                case 88: goto L_0x01e8;
                case 89: goto L_0x01dc;
                case 90: goto L_0x01c9;
                case 91: goto L_0x01af;
                case 92: goto L_0x0199;
                case 93: goto L_0x017c;
                case 94: goto L_0x0158;
                case 95: goto L_0x0148;
                case 96: goto L_0x013e;
                case 97: goto L_0x012f;
                case 98: goto L_0x0125;
                case 99: goto L_0x0116;
                case 100: goto L_0x013e;
                case 101: goto L_0x012f;
                case 102: goto L_0x0125;
                case 103: goto L_0x0116;
                case 104: goto L_0x013e;
                case 105: goto L_0x012f;
                case 106: goto L_0x0125;
                case 107: goto L_0x0116;
                case 108: goto L_0x013e;
                case 109: goto L_0x012f;
                case 110: goto L_0x0125;
                case 111: goto L_0x0116;
                case 112: goto L_0x013e;
                case 113: goto L_0x012f;
                case 114: goto L_0x0125;
                case 115: goto L_0x0116;
                case 116: goto L_0x02c6;
                case 117: goto L_0x02c6;
                case 118: goto L_0x02c6;
                case 119: goto L_0x02c6;
                case 120: goto L_0x013e;
                case 121: goto L_0x0107;
                case 122: goto L_0x013e;
                case 123: goto L_0x0107;
                case 124: goto L_0x013e;
                case 125: goto L_0x0107;
                case 126: goto L_0x013e;
                case 127: goto L_0x012f;
                case 128: goto L_0x013e;
                case 129: goto L_0x012f;
                case 130: goto L_0x013e;
                case 131: goto L_0x012f;
                case 132: goto L_0x0100;
                case 133: goto L_0x00f1;
                case 134: goto L_0x00e7;
                case 135: goto L_0x00d8;
                case 136: goto L_0x013e;
                case 137: goto L_0x0125;
                case 138: goto L_0x0258;
                case 139: goto L_0x00ce;
                case 140: goto L_0x00f1;
                case 141: goto L_0x00d8;
                case 142: goto L_0x013e;
                case 143: goto L_0x026f;
                case 144: goto L_0x0125;
                case 145: goto L_0x02c6;
                case 146: goto L_0x02c6;
                case 147: goto L_0x02c6;
                case 148: goto L_0x00c4;
                case 149: goto L_0x013e;
                case 150: goto L_0x013e;
                case 151: goto L_0x00c4;
                case 152: goto L_0x00c4;
                case 153: goto L_0x02c3;
                case 154: goto L_0x02c3;
                case 155: goto L_0x02c3;
                case 156: goto L_0x02c3;
                case 157: goto L_0x02c3;
                case 158: goto L_0x02c3;
                case 159: goto L_0x01e8;
                case 160: goto L_0x01e8;
                case 161: goto L_0x01e8;
                case 162: goto L_0x01e8;
                case 163: goto L_0x01e8;
                case 164: goto L_0x01e8;
                case 165: goto L_0x01e8;
                case 166: goto L_0x01e8;
                case 167: goto L_0x02c6;
                case 168: goto L_0x00bc;
                case 169: goto L_0x00bc;
                case 170: goto L_0x02c3;
                case 171: goto L_0x02c3;
                case 172: goto L_0x02c3;
                case 173: goto L_0x01e8;
                case 174: goto L_0x02c3;
                case 175: goto L_0x01e8;
                case 176: goto L_0x02c3;
                case 177: goto L_0x02c6;
                case 178: goto L_0x00b7;
                case 179: goto L_0x00b2;
                case 180: goto L_0x00aa;
                case 181: goto L_0x00a2;
                default: goto L_0x0020;
            }
        L_0x0020:
            switch(r6) {
                case 187: goto L_0x0096;
                case 188: goto L_0x0058;
                case 189: goto L_0x003b;
                case 190: goto L_0x00ce;
                case 191: goto L_0x02c3;
                case 192: goto L_0x002b;
                case 193: goto L_0x00ce;
                case 194: goto L_0x02c3;
                case 195: goto L_0x02c3;
                default: goto L_0x0023;
            }
        L_0x0023:
            r5.m60176d(r7)
            r5.m60173b(r8)
            goto L_0x02c6
        L_0x002b:
            r5.m60175d()
            i.b.a.a.c.i.u r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13960u.m60148d(r8)
            java.lang.String r6 = r6.mo44204d()
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x003b:
            r5.m60175d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "["
            r6.append(r7)
            i.b.a.a.c.i.u r7 = p205i.p471b.p472a.p473a.p474c.p475i.C13960u.m60148d(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0058:
            r5.m60175d()
            switch(r7) {
                case 4: goto L_0x008f;
                case 5: goto L_0x0088;
                case 6: goto L_0x0081;
                case 7: goto L_0x007a;
                case 8: goto L_0x0073;
                case 9: goto L_0x006c;
                case 10: goto L_0x0065;
                default: goto L_0x005e;
            }
        L_0x005e:
            java.lang.String r6 = "[J"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0065:
            java.lang.String r6 = "[I"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x006c:
            java.lang.String r6 = "[S"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0073:
            java.lang.String r6 = "[B"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x007a:
            java.lang.String r6 = "[D"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0081:
            java.lang.String r6 = "[F"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0088:
            java.lang.String r6 = "[C"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x008f:
            java.lang.String r6 = "[Z"
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0096:
            java.util.List<i.b.a.a.c.i.q> r6 = r5.f41015n3
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x00a2:
            r5.m60170a(r8)
            r5.m60175d()
            goto L_0x02c6
        L_0x00aa:
            r5.m60176d(r2)
            r5.m60173b(r8)
            goto L_0x02c6
        L_0x00b2:
            r5.m60170a(r8)
            goto L_0x02c6
        L_0x00b7:
            r5.m60173b(r8)
            goto L_0x02c6
        L_0x00bc:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "JSR/RET are not supported"
            r6.<init>(r7)
            throw r6
        L_0x00c4:
            r5.m60176d(r4)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x00ce:
            r5.m60176d(r2)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x00d8:
            r5.m60176d(r2)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x00e7:
            r5.m60176d(r2)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40885d0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x00f1:
            r5.m60176d(r2)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0100:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0
            r5.m60168a(r7, r6)
            goto L_0x02c6
        L_0x0107:
            r5.m60176d(r3)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0116:
            r5.m60176d(r4)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0125:
            r5.m60176d(r0)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40885d0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x012f:
            r5.m60176d(r4)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x013e:
            r5.m60176d(r0)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0148:
            java.lang.Object r6 = r5.m60175d()
            java.lang.Object r7 = r5.m60175d()
            r5.m60172b(r6)
            r5.m60172b(r7)
            goto L_0x02c6
        L_0x0158:
            java.lang.Object r6 = r5.m60175d()
            java.lang.Object r7 = r5.m60175d()
            java.lang.Object r8 = r5.m60175d()
            java.lang.Object r0 = r5.m60175d()
            r5.m60172b(r7)
            r5.m60172b(r6)
            r5.m60172b(r0)
            r5.m60172b(r8)
            r5.m60172b(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x017c:
            java.lang.Object r6 = r5.m60175d()
            java.lang.Object r7 = r5.m60175d()
            java.lang.Object r8 = r5.m60175d()
            r5.m60172b(r7)
            r5.m60172b(r6)
            r5.m60172b(r8)
            r5.m60172b(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0199:
            java.lang.Object r6 = r5.m60175d()
            java.lang.Object r7 = r5.m60175d()
            r5.m60172b(r7)
            r5.m60172b(r6)
            r5.m60172b(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x01af:
            java.lang.Object r6 = r5.m60175d()
            java.lang.Object r7 = r5.m60175d()
            java.lang.Object r8 = r5.m60175d()
            r5.m60172b(r6)
            r5.m60172b(r8)
            r5.m60172b(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x01c9:
            java.lang.Object r6 = r5.m60175d()
            java.lang.Object r7 = r5.m60175d()
            r5.m60172b(r6)
            r5.m60172b(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x01dc:
            java.lang.Object r6 = r5.m60175d()
            r5.m60172b(r6)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x01e8:
            r5.m60176d(r0)
            goto L_0x02c6
        L_0x01ed:
            r5.m60176d(r4)
            goto L_0x02c6
        L_0x01f2:
            r5.m60176d(r3)
            goto L_0x02c6
        L_0x01f7:
            r5.m60176d(r2)
            java.lang.Object r6 = r5.m60175d()
            r5.m60168a(r7, r6)
            int r6 = r7 + 1
            java.lang.Integer r8 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60168a(r6, r8)
            if (r7 <= 0) goto L_0x02c6
            int r7 = r7 - r2
            java.lang.Object r6 = r5.m60174c(r7)
            java.lang.Integer r8 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            if (r6 == r8) goto L_0x0217
            java.lang.Integer r8 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0
            if (r6 != r8) goto L_0x02c6
        L_0x0217:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60168a(r7, r6)
            goto L_0x02c6
        L_0x021e:
            java.lang.Object r6 = r5.m60175d()
            r5.m60168a(r7, r6)
            if (r7 <= 0) goto L_0x02c6
            int r7 = r7 - r2
            java.lang.Object r6 = r5.m60174c(r7)
            java.lang.Integer r8 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            if (r6 == r8) goto L_0x0234
            java.lang.Integer r8 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0
            if (r6 != r8) goto L_0x02c6
        L_0x0234:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60168a(r7, r6)
            goto L_0x02c6
        L_0x023b:
            r5.m60176d(r2)
            java.lang.Object r6 = r5.m60175d()
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x0251
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.substring(r2)
            r5.m60173b(r6)
            goto L_0x02c6
        L_0x0251:
            java.lang.String r6 = "java/lang/Object"
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0258:
            r5.m60176d(r0)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0266:
            r5.m60176d(r0)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40885d0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x026f:
            r5.m60176d(r0)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x027d:
            r5.m60176d(r0)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0286:
            java.lang.Object r6 = r5.m60174c(r7)
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x0293:
            java.lang.Object r6 = r5.m60174c(r7)
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x029b:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40890e0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x02a6:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40885d0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x02ac:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40895f0
            r5.m60172b(r6)
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40875b0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x02b7:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40880c0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x02bd:
            java.lang.Integer r6 = p205i.p471b.p472a.p473a.p474c.p475i.C13959t.f40900g0
            r5.m60172b(r6)
            goto L_0x02c6
        L_0x02c3:
            r5.m60176d(r2)
        L_0x02c6:
            r5.f41015n3 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.p476w.C13962a.m60167a(int, int, java.lang.String):void");
    }
}
