package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0660g.C0662b;
import androidx.constraintlayout.solver.p014h.C0667e;
import androidx.constraintlayout.solver.p014h.C0667e.C0671d;
import androidx.constraintlayout.solver.p014h.C0677h;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.d */
/* compiled from: LinearSystem */
public class C0654d {

    /* renamed from: q */
    public static final boolean f2586q = false;

    /* renamed from: r */
    private static final boolean f2587r = false;

    /* renamed from: s */
    private static int f2588s = 1000;

    /* renamed from: t */
    public static C0656e f2589t;

    /* renamed from: a */
    int f2590a = 0;

    /* renamed from: b */
    private HashMap<String, C0660g> f2591b = null;

    /* renamed from: c */
    private C0655a f2592c;

    /* renamed from: d */
    private int f2593d = 32;

    /* renamed from: e */
    private int f2594e;

    /* renamed from: f */
    C0652b[] f2595f;

    /* renamed from: g */
    public boolean f2596g;

    /* renamed from: h */
    private boolean[] f2597h;

    /* renamed from: i */
    int f2598i;

    /* renamed from: j */
    int f2599j;

    /* renamed from: k */
    private int f2600k;

    /* renamed from: l */
    final Cache f2601l;

    /* renamed from: m */
    private C0660g[] f2602m;

    /* renamed from: n */
    private int f2603n;

    /* renamed from: o */
    private C0652b[] f2604o;

    /* renamed from: p */
    private final C0655a f2605p;

    /* renamed from: androidx.constraintlayout.solver.d$a */
    /* compiled from: LinearSystem */
    interface C0655a {
        /* renamed from: a */
        C0660g mo3435a(C0654d dVar, boolean[] zArr);

        /* renamed from: a */
        void mo3437a(C0655a aVar);

        /* renamed from: a */
        void mo3438a(C0660g gVar);

        void clear();

        C0660g getKey();

        boolean isEmpty();
    }

    public C0654d() {
        int i = this.f2593d;
        this.f2594e = i;
        this.f2595f = null;
        this.f2596g = false;
        this.f2597h = new boolean[i];
        this.f2598i = 1;
        this.f2599j = 0;
        this.f2600k = i;
        this.f2602m = new C0660g[f2588s];
        this.f2603n = 0;
        this.f2604o = new C0652b[i];
        this.f2595f = new C0652b[i];
        m3574s();
        this.f2601l = new Cache();
        this.f2592c = new C0653c(this.f2601l);
        this.f2605p = new C0652b(this.f2601l);
    }

    /* renamed from: c */
    private String m3566c(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 6 ? "FIXED" : "NONE";
    }

    /* renamed from: d */
    private final void m3568d(C0652b bVar) {
        if (this.f2599j > 0) {
            bVar.f2584d.mo3413a(bVar, this.f2595f);
            if (bVar.f2584d.f2568a == 0) {
                bVar.f2585e = true;
            }
        }
    }

    /* renamed from: n */
    private void m3569n() {
        for (int i = 0; i < this.f2599j; i++) {
            C0652b bVar = this.f2595f[i];
            bVar.f2581a.f2658e = bVar.f2582b;
        }
    }

