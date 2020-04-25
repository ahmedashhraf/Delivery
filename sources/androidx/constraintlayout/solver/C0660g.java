package androidx.constraintlayout.solver;

import java.util.Arrays;
import p053b.p063d.p064b.C2108a;

/* renamed from: androidx.constraintlayout.solver.g */
/* compiled from: SolverVariable */
public class C0660g {

    /* renamed from: k */
    private static final boolean f2639k = false;

    /* renamed from: l */
    public static final int f2640l = 0;

    /* renamed from: m */
    public static final int f2641m = 1;

    /* renamed from: n */
    public static final int f2642n = 2;

    /* renamed from: o */
    public static final int f2643o = 3;

    /* renamed from: p */
    public static final int f2644p = 4;

    /* renamed from: q */
    public static final int f2645q = 5;

    /* renamed from: r */
    public static final int f2646r = 6;

    /* renamed from: s */
    public static final int f2647s = 7;

    /* renamed from: t */
    private static int f2648t = 1;

    /* renamed from: u */
    private static int f2649u = 1;

    /* renamed from: v */
    private static int f2650v = 1;

    /* renamed from: w */
    private static int f2651w = 1;

    /* renamed from: x */
    private static int f2652x = 1;

    /* renamed from: y */
    static final int f2653y = 7;

    /* renamed from: a */
    private String f2654a;

    /* renamed from: b */
    public int f2655b = -1;

    /* renamed from: c */
    int f2656c = -1;

    /* renamed from: d */
    public int f2657d = 0;

    /* renamed from: e */
    public float f2658e;

    /* renamed from: f */
    float[] f2659f = new float[7];

    /* renamed from: g */
    C0662b f2660g;

    /* renamed from: h */
    C0652b[] f2661h = new C0652b[8];

    /* renamed from: i */
    int f2662i = 0;

    /* renamed from: j */
    public int f2663j = 0;

    /* renamed from: androidx.constraintlayout.solver.g$a */
    /* compiled from: SolverVariable */
    static /* synthetic */ class C0661a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2664a = new int[C0662b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.solver.g$b[] r0 = androidx.constraintlayout.solver.C0660g.C0662b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2664a = r0
                int[] r0 = f2664a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.g$b r1 = androidx.constraintlayout.solver.C0660g.C0662b.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2664a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.g$b r1 = androidx.constraintlayout.solver.C0660g.C0662b.CONSTANT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2664a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.g$b r1 = androidx.constraintlayout.solver.C0660g.C0662b.SLACK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2664a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.g$b r1 = androidx.constraintlayout.solver.C0660g.C0662b.ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f2664a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.g$b r1 = androidx.constraintlayout.solver.C0660g.C0662b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C0660g.C0661a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.solver.g$b */
    /* compiled from: SolverVariable */
    public enum C0662b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0660g(String str, C0662b bVar) {
        this.f2654a = str;
        this.f2660g = bVar;
    }

    /* renamed from: b */
    private static String m3618b(C0662b bVar, String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(f2649u);
            return sb.toString();
        }
        int i = C0661a.f2664a[bVar.ordinal()];
        if (i == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("U");
            int i2 = f2650v + 1;
            f2650v = i2;
            sb2.append(i2);
            return sb2.toString();
        } else if (i == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("C");
            int i3 = f2651w + 1;
            f2651w = i3;
            sb3.append(i3);
            return sb3.toString();
        } else if (i == 3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C2108a.f8087L4);
            int i4 = f2648t + 1;
            f2648t = i4;
            sb4.append(i4);
            return sb4.toString();
        } else if (i == 4) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("e");
            int i5 = f2649u + 1;
            f2649u = i5;
            sb5.append(i5);
            return sb5.toString();
        } else if (i == 5) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(C2108a.f8135R4);
            int i6 = f2652x + 1;
            f2652x = i6;
            sb6.append(i6);
            return sb6.toString();
        } else {
            throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: e */
    static void m3619e() {
        f2649u++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3494a() {
        for (int i = 0; i < 7; i++) {
            this.f2659f[i] = 0.0f;
        }
    }

    /* renamed from: c */
    public final void mo3501c(C0652b bVar) {
        int i = this.f2662i;
        for (int i2 = 0; i2 < i; i2++) {
            C0652b[] bVarArr = this.f2661h;
            bVarArr[i2].f2584d.mo3412a(bVarArr[i2], bVar, false);
        }
        this.f2662i = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo3502d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("[");
        String sb2 = sb.toString();
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f2659f.length; i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f2659f[i]);
            String sb4 = sb3.toString();
            float[] fArr = this.f2659f;
            if (fArr[i] > 0.0f) {
                z = false;
            } else if (fArr[i] < 0.0f) {
                z = true;
            }
            if (this.f2659f[i] != 0.0f) {
                z2 = false;
            }
            if (i < this.f2659f.length - 1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(", ");
                sb2 = sb5.toString();
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb4);
                sb6.append("] ");
                sb2 = sb6.toString();
            }
        }
        if (z) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb2);
            sb7.append(" (-)");
            sb2 = sb7.toString();
        }
        if (!z2) {
            return sb2;
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(sb2);
        sb8.append(" (*)");
        return sb8.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f2654a);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo3495a(C0652b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f2662i;
            if (i >= i2) {
                C0652b[] bVarArr = this.f2661h;
                if (i2 >= bVarArr.length) {
                    this.f2661h = (C0652b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0652b[] bVarArr2 = this.f2661h;
                int i3 = this.f2662i;
                bVarArr2[i3] = bVar;
                this.f2662i = i3 + 1;
                return;
            } else if (this.f2661h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo3500c() {
        this.f2654a = null;
        this.f2660g = C0662b.UNKNOWN;
        this.f2657d = 0;
        this.f2655b = -1;
        this.f2656c = -1;
        this.f2658e = 0.0f;
        this.f2662i = 0;
        this.f2663j = 0;
    }

    /* renamed from: a */
    public void mo3497a(String str) {
        this.f2654a = str;
    }

    /* renamed from: a */
    public void mo3496a(C0662b bVar, String str) {
        this.f2660g = bVar;
    }

    /* renamed from: b */
    public final void mo3499b(C0652b bVar) {
        int i = this.f2662i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2661h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0652b[] bVarArr = this.f2661h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f2662i--;
                return;
            }
        }
    }

    public C0660g(C0662b bVar, String str) {
        this.f2660g = bVar;
    }

    /* renamed from: b */
    public String mo3498b() {
        return this.f2654a;
    }
}