    /* renamed from: o */
    private void m3570o() {
        m3571p();
        String str = "";
        int i = 0;
        while (true) {
            String str2 = "\n";
            if (i < this.f2599j) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f2595f[i]);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(str2);
                str = sb3.toString();
                i++;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(this.f2592c);
                sb4.append(str2);
                System.out.println(sb4.toString());
                return;
            }
        }
    }

    /* renamed from: p */
    private void m3571p() {
        StringBuilder sb = new StringBuilder();
        sb.append("Display Rows (");
        sb.append(this.f2599j);
        sb.append("x");
        sb.append(this.f2598i);
        sb.append(")\n");
        System.out.println(sb.toString());
    }

    /* renamed from: q */
    public static C0656e m3572q() {
        return f2589t;
    }

    /* renamed from: r */
    private void m3573r() {
        this.f2593d *= 2;
        this.f2595f = (C0652b[]) Arrays.copyOf(this.f2595f, this.f2593d);
        Cache cache = this.f2601l;
        cache.mIndexedVariables = (C0660g[]) Arrays.copyOf(cache.mIndexedVariables, this.f2593d);
        int i = this.f2593d;
        this.f2597h = new boolean[i];
        this.f2594e = i;
        this.f2600k = i;
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2613d++;
            eVar.f2625p = Math.max(eVar.f2625p, (long) i);
            C0656e eVar2 = f2589t;
            eVar2.f2609D = eVar2.f2625p;
        }
    }

    /* renamed from: s */
    private void m3574s() {
        int i = 0;
        while (true) {
            C0652b[] bVarArr = this.f2595f;
            if (i < bVarArr.length) {
                C0652b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f2601l.arrayRowPool.release(bVar);
                }
                this.f2595f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo3465a(C0656e eVar) {
        f2589t = eVar;
    }

    /* renamed from: b */
    public C0652b mo3473b() {
        C0652b bVar = (C0652b) this.f2601l.arrayRowPool.mo3491a();
        if (bVar == null) {
            bVar = new C0652b(this.f2601l);
        } else {
            bVar.mo3447c();
        }
        C0660g.m3619e();
        return bVar;
    }

    /* renamed from: c */
    public C0660g mo3477c() {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2623n++;
        }
        if (this.f2598i + 1 >= this.f2594e) {
            m3573r();
        }
        C0660g a = m3558a(C0662b.SLACK, (String) null);
        this.f2590a++;
        this.f2598i++;
        int i = this.f2590a;
        a.f2655b = i;
        this.f2601l.mIndexedVariables[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3480e() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2593d; i2++) {
            C0652b[] bVarArr = this.f2595f;
            if (bVarArr[i2] != null) {
                i += bVarArr[i2].mo3449d();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2599j; i4++) {
            C0652b[] bVarArr2 = this.f2595f;
            if (bVarArr2[i4] != null) {
                i3 += bVarArr2[i4].mo3449d();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f2593d);
        sb.append(" (");
        int i5 = this.f2593d;
        sb.append(m3563b(i5 * i5));
        sb.append(") -- row sizes: ");
        sb.append(m3563b(i));
        sb.append(", actual size: ");
        sb.append(m3563b(i3));
        sb.append(" rows: ");
        sb.append(this.f2599j);
        String str = "/";
        sb.append(str);
        sb.append(this.f2600k);
        sb.append(" cols: ");
        sb.append(this.f2598i);
        sb.append(str);
        sb.append(this.f2594e);
        sb.append(C3868i.f12248b);
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(m3563b(0));
        printStream.println(sb.toString());
    }

    /* renamed from: f */
    public void mo3481f() {
        m3571p();
        String str = "";
        int i = 0;
        while (true) {
            String str2 = "\n";
            if (i < this.f2599j) {
                if (this.f2595f[i].f2581a.f2660g == C0662b.UNRESTRICTED) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.f2595f[i].mo3451e());
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(str2);
                    str = sb3.toString();
                }
                i++;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(this.f2592c);
                sb4.append(str2);
                System.out.println(sb4.toString());
                return;
            }
        }
    }

    /* renamed from: g */
    public Cache mo3482g() {
        return this.f2601l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C0655a mo3483h() {
        return this.f2592c;
    }

    /* renamed from: i */
    public int mo3484i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2599j; i2++) {
            C0652b[] bVarArr = this.f2595f;
            if (bVarArr[i2] != null) {
                i += bVarArr[i2].mo3449d();
            }
        }
        return i;
    }

    /* renamed from: j */
    public int mo3485j() {
        return this.f2599j;
    }

    /* renamed from: k */
    public int mo3486k() {
        return this.f2590a;
    }

    /* renamed from: l */
    public void mo3487l() throws Exception {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2614e++;
        }
        if (this.f2596g) {
            C0656e eVar2 = f2589t;
            if (eVar2 != null) {
                eVar2.f2627r++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f2599j) {
                    z = true;
                    break;
                } else if (!this.f2595f[i].f2585e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo3464a(this.f2592c);
                return;
            }
            C0656e eVar3 = f2589t;
            if (eVar3 != null) {
                eVar3.f2626q++;
            }
            m3569n();
            return;
        }
        mo3464a(this.f2592c);
    }

    /* renamed from: m */
    public void mo3488m() {
        Cache cache;
        int i = 0;
        while (true) {
            cache = this.f2601l;
            C0660g[] gVarArr = cache.mIndexedVariables;
            if (i >= gVarArr.length) {
                break;
            }
            C0660g gVar = gVarArr[i];
            if (gVar != null) {
                gVar.mo3500c();
            }
            i++;
        }
        cache.solverVariablePool.mo3492a(this.f2602m, this.f2603n);
        this.f2603n = 0;
        Arrays.fill(this.f2601l.mIndexedVariables, null);
        HashMap<String, C0660g> hashMap = this.f2591b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2590a = 0;
        this.f2592c.clear();
        this.f2598i = 1;
        for (int i2 = 0; i2 < this.f2599j; i2++) {
            this.f2595f[i2].f2583c = false;
        }
        m3574s();
        this.f2599j = 0;
    }

    /* renamed from: a */
    public C0660g mo3460a(Object obj) {
        C0660g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2598i + 1 >= this.f2594e) {
            m3573r();
        }
        if (obj instanceof C0667e) {
            C0667e eVar = (C0667e) obj;
            gVar = eVar.mo3544i();
            if (gVar == null) {
                eVar.mo3523a(this.f2601l);
                gVar = eVar.mo3544i();
            }
            int i = gVar.f2655b;
            if (i == -1 || i > this.f2590a || this.f2601l.mIndexedVariables[i] == null) {
                if (gVar.f2655b != -1) {
                    gVar.mo3500c();
                }
                this.f2590a++;
                this.f2598i++;
                int i2 = this.f2590a;
                gVar.f2655b = i2;
                gVar.f2660g = C0662b.UNRESTRICTED;
                this.f2601l.mIndexedVariables[i2] = gVar;
            }
        }
        return gVar;
    }

    /* renamed from: b */
    private void m3564b(C0652b bVar) {
        bVar.mo3427a(this, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3479d() {
        m3571p();
        String str = " #  ";
        for (int i = 0; i < this.f2599j; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f2595f[i].mo3451e());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("\n #  ");
            str = sb3.toString();
        }
        if (this.f2592c != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f2592c);
            sb4.append("\n");
            str = sb4.toString();
        }
        System.out.println(str);
    }

    /* renamed from: b */
    private C0660g m3562b(String str, C0662b bVar) {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2621l++;
        }
        if (this.f2598i + 1 >= this.f2594e) {
            m3573r();
        }
        C0660g a = m3558a(bVar, (String) null);
        a.mo3497a(str);
        this.f2590a++;
        this.f2598i++;
        a.f2655b = this.f2590a;
        if (this.f2591b == null) {
            this.f2591b = new HashMap<>();
        }
        this.f2591b.put(str, a);
        this.f2601l.mIndexedVariables[this.f2590a] = a;
        return a;
    }

    /* renamed from: c */
    private final void m3567c(C0652b bVar) {
        C0652b[] bVarArr = this.f2595f;
        int i = this.f2599j;
        if (bVarArr[i] != null) {
            this.f2601l.arrayRowPool.release(bVarArr[i]);
        }
        C0652b[] bVarArr2 = this.f2595f;
        int i2 = this.f2599j;
        bVarArr2[i2] = bVar;
        C0660g gVar = bVar.f2581a;
        gVar.f2656c = i2;
        this.f2599j = i2 + 1;
        gVar.mo3501c(bVar);
    }

    /* renamed from: a */
    public C0660g mo3458a() {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2624o++;
        }
        if (this.f2598i + 1 >= this.f2594e) {
            m3573r();
        }
        C0660g a = m3558a(C0662b.SLACK, (String) null);
        this.f2590a++;
        this.f2598i++;
        int i = this.f2590a;
        a.f2655b = i;
        this.f2601l.mIndexedVariables[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo3478c(C0660g gVar, C0660g gVar2, int i, int i2) {
        C0652b b = mo3473b();
        C0660g c = mo3477c();
        c.f2657d = 0;
        b.mo3441b(gVar, gVar2, c, i);
        if (i2 != 6) {
            mo3463a(b, (int) (b.f2584d.mo3418b(c) * -1.0f), i2);
        }
        mo3462a(b);
    }

    /* renamed from: b */
    public int mo3472b(Object obj) {
        C0660g i = ((C0667e) obj).mo3544i();
        if (i != null) {
            return (int) (i.f2658e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private int m3560b(C0655a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f2599j) {
                z = false;
                break;
            }
            C0652b[] bVarArr = this.f2595f;
            if (bVarArr[i].f2581a.f2660g != C0662b.UNRESTRICTED && bVarArr[i].f2582b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0656e eVar = f2589t;
            if (eVar != null) {
                eVar.f2620k++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f2599j) {
                C0652b bVar = this.f2595f[i3];
                if (bVar.f2581a.f2660g != C0662b.UNRESTRICTED && !bVar.f2585e && bVar.f2582b < f) {
                    int i7 = 1;
                    while (i7 < this.f2598i) {
                        C0660g gVar = this.f2601l.mIndexedVariables[i7];
                        float b = bVar.f2584d.mo3418b(gVar);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = gVar.f2659f[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0652b bVar2 = this.f2595f[i4];
                bVar2.f2581a.f2656c = -1;
                C0656e eVar2 = f2589t;
                if (eVar2 != null) {
                    eVar2.f2619j++;
                }
                bVar2.mo3450d(this.f2601l.mIndexedVariables[i5]);
                C0660g gVar2 = bVar2.f2581a;
                gVar2.f2656c = i4;
                gVar2.mo3501c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f2598i / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: c */
    public static C0652b m3565c(C0654d dVar, C0660g gVar, C0660g gVar2, int i, boolean z) {
        C0660g c = dVar.mo3477c();
        C0652b b = dVar.mo3473b();
        b.mo3441b(gVar, gVar2, c, i);
        if (z) {
            dVar.m3559a(b, (int) (b.f2584d.mo3418b(c) * -1.0f));
        }
        return b;
    }

    /* renamed from: a */
    private void m3559a(C0652b bVar, int i) {
        mo3463a(bVar, i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3463a(C0652b bVar, int i, int i2) {
        bVar.mo3428a(mo3459a(i2, (String) null), i);
    }

    /* renamed from: a */
    public C0660g mo3459a(int i, String str) {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2622m++;
        }
        if (this.f2598i + 1 >= this.f2594e) {
            m3573r();
        }
        C0660g a = m3558a(C0662b.ERROR, str);
        this.f2590a++;
        this.f2598i++;
        int i2 = this.f2590a;
        a.f2655b = i2;
        a.f2657d = i;
        this.f2601l.mIndexedVariables[i2] = a;
        this.f2592c.mo3438a(a);
        return a;
    }

    /* renamed from: a */
    private C0660g m3558a(C0662b bVar, String str) {
        C0660g gVar = (C0660g) this.f2601l.solverVariablePool.mo3491a();
        if (gVar == null) {
            gVar = new C0660g(bVar, str);
            gVar.mo3496a(bVar, str);
        } else {
            gVar.mo3500c();
            gVar.mo3496a(bVar, str);
        }
        int i = this.f2603n;
        int i2 = f2588s;
        if (i >= i2) {
            f2588s = i2 * 2;
            this.f2602m = (C0660g[]) Arrays.copyOf(this.f2602m, f2588s);
        }
        C0660g[] gVarArr = this.f2602m;
        int i3 = this.f2603n;
        this.f2603n = i3 + 1;
        gVarArr[i3] = gVar;
        return gVar;
    }

    /* renamed from: b */
    private String m3563b(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        String str = "";
        if (i4 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i4);
            sb.append(" Mb");
            return sb.toString();
        } else if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i3);
            sb2.append(" Kb");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(i2);
            sb3.append(" bytes");
            return sb3.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0652b mo3456a(int i) {
        return this.f2595f[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo3455a(String str) {
        C0660g a = mo3461a(str, C0662b.UNRESTRICTED);
        if (a == null) {
            return 0.0f;
        }
        return a.f2658e;
    }

    /* renamed from: b */
    public void mo3475b(C0660g gVar, C0660g gVar2, int i, int i2) {
        C0652b b = mo3473b();
        C0660g c = mo3477c();
        c.f2657d = 0;
        b.mo3433a(gVar, gVar2, c, i);
        if (i2 != 6) {
            mo3463a(b, (int) (b.f2584d.mo3418b(c) * -1.0f), i2);
        }
        mo3462a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0660g mo3461a(String str, C0662b bVar) {
        if (this.f2591b == null) {
            this.f2591b = new HashMap<>();
        }
        C0660g gVar = (C0660g) this.f2591b.get(str);
        return gVar == null ? m3562b(str, bVar) : gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3464a(C0655a aVar) throws Exception {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2629t++;
            eVar.f2630u = Math.max(eVar.f2630u, (long) this.f2598i);
            C0656e eVar2 = f2589t;
            eVar2.f2631v = Math.max(eVar2.f2631v, (long) this.f2599j);
        }
        m3568d((C0652b) aVar);
        m3560b(aVar);
        m3554a(aVar, false);
        m3569n();
    }

    /* renamed from: b */
    public void mo3474b(C0660g gVar, int i) {
        C0652b b = mo3473b();
        C0660g c = mo3477c();
        c.f2657d = 0;
        b.mo3429a(gVar, i, c);
        mo3462a(b);
    }

    /* renamed from: b */
    public void mo3476b(C0660g gVar, C0660g gVar2, boolean z) {
        C0652b b = mo3473b();
        C0660g c = mo3477c();
        c.f2657d = 0;
        b.mo3441b(gVar, gVar2, c, 0);
        if (z) {
            mo3463a(b, (int) (b.f2584d.mo3418b(c) * -1.0f), 1);
        }
        mo3462a(b);
    }

    /* renamed from: a */
    public void mo3462a(C0652b bVar) {
        if (bVar != null) {
            C0656e eVar = f2589t;
            if (eVar != null) {
                eVar.f2615f++;
                if (bVar.f2585e) {
                    eVar.f2616g++;
                }
            }
            if (this.f2599j + 1 >= this.f2600k || this.f2598i + 1 >= this.f2594e) {
                m3573r();
            }
            boolean z = false;
            if (!bVar.f2585e) {
                m3568d(bVar);
                if (!bVar.isEmpty()) {
                    bVar.mo3436a();
                    if (bVar.mo3439a(this)) {
                        C0660g a = mo3458a();
                        bVar.f2581a = a;
                        m3567c(bVar);
                        this.f2605p.mo3437a((C0655a) bVar);
                        m3554a(this.f2605p, true);
                        if (a.f2656c == -1) {
                            if (bVar.f2581a == a) {
                                C0660g c = bVar.mo3446c(a);
                                if (c != null) {
                                    C0656e eVar2 = f2589t;
                                    if (eVar2 != null) {
                                        eVar2.f2619j++;
                                    }
                                    bVar.mo3450d(c);
                                }
                            }
                            if (!bVar.f2585e) {
                                bVar.f2581a.mo3501c(bVar);
                            }
                            this.f2599j--;
                        }
                        z = true;
                    }
                    if (!bVar.mo3443b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m3567c(bVar);
            }
        }
    }

    /* renamed from: b */
    public static C0652b m3561b(C0654d dVar, C0660g gVar, C0660g gVar2, int i, boolean z) {
        C0660g c = dVar.mo3477c();
        C0652b b = dVar.mo3473b();
        b.mo3433a(gVar, gVar2, c, i);
        if (z) {
            dVar.m3559a(b, (int) (b.f2584d.mo3418b(c) * -1.0f));
        }
        return b;
    }

    /* renamed from: a */
    private final int m3554a(C0655a aVar, boolean z) {
        C0656e eVar = f2589t;
        if (eVar != null) {
            eVar.f2617h++;
        }
        for (int i = 0; i < this.f2598i; i++) {
            this.f2597h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0656e eVar2 = f2589t;
            if (eVar2 != null) {
                eVar2.f2618i++;
            }
            i2++;
            if (i2 >= this.f2598i * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f2597h[aVar.getKey().f2655b] = true;
            }
            C0660g a = aVar.mo3435a(this, this.f2597h);
            if (a != null) {
                boolean[] zArr = this.f2597h;
                int i3 = a.f2655b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f2599j; i5++) {
                    C0652b bVar = this.f2595f[i5];
                    if (bVar.f2581a.f2660g != C0662b.UNRESTRICTED && !bVar.f2585e && bVar.mo3444b(a)) {
                        float b = bVar.f2584d.mo3418b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f2582b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0652b bVar2 = this.f2595f[i4];
                    bVar2.f2581a.f2656c = -1;
                    C0656e eVar3 = f2589t;
                    if (eVar3 != null) {
                        eVar3.f2619j++;
                    }
                    bVar2.mo3450d(a);
                    C0660g gVar = bVar2.f2581a;
                    gVar.f2656c = i4;
                    gVar.mo3501c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo3470a(C0660g gVar, C0660g gVar2, boolean z) {
        C0652b b = mo3473b();
        C0660g c = mo3477c();
        c.f2657d = 0;
        b.mo3433a(gVar, gVar2, c, 0);
        if (z) {
            mo3463a(b, (int) (b.f2584d.mo3418b(c) * -1.0f), 1);
        }
        mo3462a(b);
    }

    /* renamed from: a */
    public void mo3468a(C0660g gVar, C0660g gVar2, int i, float f, C0660g gVar3, C0660g gVar4, int i2, int i3) {
        int i4 = i3;
        C0652b b = mo3473b();
        b.mo3431a(gVar, gVar2, i, f, gVar3, gVar4, i2);
        if (i4 != 6) {
            b.mo3427a(this, i4);
        }
        mo3462a(b);
    }

    /* renamed from: a */
    public void mo3469a(C0660g gVar, C0660g gVar2, C0660g gVar3, C0660g gVar4, float f, int i) {
        C0652b b = mo3473b();
        b.mo3434a(gVar, gVar2, gVar3, gVar4, f);
        if (i != 6) {
            b.mo3427a(this, i);
        }
        mo3462a(b);
    }

    /* renamed from: a */
    public C0652b mo3457a(C0660g gVar, C0660g gVar2, int i, int i2) {
        C0652b b = mo3473b();
        b.mo3430a(gVar, gVar2, i);
        if (i2 != 6) {
            b.mo3427a(this, i2);
        }
        mo3462a(b);
        return b;
    }

    /* renamed from: a */
    public void mo3466a(C0660g gVar, int i) {
        int i2 = gVar.f2656c;
        if (i2 != -1) {
            C0652b bVar = this.f2595f[i2];
            if (bVar.f2585e) {
                bVar.f2582b = (float) i;
            } else if (bVar.f2584d.f2568a == 0) {
                bVar.f2585e = true;
                bVar.f2582b = (float) i;
            } else {
                C0652b b = mo3473b();
                b.mo3445c(gVar, i);
                mo3462a(b);
            }
        } else {
            C0652b b2 = mo3473b();
            b2.mo3440b(gVar, i);
            mo3462a(b2);
        }
    }

    /* renamed from: a */
    public void mo3467a(C0660g gVar, int i, int i2) {
        int i3 = gVar.f2656c;
        if (i3 != -1) {
            C0652b bVar = this.f2595f[i3];
            if (bVar.f2585e) {
                bVar.f2582b = (float) i;
                return;
            }
            C0652b b = mo3473b();
            b.mo3445c(gVar, i);
            b.mo3427a(this, i2);
            mo3462a(b);
            return;
        }
        C0652b b2 = mo3473b();
        b2.mo3440b(gVar, i);
        b2.mo3427a(this, i2);
        mo3462a(b2);
    }

    /* renamed from: a */
    public static C0652b m3556a(C0654d dVar, C0660g gVar, C0660g gVar2, int i, boolean z) {
        C0652b b = dVar.mo3473b();
        b.mo3430a(gVar, gVar2, i);
        if (z) {
            dVar.m3559a(b, 1);
        }
        return b;
    }

    /* renamed from: a */
    public static C0652b m3557a(C0654d dVar, C0660g gVar, C0660g gVar2, C0660g gVar3, float f, boolean z) {
        C0652b b = dVar.mo3473b();
        if (z) {
            dVar.m3564b(b);
        }
        return b.mo3432a(gVar, gVar2, gVar3, f);
    }

    /* renamed from: a */
    public static C0652b m3555a(C0654d dVar, C0660g gVar, C0660g gVar2, int i, float f, C0660g gVar3, C0660g gVar4, int i2, boolean z) {
        C0652b b = dVar.mo3473b();
        b.mo3431a(gVar, gVar2, i, f, gVar3, gVar4, i2);
        if (z) {
            C0654d dVar2 = dVar;
            b.mo3427a(dVar, 4);
        }
        return b;
    }

    /* renamed from: a */
    public void mo3471a(C0677h hVar, C0677h hVar2, float f, int i) {
        C0677h hVar3 = hVar;
        C0677h hVar4 = hVar2;
        C0660g a = mo3460a((Object) hVar3.mo3599a(C0671d.LEFT));
        C0660g a2 = mo3460a((Object) hVar3.mo3599a(C0671d.TOP));
        C0660g a3 = mo3460a((Object) hVar3.mo3599a(C0671d.RIGHT));
        C0660g a4 = mo3460a((Object) hVar3.mo3599a(C0671d.BOTTOM));
        C0660g a5 = mo3460a((Object) hVar4.mo3599a(C0671d.LEFT));
        C0660g a6 = mo3460a((Object) hVar4.mo3599a(C0671d.TOP));
        C0660g a7 = mo3460a((Object) hVar4.mo3599a(C0671d.RIGHT));
        C0660g a8 = mo3460a((Object) hVar4.mo3599a(C0671d.BOTTOM));
        C0652b b = mo3473b();
        double d = (double) f;
        double sin = Math.sin(d);
        C0660g gVar = a3;
        double d2 = (double) i;
        Double.isNaN(d2);
        C0660g gVar2 = a7;
        b.mo3442b(a2, a4, a6, a8, (float) (sin * d2));
        mo3462a(b);
        C0652b b2 = mo3473b();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        b2.mo3442b(a, gVar, a5, gVar2, (float) (cos * d2));
        mo3462a(b2);
    }
}
